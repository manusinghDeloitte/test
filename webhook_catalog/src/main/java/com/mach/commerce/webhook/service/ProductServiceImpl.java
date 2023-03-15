package com.mach.commerce.webhook.service;

import com.mach.commerce.webhook.model.Product;
import com.mach.commerce.webhook.mapper.ProductMapper;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductDataService {

    static final String PRODUCT_TOPIC = "productTopic";
    private final ProductMapper productMapper;

    Product productDTO;
    @Autowired
    KafkaTemplate<String, Product> productKafkaTemplate;

    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public Product setProductValues(Product payloadData) {
        productDTO = productMapper.productDetailsReturn(payloadData);
        productKafkaTemplate.send(new ProducerRecord<String, Product>(ProductServiceImpl.PRODUCT_TOPIC, productDTO));
        return payloadData;
    }
}
