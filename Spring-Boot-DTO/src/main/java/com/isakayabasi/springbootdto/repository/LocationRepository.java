package com.isakayabasi.springbootdto.repository;

import com.isakayabasi.springbootdto.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
