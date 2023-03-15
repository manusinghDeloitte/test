package com.mach.commerce.webhook.mapper;

import com.mach.commerce.webhook.model.Price;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-09T13:38:04+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20221215-1352, environment: Java 17.0.5 (Eclipse Adoptium)"
)
@Component
public class PriceMapperImpl implements PriceMapper {

    @Override
    public Price priceDetailsReturn(Price price) {
        if ( price == null ) {
            return null;
        }

        Price price1 = new Price();

        price1.setLocale( price.getLocale() );
        price1.setScope( price.getScope() );
        price1.setData( price.getData() );

        return price1;
    }
}
