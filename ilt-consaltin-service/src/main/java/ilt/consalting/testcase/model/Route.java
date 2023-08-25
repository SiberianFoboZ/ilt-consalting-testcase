package ilt.consalting.testcase.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table
public class Route {
    @Id
    private UUID id;
    private String station;
    private Long way;
}
