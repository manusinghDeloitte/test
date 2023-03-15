package com.mach.commerce.webhook.mapper;

import com.mach.commerce.webhook.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product productDetailsReturn(Product product);
}
