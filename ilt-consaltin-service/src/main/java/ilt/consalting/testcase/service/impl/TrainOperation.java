package ilt.consalting.testcase.service.impl;

import ilt.consalting.testcase.model.Train;
import ilt.consalting.testcase.service.Operation;

import java.util.UUID;

public class TrainOperation implements Operation<Train> {
    @Override
    public Train findById(UUID id) {
        return null;
    }

    @Override
    public Train save(Train dto) {
        return null;
    }

    @Override
    public Train update(Train dto) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
