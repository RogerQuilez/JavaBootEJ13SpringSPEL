package utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Util {

	public static double generateRandomNumber(int min, int max) {
		return (Math.random() * ((max - min) + 1)) + min;
	}
	
	public static String formatNumber(double number) {
		NumberFormat formatter = new DecimalFormat("#.##");
		return formatter.format(number);
	}
	
	public static String getRandomMarca(String[] marcas) {
		int index = (int)Util.generateRandomNumber(0, marcas.length - 1);
		return marcas[index];
	}

}
