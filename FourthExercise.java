package com.gustavo.guiauno;
import javax.swing.*;
import java.text.*;

public class FourthExercise {

	public static void main(String[] args) {

		int pedroAge, juanAge, marioAge;
		
		try {
			pedroAge = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de Pedro"));
			juanAge = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de Juan"));
			marioAge = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de Mario"));
		
			if(pedroAge == juanAge && juanAge == marioAge)
			{
				JOptionPane.showMessageDialog(null, "Todos tienen " + pedroAge + " años");
			}
			else if(pedroAge == juanAge)
			{
				JOptionPane.showMessageDialog(null, "Pedro y Juan tienen la misma edad: " + pedroAge + " años.");
			}
			else if(pedroAge == marioAge)
			{
				JOptionPane.showMessageDialog(null, "Pedro y Mario tienen la misma edad: " + pedroAge + " años.");
			}
			else if(juanAge == marioAge)
			{
				JOptionPane.showMessageDialog(null, "Juan y Mario tienen la misma edad: " + juanAge + " años.");
			}
			else
				JOptionPane.showMessageDialog(null, "Ninguno tiene la misma edad");
		}
		catch(Exception notValidInput)
		{
			JOptionPane.showMessageDialog(null, "Valor inválido ingresado");
		}

	}

}
