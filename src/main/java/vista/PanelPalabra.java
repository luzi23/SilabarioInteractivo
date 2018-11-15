package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPalabra extends JPanel implements ActionListener {

    private VentanaPrincipal ventana;
    private PanelLetra pnlLetra;

    private JLabel frase;
    private JButton imagen;
    private JButton resp1;
    private JButton resp2;
    private JButton resp3;
    private JButton resp4;
    private PanelPrincipal panelPrincipal;

    public PanelPalabra(VentanaPrincipal ventana, PanelPrincipal panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
        this.ventana = ventana;
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        ImageIcon icono = new ImageIcon("C:\\Users\\NTB01\\Documents\\NetBeansProjects\\Proyecto\\src\\main\\java\\vista\\araña.jpg");
        this.frase = new JLabel("la imagen representa uno de los objetos de las opciones y que comleta la frace va aqui");

        this.pnlLetra = new PanelLetra(ventana, panelPrincipal);

        this.imagen = new JButton(icono);
        this.resp1 = new JButton("Falso");
        this.resp2 = new JButton("Falso");
        this.resp3 = new JButton("correcta");
        this.resp4 = new JButton("Falso");

        this.resp3.addActionListener(this);

        imagen.setPreferredSize(new Dimension(1000, 400));
        frase.setPreferredSize(new Dimension(1050, 60));
        resp1.setPreferredSize(new Dimension(200, 200));
        resp2.setPreferredSize(new Dimension(200, 200));
        resp3.setPreferredSize(new Dimension(200, 200));
        resp4.setPreferredSize(new Dimension(200, 200));

        this.add(imagen, BorderLayout.NORTH);
        this.add(frase, BorderLayout.CENTER);
        this.add(resp1, BorderLayout.SOUTH);
        this.add(resp2, BorderLayout.SOUTH);
        this.add(resp3, BorderLayout.SOUTH);
        this.add(resp4, BorderLayout.SOUTH);

        this.resp3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        if (this.resp3 == e.getSource()) {
            this.ventana.remove(this);
            this.ventana.add(this.pnlLetra);
            this.ventana.validate();
        }
    }
}
