package celularteste;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 * Aplicação de demonstração de um teclado numérico de celular.
 */
public class App {
    private final JLabel visor = new JLabel(" ", SwingConstants.RIGHT);

    private void criarJanela() {
        JFrame janela = new JFrame("Teclado de Celular");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 420);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new BorderLayout(12, 12));

        visor.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        visor.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        janela.add(visor, BorderLayout.NORTH);

        janela.add(new Botoes(tecla -> visor.setText(visor.getText().trim() + tecla)),
                BorderLayout.CENTER);

        JPanel acoes = new JPanel();
        JButton apagar = new JButton("Apagar");
        JButton limpar = new JButton("Limpar");

        apagar.addActionListener(evento -> {
            String atual = visor.getText().trim();
            if (!atual.isEmpty()) {
                visor.setText(atual.substring(0, atual.length() - 1));
            }
        });

        limpar.addActionListener(evento -> visor.setText(" "));

        acoes.add(apagar);
        acoes.add(limpar);
        janela.add(acoes, BorderLayout.SOUTH);

        janela.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App().criarJanela());
    }
}
