package com.cristiane.springKafka.config;

import com.cristiane.springKafka.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.cristiane.springKafka.dataprovider.FindAddressByZipCodeImpl;
import com.cristiane.springKafka.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer);
    };

}
