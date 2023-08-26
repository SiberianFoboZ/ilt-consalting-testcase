package ilt.consalting.testcase.service.impl;

import ilt.consalting.testcase.model.Wagon;
import ilt.consalting.testcase.service.Operation;

import java.util.UUID;

public class WagonOperation implements Operation<Wagon> {
    @Override
    public Wagon findById(UUID id) {
        return null;
    }

    @Override
    public Wagon save(Wagon dto) {
        return null;
    }

    @Override
    public Wagon update(Wagon dto) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
