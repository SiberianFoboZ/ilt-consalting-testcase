package ilt.consalting.testcase.model;

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
public class Cargo {
    @Id
    private UUID id;
    private String code;
    private String name;
}
