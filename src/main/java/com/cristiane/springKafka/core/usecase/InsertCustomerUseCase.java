package com.cristiane.springKafka.core.usecase;

import com.cristiane.springKafka.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);

}
