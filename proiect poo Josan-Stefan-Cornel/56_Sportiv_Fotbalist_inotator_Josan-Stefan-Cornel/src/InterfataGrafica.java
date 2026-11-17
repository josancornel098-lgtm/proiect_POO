
import javax.swing.*;
import java.awt.*;

public class InterfataGrafica extends JFrame {

    private Object[] fotbalisti;
    private Object[] inotatori;

    private JTextField goluriField;
    private JTextField varstaField;

    private JTextField medaliiField;
    private JTextField timpField;

    private JTextArea rezultate;

    public InterfataGrafica(Object[] fotbalisti, Object[] inotatori) {

        this.fotbalisti = fotbalisti;
        this.inotatori = inotatori;

        setTitle("Gestionare Sportivi");
        setSize(650, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panouPrincipal = new JPanel();
        panouPrincipal.setLayout(new BorderLayout(10, 10));
        panouPrincipal.setBorder(
                BorderFactory.createEmptyBorder(15, 15, 15, 15)
        );

        JLabel titlu = new JLabel(
                "GESTIONARE SPORTIVI",
                SwingConstants.CENTER
        );

        titlu.setFont(new Font("Arial", Font.BOLD, 22));

        panouPrincipal.add(titlu, BorderLayout.NORTH);

        // Panoul pentru conditii
        JPanel panouConditii = new JPanel(new GridLayout(1, 2, 15, 10));

        // Sectiunea fotbalisti
        JPanel panouFotbalisti = new JPanel(new GridLayout(3, 2, 5, 10));
        panouFotbalisti.setBorder(
                BorderFactory.createTitledBorder("Cautare fotbalisti")
        );

        goluriField = new JTextField();
        varstaField = new JTextField();

        JButton butonFotbalisti = new JButton("Cauta fotbalisti");

        panouFotbalisti.add(new JLabel("Goluri minime:"));
        panouFotbalisti.add(goluriField);

        panouFotbalisti.add(new JLabel("Varsta maxima:"));
        panouFotbalisti.add(varstaField);

        panouFotbalisti.add(new JLabel(""));
        panouFotbalisti.add(butonFotbalisti);

        // Sectiunea inotatori
        JPanel panouInotatori = new JPanel(new GridLayout(3, 2, 5, 10));
        panouInotatori.setBorder(
                BorderFactory.createTitledBorder("Cautare inotatori")
        );

        medaliiField = new JTextField();
        timpField = new JTextField();

        JButton butonInotatori = new JButton("Cauta inotatori");

        panouInotatori.add(new JLabel("Medalii minime:"));
        panouInotatori.add(medaliiField);

        panouInotatori.add(new JLabel("Timp maxim:"));
        panouInotatori.add(timpField);

        panouInotatori.add(new JLabel(""));
        panouInotatori.add(butonInotatori);

        panouConditii.add(panouFotbalisti);
        panouConditii.add(panouInotatori);

        panouPrincipal.add(panouConditii, BorderLayout.CENTER);

        // Zona pentru rezultate
        rezultate = new JTextArea();
        rezultate.setEditable(false);
        rezultate.setFont(new Font("Monospaced", Font.PLAIN, 12));

        JScrollPane scroll = new JScrollPane(rezultate);
        scroll.setBorder(
                BorderFactory.createTitledBorder("Rezultatele cautarii")
        );

        panouPrincipal.add(scroll, BorderLayout.SOUTH);

        add(panouPrincipal);

        // Actiunea butonului pentru fotbalisti
        butonFotbalisti.addActionListener(e -> cautaFotbalisti());

        // Actiunea butonului pentru inotatori
        butonInotatori.addActionListener(e -> cautaInotatori());

        setVisible(true);
    }

    // Cautare fotbalisti
    private void cautaFotbalisti() {

        try {
            int goluriMinime = Integer.parseInt(goluriField.getText());
            int varstaMaxima = Integer.parseInt(varstaField.getText());

            rezultate.setText("");
            rezultate.append("===== FOTBALISTI GASITI =====\n\n");

            boolean gasit = false;

            for (int i = 0; i < fotbalisti.length; i++) {

                Fotbalist f = (Fotbalist) fotbalisti[i];

                if (f.getGoluri() >= goluriMinime &&
                        f.getVarsta() <= varstaMaxima) {

                    rezultate.append(f.toString() + "\n\n");
                    gasit = true;
                }
            }

            if (!gasit) {
                rezultate.append("Nu exista rezultate.");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Introdu valori numerice corecte!",
                    "Eroare",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    // Cautare inotatori
    private void cautaInotatori() {

        try {
            int medaliiMinime = Integer.parseInt(medaliiField.getText());
            double timpMaxim = Double.parseDouble(
                    timpField.getText().replace(',', '.')
            );

            rezultate.setText("");
            rezultate.append("===== INOTATORI GASITI =====\n\n");

            boolean gasit = false;

            for (int i = 0; i < inotatori.length; i++) {

                Inotator in = (Inotator) inotatori[i];

                if (in.getMedalii() >= medaliiMinime &&
                        in.getTimpProba() <= timpMaxim) {

                    rezultate.append(in.toString() + "\n\n");
                    gasit = true;
                }
            }

            if (!gasit) {
                rezultate.append("Nu exista rezultate.");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Introdu valori numerice corecte!",
                    "Eroare",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
