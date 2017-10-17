package test.Round;

import static org.junit.Assert.assertEquals;

import main.Util.Round;
import org.junit.Test;

import java.math.BigDecimal;

public class RoundTest {

    Round round = new Round();

    @Test
    public void roundToNearestFiveCentTest1(){
        BigDecimal amount = round.roundToNearestFiveCent(new BigDecimal("1.12"));
        amount = round.roundTo2DecPlaces(amount);
        assertEquals(amount, new BigDecimal("1.15"));

    }

    @Test
    public void roundToNearestFiveCentTest2(){
        BigDecimal amount = round.roundToNearestFiveCent(new BigDecimal("1.10"));
        amount = round.roundTo2DecPlaces(amount);
        assertEquals(amount, new BigDecimal("1.10"));
    }

    @Test
    public void roundToNearestFiveCentTest3(){
        BigDecimal amount = round.roundToNearestFiveCent(new BigDecimal("1.15"));
        amount = round.roundTo2DecPlaces(amount);
        assertEquals(amount, new BigDecimal("1.15"));
    }
}
