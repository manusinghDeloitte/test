package com.mach.commerce.webhook.mapper;

import com.mach.commerce.webhook.model.Product;
import com.mach.commerce.webhook.model.ProductEvent;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-09T13:38:05+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20221215-1352, environment: Java 17.0.5 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productDetailsReturn(Product product) {
        if ( product == null ) {
            return null;
        }

        Product product1 = new Product();

        List<ProductEvent> list = product.getEvent();
        if ( list != null ) {
            product1.setEvent( new ArrayList<ProductEvent>( list ) );
        }

        return product1;
    }
}
