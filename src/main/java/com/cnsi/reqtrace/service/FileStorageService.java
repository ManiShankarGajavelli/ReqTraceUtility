package com.cnsi.reqtrace.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.cnsi.reqtrace.exception.FileStorageException;
import com.cnsi.reqtrace.model.FileStoragePath;

@Service
public class FileStorageService {
	
    private final Path fileStorageLocation;
	

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
		        
		        // Creating a Workbook from an Excel file (.xls or .xlsx)
		        Workbook workbook = WorkbookFactory.create(targetLocation.toFile());
		        
		        // Retrieving the number of sheets in the Workbook
		        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
		        System.out.println("Retrieving Sheets using Java 8 forEach with lambda");
		        workbook.forEach(sheet -> {
		            System.out.println("=> " + sheet.getSheetName());
		        });
		        
		        // 3. Or you can use Java 8 forEach loop with lambda
		        System.out.println("\n\nIterating over Rows and Columns using Java 8 forEach with lambda\n");
		        Sheet sheet = workbook.getSheetAt(0);
		        sheet.forEach(row -> {
		            row.forEach(cell -> {
		                System.out.print(cell + "\t");
		            });
		            System.out.println();
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
