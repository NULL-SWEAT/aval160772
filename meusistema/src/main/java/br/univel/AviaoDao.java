package br.univel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AviaoDao {

	private static final String SQL_BUSCA_TODOS = "SELECT * FROM aviao";
	
	Connection con = conexaoBanco.getInstance().getConnection();

	public List<Aviao> getTodos() {
		
		List<Aviao> lista = new ArrayList<>();
		try (PreparedStatement ps = con
					.prepareStatement(SQL_BUSCA_TODOS);
				ResultSet rs = ps.executeQuery()) {
			
			while (rs.next()) {
				Aviao a = new Aviao();
				a.setId(rs.getLong(1));
				a.setNome(rs.getString(2));
				a.setCor(rs.getString(3));
				a.setNumMotores(rs.getInt(4));
				lista.add(a);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public void insere(Aviao a) {
		String sql = "INSERT INTO aviao (id, nome, cor, numMotores) VALUES(" +
				a.getId() + "," + a.getNome() + "," + a.getCor() + "," + a.getNumMotores() + ")";
		
		try {
			con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualiza(Long id, Aviao a) {
		String sql = "UPDATE aviao SET nome="+a.getNome()+", cor="+a.getCor()+", numMotores="+a.getNumMotores()+
				"WHERE id=" + id;
		
		try {
			con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void exclui(Long id) {
		String sql = "DELETE FROM aviao WHERE id=" + id;
		
		try {
			con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
