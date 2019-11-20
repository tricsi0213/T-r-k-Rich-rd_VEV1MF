package feladat4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ido extends JFrame implements ActionListener{
    JLabel nap1;
    JLabel ora1;
    JLabel perc1;
    JLabel masodperc1;
    
    JLabel nap2;
    JLabel ora2;
    JLabel perc2;
    JLabel masodperc2;
    
    JLabel nap3;
    JLabel ora3;
    JLabel perc3;
    JLabel masodperc3;
    
    JTextField naptx1;
    JTextField oratx1;
    JTextField perctx1;
    JTextField masodperctx1;
    
    JTextField naptx2;
    JTextField oratx2;
    JTextField perctx2;
    JTextField masodperctx2;
    
    JTextField naptx3;
    JTextField oratx3;
    JTextField perctx3;
    JTextField masodperctx3;
    
    JButton b1;
    
    JPanel p1;
    JPanel p2;
    JPanel p3;
    
    public Ido(String title){
        super(title);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        nap1 = new JLabel("nap");
        ora1 = new JLabel("óra");
        perc1 = new JLabel("perc");
        masodperc1 = new JLabel("másodperc");
        
        nap2 = new JLabel("nap");
        ora2 = new JLabel("óra");
        perc2 = new JLabel("perc");
        masodperc2 = new JLabel("másodperc");
        
        nap3 = new JLabel("nap");
        ora3 = new JLabel("óra");
        perc3 = new JLabel("perc");
        masodperc3 = new JLabel("másodperc");
        
        naptx1 = new JTextField(4);
        oratx1 = new JTextField(2);
        perctx1 = new JTextField(2);
        masodperctx1 = new JTextField(2);
        
        naptx2 = new JTextField(4);
        oratx2 = new JTextField(2);
        perctx2 = new JTextField(2);
        masodperctx2 = new JTextField(2);
        
        naptx3 = new JTextField(4);
        oratx3 = new JTextField(2);
        perctx3 = new JTextField(2);
        masodperctx3 = new JTextField(2);
        
        b1 = new JButton("Számol");
        b1.addActionListener(this);
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        
        GridLayout gr1 = new GridLayout(2, 8);
        GridLayout gr2 = new GridLayout(1, 1);
        GridLayout gr3 = new GridLayout(1, 8);
        GridLayout gr4 = new GridLayout(3, 1);
        
        p1.setLayout(gr1);
        p2.setLayout(gr2);
        p3.setLayout(gr3);
        this.setLayout(gr4);
        
        p1.add(naptx1);
        p1.add(nap1);
        p1.add(oratx1);
        p1.add(ora1);
        p1.add(perctx1);
        p1.add(perc1);
        p1.add(masodperctx1);
        p1.add(masodperc1);
        p1.add(naptx2);
        p1.add(nap2);
        p1.add(oratx2);
        p1.add(ora2);
        p1.add(perctx2);
        p1.add(perc2);
        p1.add(masodperctx2);
        p1.add(masodperc2);
        
        p2.add(b1);
        
        p3.add(naptx3);
        p3.add(nap3);
        p3.add(oratx3);
        p3.add(ora3);
        p3.add(perctx3);
        p3.add(perc3);
        p3.add(masodperctx3);
        p3.add(masodperc3);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int nap;
        int ora;
        int perc;
        int masodperc;
        nap = Integer.parseInt(naptx1.getText()) + Integer.parseInt(naptx2.getText());
        ora = Integer.parseInt(oratx1.getText()) + Integer.parseInt(oratx2.getText());
        perc = Integer.parseInt(perctx1.getText()) + Integer.parseInt(perctx2.getText());
        masodperc = Integer.parseInt(masodperctx1.getText()) + Integer.parseInt(masodperctx2.getText());
        
        perc += masodperc/60;
        masodperc -= (masodperc/60 * 60);
        masodperctx3.setText(Integer.toString(masodperc));
        
        ora += perc/60;
        perc -= (perc/60 * 60);
        perctx3.setText(Integer.toString(perc));
        
        nap += ora/24;
        ora -= (ora/24 * 24);
        oratx3.setText(Integer.toString(ora));
        naptx3.setText(Integer.toString(nap));
    }
}
