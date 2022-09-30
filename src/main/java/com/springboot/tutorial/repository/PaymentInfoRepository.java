package com.springboot.tutorial.repository;

import com.springboot.tutorial.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author arlund
 */
@Repository
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {
}
