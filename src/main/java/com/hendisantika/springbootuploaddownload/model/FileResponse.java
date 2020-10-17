package com.hendisantika.springbootuploaddownload.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-upload-download
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/10/20
 * Time: 04.50
 */
@Data
@AllArgsConstructor
public class FileResponse {
    private String fileName;
    private String fileUrl;
    private String message;
}
