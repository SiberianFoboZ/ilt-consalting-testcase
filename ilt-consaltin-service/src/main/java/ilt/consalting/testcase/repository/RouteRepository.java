package ilt.consalting.testcase.repository;

import ilt.consalting.testcase.model.Route;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface RouteRepository extends CrudRepository<Route, UUID> {
}
