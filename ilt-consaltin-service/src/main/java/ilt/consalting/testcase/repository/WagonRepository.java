package ilt.consalting.testcase.repository;

import ilt.consalting.testcase.model.Wagon;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface WagonRepository extends CrudRepository<Wagon, UUID> {
}
