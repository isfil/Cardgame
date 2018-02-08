package cards;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import cards.Bisca;
import cards.Hand;

public class Window {
	private JFrame frame;
	private JButton[] cards = new JButton[3];
	private JTextArea screen;
	private Bisca bisca;
	private Deck deck;

	public Window() {
		this.bisca = new Bisca();
		this.deck = new Deck();
		deck.Shufle();
		bisca.giveCards();

		frame = new JFrame("Jogo");
		JPanel panel = new JPanel(new GridLayout(1, 3));
		frame.add(panel, BorderLayout.SOUTH);
		screen = new JTextArea();
		frame.add(screen);
		// Ter Scroll

		JScrollPane scroll = new JScrollPane(screen);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		frame.add(scroll);

		screen.append("O trunfo é:" + bisca.trunfo() + "\n");
		screen.append(bisca.getrounds() + "\n");
		screen.append("A tua Mão " + bisca.getPlayer1().toString() + "\n");
		

		for (int i = 0; i < cards.length; i++) {
			cards[i] = new JButton("Carta " + i);
			panel.add(cards[i]);

			cards[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					JButton b = (JButton) e.getSource();
					
					for (int i = 0; i < cards.length; i++) {

						if (bisca.getWinner() == 1) {
							if (b == cards[i]) {

								screen.append("Carta Escolhida : " + bisca.getPlayer1().showCard(i) + "\n");
								screen.append("\n");
								screen.append("Ronda:" + bisca.getPlayer1().showCard(i) + " vs "
										+ bisca.getPlayer2().showCard(0) + "\n");
								screen.append("\n");
								bisca.rulesGame(i);
								if (bisca.getWinner() == 1) {
									screen.append("\n");
									screen.append("Jogador 1 Vence!" + "\n");
									screen.append(bisca.getrounds() + "\n");
								} else {
									screen.append("\n");
									screen.append("Jogador 2 Vence!" + "\n");
									screen.append(bisca.getrounds() + "\n");
									screen.append("Carta do jogador 2 : " + bisca.getPlayer2().showCard(0) + "\n");
								}
								screen.append("Escolhe uma carta: " + bisca.getPlayer1().toString() + "\n");
								if (bisca.getPlayer1().hasCards() == false) {
									if (bisca.getPointsP1() > bisca.getPointsP2()) {
										JOptionPane.showMessageDialog(null, "Ganhou o Jogador1!");
									} else if (bisca.getPointsP1() < bisca.getPointsP2()) {
										JOptionPane.showMessageDialog(null, "Ganhou o Jogador2!");
									} else {
										JOptionPane.showMessageDialog(null, "Empataram!");
									}

									frame.setVisible(false);

								}

							}
						} else if (bisca.getWinner() == 2) {

							if (b == cards[i]) {

								screen.append("Carta Escolhida : " + bisca.getPlayer1().showCard(i) + "\n");
								screen.append("\n");
								screen.append("Ronda:" + bisca.getPlayer2().showCard(0) + " vs "
										+ bisca.getPlayer1().showCard(i) + "\n");
								bisca.rulesGameNew(i);
								screen.append("\n");
								if (bisca.getWinner() == 1) {
									screen.append("\n");
									screen.append("Jogador 1 Vence" + "\n");
									screen.append(bisca.getrounds() + "\n");
								} else {
									screen.append("\n");
									screen.append("Jogador 2 Vence" + "\n");
									screen.append(bisca.getrounds() + "\n");
									screen.append("Carta do jogador 2 : " + bisca.getPlayer2().showCard(0) + "\n");
								}
								screen.append("Escolhe uma carta : " + bisca.getPlayer1().toString() + "\n");
								if (bisca.getPlayer1().hasCards() == false) {
									if (bisca.getPointsP1() > bisca.getPointsP2()) {
										JOptionPane.showMessageDialog(null, "Ganhou o Jogador1");
									} else {
										JOptionPane.showMessageDialog(null, "Ganhou o Jogador2");
									}

									frame.setVisible(false);
									;
								}

							}

						}

					}
				}

			});
		}

	}

	private void init() {
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Window().init();

	}
}
