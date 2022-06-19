package ConexaoBD;

	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
	
	public class ConexaoBD {
		
		
			 private final String url = "jdbc:postgresql://localhost/BancoDeDadoLivraria";
			 private final String user = "postgres";
			 private final String password = "123456";
			 Connection conn = null;

			 
			 private static final String QUERY = "select * from autor where id_autor =?";
			 private static final String SELECT_ALL_QUERY = "select * from autor";
			 private static final String SELECT_ALL_QUERY_LIVRO = "select * from livro";
			 private static final String SELECT_ALL_QUERY_CLIENTE ="select * from cliente";
		
			 
			 public Connection connect() {
			        
			        try {
			            conn = DriverManager.getConnection(url, user, password);

			            if (conn != null) {
			                System.out.println("Connected to the PostgreSQL server successfully.");
			            } else {
			                System.out.println("Failed to make connection!");
			            }
			            //versão do postgreeSQL
			            Statement statement = conn.createStatement();
			            ResultSet resultSet = statement.executeQuery("SELECT VERSION()");
			            if (resultSet.next()) {
			            	System.out.println(resultSet.getString(1));
			            }
			        } catch (SQLException e) {
			            System.out.println(e.getMessage());
			        }

			        return conn;
			        //conn.close();
			    }
			 
			 public void retornaLivro() {
			      
			        try {
			           
			            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ALL_QUERY_LIVRO);
			            
			            ResultSet rs = preparedStatement.executeQuery();

			            
			            while (rs.next()) {
			                int edicao = rs.getInt("nu_edicao");
			                String name_titulo = rs.getString("nm_titulo");
			                System.out.println(edicao + " - " + name_titulo);
			            }
			        } catch (SQLException e) {
			            printSQLException(e);
			        }
			    }
			 
			 public void retornaCliente() {
			       
			        try {
			           
			            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ALL_QUERY_CLIENTE);
			           
			            ResultSet rs = preparedStatement.executeQuery();

			            
			            while (rs.next()) {
			                int idCliente = rs.getInt("id_cliente");
			                String name_cliente = rs.getString("nm_cliente");
			                System.out.println(idCliente + " - " + name_cliente);
			            }
			        } catch (SQLException e) {
			            printSQLException(e);
			        }
			    }
			 
			   public void pedidosCliente(String sql) {
			       
			        try {
			          
			            PreparedStatement preparedStatement = conn.prepareStatement(sql);
			          
			            ResultSet rs = preparedStatement.executeQuery();

			           
			            while (rs.next()) {
			                int idCliente = rs.getInt("id_cliente");
			                String nm_cliente = rs.getString("nm_cliente");
			                System.out.println(idCliente + " - " + nm_cliente);
			            }
			        } catch (SQLException e) {
			            printSQLException(e);
			        }
			    }
			 
			    public void getAllUsers() {
			        
			        try {
			            
			            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ALL_QUERY);
			           
			            ResultSet rs = preparedStatement.executeQuery();

			       
			            while (rs.next()) {
			                int id = rs.getInt("id_autor");
			                String name_autor = rs.getString("nm_autor");
			                System.out.println(id + " - " + name_autor);
			            }
			        } catch (SQLException e) {
			            printSQLException(e);
			        }
			    }

			    public void getUserById() {
			    
			        try {
			     
			            PreparedStatement preparedStatement = conn.prepareStatement(QUERY);
			            
			            preparedStatement.setInt(1, 5);
			    
			            ResultSet rs = preparedStatement.executeQuery();
			            
			            while (rs.next()) {
			                int id = rs.getInt("id_autor");
			                String name_autor = rs.getString("nm_autor");
			                System.out.println(id + " - " + name_autor);
			            }
			        } catch (SQLException e) {
			            printSQLException(e);
			        }
			    }
			    
			    public static void printSQLException(SQLException ex) {
			            for (Throwable e: ex) {
			                if (e instanceof SQLException) {
			                    e.printStackTrace(System.err);
			                    System.err.println("SQLState: " + ((SQLException) e).getSQLState());
			                    System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
			                    System.err.println("Message: " + e.getMessage());
			                    Throwable t = ex.getCause();
			                    while (t != null) {
			                        System.out.println("Cause: " + t);
			                        t = t.getCause();
			                    }
			                }
			            }
			        }
			    /**
			     * @param args the command line arguments
			     */
			    public static void main(String[] args) {
			    	
			    	Scanner ler = new Scanner (System.in);
			    	ConexaoPostgre app = new ConexaoPostgre();
			        app.connect();
			        /*System.out.println("\nRealizando o select na tabela Autor");
			        app.getAllUsers();
			        System.out.println("\nRealizando o select na tabela Autor pelo ID");
			        app.getUserById();*/
			        
			        
			        
			        int menu=0;
			        
			        do {
			        
			        System.out.println("------------");
			        System.out.println("    MENU    ");
			        System.out.println("------------");
			        System.out.println("1 - Pesquisar livro" + "\n2 - Pesquisar cliente" + "\n3 - Pesquisar os pedidos de um cliente" + "\n4 - Sair");
			        System.out.println("------------");
			        
			        menu = ler.nextInt();
			        
			        switch (menu) {
			        
			        case 1:
			        	System.out.println("\nSegue todos os livros listados: ");
			        	app.retornaLivro();
			        break;	
			        	
			        case 2:
			        	System.out.println("\nSegue todos os clientes listados: ");
			        	app.retornaCliente();
			        	break;
			        	
			        case 3:
			        	
			        	String nm_cliente = "";
			        	int id_cliente = 0;
			        	
			        	System.out.println("\nDigite o nome: ");
			        	nm_cliente = ler.next();
			        	System.out.println("\nDigite o id: ");
			        	id_cliente = ler.nextInt();
			        	
			        	String sql = "";
			        	
			        	if (id_cliente != 0) {
			        	sql = ("select a.nm_cliente, b.id_cliente, b.dt_pedido, b.vl_total_pago from cliente a inner join pedido b on a.id_cliente = b.id_cliente where b.id_cliente = " + id_cliente);
			        	}
			        	else if  (nm_cliente != "") {
			        	sql = ("select a.nm_cliente, b.id_cliente, b.dt_pedido, b.vl_total_pago from cliente a inner join pedido b on a.id_cliente = b.id_cliente where a.nm_cliente like '%" + nm_cliente + "%'");
			        	}
			        	else {
			        		System.out.println("Cadastro não encontrado.");
			        	}
			        	
			        	app.pedidosCliente(sql);
			        	
			        	break;
			        	
			        case 4:
			        	System.out.println("Programa finalizado");
			        break;		        	

			        default:
			        	System.out.println("Comando inválido. Tente novamente.");
			        
			        }	        
			    }
			        
			        while (menu <=3) ; 

			    }
	}


