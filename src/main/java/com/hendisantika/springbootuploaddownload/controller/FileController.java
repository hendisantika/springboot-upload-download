package com.hendisantika.springbootuploaddownload.controller;

import com.hendisantika.springbootuploaddownload.model.FileResponse;
import com.hendisantika.springbootuploaddownload.service.IFileSystemStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-upload-download
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/10/20
 * Time: 05.09
 */
@RestController
@RequestMapping("/api")
public class FileController {

    @Autowired
    private IFileSystemStorage fileSystemStorage;

    @PostMapping("/uploadfile")
    public ResponseEntity<FileResponse> uploadSingleFile(@RequestParam("file") MultipartFile file) {
        String upfile = fileSystemStorage.saveFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/download/")
                .path(upfile)
                .toUriString();

        return ResponseEntity.status(HttpStatus.OK).body(new FileResponse(upfile, fileDownloadUri, "File uploaded " +
                "with success!"));
    }
}
