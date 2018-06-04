package com.storefront.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class OrderStatusEvent {

    @NonNull
    private Long timestamp;

    @NonNull
    private OrderStatusType orderStatusType;

    private String note;

    public OrderStatusEvent(OrderStatusType orderStatusType) {

        this.timestamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.orderStatusType = orderStatusType;
    }

    public OrderStatusEvent(OrderStatusType orderStatusType, String note) {

        this.timestamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.orderStatusType = orderStatusType;
        this.note = note;
    }
}
