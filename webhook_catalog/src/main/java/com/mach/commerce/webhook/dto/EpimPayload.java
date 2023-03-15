package com.mach.commerce.webhook.dto;

import com.mach.commerce.webhook.model.Price;
import com.mach.commerce.webhook.model.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EpimPayload {

    public Product productDTO;
    public Price priceDTO;

    public EpimPayload(Price priceDTO, Product productDTO) {
        this.productDTO = productDTO;
        this.priceDTO = priceDTO;
    }
}
