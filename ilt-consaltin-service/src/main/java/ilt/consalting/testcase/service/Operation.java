package ilt.consalting.testcase.service;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

public interface Operation<T> {

    default List<T> findAll() {
        return List.of();
    }

    T findById(@NotNull UUID id);

    T save(@Valid T dto);

    T update(@Valid T dto);

    void delete(@NotNull UUID id);
}
