package com.cristiane.springKafka.core.usecase.impl;

import com.cristiane.springKafka.core.dataprovider.DeleteCustomerById;
import com.cristiane.springKafka.core.usecase.DeleteCustomerByIdUseCase;
import com.cristiane.springKafka.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    final private DeleteCustomerById deleteCustomerById;

    final private FindCustomerByIdUseCase findCustomerByIdUseCase;

    public DeleteCustomerByIdUseCaseImpl(
            DeleteCustomerById deleteCustomerById,
            FindCustomerByIdUseCase findCustomerByIdUseCase
    ) {
        this.deleteCustomerById = deleteCustomerById;
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdUseCase.find(id);
        deleteCustomerById.delete(id);
    }
}
