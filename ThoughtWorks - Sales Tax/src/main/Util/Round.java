package main.Util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Round {
    public Round(){}

    public BigDecimal roundToNearestFiveCent(BigDecimal amount){
        BigDecimal finalAmount =  new BigDecimal(Math.ceil(amount.doubleValue() * 20) / 20);
        finalAmount .setScale(2, RoundingMode.HALF_UP);
        return finalAmount;
    }

    public BigDecimal roundTo2DecPlaces(BigDecimal amount){
        return amount.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

}
