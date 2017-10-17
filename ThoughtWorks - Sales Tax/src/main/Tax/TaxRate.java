package main.Tax;

import java.math.BigDecimal;

public enum TaxRate {
    GENERAL(new BigDecimal("0.10")),
    IMPORTED(new BigDecimal("0.05")),
    EXEMPT(new BigDecimal("0.00"));

    private BigDecimal taxRate;

    TaxRate(BigDecimal taxRate){
        this.taxRate = taxRate;
    }

    public BigDecimal getTaxRate(){
        return taxRate;
    }
}
