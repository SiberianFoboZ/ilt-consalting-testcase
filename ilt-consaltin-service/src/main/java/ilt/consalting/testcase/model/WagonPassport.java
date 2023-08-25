package ilt.consalting.testcase.model;

import ilt.consalting.testcase.enums.WagonType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "")
public class WagonPassport {

    @Id
    private UUID id;

    private String number;
    private WagonType type;
    private Long carring;
    private Long tareWeight;

}
