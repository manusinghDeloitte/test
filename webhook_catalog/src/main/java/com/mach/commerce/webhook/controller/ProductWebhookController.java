package com.mach.commerce.webhook.controller;

import com.mach.commerce.webhook.api.ProductApi;
import com.mach.commerce.webhook.model.Price;
import com.mach.commerce.webhook.model.Product;
import com.mach.commerce.webhook.service.PriceDataService;
import com.mach.commerce.webhook.service.ProductDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductWebhookController implements ProductApi {

    @Autowired
    private PriceDataService priceDataService;
    @Autowired
    private ProductDataService productDataService;
    Price priceDTO;
    Product productDTO;

    @Override
    public ResponseEntity<Object> publishProductWebhook(Product message) {
        // Include whatever required going forward in Headers
        if (message != null) {
            Price priceFromProductPayload = message.getEvent().get(0).
                    getData().getResource().getValues().getPrice();
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("MyResponseHeader", "MyValue");
            productDataService.setProductValues(message);
            priceDataService.setPriceValues(priceFromProductPayload);
        }
        return ResponseEntity.ok(message);
    }
}
