
package proo;

import java.awt.*;
import javax.swing.*;
public class cargando {
     public static void main(String[] args) {
        final int MAXIMUM = 100;
        final JFrame jFrame = new JFrame("");
        JLabel lbl11;

        // create horizontal progress bar
        final JProgressBar progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(MAXIMUM);
        progressBar.setStringPainted(true);

        // create label for displaying "Cargando..."
        JLabel lblCargando = new JLabel("********charging*******");

        // create panel for holding progress bar and label
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(progressBar, BorderLayout.NORTH);
        panel.add(lblCargando, BorderLayout.CENTER);

        // add panel to the content pane layer
        jFrame.setLayout(new FlowLayout());
        jFrame.setUndecorated(true);
        jFrame.getContentPane().add(panel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 200);
        jFrame.setLocation(560,230);
        jFrame.setVisible(true);

        // update progressbar starting from 0 to 100
        for (int i = 0; i <= MAXIMUM; i++) {
            final int currentNumber = i;
            try {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        progressBar.setValue(currentNumber);
                    }
                });
                java.lang.Thread.sleep(100);
            } catch (InterruptedException event) {
                JOptionPane.showMessageDialog(jFrame, event.getMessage());
            }
        }
        
        Inventario mymp = new Inventario();
       
        jFrame.setVisible(false);
    }
}