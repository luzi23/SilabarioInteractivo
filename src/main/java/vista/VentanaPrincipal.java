package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    private PanelLateral panelLat;
    private PanelMenu panelMenu;
    private PanelColor panelColor;
    private PanelPalabra panelPalabra;
    private PanelCuento panelCuento;
    private PanelLetra panelLetra;
    private PanelPrincipal panelPrincipal;

    public VentanaPrincipal() {

        this.inicializarComponents();

    }

    public void Lateral() {

    }

    public void Principal() {
    }

    private void inicializarComponents() {

        this.panelPrincipal = new PanelPrincipal(this);
        this.panelLat = new PanelLateral(this);

        this.add(this.panelLat, BorderLayout.WEST);
        this.add(this.panelPrincipal, BorderLayout.CENTER);

        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Ventana de ejemplo");
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
