package com.springboot.tutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author arlund
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PAYMENT_INFO")
public class PaymentInfo {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String paymentId;

    private String accountNo;

    private double amount;

    private String cardType;

    private Long passengerId;

}
