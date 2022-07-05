package com.isakayabasi.springbootdto.repository;


import com.isakayabasi.springbootdto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long > {
}
