package click.selfcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbBackupS3CronJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbBackupS3CronJobApplication.class, args);
	}

}
