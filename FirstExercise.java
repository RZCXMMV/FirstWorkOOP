package com.gustavo.guiauno;
import javax.swing.*;
import java.text.*;

public class FirstExercise {

	public static void main(String[] args) {
		
		float t = 5, v = 2, w = 4, x = 8, y, z = 6;
		DecimalFormat ft = new DecimalFormat("##.###");
		
		y = (x*(z+w))/(t-v);
		
		JOptionPane.showMessageDialog(null, "CALCULAR Y\n" + "\nX = 8" + "\nZ = 6" + "\nW = 4" + "\nT = 5" + "V = 2" + "\nY = " + ft.format(y));

	}

}
