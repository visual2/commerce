package com.galid.commerce.domains.order.domain;

import com.galid.commerce.common.config.logging.BaseEntity;
import com.galid.commerce.domains.member.domain.MemberEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="orders")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    private int totalAmount;
    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;

    private boolean removed;
    private LocalDateTime removedAt;

    //private MemberEntity orderer;


}
