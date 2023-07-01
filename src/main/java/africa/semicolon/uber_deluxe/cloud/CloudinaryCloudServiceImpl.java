package africa.semicolon.uber_deluxe.cloud;


import africa.semicolon.uber_deluxe.exception.ImageUploadException;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
@AllArgsConstructor
@Slf4j
public class CloudinaryCloudServiceImpl implements CloudService {
    @Value("${cloudinary.cloud.name")
    private String cloudName;
    @Value("${cloudinary.api.key}")
    private String apiKey;
    @Value("${cloudinary.api.secret")
    private String apiSecret;


    private final Cloudinary cloudinary;

    public CloudinaryCloudServiceImpl(){
        this.cloudinary = new Cloudinary(
                ObjectUtils.asMap(
                        "cloud_name",cloudName,
                        "api_key",apiKey,
                        "api_secret",apiSecret
                )
        );
    }

    @Override
    public String upload(MultipartFile image) {
        try {
            Map<?, ?> response =
                    cloudinary.uploader().upload(image.getBytes(), ObjectUtils.emptyMap());
            return response.get("url").toString();
        } catch (IOException e) {
            throw new ImageUploadException(e.getMessage());
        }
    }
}
