package com.springboot.study.vuepro;

import com.springboot.study.vuepro.entity.User;
import com.springboot.study.vuepro.repository.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VueproApplication {

	@Bean
	InitializingBean saveData(UserRepository repo){
		return ()->{
			repo.save(new User("Get to know Spring Boot",Integer.valueOf(12)));
			repo.save(new User("Simple Spring Boot Project",Integer.valueOf(15)));
			repo.save(new User("Spring Boot Reading",Integer.valueOf(18)));
			repo.save(new User("Spring Boot in the Cloud",Integer.valueOf(20)));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VueproApplication.class, args);
	}
}
