package kg.db.jpademo;

import kg.db.jpademo.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpademoApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users are -> {}", personJdbcDao.findAll());
		logger.info("User with id 1001 -> {}", personJdbcDao.findById(1001));
		logger.info("User with id 1001 is removed -> {}", personJdbcDao.deleteById(1001));
		logger.info("All users are -> {}", personJdbcDao.findAll());
	}
}
