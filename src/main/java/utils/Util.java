package utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Util {

	public static double generateRandomNumber(int min, int max) {
		return (Math.random() * ((max - min) + 1)) + min;
	}
	
	public static String getRandomMarca() {
		String[] marcas = new String[] {"Acer", "Nvidia", "HP", "ASUS"};
		int index = (int)Util.generateRandomNumber(0, 3);
		return marcas[index];
	}
	
	public static String formatNumber(double number) {
		NumberFormat formatter = new DecimalFormat("#.##");
		return formatter.format(number);
	}
}
