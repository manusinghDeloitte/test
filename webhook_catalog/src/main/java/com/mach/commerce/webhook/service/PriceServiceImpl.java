package com.mach.commerce.webhook.service;
//com.mach.commerce.webhook
import com.mach.commerce.webhook.mapper.PriceMapper;
import com.mach.commerce.webhook.model.Price;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class PriceServiceImpl implements PriceDataService {

    Price priceDTO;
    private final PriceMapper priceMapper;

    @Autowired
    KafkaTemplate<String, Price> priceKafkaTemplate;

    static final String PRICE_TOPIC = "priceTopic";

    public PriceServiceImpl(PriceMapper priceMapper) {
        this.priceMapper = priceMapper;
    }

    @Override
    public Price setPriceValues(Price priceDataFromPayload) {
        priceDTO = priceMapper.priceDetailsReturn(priceDataFromPayload);

        priceKafkaTemplate.send(new ProducerRecord<String, Price>(PriceServiceImpl.PRICE_TOPIC, priceDTO));
        return priceDataFromPayload;
    }
}
