package com.hendisantika.springbootuploaddownload.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-upload-download
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/10/20
 * Time: 04.57
 */
public interface IFileSystemStorage {
    void init();

    String saveFile(MultipartFile file);

    Resource loadFile(String fileName);
}
