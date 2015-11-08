import javax.swing.JOptionPane;

public class ConveterDemo {

	public static void main(String[] args) {
		String input= JOptionPane.showInputDialog(null, "Enter the height in centimeters");
		double height=Double.parseDouble(input);
		double result1=height*0.39;
		double result2=result1/12;
		JOptionPane.showMessageDialog(null, "The height is "+result1+ " inches or "+result2 +" foot");
	}
}
