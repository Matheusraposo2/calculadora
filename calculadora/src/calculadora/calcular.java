package calculadora;

import javax.swing.JOptionPane;

public class calcular {
	public static void main(String[] args) {
		matematica();
	}
	public static void matematica() {
		String num1 = JOptionPane.showInputDialog("Digite um número");
		String num2 = JOptionPane.showInputDialog("Digite o segundo número");
		String caracter = JOptionPane.showInputDialog("Escolha um operador:(X,+,-,/)");
		
		double dNum1 = Double.parseDouble(num1);
		double dNum2 = Double.parseDouble(num2);
		
		switch(caracter){
		case "x":
		case "X":
		case "*":	
			JOptionPane.showMessageDialog(null, dNum1 * dNum2);
			break;
		case "+":
			JOptionPane.showMessageDialog(null, dNum1 + dNum2);
			break;
		case "-":
			JOptionPane.showMessageDialog(null, dNum1 - dNum2);
		case "/":
			if(dNum2 !=0) {
				JOptionPane.showMessageDialog(null, dNum1 / dNum2);
			}
			else {
				JOptionPane.showMessageDialog(null, "Não pode dividir número por 0");
			}
			break;
			default:
				JOptionPane.showMessageDialog(null, "Operador inválido");
				return;	
		}
	
				
	}
	
}
