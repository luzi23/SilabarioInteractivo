package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelLateral extends JPanel implements ActionListener {

    private VentanaPrincipal ventana;
    private PanelPrincipal pnlPrincipal;
    private PanelMenu pnlMenu;

    private JButton btnInstruccion;
    private JButton btnMusica;
    private JButton btnVolver;
    private JButton btnMenu;

    public PanelLateral(VentanaPrincipal ventana) {

        this.ventana = ventana;
        this.unitComponents();
    }

    private void unitComponents() {
        GridLayout distribucion = new GridLayout(4, 1);
        this.btnInstruccion = new JButton("Instrucciones");

        this.setLayout(distribucion);
        this.add(this.btnInstruccion);

        this.btnMusica = new JButton("Música");

        this.setLayout(distribucion);
        this.add(this.btnMusica);

        this.btnMenu = new JButton("Menú");

        this.setLayout(distribucion);
        this.add(this.btnMenu);

        this.btnVolver = new JButton("Volver");

        this.setLayout(distribucion);
        this.add(this.btnVolver);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
