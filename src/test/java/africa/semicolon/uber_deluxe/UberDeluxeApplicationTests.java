package africa.semicolon.uber_deluxe;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UberDeluxeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testDatabaseConnection(){
		DriverManagerDataSource dataSource =
				new DriverManagerDataSource("jdbc:mysql://127.0.0.1:3306/uberdeluxe");
		try {
			Connection connection = dataSource.getConnection("Martha", "DrDanladi@@2020");
			System.out.println(connection);
			assertThat(connection).isNotNull();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
//		DataSource dataSource =
//				new DriverManagerDataSource("jdbc:mysql://localhost", "Martha", "DrDanladi@@2020");
//		try{"jdbc:postgres://127.0.0.1:5432"
//			Connection connection = dataSource.getConnection();
//			System.out.println(connection);
//			assertThat(connection).isNotNull();
//		}catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
	}

}
