package com.springboot.tutorial.service;

import com.springboot.tutorial.dto.FlightBookingAcknowledgement;
import com.springboot.tutorial.dto.FlightBookingRequest;
import com.springboot.tutorial.entity.PassengerInfo;
import com.springboot.tutorial.entity.PaymentInfo;
import com.springboot.tutorial.repository.PassengerInfoRepository;
import com.springboot.tutorial.repository.PaymentInfoRepository;
import com.springboot.tutorial.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author arlund
 */
@Service
public class FlightBookingServiceImpl {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest flightBookingRequest) {
        FlightBookingAcknowledgement acknowledgement = null;

        PassengerInfo passengerInfo = flightBookingRequest.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = flightBookingRequest.getPaymentInfo();
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);

        return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(),
                UUID.randomUUID().toString().split("-")[0], passengerInfo);
    }

}
