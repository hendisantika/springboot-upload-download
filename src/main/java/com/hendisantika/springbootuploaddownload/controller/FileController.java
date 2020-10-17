package com.hendisantika.springbootuploaddownload.controller;

import com.hendisantika.springbootuploaddownload.service.IFileSystemStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
