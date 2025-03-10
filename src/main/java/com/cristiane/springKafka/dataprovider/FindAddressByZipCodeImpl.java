package com.cristiane.springKafka.dataprovider;

import com.cristiane.springKafka.core.dataprovider.FindAddressByZipCode;
import com.cristiane.springKafka.core.domain.Address;
import com.cristiane.springKafka.dataprovider.client.FindAddressByZipCodeClient;
import com.cristiane.springKafka.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
