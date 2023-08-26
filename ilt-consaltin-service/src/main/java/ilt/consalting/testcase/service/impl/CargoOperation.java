package ilt.consalting.testcase.service.impl;

import ilt.consalting.testcase.model.Cargo;
import ilt.consalting.testcase.service.Operation;

import java.util.UUID;

public class CargoOperation implements Operation<Cargo> {
    @Override
    public Cargo findById(UUID id) {
        return null;
    }

    @Override
    public Cargo save(Cargo dto) {
        return null;
    }

    @Override
    public Cargo update(Cargo dto) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
