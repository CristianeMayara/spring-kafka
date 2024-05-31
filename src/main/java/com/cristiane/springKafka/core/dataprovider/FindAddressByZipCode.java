package com.cristiane.springKafka.core.dataprovider;

import com.cristiane.springKafka.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);

}
