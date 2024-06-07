package com.cristiane.springKafka.entrypoint.consumer.mapper;

import com.cristiane.springKafka.core.domain.Customer;
import com.cristiane.springKafka.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
