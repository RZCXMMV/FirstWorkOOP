package com.gustavo.guiauno;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class NinthExercise
{

	public static void main(String[] args)
	{
		
		Frame frame = new Frame("Measurements Converter");
		DecimalFormat ft = new DecimalFormat("#,###.###");
		
		Button metersToKilometers = new Button("Metros -> Kilómetros");
		metersToKilometers.setBounds(100, 100, 150, 50);
		
		Button kilometersToMiles = new Button("Kilómetros -> Millas");
		kilometersToMiles.setBounds(100, 150, 150, 50);
		
		Button centimetersToMeters = new Button("Centímetros -> Metros");
		centimetersToMeters.setBounds(100, 200, 150, 50);
		
		Button kilometersToCentimeters = new Button("Kilómetros -> Centímetros");
		kilometersToCentimeters.setBounds(100, 250, 150, 50);
		
		metersToKilometers.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Double meters = null;
				try
				{
					meters = Double.parseDouble(JOptionPane.showInputDialog("Inserte la cantidad de metros"));
				}
				catch(NumberFormatException ex)
				{
					JOptionPane.showMessageDialog(null, "Entrada inválida. Por favot, introduzca un número");
					return;
				}
				Double kilometers = meters * 0.001;
				JOptionPane.showMessageDialog(null, meters + " metros equivalen a: " + ft.format(kilometers) + " kilómetros.");
			}
		});
		
		kilometersToMiles.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Double kilometers = null;
				try
				{
					kilometers = Double.parseDouble(JOptionPane.showInputDialog("Inserte la cantidad de kilómetros"));
				}
				catch(NumberFormatException ex)
				{
					JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, introduzca un número");
					return;
				}
				Double miles = kilometers * 0.621;
				JOptionPane.showMessageDialog(null, kilometers + " kilómetros equivalen a: " + ft.format(miles) + " millas.");
			}
		});
		
		centimetersToMeters.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Double centimeters = null;
				try
				{
					centimeters = Double.parseDouble(JOptionPane.showInputDialog("Inserte la cantidad de centímetros"));
				}
				catch(NumberFormatException ex)
				{
					JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, introduczca un número");
					return;
				}
				Double meters = centimeters * 0.01;
				JOptionPane.showMessageDialog(null, centimeters + " centímetros equivalen a: " + ft.format(meters) + " metros.");
			}
		});
		
		kilometersToCentimeters.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Double kilometers = null;
				try
				{
					kilometers = Double.parseDouble(JOptionPane.showInputDialog("Inserte la cantidad de kilómetros"));
				}
				catch(NumberFormatException ex)
				{
					JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, introduzca un número.");
					return;
				}
				Double centimeters = kilometers * 100000;
				JOptionPane.showMessageDialog(null, kilometers + " kilómetros equivalen a: " + ft.format(centimeters) + " centímetros.");
			}
		});
		
		frame.add(metersToKilometers);
		frame.add(kilometersToMiles);
		frame.add(centimetersToMeters);
		frame.add(kilometersToCentimeters);
		
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter()
		{
		    public void windowClosing(WindowEvent e)
		    {
		        System.exit(0);
		    }
		});

	}

}
