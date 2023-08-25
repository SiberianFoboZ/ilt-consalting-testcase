package ilt.consalting.testcase.repository;

import ilt.consalting.testcase.model.Train;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TrainRepository extends CrudRepository<Train, UUID> {
}
