package com.cristiane.springKafka.core.usecase;

import com.cristiane.springKafka.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);

}
