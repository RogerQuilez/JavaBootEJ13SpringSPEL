package utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Util {

	public static double generateRandomNumber(int min, int max) {
		return (Math.random() * ((max - min) + 1)) + min;
	}
	
	public static String getRandomMarcaOrdenador() {
		String[] marcasOrdenador = new String[] {"HP", "Asus", "Dell", "Acer"};
		return getElement(marcasOrdenador, marcasOrdenador.length);
	}
	
	public static String getRandomMarcaProcesador() {
		String[] marcasProcesador = new String[] {"AMD", "Intel", "CML", "NXP"};
		return getElement(marcasProcesador, marcasProcesador.length);
	}
	
	public static String getRandomMarcaGrafica() {
		String[] marcasGrafica = new String[] {"AMD", "Nvidia"};
		return getElement(marcasGrafica, marcasGrafica.length);
	}
	
	public static String getRandomMarcaPerifericos() {
		String[] marcasPerifericos = new String[] {"Asus", "Acer", "BenQ", "Dell"};
		return getElement(marcasPerifericos, marcasPerifericos.length);
	}
	
	public static String getRandomMarcaPlacaBase() {
		String[] marcasPlacaBase = new String[] {"AsRock", "ASUS", "Biostar", "Intell"};
		return getElement(marcasPlacaBase, marcasPlacaBase.length);
	}
	
	public static String formatNumber(double number) {
		NumberFormat formatter = new DecimalFormat("#.##");
		return formatter.format(number);
	}
	
	public static String getElement(String[] marcas, int arrayLength) {
		int index = (int)Util.generateRandomNumber(0, arrayLength - 1);
		return marcas[index];
	}
}
