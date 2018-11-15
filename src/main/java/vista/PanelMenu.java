package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelMenu extends JPanel implements ActionListener {

    private VentanaPrincipal ventana;
    private PanelCuento pnlCuento;
    private PanelPalabra pnlPalabra;
    private PanelLetra pnlLetra;
    private PanelColor pnlColor;

    private JButton actividad1;
    private JButton actividad2;
    private JButton actividad3;
    private JButton actividad4;
    private JButton explicacionAct1;
    private JButton explicacionAct2;
    private JButton explicacionAct3;
    private JButton explicacionAct4;
    private PanelPrincipal panelPrincipal;

    public PanelMenu(VentanaPrincipal ventana, PanelPrincipal panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
        this.ventana = ventana;
        System.out.println("PanelMenu");
        inicializarComponentes();
    }

    private void inicializarComponentes() {

        this.pnlCuento = new PanelCuento(ventana, panelPrincipal);
        this.pnlPalabra = new PanelPalabra(ventana, panelPrincipal);
        this.pnlLetra = new PanelLetra(ventana, panelPrincipal);
        this.pnlColor = new PanelColor(ventana, panelPrincipal);

        JPanel panelLatIzq = new JPanel(new GridLayout(4, 1));
        JPanel panelLatDer = new JPanel(new GridLayout());
        this.setLayout(new BorderLayout(10, 10));
        ImageIcon icono = new ImageIcon("C:\\Users\\NTB01\\Documents\\NetBeansProjects\\Proyecto\\src\\main\\java\\vista\\araña.jpg");
        actividad1 = new JButton(icono);
        actividad2 = new JButton(icono);
        actividad3 = new JButton(icono);
        actividad4 = new JButton(icono);
        explicacionAct1 = new JButton("Explicacion priera actividad");
        explicacionAct2 = new JButton("Explicacion segunda actividad");
        explicacionAct3 = new JButton("Explicacion tercera actividad");
        explicacionAct4 = new JButton("Explicacion cuarta actividad");

        panelLatIzq.add(actividad1);
        panelLatIzq.add(explicacionAct1);
        panelLatIzq.add(actividad2);
        panelLatIzq.add(explicacionAct2);
        panelLatIzq.add(actividad3);
        panelLatIzq.add(explicacionAct3);
        panelLatIzq.add(actividad4);
        panelLatIzq.add(explicacionAct4);
        this.add(panelLatIzq, BorderLayout.WEST);
        this.add(panelLatDer, BorderLayout.CENTER);

        this.actividad1.addActionListener(this);
        this.actividad2.addActionListener(this);
        this.actividad3.addActionListener(this);
        this.actividad4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        if (this.actividad1 == e.getSource()) {
            this.ventana.remove(this);
            this.ventana.add(this.pnlCuento);
            this.ventana.validate();
        } else if (actividad2 == e.getSource()) {
            this.ventana.remove(this);
            this.ventana.add(this.pnlPalabra);
            this.ventana.validate();
        } else if (actividad3 == e.getSource()) {
            this.ventana.remove(this);
            this.ventana.add(this.pnlLetra);
            this.ventana.validate();
        } else if (actividad4 == e.getSource()) {
            this.ventana.remove(this);
            this.ventana.add(this.pnlColor);
            this.ventana.validate();
        }
    }
}
