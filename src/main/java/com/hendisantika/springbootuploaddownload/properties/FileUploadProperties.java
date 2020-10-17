package com.hendisantika.springbootuploaddownload.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-upload-download
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/10/20
 * Time: 04.51
 */
@Data
@ConfigurationProperties(prefix = "file.upload")
public class FileUploadProperties {
    private String location;
}
