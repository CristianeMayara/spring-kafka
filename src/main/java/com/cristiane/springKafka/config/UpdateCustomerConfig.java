package com.cristiane.springKafka.config;

import com.cristiane.springKafka.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.cristiane.springKafka.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.cristiane.springKafka.dataprovider.FindAddressByZipCodeImpl;
import com.cristiane.springKafka.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }

}
