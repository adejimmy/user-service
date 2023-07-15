package com.example.awscicd;

import com.example.awscicd.exampletest.User;
import com.example.awscicd.exampletest.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
@RequestMapping("/users")
public class AwscicdApplication {

	@Autowired
	private UserDao userDao;

	@GetMapping
	public List<User> fetchOrders() {
		return userDao.getUsers().stream().
				sorted(Comparator.comparing(User::getBankbalance)).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		SpringApplication.run(AwscicdApplication.class, args);
	}

}
