package com.cristiane.springKafka.core.usecase.impl;

import com.cristiane.springKafka.core.dataprovider.FindCustomerById;
import com.cristiane.springKafka.core.domain.Customer;
import com.cristiane.springKafka.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}
