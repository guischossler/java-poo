package db;

import java.sql.*;

public abstract class ConexaoBD {

    private static Connection conn = null;

    public ConexaoBD() {
        // Construtor vazio
    }

    public final static Connection abrirConexao() {
        try {
            String url = "jdbc:postgresql://localhost/teste";
            String user = "postgres";
            String password = "postgresql";
            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Sucesso ao conectar ao BD");
        } catch (SQLException ex) {
            System.out.println("Erro: Não conseguiu conectar no BD:");
            ex.printStackTrace();
        } catch (Exception e) {
            System.out.println("Erro inesperado:");
            e.printStackTrace();
        }

        return conn;
    }

    /*public final void fecharConexao() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("BD desconectado com sucesso");
            } else {
                System.out.println("Não existe uma conexão aberta");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão:");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Erro inesperado ao fechar conexão:");
            e.printStackTrace();
        }
    }
     */
}
