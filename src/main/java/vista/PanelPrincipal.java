package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel implements ActionListener {

    private JButton[] btnesLetras;
    private PanelMenu pnlMenu;
    private VentanaPrincipal ventana;

    public PanelPrincipal(VentanaPrincipal ventana) {
        this.ventana = ventana;
        this.inicializarComponentes();

    }

    private void inicializarComponentes() {
        this.setLayout(new GridLayout(5, 5));
        this.btnesLetras = new JButton[26];
        this.pnlMenu = new PanelMenu(this.ventana, this);
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (int i = 0; i < btnesLetras.length; i++) {
            btnesLetras[i] = new JButton(letras[i]);
            this.btnesLetras[i].addActionListener(this);
            this.add(this.btnesLetras[i]);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < btnesLetras.length; i++) {
            if (btnesLetras[i] == e.getSource()) {
                this.ventana.remove(this);
                this.ventana.add(this.pnlMenu);
                this.ventana.validate();
            }
        }
    }

}
