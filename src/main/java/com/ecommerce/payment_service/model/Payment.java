package com.ecommerce.payment_service.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collection = "payments")
public class Payment {

    @Id
    private String id;

    private String orderId;
    private String customerId;
    private double amount;
    private String paymentMethod;
    private String status;
    private LocalDateTime paymentDate;
}