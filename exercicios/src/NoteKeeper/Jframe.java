package NoteKeeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Jframe extends JFrame {

	private DefaultListModel<String> listaNotasModel;
	private JList<String> listaNotas;
	private List<Nota> notas;

	public Jframe() {
        setTitle("Gerenciador de Notas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        notas = new ArrayList<>();
        listaNotasModel = new DefaultListModel<>();
        listaNotas = new JList<>(listaNotasModel);

        JButton btnAdicionar = new JButton("Adicionar Nota");
        JButton btnRemover = new JButton("Remover Nota");

        btnAdicionar.addActionListener(e -> adicionarNota());
        btnRemover.addActionListener(e -> removerNota());

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(listaNotas), BorderLayout.CENTER);

        JPanel botoesPanel = new JPanel();
        botoesPanel.add(btnAdicionar);
        botoesPanel.add(btnRemover);

        panel.add(botoesPanel, BorderLayout.SOUTH);
        add(panel);
    }

	private void adicionarNota() {
		String nomeNota = JOptionPane.showInputDialog(this, "Nome da Nota:");
		if (nomeNota != null && !nomeNota.trim().isEmpty()) {
			Nota nota = new Nota();
			nota.setNome(nomeNota);
			notas.add(nota);
			listaNotasModel.addElement(nomeNota);
			JOptionPane.showMessageDialog(this, "Nota adicionada com sucesso!");
		}
	}

	private void removerNota() {
		int indice = listaNotas.getSelectedIndex();
		if (indice != -1) {
			notas.remove(indice);
			listaNotasModel.remove(indice);
			JOptionPane.showMessageDialog(this, "Nota removida!");
		} else {
			JOptionPane.showMessageDialog(this, "Selecione uma nota para remover.");
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new Jframe().setVisible(true);
		});
	}
}
