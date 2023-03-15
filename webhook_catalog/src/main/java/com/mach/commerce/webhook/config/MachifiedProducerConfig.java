package com.mach.commerce.webhook.config;

import com.mach.commerce.webhook.dto.serializer.PriceSerializer;
import com.mach.commerce.webhook.dto.serializer.ProductSerializer;
import com.mach.commerce.webhook.model.Price;
import com.mach.commerce.webhook.model.Product;
import com.mach.commerce.webhook.util.Constants;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MachifiedProducerConfig {

	@Bean
    public Map<String, Object> priceConfigFactory() {
    	System.out.println("Inside price config factory");      
      Map<String, Object> configProps = new HashMap<>();
      configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, Constants.BOOTSTRAP_SERVER);
      configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
      configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, PriceSerializer.class);
      return configProps;
    }
    
	@Bean
    public ProducerFactory<String, Price> priceProducerFactory() {
        return new DefaultKafkaProducerFactory<>(priceConfigFactory());
    }
	
	@Bean("priceKafkaTemplate")
    public KafkaTemplate<String, Price> priceKafkaTemplate() {
    	System.out.println("Inside price kafka template");
        return new KafkaTemplate<String, Price>(priceProducerFactory());
    }
	
	@Bean
    public Map<String, Object> productConfigFactory() {
        System.out.println("Inside product producer factory");
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, Constants.BOOTSTRAP_SERVER);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ProductSerializer.class);
        return configProps;
    }

    @Bean
    public ProducerFactory<String, Product> productProducerFactory() {
        return new DefaultKafkaProducerFactory<>(productConfigFactory());
    }
    
    @Bean("productKafkaTemplate")
    public KafkaTemplate<String, Product> productKafkaTemplate() {
    	System.out.println("Inside product kafka template");
        return new KafkaTemplate<String, Product>(productProducerFactory());
    }
}
