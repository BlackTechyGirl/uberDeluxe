package africa.semicolon.uber_deluxe.config.app;

import africa.semicolon.uber_deluxe.config.distance.DistanceConfig;
import africa.semicolon.uber_deluxe.config.mail.MailConfig;
import africa.semicolon.uber_deluxe.config.security.util.JwtUtil;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Configuration
@RequiredArgsConstructor
public class AppConfig {

    @Value("${google.distance.url}")
    private String googleDistanceUrl;
    @Value("${google.api.key}")
    private String googleApiKey;

    @Value("${mail.api.key}")
    private String mailApiKey;

    @Value("${sendinblue.mail.url}")
    private String mailUrl;

    @Value("${jwt.secret.key}")
    private String jwtSecret;

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

//    @Bean
//    public Cloudinary cloudinary(){
//        return new Cloudinary(
//                ObjectUtils.asMap(
//                        "cloud_name",cloudName,
//                        "api_key",apiKey,
//                        "api_secret",apiSecret
//                )
//        );
//    }

    @Bean
    public MailConfig mailConfig(){
        return new MailConfig(mailApiKey, mailUrl);
    }


    @Bean
    public DistanceConfig distanceConfig(){
        return new DistanceConfig(googleDistanceUrl, googleApiKey);
    }


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtUtil jwtUtil(){
        return new JwtUtil(jwtSecret);
    }


}
