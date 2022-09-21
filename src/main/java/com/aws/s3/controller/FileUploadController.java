package com.aws.s3.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.aws.s3.service.FileUploadService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // lombok error
@RestController
public class FileUploadController {

	private final FileUploadService fileUploadService;

	public FileUploadController(FileUploadService fileUploadService) {
		this.fileUploadService = fileUploadService;
	}

	@PostMapping("/api/v1/upload")
	public String uploadImage(@RequestPart MultipartFile file) {
		return fileUploadService.uploadImage(file);
	}

}