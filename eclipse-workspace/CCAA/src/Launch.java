
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
​
public class Launch {
	static String url = "jdbc:mysql://localhost:3306/pruebabd?serverTimezone=UTC";
	static String user = "root";
	static String pass = "1234";
​
	public static void main(String[] args) {
		menuManager();
	}
​
	public static void menuManager() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
​
		System.out.println("\nSelecciona una opción");
		System.out.println("1. Ver lista de CCAA");
		System.out.println("2. Ver las provincias de una CCAA");
​
		int opcion = scan.nextInt();
​
		switch (opcion) {
		case 1:
			showComunidades();
			menuManager();
			break;
​
		case 2:
			getProvinciasFromCCAA();
			menuManager();
			break;
​
		}
	}
​
	public static void showComunidades() {
		try {
			Connection conexion = DriverManager.getConnection(url, user, pass);
			Statement st = conexion.createStatement();
			System.out.println("Las CCAA de España son: ");
			ResultSet rs = st.executeQuery("SELECT * FROM CCAA");
			while (rs.next()) {
				System.out.print(String.valueOf(rs.getInt("ID")).concat(". "));
				System.out.println(rs.getString("NOMBRE").concat(". "));
			}
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
​
	public static void getProvinciasFromCCAA() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("¿De que comunidad autonoma quieres saber sus provincias?");
		int ccaa = scan.nextInt();
​
		try {
​
			Connection conexion = null;
			conexion = DriverManager.getConnection(url, user, pass);
			PreparedStatement pst1 = conexion.prepareStatement("SELECT NOMBRE FROM CCAA WHERE ID = ?");
			pst1.setInt(1, ccaa);
			ResultSet rs1 = pst1.executeQuery();
			if (rs1.next() == true) {
				System.out.println("Las provincias de " + rs1.getString("NOMBRE") + " son: ");
			}
			PreparedStatement pst2 = conexion.prepareStatement("SELECT NOMBRE FROM PROVINCIAS WHERE ID_CCAA = ?");
			pst2.setInt(1, ccaa);
​
			ResultSet rs2 = pst2.executeQuery();
			while (rs2.next()) {
				System.out.println(rs2.getString("NOMBRE"));
			}
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}