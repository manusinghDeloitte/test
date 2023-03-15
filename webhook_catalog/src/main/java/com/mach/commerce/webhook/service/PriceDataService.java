package com.mach.commerce.webhook.service;

import com.mach.commerce.webhook.model.Price;

public interface PriceDataService {
    Price setPriceValues(Price priceDataFromPayload);
}
