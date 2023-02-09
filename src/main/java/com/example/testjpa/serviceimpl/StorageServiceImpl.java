package com.example.testjpa.serviceimpl;

import com.example.testjpa.pojo.FileData;
import com.example.testjpa.Repository.FileDataRepository;
import com.example.testjpa.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;
import java.util.UUID;

@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private FileDataRepository fileDataRepository;
    private final String FOLDER_PATH="C:/Users/ssd/Desktop/test/";

    @Override
    public String uploadImageToFileSystem(MultipartFile file) throws IOException {
//        有檔名
//        String fileName=file.getOriginalFilename();
//        String filePath=FOLDER_PATH+fileName;
        if (file.getOriginalFilename().endsWith(".png") || file.getOriginalFilename().endsWith(".jpg")){
        String fileName=UUID.randomUUID()
                +file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

        String filePath=FOLDER_PATH+fileName;

                FileData fileData=fileDataRepository.save(FileData.builder()
                .name(fileName)
                .type(file.getContentType())
                .filePath(filePath).build());

        file.transferTo(new File(filePath));

        if (fileData != null) {
            return "file uploaded successfully : " + filePath;
        }
        return null;
    }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "only png/jpg");
    }
    @Override
    public byte[] downloadImageFromFileSystem(String fileName) throws IOException {
        Optional<FileData> fileData = fileDataRepository.findByName(fileName);
        String filePath=fileData.get().getFilePath();
        byte[] images = Files.readAllBytes(new File(filePath).toPath());
        return images;
    }
}