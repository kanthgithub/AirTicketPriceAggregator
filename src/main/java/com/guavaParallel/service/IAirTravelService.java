package com.guavaParallel.service;

import com.guavaParallel.dto.QuoteRequestDTO;
import com.guavaParallel.dto.QuoteResponseDTO;

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
