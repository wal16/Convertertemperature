package temperatureconverter.waldemarmozola.example.com.pl.converterutil;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ConverterUtilTest {
    @Test
    public void convertFahrenheitToCelsius() throws Exception {
        float input = 212;
        float output;
        float expected = 100;
        double delta = .1;

        ConverterUtil converterUtil = new ConverterUtil();
        output = converterUtil.convertFahrenheitToCelsius(input);

        assertEquals(expected, output, delta);
    }

    @Test
    public void convertCelsiusToFahrenheit() throws Exception {
        float input = 100;
        float output;
        float expected = 212;
        double delta = .1;

        ConverterUtil converterUtil = new ConverterUtil();
        output = converterUtil.convertCelsiusToFahrenheit(input);

        assertEquals(expected, output, delta);

    }
}