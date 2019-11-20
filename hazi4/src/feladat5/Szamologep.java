package feladat5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Szamologep extends JFrame implements ActionListener{
    public static void main(String[] args) {
        Szamologep sz = new Szamologep("Számológép");
    }
    
    int osszeg;
    
    JTextField tx;
    JButton backspace;
    JButton ce;
    JButton c;
    JButton mc;
    JButton mr;
    JButton ms;
    JButton mplus;
    JButton osztas;
    JButton szorzas;
    JButton osszead;
    JButton kivon;
    JButton sqrt;
    JButton szazalek;
    JButton egyperx;
    JButton egyenlo;
    JButton pont;
    JButton pozitivnegativ;
    JButton nulla;
    JButton egy;
    JButton ketto;
    JButton harom;
    JButton negy;
    JButton ot;
    JButton hat;
    JButton het;
    JButton nyolc;
    JButton kilenc;
    JButton ures;
    
    
    
    JPanel p1;
    JPanel p2;
    JPanel p3;
    
    public Szamologep(String title){
        super(title);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        tx = new JTextField("0");
        backspace = new JButton("Backspace");
        ce = new JButton("CE");
        c = new JButton("C");
        mc = new JButton("MC");
        mr = new JButton("MR");
        ms = new JButton("MS");
        mplus = new JButton("M+");
        sqrt = new JButton("sqrt");
        szazalek = new JButton("%");
        egyperx = new JButton("1/x");
        egyenlo = new JButton("=");
        osztas = new JButton("/");
        szorzas = new JButton("*");
        kivon = new JButton("-");
        osszead = new JButton("+");
        pont = new JButton(".");
        pozitivnegativ = new JButton("+/-");
        nulla = new JButton("0");
        egy = new JButton("1");
        ketto = new JButton("2");
        harom = new JButton("3");
        negy = new JButton("4");
        ot = new JButton("5");
        hat = new JButton("6");
        het = new JButton("7");
        nyolc = new JButton("8");
        kilenc = new JButton("9");
        ures = new JButton("");
        
        osszead.addActionListener(this);
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        
        GridLayout gr1 = new GridLayout(1, 1);
        GridLayout gr2 = new GridLayout(1, 4);
        GridLayout gr3 = new GridLayout(4, 6);
        GridLayout gr4 = new GridLayout(3, 1);
        
        p1.setLayout(gr1);
        p2.setLayout(gr2);
        p3.setLayout(gr3);
        this.setLayout(gr4);
        
        p1.add(tx);
        
        p2.add(ures);
        p2.add(backspace);
        p2.add(ce);
        p2.add(c);
        
        p3.add(mc);
        p3.add(het);
        p3.add(nyolc);
        p3.add(kilenc);
        p3.add(osztas);
        p3.add(sqrt);
        p3.add(mr);
        p3.add(negy);
        p3.add(ot);
        p3.add(hat);
        p3.add(szorzas);
        p3.add(szazalek);
        p3.add(ms);
        p3.add(egy);
        p3.add(ketto);
        p3.add(harom);
        p3.add(kivon);
        p3.add(egyperx);
        p3.add(mplus);
        p3.add(nulla);
        p3.add(pozitivnegativ);
        p3.add(pont);
        p3.add(osszead);
        p3.add(egyenlo);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        osszeg += Integer.parseInt(tx.getText());
        tx.setText(Integer.toString(osszeg));
    }
}
