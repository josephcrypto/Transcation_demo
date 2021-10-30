package cn.coding.com.transaction_demo.dto;

import cn.coding.com.transaction_demo.entity.PassengerInfo;
import cn.coding.com.transaction_demo.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;

    private PaymentInfo paymentInfo;
}
