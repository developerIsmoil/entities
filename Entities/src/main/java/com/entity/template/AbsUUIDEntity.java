package com.entity.template;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class AbsUUIDEntity extends AbsMainEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Type(type="pg-uuid")
//    @Type(type = "org.hibernate.PostgresUUIDType")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
}
