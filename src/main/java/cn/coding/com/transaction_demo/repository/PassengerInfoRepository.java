package cn.coding.com.transaction_demo.repository;

import cn.coding.com.transaction_demo.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {
}
