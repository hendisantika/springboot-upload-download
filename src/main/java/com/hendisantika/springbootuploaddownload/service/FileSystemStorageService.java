package com.hendisantika.springbootuploaddownload.service;

import com.hendisantika.springbootuploaddownload.properties.FileUploadProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-upload-download
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/10/20
 * Time: 04.57
 */
@Service
public class FileSystemStorageService implements IFileSystemStorage {

    private final Path dirLocation;

    @Autowired
    public FileSystemStorageService(FileUploadProperties fileUploadProperties) {
        this.dirLocation = Paths.get(fileUploadProperties.getLocation())
                .toAbsolutePath()
                .normalize();
    }
}
