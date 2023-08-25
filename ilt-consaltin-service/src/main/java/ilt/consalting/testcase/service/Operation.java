package ilt.consalting.testcase.service;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

public interface Operation<T, C, U> {

    default List<T> findAll() {
        return List.of();
    }

    T findById(@NotNull UUID id);

    T save(@Valid C dto);

    T update(@Valid U dto);

    void delete(@NotNull UUID id);
}
