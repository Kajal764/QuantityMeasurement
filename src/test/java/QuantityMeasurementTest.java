import org.junit.Assert;
import org.junit.Test;
import quantityMeasurement.UnitConversion;
import quantityMeasurement.UnitMeasurement;
import quantityMeasurement.QuantityMeasureException;

public class QuantityMeasurementTest {

    @Test
    public void whenGivenZeroFeet_ShouldReturnTrue() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,0.0);
        UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,0.0);
        Assert.assertEquals(first,second);
    }

    @Test
    public void whenGivenNull_ShouldReturnFalse() throws QuantityMeasureException {
            UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,0.0);
            UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,null);
            Assert.assertEquals(first,second);
            Assert.assertFalse(first==second);
    }

    @Test
    public void whenGivenReference_ShouldReturntrue() throws QuantityMeasureException {
        UnitMeasurement quantityMeasurement = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,0.0);
        Assert.assertEquals(quantityMeasurement,quantityMeasurement);
    }

    @Test
    public void whenGivenFeetValue_ShouldReturnFalse() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,1.0);
        UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,1.0);
        Assert.assertTrue(first.equals(second));
        Assert.assertEquals(first, second);
    }

//Inch Test case

    @Test
    public void whenGivenZeroInch_ShouldReturnTrue() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,0.0);
        UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,0.0);
        Assert.assertEquals(first,second);
    }

    @Test
    public void whenGivenNullInInch_ShouldReturnFalse() throws QuantityMeasureException {
            UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,0.0);
            UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,null);
        Assert.assertEquals(first,second);

    }

    @Test
    public void whenGivenInchObjectReference_ShouldReturntrue() throws QuantityMeasureException {
        UnitMeasurement quantityMeasurement = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,0.0);
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void whenGivenInchValue_ShouldReturnFalse() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,1.0);
        UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,1.0);
        Assert.assertEquals(first, second);
    }

    //Test Case For Feet To Inch


    @Test
    public void whenGiven0FeetAnd0Inch_IfComaparisonEqual_shouldReturnTrue() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,0.0);
        UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,0.0);
        Assert.assertEquals(first,second);
    }

    @Test
    public void whenGivenZeroFeetAndZeroInch_ShouldReturnZeroInch() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,0.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,0.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertEquals(v1,v2,0.0);
    }

    @Test
    public void whenGivenOneFeetAndOneInch_ShouldReturnFalseInch() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,1.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,1.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertNotEquals(v1,v2,0.0);
    }

    @Test
    public void whenGivenOnefeetAndTwelveInch_ShouldReturnTrue() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,1.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,12.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertEquals(v1,v2,0.0);
    }

    //Added Test Cases For Yard Conversion

    @Test
    public void whenGivenThreefeetAndOneYard_ShouldReturnTrue() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,3.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.YARD,1.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertEquals(v1,v2,0.0);
    }

    @Test
    public void whenGivenOnefeetAndOneYard_ShouldReturnFalse() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,1.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.YARD,1.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertNotEquals(v1,v2,0.0);
    }

    @Test
    public void whenGivenOneInchAndOneYard_ShouldReturnFalse() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,1.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.YARD,1.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertNotEquals(v1,v2,0.0);
    }

    @Test
    public void whenGivenThirtySixInchAndOneYard_ShouldReturnTrue() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,36.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.YARD,1.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertEquals(v1,v2,0.0);
    }

    @Test
    public void whenGivenTwoInchAndFiveCentimeter_ShouldReturnTrue() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,2.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.CENTIMETER,5.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertEquals(v1,v2,0.0);
    }

    @Test
    public void whenGivenOneGallon_ShouldReturnInTrue() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("VOLUMN",UnitMeasurement.UnitType.GALLON,  1.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("VOLUMN",UnitMeasurement.UnitType.LITRE,3.785);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertEquals(v1,v2,0.0);
    }

    @Test
    public void whenGivenOneLitreAndThousandMililiter_ShouldReturnTrue() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("VOLUMN",UnitMeasurement.UnitType.LITRE,  1.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("VOLUMN",UnitMeasurement.UnitType.MILILITER,1000.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertEquals(v1,v2,0.0);
    }

    @Test
    public void whenGivenOnekgAndThousandGrams_ShouldReturnTrue() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("MASS",UnitMeasurement.UnitType.KILOGRAM,  1.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("MASS",UnitMeasurement.UnitType.GRAM,1000.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertEquals(v1,v2,0.0);
    }


    @Test
    public void whenGivenOneTonneAndThousandKilograms_ShouldReturnTrue() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("MASS",UnitMeasurement.UnitType.Tonne,  1.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("MASS",UnitMeasurement.UnitType.KILOGRAM,1000.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertEquals(v1,v2,0.0);
    }


    @Test
    public void whenGivenFahrenheitAndCelcius_ShouldReturnTrue() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("TEMP",UnitMeasurement.UnitType.FAHRENHEIT, 212.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("TEMP",UnitMeasurement.UnitType.CELCIUS,100.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertEquals(v1,v2,0);
    }

    @Test
    public void whenGivenFahrenheitAndCelcius_ShouldReturnFalse() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("TEMP",UnitMeasurement.UnitType.FAHRENHEIT, 212.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("TEMP",UnitMeasurement.UnitType.CELCIUS,100.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertEquals(v1,v2,0);
    }

    @Test
    public void whenGivenFahrenheitAndCelciusWithLength_ShouldReturnFalse() throws QuantityMeasureException {
        UnitMeasurement first = new UnitMeasurement("TEMP",UnitMeasurement.UnitType.FAHRENHEIT, 212.0);
        UnitConversion unit = new UnitConversion(first);
        double v1 = unit.getConvertedValue(first.unitType);
        UnitMeasurement second = new UnitMeasurement("TEMP",UnitMeasurement.UnitType.CELCIUS,100.0);
        UnitConversion unit1 = new UnitConversion(second);
        double v2=unit1.getConvertedValue(second.unitType);
        Assert.assertEquals(first,second);
        Assert.assertEquals(v1,v2,0);
    }

}
