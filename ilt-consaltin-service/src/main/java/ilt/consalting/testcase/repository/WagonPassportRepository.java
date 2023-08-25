package ilt.consalting.testcase.repository;

import ilt.consalting.testcase.model.WagonPassport;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface WagonPassportRepository extends CrudRepository<WagonPassport, UUID> {
}
