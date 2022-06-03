package com.galid.commerce.domains.delivery.domain;

import com.galid.commerce.common.config.logging.BaseEntity;
import com.galid.commerce.common.config.value.Address;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "delivery")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DeliveryEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deliveryId;
    @Embedded
    private Address address;

    @Enumerated(value = EnumType.STRING)
    private DeliveryStatus status;

    @Builder
    public DeliveryEntity(Address address) {
        this.address = address;
        this.status = DeliveryStatus.READY_STATUS;
    }




}
