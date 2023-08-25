package ilt.consalting.testcase.repository;

import ilt.consalting.testcase.model.Cargo;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CargoRepository extends CrudRepository<Cargo, UUID> {
}
