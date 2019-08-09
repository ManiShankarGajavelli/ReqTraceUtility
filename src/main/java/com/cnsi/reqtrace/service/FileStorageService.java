package com.cnsi.reqtrace.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.cnsi.reqtrace.exception.FileStorageException;
import com.cnsi.reqtrace.model.domain.FileStoragePath;
import com.cnsi.reqtrace.repository.ExcelReqCertifyRepository;
import com.cnsi.reqtrace.model.domain.ExcelReqCertify;

@Service
public class FileStorageService {
	
    private final Path fileStorageLocation;
    
    @Autowired
    ExcelReqCertifyRepository ExcelH2Data;
	

	   @Autowired
	    public FileStorageService(FileStoragePath fileStorageProperties) {
	        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
	                .toAbsolutePath().normalize();

	        try {
	            Files.createDirectories(this.fileStorageLocation);
	        } catch (Exception ex) {
	            throw new FileStorageException("Could not create the directory where the uploaded files will be stored.", ex);
	        }
	    }
	   
	   public String storeFile(MultipartFile file) {
	        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	        try {
	            if(fileName.contains("..")) {
	                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
	            }

	            Path targetLocation = this.fileStorageLocation.resolve(fileName);
	            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
		        
		        Workbook workbook = WorkbookFactory.create(targetLocation.toFile());
		        List<ExcelReqCertify> l_alReqCertifyExcelData = new ArrayList<ExcelReqCertify>();
		        workbook.forEach(sheet -> {
		        	sheet.forEach(row -> {
		        		ExcelReqCertify l_objExcelRow = new ExcelReqCertify();
		            	l_objExcelRow.setChecklist_ID(row.getCell(0).getStringCellValue());
		            	l_objExcelRow.setChecklist_Standard(row.getCell(1).getStringCellValue());
		            	l_objExcelRow.setChecklist_Description(row.getCell(2).getStringCellValue());
		            	l_objExcelRow.setCriteria_Number(row.getCell(3).getStringCellValue());
		            	l_objExcelRow.setCriteria_Name(row.getCell(4).getStringCellValue());
		            	l_objExcelRow.setCriteria_Business_Objective(row.getCell(5).getStringCellValue());
		            	l_objExcelRow.setCriteria_Description(row.getCell(6).getStringCellValue());
		            	l_objExcelRow.setCriteria_Source(row.getCell(7).getStringCellValue());
		            	l_objExcelRow.setBusiness_Process(row.getCell(8).getStringCellValue());
		            	l_objExcelRow.setBusiness_Process_ID(row.getCell(9).getStringCellValue());
		            	l_objExcelRow.setBusiness_Area(row.getCell(10).getStringCellValue());
		            	l_alReqCertifyExcelData.add(l_objExcelRow);
//		            	ExcelH2Data.save(l_objExcelRow);
		            	System.out.println(l_alReqCertifyExcelData);
//			            row.forEach(cell -> {
			            	
//			            });
			            System.out.println();
			        });
		        });
		        

		        workbook.close();
	            return fileName;
	        } catch (IOException ex) {
	            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
	        } catch (InvalidFormatException exInvalidFormatException) {
	        	throw new FileStorageException("Invalid file format Exception : " + fileName + ". Please try again!", exInvalidFormatException);
				
			}
	    }

	
}
