package com.cristiane.springKafka.dataprovider;

import com.cristiane.springKafka.core.dataprovider.InsertCustomer;
import com.cristiane.springKafka.core.domain.Customer;
import com.cristiane.springKafka.dataprovider.repository.CustomerRepository;
import com.cristiane.springKafka.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
