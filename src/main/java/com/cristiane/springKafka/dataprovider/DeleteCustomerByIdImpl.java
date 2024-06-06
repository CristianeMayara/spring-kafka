package com.cristiane.springKafka.dataprovider;

import com.cristiane.springKafka.core.dataprovider.DeleteCustomerById;
import com.cristiane.springKafka.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
