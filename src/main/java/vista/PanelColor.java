package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelColor extends JPanel implements ActionListener {

    private VentanaPrincipal ventana;
    private PanelPrincipal pnlPrincipal;
    private PanelColor pnlColor;

    private JButton imagen;
    private JButton interrogante;
    private JButton resp1;
    private JButton resp2;
    private JButton resp3;
    private JButton resp4;

    public PanelColor(VentanaPrincipal ventana, PanelPrincipal panelPrincipal) {
        this.pnlPrincipal = panelPrincipal;
        this.ventana = ventana;
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        ImageIcon icono = new ImageIcon("C:\\Users\\NTB01\\Documents\\NetBeansProjects\\Proyecto\\src\\main\\java\\vista\\araña.jpg");
        this.interrogante = new JButton("ingrese el color preguntado");

        this.imagen = new JButton(icono);
        this.resp1 = new JButton("Falso");
        this.resp2 = new JButton("Falso");
        this.resp3 = new JButton("correcta");
        this.resp4 = new JButton("Falso");

        this.resp3.addActionListener(this);

        imagen.setPreferredSize(new Dimension(1000, 400));
        interrogante.setPreferredSize(new Dimension(1050, 60));
        resp1.setPreferredSize(new Dimension(200, 200));
        resp2.setPreferredSize(new Dimension(200, 200));
        resp3.setPreferredSize(new Dimension(200, 200));
        resp4.setPreferredSize(new Dimension(200, 200));

        this.add(imagen, BorderLayout.NORTH);
        this.add(interrogante, BorderLayout.CENTER);
        this.add(resp1, BorderLayout.SOUTH);
        this.add(resp2, BorderLayout.SOUTH);
        this.add(resp3, BorderLayout.SOUTH);
        this.add(resp4, BorderLayout.SOUTH);

        this.resp3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.resp3 == e.getSource()) {
            this.ventana.remove(this);
//            this.pnlPrincipal = new PanelPrincipal(ventana);
            this.ventana.add(this.pnlPrincipal);
        }
    }
}
