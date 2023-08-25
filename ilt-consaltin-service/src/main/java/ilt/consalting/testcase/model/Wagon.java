package ilt.consalting.testcase.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "")
public class Wagon {
    @Id
    private UUID id;

    @OneToOne
    private WagonPassport passport;
    @OneToOne
    @Enumerated(EnumType.STRING)
    private Cargo cargo;
    private Long number;
    private Long cargoWeight;
    private Long wagonWeight;
}
