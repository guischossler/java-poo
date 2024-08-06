package dao;

import java.sql.Connection;
import model.Pessoa;
import db.ConexaoBD;
import java.sql.*;
import java.util.ArrayList;

public class PessoaDAO extends ConexaoBD {

    public boolean inserir(Pessoa pessoa) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConexaoBD.abrirConexao();

            String sql = "INSERT INTO pessoa (nome, sexo, telefone, email, dt_nascimento, ativo) VALUES (?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, String.valueOf(pessoa.getSexo()));
            stmt.setString(3, pessoa.getTelefone());
            stmt.setString(4, pessoa.getEmail());
            stmt.setString(5, pessoa.getDtNascimento());
            stmt.setBoolean(6, pessoa.isAtivo());

            stmt.executeUpdate();

            System.out.println("Pessoa inserida com sucesso");
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
                System.out.println("Erro: ");
                e.printStackTrace();
            }
        }
    }

    public void MostrarEmLista(ArrayList<Pessoa> p) {
        System.out.println("#### PESSOAS ####");

        for (int i = 0; i < p.size(); i++) {
            System.out.println(p.get(i).toString());
        }

        System.out.println("#################");
    }

    public ArrayList<Pessoa> consultarTodos() {
        ArrayList<Pessoa> ps = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConexaoBD.abrirConexao();
            String sql = "SELECT * FROM pessoa";

            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Pessoa p = new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setSexo(rs.getString("sexo").charAt(0));
                p.setTelefone(rs.getString("telefone"));
                p.setEmail(rs.getString("email"));
                p.setDtNascimento(rs.getString("dt_nascimento"));
                p.setAtivo(rs.getBoolean("ativo"));

                ps.add(p);

            }
        } catch (SQLException e) {
            System.out.println("Erro: ");
            e.printStackTrace();
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
                System.out.println("Erro: ");
                e.printStackTrace();
            }
        }

        return ps;
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
                System.out.println("Erro: ");
                e.printStackTrace();
            }
        }
    }

}
