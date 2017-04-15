package com.priceaggregator.service;

import com.priceaggregator.dto.QuoteRequestDTO;
import com.priceaggregator.dto.QuoteResponseDTO;

/**
 * Created by lakshmikanth on 29/1/17.
 */
public interface IAirTravelService {

    /**
     * get the availability of Seats and Price for the Travel-Plan Inputs in QuoteRequestDTO
     * @param quoteRequestDTO
     * @return QuoteResponseDTO
     */
    QuoteResponseDTO getQuoteResponse(QuoteRequestDTO quoteRequestDTO);



}
