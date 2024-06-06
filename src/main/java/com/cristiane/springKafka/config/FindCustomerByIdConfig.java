package com.cristiane.springKafka.config;

import com.cristiane.springKafka.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.cristiane.springKafka.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ) {
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }

}
