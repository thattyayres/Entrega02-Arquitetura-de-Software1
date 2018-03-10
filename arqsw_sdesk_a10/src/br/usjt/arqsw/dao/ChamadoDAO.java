package br.usjt.arqsw.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.usjt.arqsw.entity.*;

public class ChamadoDAO {
	
	public ArrayList<Chamado> listarChamado(int id_fila) throws IOException {
		String query = "select * from chamado where =" + id_fila;
		ArrayList<Chamado> lista = new ArrayList<>();
		try(Connection conn = ConnectionFactory.getConnection();
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();){
			
			while(rs.next()) {
				Fila filas = new Fila();
				Chamado chamado = new Chamado();
				chamado.setId_chamado(rs.getInt("id_chamado"));
				chamado.setDescricao(rs.getString("descricao"));
				chamado.setStatus(rs.getString("status"));
				chamado.setDt_abertura(rs.getDate("dt_abertura"));
				chamado.setDt_fechamento(rs.getDate("dt_fechamento"));
				filas.setId(rs.getInt("id_fila"));
				chamado.setFila(filas);
				lista.add(chamado);
			}
			
		} catch (SQLException e) {
			throw new IOException(e);
		}
		return lista;
	}

}
