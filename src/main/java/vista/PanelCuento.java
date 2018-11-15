package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCuento extends JPanel implements ActionListener {

    private VentanaPrincipal ventana;
    private PanelPalabra pnlPalabra;

    private JLabel historia;
    private JButton continuar;
    private JButton imagen;
    private PanelPrincipal panelPrincipal;

    public PanelCuento(VentanaPrincipal ventana, PanelPrincipal panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
        this.ventana = ventana;
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.pnlPalabra = new PanelPalabra(ventana, panelPrincipal);
        this.setLayout(new BorderLayout(10, 10));
        this.historia = new JLabel("\t \t \t \t \t \t Aqui se encuentra el cuento, al precionar la imagen se reproduciria el audio y al presionar el boton inferios se accede al siguiente nivel");
        this.continuar = new JButton("continuar");
        ImageIcon icono = new ImageIcon("C:\\Users\\NTB01\\Documents\\NetBeansProjects\\Proyecto\\src\\main\\java\\vista\\araña.jpg");
        imagen = new JButton(icono);

        this.add(imagen, BorderLayout.NORTH);
        this.add(historia, BorderLayout.CENTER);
        this.add(continuar, BorderLayout.PAGE_END);

        this.continuar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        if (this.continuar == e.getSource()) {
            this.ventana.remove(this);
            this.ventana.add(this.pnlPalabra);
            this.ventana.validate();
        }
    }
}
