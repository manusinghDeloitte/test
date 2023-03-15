package com.mach.commerce.webhook.mapper;

import com.mach.commerce.webhook.model.Price;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceMapper {

    Price priceDetailsReturn(Price price);
}

