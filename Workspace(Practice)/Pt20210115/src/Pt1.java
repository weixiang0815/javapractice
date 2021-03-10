import javax.swing.JOptionPane;
public class Pt1 {

	public static void main(String[] arg) {
		String name = JOptionPane.showInputDialog("你的名字");
		JOptionPane.showMessageDialog(null, "你叫"+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("你的年齡"));
		JOptionPane.showMessageDialog(null, "你今年"+age+"歲");

		double height = Double.parseDouble(JOptionPane.showInputDialog("你的身高"));
		JOptionPane.showMessageDialog(null, "你的身高"+height+"公尺");
	}
	
}
