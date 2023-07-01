package africa.semicolon.uber_deluxe.cloud;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static africa.semicolon.uber_deluxe.util.AppUtilities.UBER_DELUXE_TEST_IMAGE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class CloudinaryCloudServiceImplTest {

    @Autowired
    private CloudService cloudService;

    private MockMultipartFile file;

    @BeforeEach
    void setUp() throws IOException {
        file =
                new MockMultipartFile("puppy",
                        new FileInputStream(UBER_DELUXE_TEST_IMAGE));
    }

    @Test
    void uploadTest() {
        var cloudinaryImageUrl = cloudService.upload(file);
        assertThat(cloudinaryImageUrl).isNotNull();
    }
}
