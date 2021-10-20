package service.impl;

import entity.Computer;
import repository.OrdenadorRepository;
import service.OrdenadorService;

public class OrdenadorServiceImpl implements OrdenadorService {
	
	private OrdenadorRepository ordenadorRepo;

	@Override
	public String guardarOrdenador(Computer ordenador) {
		if (ordenadorRepo.guardarOrdenador(ordenador))
			return "Objeto guardado Correctamente en el fichero 'Ordenador.txt'\n"
					+ "Refresque el proyecto para visualizarlo";
		else
			return "Error al guardar el objeto";
		
	}

	public OrdenadorRepository getOrdenadorRepo() {
		return ordenadorRepo;
	}

	public void setOrdenadorRepo(OrdenadorRepository ordenadorRepo) {
		this.ordenadorRepo = ordenadorRepo;
	}

}
