package cn.coding.com.transaction_demo.repository;

import cn.coding.com.transaction_demo.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {
}
