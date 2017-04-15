package com.priceaggregator.dto;

import org.pojomatic.annotations.AutoProperty;

import java.math.BigDecimal;

/**
 * Created by lakshmikanth on 29/1/17.
 */
@AutoProperty
public class QuoteRequestDTO extends BaseDTO{

    private String quoteRequestId;
    private BigDecimal price;
    private Boolean isTicketAvailable;


}
