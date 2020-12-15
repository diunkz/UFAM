package connection;
import java.sql.*;

import base.Candidato;
import base.Eleitor;

public class BancoDeDados {
	private static String url = "jdbc:mysql://localhost:3306/EleicaoBD";
	String user;
	String pass;
	public static Connection conexao = null;
	
	public BancoDeDados(){
		
	}
	
	public BancoDeDados(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}
	
	public boolean conecta() {
		try {
			BancoDeDados.conexao = DriverManager.getConnection(url, user, pass);
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public boolean desconecta() {
		try {
			conexao.close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public static Connection getConexao() {
		return BancoDeDados.conexao;
	}
	
	public static void listarEleitores() {
		try {
			Statement st = getConexao().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM eleitores");
			System.out.println("ELEITORES\nID - Nome - Título\n");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
			}
			System.out.println();
		} catch (SQLException e) {
		}
	}
	
	public static String mostrarEleitores() {
		String result;
		try {
			result = "ELEITORES\n\nID - Eleitor - Título de Eleitor\n\n";
			Statement st = getConexao().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM eleitores");
			while(rs.next()) {
				result += (rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + "\n" );
			}
		}catch (SQLException e) {
			result = "Falha no programa!";
		}
		return result;
	}
	
	public static boolean adicionarEleitor(Eleitor eleitor) {
		try {
			Statement st = getConexao().createStatement();
			st.executeUpdate("INSERT INTO eleitores VALUES (NULL, '" + eleitor.getNome() + "', '" + eleitor.getTitulo() + " ') ");
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public static boolean removerEleitor(int id) {
		try {
			Statement st = getConexao().createStatement();
			st.executeUpdate("DELETE FROM eleitores WHERE id =" + String.valueOf(id));
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public static boolean removerTodosOsEleitores() {
		try {
			Statement st = getConexao().createStatement();
			st.executeUpdate("TRUNCATE TABLE eleitores");
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public static boolean mudarNomeEleitor(int id, String nome) {
		try {
			Statement st = getConexao().createStatement();
			st.executeUpdate("UPDATE eleitores SET nome='" + nome + "' WHERE id=" + String.valueOf(id));
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public static boolean mudarTituloEleitor(int id, int titulo) {
		try {
			Statement st = getConexao().createStatement();
			st.executeUpdate("UPDATE eleitores SET titulo=" + String.valueOf(titulo) + " WHERE id=" + String.valueOf(id));
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public static void mudarEleitor(int id, String nome, int numero) {
		mudarTituloEleitor(id, numero);
		mudarNomeEleitor(id, nome);
	}
		
	//funções para candidatos
	
	public static void listarCandidatos() {
		try {
			Statement st = getConexao().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM candidatos");
			System.out.println("CANDIDATOS\nID - Nome - Número\n");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
			}
			System.out.println();
		} catch (SQLException e) {
		}
	}
	
	public static String mostrarCandidatos() {
		String result;
		try {
			result = "CANDIDATOS\n\nID - Candidato - Número do Candidato\n\n";
			Statement st = getConexao().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM candidatos");
			while(rs.next()) {
				result += (rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + "\n" );
			}
		}catch (SQLException e) {
			result = "Falha no programa!";
		}
		return result;
	}
	
	public static boolean adicionarCandidato(Candidato candidato) {
		try {
			Statement st = getConexao().createStatement();
			st.executeUpdate("INSERT INTO candidatos VALUES (NULL, '" + candidato.getNome() + "', '" + candidato.getNumero() + " ') ");
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public static boolean removerCandidato(int id) {
		try {
			Statement st = getConexao().createStatement();
			st.executeUpdate("DELETE FROM candidatos WHERE id =" + String.valueOf(id));
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public static boolean removerTodosOsCandidatos() {
		try {
			Statement st = getConexao().createStatement();
			st.executeUpdate("TRUNCATE TABLE candidatos");
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public static boolean mudarNomeCandidato(int id, String nome) {
		try {
			Statement st = getConexao().createStatement();
			st.executeUpdate("UPDATE candidatos SET nome='" + nome + "' WHERE id=" + String.valueOf(id));
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public static boolean mudarNumeroCandidato(int id, int numero) {
		try {
			Statement st = getConexao().createStatement();
			st.executeUpdate("UPDATE candidatos SET numero=" + String.valueOf(numero) + " WHERE id=" + String.valueOf(id));
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public static void mudarCandidato(int id, String nome, int numero) {
		mudarNumeroCandidato(id, numero);
		mudarNomeCandidato(id, nome);
	}
	
}