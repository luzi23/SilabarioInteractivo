package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelLetra extends JPanel implements ActionListener {

    private VentanaPrincipal ventana;
    private PanelColor pnlColor;

    private JLabel palabra;
    private JButton imagen;
    private JButton resp1;
    private JButton resp2;
    private JButton resp3;
    private JButton resp4;
    private JButton resp5;
    private JButton resp6;
    private PanelPrincipal panelPrincipal;

    public PanelLetra(VentanaPrincipal ventana, PanelPrincipal panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
        this.ventana = ventana;
        inicializarComponentes();
    }

    private void inicializarComponentes() {

        ImageIcon icono = new ImageIcon("C:\\Users\\NTB01\\Documents\\NetBeansProjects\\Proyecto\\src\\main\\java\\vista\\araña.jpg");
        this.palabra = new JLabel("ingrese la letra que completa la palabra");

        this.pnlColor = new PanelColor(ventana, panelPrincipal);

        this.imagen = new JButton(icono);
        this.resp1 = new JButton("Falso");
        this.resp2 = new JButton("Falso");
        this.resp3 = new JButton("Correcto");
        this.resp4 = new JButton("Falso");
        this.resp5 = new JButton("Falso");
        this.resp6 = new JButton("Falso");

        this.resp3.addActionListener(this);

        imagen.setPreferredSize(new Dimension(1000, 400));
        palabra.setPreferredSize(new Dimension(1150, 60));
        resp1.setPreferredSize(new Dimension(150, 150));
        resp2.setPreferredSize(new Dimension(150, 150));
        resp3.setPreferredSize(new Dimension(150, 150));
        resp4.setPreferredSize(new Dimension(150, 150));
        resp5.setPreferredSize(new Dimension(150, 150));
        resp6.setPreferredSize(new Dimension(150, 150));

        this.add(imagen, BorderLayout.NORTH);
        this.add(palabra, BorderLayout.LINE_END);
        this.add(resp1, BorderLayout.SOUTH);
        this.add(resp2, BorderLayout.SOUTH);
        this.add(resp3, BorderLayout.SOUTH);
        this.add(resp4, BorderLayout.SOUTH);
        this.add(resp5, BorderLayout.SOUTH);
        this.add(resp6, BorderLayout.SOUTH);

        this.resp3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        if (this.resp3 == e.getSource()) {
            this.ventana.remove(this);
            this.ventana.add(this.pnlColor);
            this.ventana.validate();
        }
    }
}
