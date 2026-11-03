package celularteste;

import java.awt.GridLayout;
import java.util.function.Consumer;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Painel reutilizável com o teclado numérico de um celular.
 * Cada botão envia seu texto para o callback recebido no construtor.
 */
public class Botoes extends JPanel {
    public Botoes(Consumer<String> aoPressionar) {
        super(new GridLayout(4, 3, 8, 8));

        String[] teclas = {
            "1", "2", "3",
            "4", "5", "6",
            "7", "8", "9",
            "*", "0", "#"
        };

        for (String tecla : teclas) {
            JButton botao = new JButton(tecla);
            botao.setFocusPainted(false);
            botao.addActionListener(evento -> aoPressionar.accept(tecla));
            add(botao);
        }
    }
}
