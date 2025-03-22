package com.gustavo.guiauno;
import javax.swing.*;
import java.text.*;

public class ThirdExercise {

	public static void main(String[] args) {
		
		DecimalFormat ft = new DecimalFormat("#,###.##");
		Double sideArea, totalArea, baseArea, height, radius;
		
		height = Double.parseDouble(JOptionPane.showInputDialog("Inserte el valor de la altura"));
		if(height < 0 || height == 0)
		{
			JOptionPane.showMessageDialog(null, "Valor inválido para la operación");
		}
		
		radius = Double.parseDouble(JOptionPane.showInputDialog("Inserte el valor del radio"));
		if(radius < 0 || radius == 0)
		{
			JOptionPane.showMessageDialog(null, "Valor inválido para la operación");
		}
		
		sideArea = 2*Math.PI*radius*height;
		baseArea = Math.PI*Math.pow(radius, 2);
		totalArea = (2*baseArea)+sideArea;
		
		JOptionPane.showMessageDialog(null, "Área Lateral: " + ft.format(sideArea) + "\nÁrea de la base: " + ft.format(baseArea) + "\nÁrea Total: " + ft.format(totalArea));
		
	}

}
