package com.cristiane.springKafka.config;

import com.cristiane.springKafka.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.cristiane.springKafka.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.cristiane.springKafka.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            DeleteCustomerByIdImpl deleteCustomerById,
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase
    ) {
        return new DeleteCustomerByIdUseCaseImpl(deleteCustomerById, findCustomerByIdUseCase);
    }

}
