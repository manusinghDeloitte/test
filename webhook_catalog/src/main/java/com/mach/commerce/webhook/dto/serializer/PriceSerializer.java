package com.mach.commerce.webhook.dto.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mach.commerce.webhook.model.Price;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@AutoConfiguration
public class PriceSerializer implements Serializer<Price> {

	private final ObjectMapper objectMapper = new ObjectMapper();
	
	@Override
    public void configure(Map<String, ?> configs, boolean isKey) {
/*        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);*/
		System.out.println("Serializer Conifgure");
    }

	@Override
    public byte[] serialize(String topic, Price data) {
        try {
            if (data == null){
                System.out.println("Null received at serializing");
                return null;
            }
            System.out.println("Serializing PriceDTO object : ");
            return objectMapper.writeValueAsBytes(data);
        } catch (Exception e) {
            throw new SerializationException("Error when serializing PriceDTO to byte[]");
        }
    }
	
	@Override
    public void close() {
        // nothing to do
    }
	

}
