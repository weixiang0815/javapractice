import javax.swing.JOptionPane;
public class Pt1 {

	public static void main(String[] arg) {
		String name = JOptionPane.showInputDialog("�A���W�r");
		JOptionPane.showMessageDialog(null, "�A�s"+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("�A���~��"));
		JOptionPane.showMessageDialog(null, "�A���~"+age+"��");

		double height = Double.parseDouble(JOptionPane.showInputDialog("�A������"));
		JOptionPane.showMessageDialog(null, "�A������"+height+"����");
	}
	
}
