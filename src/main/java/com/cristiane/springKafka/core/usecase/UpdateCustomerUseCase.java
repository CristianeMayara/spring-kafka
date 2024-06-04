package com.cristiane.springKafka.core.usecase;

import com.cristiane.springKafka.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);

}
