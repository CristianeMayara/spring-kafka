package com.cristiane.springKafka.dataprovider.client.mapper;

import com.cristiane.springKafka.core.domain.Address;
import com.cristiane.springKafka.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
