package com.cristiane.springKafka.core.usecase.impl;

import com.cristiane.springKafka.core.dataprovider.FindAddressByZipCode;
import com.cristiane.springKafka.core.dataprovider.UpdateCustomer;
import com.cristiane.springKafka.core.domain.Customer;
import com.cristiane.springKafka.core.usecase.FindCustomerByIdUseCase;
import com.cristiane.springKafka.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCode findAddressByZipCode,
            UpdateCustomer updateCustomer
    ) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.getId());
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }

}
