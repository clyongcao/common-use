package myTest;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/*
* @Description
* @author Caoxuyang 
* @date 2019年1月11日 下午1:22:21 
*/
public class BigDecimalTest {

	public static void main(String[] args) {

		BigDecimal tenThousand = new BigDecimal("10000"); 

		BigDecimal guaranteeDepositOriginal = new BigDecimal("50000.00");
		BigDecimal technologyDepositOriginal = new BigDecimal("50000.00");
		BigDecimal commissionRateOriginal = new BigDecimal("5.0");

		BigDecimal guaranteeDeposit = guaranteeDepositOriginal.divide(tenThousand, 2, BigDecimal.ROUND_UP);
		BigDecimal technologyDeposit = technologyDepositOriginal.divide(tenThousand, 2, BigDecimal.ROUND_UP);
		BigDecimal commissionRate = commissionRateOriginal;

		System.out.println("guaranteeDeposit: " + guaranteeDeposit);
		System.out.println("technologyDeposit: " + technologyDeposit);
		System.out.println("commissionRate: " + commissionRate);

	}

	// 取余BD
	@Test
	public void testDivideAndRemainder() {

		BigDecimal amt = new BigDecimal(400);
		BigDecimal[] results = amt.divideAndRemainder(BigDecimal.valueOf(100));
		System.out.println(results[0]);
		System.out.println(results[1]);

	}
	

	@Test
	public void testCompare() {

		BigDecimal aimBigDecimal = new BigDecimal("-100000.00");
		BigDecimal maxBigDecimal = new BigDecimal("100000");
		BigDecimal minBigDecimal = new BigDecimal("0");

		int compareMax = aimBigDecimal.compareTo(maxBigDecimal);
		int compareMin = aimBigDecimal.compareTo(minBigDecimal);
		// int compareResGt = aimBigDecimal.compareTo(maxBigDecimal);

		System.out.println("compareMax："+compareMax);
		System.out.println("compareMin："+compareMin);

	}

	@Test
	public void testDivide() {

		BigDecimal aimBigDecimal = new BigDecimal("10000.55");
		BigDecimal divideBigDecimal = new BigDecimal("10000");

		BigDecimal resBigDecimal = aimBigDecimal.divide(divideBigDecimal);
		// int compareResGt = aimBigDecimal.compareTo(maxBigDecimal);

		System.out.println(resBigDecimal);

	}
	
	@Test
	public void testMultiply() {

		BigDecimal aimBigDecimal = new BigDecimal("10.55");
		BigDecimal divideBigDecimal = new BigDecimal("10000");

		BigDecimal resBigDecimal = aimBigDecimal.multiply(divideBigDecimal);
		// int compareResGt = aimBigDecimal.compareTo(maxBigDecimal);

		System.out.println(resBigDecimal);

	}
	
	@Test
	public void test2() {

		BigDecimal[] BigDecimals1 = new BigDecimal[5];

		BigDecimals1[1] = new BigDecimal("10");
		BigDecimals1[2] = new BigDecimal("20");
		BigDecimals1[3] = new BigDecimal("30");
		BigDecimals1[4] = new BigDecimal("40");
		BigDecimals1[0] = new BigDecimal("50");

		for (BigDecimal bigDecimal : BigDecimals1) {
			System.out.println(bigDecimal);	
		}

	}
	
	@Test
	public void sysoBd() {

		BigDecimal testBd = new BigDecimal("000");
		System.out.println(testBd);
		
	}

}
