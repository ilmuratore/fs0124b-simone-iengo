package com.Gestione.GestioneDispositivi.service;

import com.Gestione.GestioneDispositivi.exception.CustomException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileUploadService {

    private final Path root = Paths.get("uploads");

    public void saveFile(MultipartFile file) {
        try {
            if (!Files.exists(root)) {
                Files.createDirectory(root);
            }
            Path resolve = root.resolve(file.getOriginalFilename());
            file.transferTo(resolve);
        } catch (IOException e) {
            throw new CustomException("Could not store the file. Error: " + e.getMessage());
        }
    }
}