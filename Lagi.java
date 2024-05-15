import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Lagi {
    public static void main(String[] args) {

        String operasi = "";
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println("error :" + e.getMessage());
        }

        JFrame frame = new JFrame();
        frame.setSize(480, 720);

        JTextField bagianOperasi = new JTextField("");
        bagianOperasi.setEditable(false);
        bagianOperasi.setBounds(20, 20, 320, 40);
        
        frame.add(bagianOperasi);

        JTextField fieldHasil = new JTextField("");
        fieldHasil.setBounds(20, 60, 320, 30);
        fieldHasil.setEditable(false);
        frame.add(fieldHasil);

        
        // Tombol Tombol
        JButton hasil = new JButton("=");
        hasil.setBounds(350, 20, 50, 70);
        hasil.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

        });
        frame.add(hasil);

        JButton kali = new JButton("x");
        kali.setBounds(350, 105, 50, 50);
        kali.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(kali);

        JButton kurang = new JButton("-");
        kurang.setBounds(350, 160, 50, 50);
        kurang.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(kurang);

        JButton tambah = new JButton("+");
        tambah.setBounds(350, 215, 50, 50);
        tambah.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(tambah);

        JButton bagi = new JButton(":");
        bagi.setBounds(350, 270, 50, 50);
        bagi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(bagi);


// Button angka angka selain operasi
        JButton reset = new JButton("C");
        reset.setBounds(20, 270, 100, 50);
        reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bagianOperasi.setText("");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(reset);

        JButton angka0 = new JButton("0");
        angka0.setBounds(130, 270, 100, 50);
        angka0.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bagianOperasi.setText(bagianOperasi.getText() + "0");

                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(angka0);

        JButton koma = new JButton(".");
        koma.setBounds(240, 270, 100, 50);
        koma.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bagianOperasi.setText(bagianOperasi.getText() + ".");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(koma);

        JButton angka1 = new JButton("1");
        angka1.setBounds(20, 210, 100, 50);
        angka1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bagianOperasi.setText(bagianOperasi.getText() + "1");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(angka1);

        JButton angka2 = new JButton("2");
        angka2.setBounds(130, 210, 100, 50);
        angka2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bagianOperasi.setText(bagianOperasi.getText() + "2");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(angka2);

        JButton angka3 = new JButton("3");
        angka3.setBounds(240, 210, 100, 50);
        angka3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bagianOperasi.setText(bagianOperasi.getText() + "3");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(angka3);

        JButton angka4 = new JButton("4");
        angka4.setBounds(20, 155, 100, 50);
        angka4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bagianOperasi.setText(bagianOperasi.getText() + "4");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(angka4);

        JButton angka5 = new JButton("5");
        angka5.setBounds(130, 155, 100, 50);
        angka5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bagianOperasi.setText(bagianOperasi.getText() + "5");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(angka5);

        JButton angka6 = new JButton("6");
        angka6.setBounds(240, 155, 100, 50);
        angka6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bagianOperasi.setText(bagianOperasi.getText() + "6");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(angka6);

        JButton angka7 = new JButton("7");
        angka7.setBounds(20, 100, 100, 50);
        angka7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bagianOperasi.setText(bagianOperasi.getText() + "7");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(angka7);

        JButton angka8 = new JButton("8");
        angka8.setBounds(130, 100, 100, 50);
        angka8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bagianOperasi.setText(bagianOperasi.getText() + "8");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(angka8);

        JButton angka9 = new JButton("9");
        angka9.setBounds(240, 100, 100, 50);
        angka9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bagianOperasi.setText(bagianOperasi.getText() + "9");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        frame.add(angka9);


        frame.setLayout(null);
        frame.setVisible(true);
    }
}