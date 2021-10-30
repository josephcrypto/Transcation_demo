package cn.coding.com.transaction_demo.controller;

import cn.coding.com.transaction_demo.dto.FlightBookingAcknowledgement;
import cn.coding.com.transaction_demo.dto.FlightBookingRequest;
import cn.coding.com.transaction_demo.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private FlightBookingService service;

    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody  FlightBookingRequest request) {
        return service.bookFlightTicket(request);
    }

}
