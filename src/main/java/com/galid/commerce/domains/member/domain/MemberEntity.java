package com.galid.commerce.domains.member.domain;

import com.galid.commerce.common.config.logging.BaseEntity;
import com.galid.commerce.common.config.value.Address;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="members")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberEntity extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Embedded
    private Address address;

    @Builder
    private MemberEntity(String name, Address address) {
        this.name = name;
        this.address = address;
    }

}
