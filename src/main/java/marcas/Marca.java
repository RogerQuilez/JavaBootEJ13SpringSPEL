package marcas;

public class Marca {
	
	private static final String[] MARCA_ORDENADORES =
			new String[] {"HP", "Asus", "Dell", "Acer"};
	
	private static final String[] MARCA_PROCESADORES =
			new String[] {"AMD", "Intel", "CML", "NXP"};
	
	private static final String[] MARCA_GRAFICAS =
			new String[] {"AMD", "Nvidia"};
	
	private static final String[] MARCA_PERIFERICOS =
			new String[] {"Asus", "Acer", "BenQ", "Dell"};
	
	private static final String[] MARCA_PLACAS_BASE =
			new String[] {"AsRock", "ASUS", "Biostar", "Intell"};

	public static String[] getMarcaOrdenadores() {
		return MARCA_ORDENADORES;
	}

	public static String[] getMarcaProcesadores() {
		return MARCA_PROCESADORES;
	}

	public static String[] getMarcaGraficas() {
		return MARCA_GRAFICAS;
	}

	public static String[] getMarcaPerifericos() {
		return MARCA_PERIFERICOS;
	}

	public static String[] getMarcaPlacasBase() {
		return MARCA_PLACAS_BASE;
	}	

}
