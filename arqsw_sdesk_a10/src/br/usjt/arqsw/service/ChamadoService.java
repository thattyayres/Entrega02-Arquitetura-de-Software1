package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arqsw.dao.*;
import br.usjt.arqsw.entity.*;

public class ChamadoService {
	private ChamadoDAO dao;
		
	public ChamadoService() {
		dao = new ChamadoDAO();
	}
	public ArrayList<Chamado> listarChamado(int id_fila) throws IOException{
		return dao.listarChamado(id_fila);
	}
	public Chamado carregar(int id) throws IOException{
		// TODO Auto-generated method stub
		return null;
	}
	

}
