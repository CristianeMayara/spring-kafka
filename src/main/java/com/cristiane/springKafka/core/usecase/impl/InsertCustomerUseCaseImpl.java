package com.cristiane.springKafka.core.usecase.impl;

import com.cristiane.springKafka.core.dataprovider.FindAddressByZipCode;
import com.cristiane.springKafka.core.dataprovider.InsertCustomer;
import com.cristiane.springKafka.core.domain.Customer;
import com.cristiane.springKafka.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;
    private final InsertCustomer  insertCustomer;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
    }

}
