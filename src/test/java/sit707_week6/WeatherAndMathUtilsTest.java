package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "222590652";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Wenzong Xuan";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
		//Assert.fail("Not yet implemented");
		int oddNumber = 3;
		Assert.assertFalse("Expected odd number to be identified as not even", WeatherAndMathUtils.isEven(oddNumber));
	}
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test
    public void testWeatherAdviceAllClear() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(44.0, 3.9));
    }

    @Test
    public void testWeatherAdviceWarnWindSpeed() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 3.0));
    }

    @Test
    public void testWeatherAdviceWarnPrecipitation() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(40.0, 4.1));
    }

    @Test
    public void testIsEvenTrue() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(2));
    }

    @Test
    public void testIsEvenFalse() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(3));
    }

    @Test
    public void testIsPrimeTrue() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(5));
    }

    @Test
    public void testIsPrimeFalse() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
    }
    
    @Test
    public void testSumNumbersUpTo() {
        Assert.assertEquals(10, WeatherAndMathUtils.sumNumbersUpTo(4)); // 1+2+3+4 = 10
        Assert.assertEquals(55, WeatherAndMathUtils.sumNumbersUpTo(10)); // 1+2+3+4+5+6+7+8+9+10 = 55
    }

    @Test
    public void testCountEvenNumbers() {
        Assert.assertEquals(2, WeatherAndMathUtils.countEvenNumbers(new int[]{1, 2, 3, 4})); 
        Assert.assertEquals(3, WeatherAndMathUtils.countEvenNumbers(new int[]{2, 4, 6, 7})); 
        Assert.assertEquals(0, WeatherAndMathUtils.countEvenNumbers(new int[]{1, 3, 5})); 
    }
}

