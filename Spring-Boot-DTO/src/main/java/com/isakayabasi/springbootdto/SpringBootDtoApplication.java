package com.isakayabasi.springbootdto;

import com.isakayabasi.springbootdto.model.Location;
import com.isakayabasi.springbootdto.model.User;
import com.isakayabasi.springbootdto.repository.LocationRepository;
import com.isakayabasi.springbootdto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootDtoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDtoApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public void run(String... args) throws Exception {

        Location location = new Location();
        location.setPlace("Pune");
        location.setDescription("Pune is great place to live");
        location.setLongitude(40.5);
        location.setLatitude(30.6);
        locationRepository.save(location);

        User user1 = new User();
        user1.setFirstName("isa");
        user1.setLastName("kayabasi");
        user1.setEmail("isakayabasi@Gmail.com");
        user1.setPassword("secret");
        user1.setLocation(location);
        userRepository.save(user1);


        User user2 = new User();
        user2.setFirstName("husfur");
        user2.setLastName("sahgur");
        user2.setEmail("husfur_sahgur@Gmail.com");
        user2.setPassword("secret");
        user2.setLocation(location);
        userRepository.save(user2);

    }
}
