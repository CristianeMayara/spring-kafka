package com.cristiane.springKafka.dataprovider;

import com.cristiane.springKafka.core.dataprovider.SendCpfForValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfForValidationImpl implements SendCpfForValidation {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);
    }

}
