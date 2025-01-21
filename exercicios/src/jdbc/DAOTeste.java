package jdbc;

public class DAOTeste {
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		dao.incluir(sql, "Leorio da silva");
		dao.incluir(sql, "Chrollo Ribeiro");
		dao.incluir(sql, "Billie Eillish");
		
		dao.close();
	}
}
