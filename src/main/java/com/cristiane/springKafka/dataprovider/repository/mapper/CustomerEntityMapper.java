package com.cristiane.springKafka.dataprovider.repository.mapper;

import com.cristiane.springKafka.core.domain.Customer;
import com.cristiane.springKafka.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
