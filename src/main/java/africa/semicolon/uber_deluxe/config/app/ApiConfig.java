//package africa.semicolon.uber_deluxe.config.app;
//
//import africa.semicolon.uber_deluxe.config.mail.MailConfig;
//import com.cloudinary.Cloudinary;
//import com.cloudinary.utils.ObjectUtils;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//
//@Configurable
//public class ApiConfig {
//    @Value("${cloudinary.cloud.name}")
//    private String cloudName;
//    @Value("${cloudinary.api.key}")
//    private String apiKey;
//    @Value("${cloudinary.api.secret}")
//    private String apiSecret;
//
//    @Value("${mail.api.key}")
//    private String mailApiKey;
//
//    @Value("${sendinblue.mail.url}")
//    private String mailUrl;
//
//    @Bean
//    public ModelMapper modelMapper(){
//        return new ModelMapper();
//    }
//
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
//
//    @Bean
//    public MailConfig mailConfig(){
//        return new MailConfig(mailApiKey, mailUrl);
//    }
//}
