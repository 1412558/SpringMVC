package com.SpringMVC;


import com.SpringMVC.entities.Student;
import com.SpringMVC.service.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class SpringMvcApplication {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

	@Bean
	CommandLineRunner demo() {
		return args -> {
			logger.debug("--Application Started--");
			StudentServiceImpl studentService = new StudentServiceImpl();
//			StudentServiceImpl.deleteAll();

			Student greg = new Student("Greg");
			Student roy = new Student("Roy");
			Student craig = new Student("Craig");

			List<Student> team = Arrays.asList(greg, roy, craig);

			logger.info("Before linking up with Neo4j...");

			team.stream().forEach(person -> logger.info("\t" + person.toString()));
			studentService.createOrUpdate(greg);
			studentService.createOrUpdate(roy);
			studentService.createOrUpdate(craig);

//			greg = personRepository.findByName(greg.getName());
//			greg.worksWith(roy);
//			greg.worksWith(craig);
//			personRepository.save(greg);

//			roy = personRepository.findByName(roy.getName());
//			roy.worksWith(craig);
			// We already know that roy works with greg
//			personRepository.save(roy);

			// We already know craig works with roy and greg

			logger.info("Lookup each person by name...");

		};
	}


}
