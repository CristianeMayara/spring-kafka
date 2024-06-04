package com.cristiane.springKafka.entrypoint.controller.mapper;

import com.cristiane.springKafka.core.domain.Customer;
import com.cristiane.springKafka.entrypoint.controller.request.CustomerRequest;
import com.cristiane.springKafka.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

}
