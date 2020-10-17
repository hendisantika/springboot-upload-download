package com.hendisantika.springbootuploaddownload.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-upload-download
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/10/20
 * Time: 04.56
 */
@Data
@AllArgsConstructor
public class FileStorageException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String message;
}
