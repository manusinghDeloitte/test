package com.mach.commerce.webhook.controller;

import com.mach.commerce.webhook.api.PriceApi;
import com.mach.commerce.webhook.model.Price;
import com.mach.commerce.webhook.service.PriceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceWebhookController implements PriceApi {
    @Autowired
    private PriceDataService priceDataService;
    @Override
    public ResponseEntity<Object> publishPriceWebhook(Price message) {
        if (message != null) {
            // Need to confirm what all Headers are needed
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("MyResponseHeader", "MyValue");
            priceDataService.setPriceValues(message);
        }
        return ResponseEntity.ok(message);
    }
}
