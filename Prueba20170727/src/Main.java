import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //System.out.println("Modifico proyecto externo");
		
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
	}

}
