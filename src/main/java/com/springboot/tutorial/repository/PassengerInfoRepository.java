package com.springboot.tutorial.repository;

import com.springboot.tutorial.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author arlund
 */
@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, String> {
}
