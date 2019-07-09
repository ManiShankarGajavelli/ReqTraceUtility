package com.cnsi.reqtrace.utils;

public class UploadFileResponse {

	private String FileName;
	private String FileDownloadUrl;
	private String FileType;
	private long size;
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public String getFileDownloadUrl() {
		return FileDownloadUrl;
	}
	public void setFileDownloadUrl(String fileDownloadUrl) {
		FileDownloadUrl = fileDownloadUrl;
	}
	public String getFileType() {
		return FileType;
	}
	public void setFileType(String fileType) {
		FileType = fileType;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public UploadFileResponse(String fileName, String fileDownloadUrl, String fileType, long size) {
		super();
		FileName = fileName;
		FileDownloadUrl = fileDownloadUrl;
		FileType = fileType;
		this.size = size;
	}
	public UploadFileResponse() {
	}
	
}
