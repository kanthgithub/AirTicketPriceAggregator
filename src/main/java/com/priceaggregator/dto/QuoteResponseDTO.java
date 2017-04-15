package com.priceaggregator.dto;

import org.pojomatic.annotations.AutoProperty;

import java.math.BigDecimal;

/**
 * Created by lakshmikanth on 29/1/17.
 */
@AutoProperty
public class QuoteResponseDTO extends BaseDTO{

    private String quoteRequestId;
    private BigDecimal price;
    private Boolean isTicketAvailable;


}
