package com.cristiane.springKafka.core.dataprovider;

import com.cristiane.springKafka.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);

}
