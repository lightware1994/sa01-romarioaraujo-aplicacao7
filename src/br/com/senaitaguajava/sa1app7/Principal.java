package br.com.senaitaguajava.sa1app7;

import javax.swing.JOptionPane;

import br.com.senaitaguajavasa1aplicacao07.Pessoa;

public class Principal {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Empresa Voe, Linhas aéreas !");
		
		//entrada de dados
		double p1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da primeira peça: "));
		double p2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da segunda peça: "));
		double p3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da terceira peça: "));
		double p4 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da quarta peça: "));
		double p5 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da quinta peça: "));
	
		Pessoa sp = new Pessoa();
		JOptionPane.showMessageDialog(null, "Valor da soma de 5 peças é: "+ "\n"+ sp.somarPeca(p1, p2, p3, p4, p5));
		
	}
	

}
