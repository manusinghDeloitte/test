package com.mach.commerce.webhook.service;

import com.mach.commerce.webhook.model.Product;

public interface ProductDataService {
    Product setProductValues(Product payloadData);
}
