package controller;

import connection.BancoDeDados;

public class TestandoConexao {
	String user = "usuario";
	String pass = "senha";
	
	TestandoConexao(){
		
	}
	
	public boolean verificarLogin() {
    	BancoDeDados bd = new BancoDeDados(user, pass);
    	if(bd.conecta()) {
    		return true;
    	}else {
    		return false;
    	}
    }
	
	public static void main(String[] args) {
		TestandoConexao x = new TestandoConexao();
		x.verificarLogin();
		System.out.println(BancoDeDados.getConexao());
		BancoDeDados.removerTodosOsCandidatos();
		BancoDeDados.removerTodosOsEleitores();
		System.out.println(BancoDeDados.mostrarCandidatos());
		System.out.println(BancoDeDados.mostrarEleitores());
	}
}
