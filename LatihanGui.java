
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LatihanGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator Luas");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel judul = new JLabel("Hitung Luas Persegi Panjang", JLabel.CENTER);
        JLabel labelPanjang = new JLabel("Panjang:");
        JLabel labelLebar = new JLabel("Lebar:");
        JTextField inputPanjang = new JTextField(10);
        JTextField inputLebar = new JTextField(10);
        JButton tombolHitung = new JButton("Hitung");
        JButton tombolReset = new JButton("Reset");
        JLabel hasil = new JLabel("Hasil: -", JLabel.CENTER);

        JPanel form = new JPanel(new GridLayout(2, 2, 10, 10));
        form.add(labelPanjang);
        form.add(inputPanjang);
        form.add(labelLebar);
        form.add(inputLebar);

        JPanel tombol = new JPanel(new FlowLayout());
        tombol.add(tombolHitung);
        tombol.add(tombolReset);

        JPanel isi = new JPanel(new BorderLayout());
        isi.add(form, BorderLayout.CENTER);
        isi.add(tombol, BorderLayout.SOUTH);

        panel.add(judul, BorderLayout.NORTH);
        panel.add(isi, BorderLayout.CENTER);
        panel.add(hasil, BorderLayout.SOUTH);

        // Event Listener Hitung
        tombolHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double panjang = Double.parseDouble(inputPanjang.getText());
                    double lebar = Double.parseDouble(inputLebar.getText());

                    if (panjang <= 0 || lebar <= 0) {
                        hasil.setText("Angka harus lebih dari 0!");
                    } else {
                        double luas = panjang * lebar;
                        hasil.setText("Hasil: " + luas);
                    }
                } catch (NumberFormatException ex) {
                    hasil.setText("Input harus berupa angka!");
                }
            }
        });

        // Event Listener Reset
        tombolReset.addActionListener(e -> {
            inputPanjang.setText("");
            inputLebar.setText("");
            hasil.setText("Hasil: -");
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
