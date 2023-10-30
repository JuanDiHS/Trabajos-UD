package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel {

	private JLabel egenero;
	private JLabel enombre;
	private JComboBox<String> lista_genero;
	private JComboBox<String> lista_nombre;

	public PanelDatos() {
		setLayout(new GridLayout(1, 4));
		setBackground(new Color(236, 159, 91));
		setBorder(new TitledBorder("Modulo de datos"));
		setPreferredSize(new Dimension(800, 80));

		inicializarComponentes();

		setVisible(true);
	}

	public void inicializarComponentes() {
		egenero = new JLabel("Genero a busca: ");
		add(egenero);

		lista_genero = new JComboBox<String>();
		lista_genero.addItem("Femenino");
		lista_genero.addItem("Masculino");
		lista_genero.setActionCommand("LISTA1");
		add(lista_genero);

		enombre = new JLabel("Nombres de las personas: ");
		add(enombre);

		lista_nombre = new JComboBox<String>();
		lista_nombre.setActionCommand("LISTA2");
		add(lista_nombre);

	}

	public JLabel getEgenero() {
		return egenero;
	}

	public void setEgenero(JLabel egenero) {
		this.egenero = egenero;
	}

	public JLabel getEnombre() {
		return enombre;
	}

	public void setEnombre(JLabel enombre) {
		this.enombre = enombre;
	}

	public JComboBox<String> getLista_genero() {
		return lista_genero;
	}

	public void setLista_genero(JComboBox<String> lista_genero) {
		this.lista_genero = lista_genero;
	}

	public JComboBox<String> getLista_nombre() {
		return lista_nombre;
	}

	public void setLista_nombre(JComboBox<String> lista_nombre) {
		this.lista_nombre = lista_nombre;
	}

}
