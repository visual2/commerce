package com.galid.commerce.domains.order.domain;

import lombok.Getter;

@Getter
public enum OrderStatus {
    ORDER_STATUS("주문현황"), CANCEL_STATUS("주문취소");

    private String status;

    OrderStatus(String status) {
        this.status = status;
    }
}
