package ilt.consalting.testcase.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "")
public class Nomenclature {

    @Id
    private UUID id;

    @OneToMany
    private Set<Wagon> wagons;

}
