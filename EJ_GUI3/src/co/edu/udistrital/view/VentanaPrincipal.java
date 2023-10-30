package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	private PanelDatos panel_datos;
	private PanelResultados panel_resultados;
	private PanelImagen pim;
	
	public VentanaPrincipal() {
		setTitle("Buscador de pareja");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.MAGENTA);
		getContentPane().setLayout(new BorderLayout(10,10));
		
		inicializarComponentes();
		
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		panel_datos= new PanelDatos();
		getContentPane().add(panel_datos, BorderLayout.NORTH);
		
		panel_resultados = new PanelResultados();
		getContentPane().add(panel_resultados, BorderLayout.WEST);
		pim = new PanelImagen();
		getContentPane().add(pim, BorderLayout.CENTER);
	}

	public PanelDatos getPanel_datos() {
		return panel_datos;
	}

	public void setPanel_datos(PanelDatos panel_datos) {
		this.panel_datos = panel_datos;
	}

	public PanelResultados getPanel_resultados() {
		return panel_resultados;
	}

	public void setPanel_resultados(PanelResultados panel_resultados) {
		this.panel_resultados = panel_resultados;
	}

	public PanelImagen getPim() {
		return pim;
	}

	public void setPim(PanelImagen pim) {
		this.pim = pim;
	}

	
}
