package dao;

import java.sql.Connection;
import model.Pessoa;
import db.ConexaoBD;
import java.sql.*;

public class PessoaDAO extends ConexaoBD {

    public boolean inserir(Pessoa pessoa) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConexaoBD.abrirConexao();

            String sql = "INSERT INTO pessoa (nome, sexo, idade) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setInt(3, pessoa.getIdade());

            stmt.executeUpdate();

            System.out.println("Pessoa inserida com sucesso");
            conn.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro: ");
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro: ");
                e.printStackTrace();
            }
        }
    }

    public boolean deletar(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // Verifica se a pessoa existe
            if (consultar(id)) {
                conn = ConexaoBD.abrirConexao();

                String sql = "DELETE FROM pessoa WHERE id=?";
                stmt = conn.prepareStatement(sql);
                stmt.setInt(1, id);

                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Pessoa com id: " + id + " foi deletada");
                    return true;
                } else {
                    System.out.println("Nenhuma pessoa foi deletada.");
                    return false;
                }
            } else {
                System.out.println("Pessoa com id: " + id + " não existe.");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro: ");
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao fechar os recursos: ");
                e.printStackTrace();
            }
        }
    }

    public boolean consultar(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConexaoBD.abrirConexao();

            String sql = "SELECT * FROM pessoa WHERE id=?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            if (rs.next()) { // se existe pessoa com esse id no banco
                return true;
            } else {
                System.out.println("Não foi encontrado o id=" + id + " no banco");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro: ");
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao fechar os recursos: ");
                e.printStackTrace();
            }
        }
    }

}
