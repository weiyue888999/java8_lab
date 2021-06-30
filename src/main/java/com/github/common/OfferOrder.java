package com.github.common;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OfferOrder {

    private Long offerId;

    private Long quantity;

    private Long signQuantity;
}
