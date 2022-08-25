package com.example.hibernaterelationonetoone;

import com.example.hibernaterelationonetoone.entity.Gender;
import com.example.hibernaterelationonetoone.entity.User;
import com.example.hibernaterelationonetoone.entity.UserProfile;
import com.example.hibernaterelationonetoone.repository.UserProfileRepository;
import com.example.hibernaterelationonetoone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class HibernateRelationApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(HibernateRelationApplication.class, args);
	}
    @Autowired
	private UserRepository userRepository;
	@Autowired
	private UserProfileRepository userProfileRepository;

	@Override
	public void run(String... args) throws Exception {
		//user object
		User user= new User();
		user.setName("Chandan");
		user.setEmail("mkrk953@gmail.com");

		UserProfile userProfile=new UserProfile();
		userProfile.setAddress("Patna");
		userProfile.setBirthOfDate(LocalDate.of(1994,11,11));
		userProfile.setGender(Gender.MALE);
		userProfile.setPhoneNumber("1234567890");

		user.setUserProfile(userProfile);
		userProfile.setUser(user);

		userRepository.save(user);

	}
}
