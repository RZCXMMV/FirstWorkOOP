package com.gustavo.guiauno;
import javax.swing.*;
import java.text.*;

public class SecondExercise {

	public static void main(String[] args) {
		
		DecimalFormat ft = new DecimalFormat("#,###.##");
		float kilometers, meters, centimeters;
		
		kilometers = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de kilómetros"));
		
		meters = kilometers * 1000;
		centimeters = kilometers * 100000;
		
		
		if(kilometers == 1)
		{
			JOptionPane.showMessageDialog(null, ft.format(kilometers) + " kilómetro equivale a: " + ft.format(meters) + " metros y a " + ft.format(centimeters) + " centímetros");
		}
		else if(kilometers < 0)
		{
			JOptionPane.showMessageDialog(null, "Canidad insertada no válida");
		}
		else
			JOptionPane.showMessageDialog(null, ft.format(kilometers) + " kilómetros equivalen a: " + ft.format(meters) + " metros y a " + ft.format(centimeters) + " centímetros");
		
	}

}
