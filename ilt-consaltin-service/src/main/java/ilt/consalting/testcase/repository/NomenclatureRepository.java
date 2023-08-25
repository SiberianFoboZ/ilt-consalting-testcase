package ilt.consalting.testcase.repository;

import ilt.consalting.testcase.model.Nomenclature;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface NomenclatureRepository extends CrudRepository<Nomenclature, UUID> {
}
