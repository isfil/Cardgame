package cards;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Bisca {

	private Deck deck = new Deck();
	private Hand player1 = new Hand();
	private Hand player2 = new Hand();
	private Card trump = deck.peakCard();

	private int winner = 1;
	private int pointsPlayer1 = 0;
	private int pointsPlayer2 = 0;
	private int rounds = 1;
	
	public String getrounds() {
		return "__________" + "RONDA : " + rounds + "__________";
	}

	public String trunfo() {
		return trump.toString();
	}

	public Hand getPlayer1() {
		return player1;
	}

	public Hand getPlayer2() {
		return player2;
	}

	public int getPointsP1() {
		return pointsPlayer1;
	}

	public int getPointsP2() {
		return pointsPlayer2;
	}

	public int getWinner() {
		return winner;
	}

	public void giveCards() {
		deck.Shufle();

		while (player2.has3Cards()) {
			player1.addCard(deck.getCard());
			player2.addCard(deck.getCard());
		}

	}

	public void playgame() {

		Card trunfo = player1.peakCard();
		System.out.println("O trufo �: " + trunfo);

		while (player1.hasCards()) {
			System.out.println("A tua M�o: " + player1.toString());

			System.out.println("A tua M�o 2: " + player2.toString());
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Choose a Card:");
			int usercard = keyboard.nextInt();
			if (deck.hasCards()) {
				if (winner == 1) {
					Card p1Card = player1.playCard(usercard);
					Card p2Card = player2.playCard(0);

					if (p1Card.getSuit().ordinal() == trunfo.getSuit().ordinal()) {
						if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
							if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
								pointsPlayer1++;
								winner = 1;
								player1.addCard(deck.getCard());
								player2.addCard(deck.getCard());
							} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
								pointsPlayer2++;
								winner = 2;
								player2.addCard(deck.getCard());
								player1.addCard(deck.getCard());

							}
						} else {
							pointsPlayer1++;
							winner = 1;
							player1.addCard(deck.getCard());
							player2.addCard(deck.getCard());

						}

					} else if (p2Card.getSuit().ordinal() == trunfo.getSuit().ordinal()) {
						if (p2Card.getSuit().ordinal() == p1Card.getSuit().ordinal()) {
							if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
								pointsPlayer1++;
								winner = 1;
								player1.addCard(deck.getCard());
								player2.addCard(deck.getCard());
							} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
								pointsPlayer2++;
								winner = 2;
								player2.addCard(deck.getCard());
								player1.addCard(deck.getCard());
							}
						} else {
							pointsPlayer2++;
							winner = 2;
							player2.addCard(deck.getCard());
							player1.addCard(deck.getCard());
						}

					} else {
						if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
							if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
								pointsPlayer1++;
								winner = 1;
								player1.addCard(deck.getCard());
								player2.addCard(deck.getCard());
							} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
								pointsPlayer2++;
								winner = 2;
								player2.addCard(deck.getCard());
								player1.addCard(deck.getCard());
							}
						} else {
							pointsPlayer1++;
							winner = 1;
							player1.addCard(deck.getCard());
							player2.addCard(deck.getCard());

						}

					}
					System.out.println("(" + pointsPlayer1 + ", " + pointsPlayer2 + ")" + p1Card + p2Card);
				}

				else if (winner == 2) {
					Card p2Card = player2.playCard(0);
					Card p1Card = player1.playCard(usercard);

					if (p1Card.getSuit().ordinal() == trunfo.getSuit().ordinal()) {
						if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
							if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
								pointsPlayer1++;
								winner = 1;
								player1.addCard(deck.getCard());
								player2.addCard(deck.getCard());
							} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
								pointsPlayer2++;
								winner = 2;
								player2.addCard(deck.getCard());
								player1.addCard(deck.getCard());
							}
						} else {
							pointsPlayer1++;
							winner = 1;
							player1.addCard(deck.getCard());
							player2.addCard(deck.getCard());
						}
					} else if (p2Card.getSuit().ordinal() == trunfo.getSuit().ordinal()) {
						if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
							if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
								pointsPlayer1++;
								winner = 1;
								player1.addCard(deck.getCard());
								player2.addCard(deck.getCard());
							} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
								pointsPlayer2++;
								winner = 2;
								player2.addCard(deck.getCard());
								player1.addCard(deck.getCard());
							}
						} else {
							pointsPlayer2++;
							winner = 2;
							player2.addCard(deck.getCard());
							player1.addCard(deck.getCard());
						}

					} else {
						if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
							if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
								pointsPlayer1++;
								winner = 1;
								player1.addCard(deck.getCard());
								player2.addCard(deck.getCard());
							} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
								pointsPlayer2++;
								winner = 2;
								player2.addCard(deck.getCard());
								player1.addCard(deck.getCard());
							}
						} else {
							pointsPlayer2++;
							winner = 2;
							player2.addCard(deck.getCard());
							player1.addCard(deck.getCard());
						}
					}
					System.out.println("(" + pointsPlayer1 + ", " + pointsPlayer2 + ")" + p1Card + p2Card);
				}
				// N�o tem mais cartas no deck
			} else {
				if (winner == 1) {
					Card p1Card = player1.playCard(usercard);
					Card p2Card = player2.playCard(0);

					if (p1Card.getSuit().ordinal() == trunfo.getSuit().ordinal()) {
						if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
							if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
								pointsPlayer1++;
								winner = 1;

							} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
								pointsPlayer2++;
								winner = 2;

							}
						} else {
							pointsPlayer1++;
							winner = 1;

						}

					} else if (p2Card.getSuit().ordinal() == trunfo.getSuit().ordinal()) {
						if (p2Card.getSuit().ordinal() == p1Card.getSuit().ordinal()) {
							if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
								pointsPlayer1++;
								winner = 1;

							} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
								pointsPlayer2++;
								winner = 2;

							}
						} else {
							pointsPlayer2++;
							winner = 2;

						}

					} else {
						if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
							if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
								pointsPlayer1++;
								winner = 1;

							} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
								pointsPlayer2++;
								winner = 2;

							}
						} else {
							pointsPlayer1++;
							winner = 1;

						}

					}
					System.out.println("(" + pointsPlayer1 + ", " + pointsPlayer2 + ")" + p1Card + p2Card);
				}

				else if (winner == 2) {
					Card p2Card = player2.playCard(0);
					Card p1Card = player1.playCard(usercard);

					if (p1Card.getSuit().ordinal() == trunfo.getSuit().ordinal()) {
						if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
							if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
								pointsPlayer1++;
								winner = 1;

							} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
								pointsPlayer2++;
								winner = 2;

							}
						} else {
							pointsPlayer1++;
							winner = 1;

						}
					} else if (p2Card.getSuit().ordinal() == trunfo.getSuit().ordinal()) {
						if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
							if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
								pointsPlayer1++;
								winner = 1;

							} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
								pointsPlayer2++;
								winner = 2;

							}
						} else {
							pointsPlayer2++;
							winner = 2;

						}

					} else {
						if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
							if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
								pointsPlayer1++;
								winner = 1;

							} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
								pointsPlayer2++;
								winner = 2;

							}
						} else {
							pointsPlayer2++;
							winner = 2;
						}
					}
					System.out.println("(" + pointsPlayer1 + ", " + pointsPlayer2 + ")" + p1Card + p2Card);
				}

			}
		}
		if (pointsPlayer1 > pointsPlayer2) {
			JOptionPane.showMessageDialog(null, "Ganhou o Jogador1");
		} else if (pointsPlayer1 < pointsPlayer2) {
			JOptionPane.showMessageDialog(null, "Ganhou o Jogador2");
		} else {
			JOptionPane.showMessageDialog(null, "Empataram");
		}
	}

	// Regras do Jogo
	public void rulesGame(int i) {
		Card p1Card = player1.playCard(i);
		Card p2Card = player2.playCard(0);

		if (p1Card.getSuit().ordinal() == trump.getSuit().ordinal()) {
			if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
				if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
					pointsPlayer1++;
					rounds++;
					winner = 1;
					if (deck.hasCards()) {
						player1.addCard(deck.getCard());
						player2.addCard(deck.getCard());
					}
				} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
					pointsPlayer2++;
					rounds++;
					winner = 2;
					if (deck.hasCards()) {
						player2.addCard(deck.getCard());
						player1.addCard(deck.getCard());
					}
				}
			} else {
				pointsPlayer1++;
				rounds++;
				winner = 1;
				if (deck.hasCards()) {
					player1.addCard(deck.getCard());
					player2.addCard(deck.getCard());
				}
			}

		} else if (p2Card.getSuit().ordinal() == trump.getSuit().ordinal()) {
			pointsPlayer2++;
			rounds++;
			winner = 2;
			if (deck.hasCards()) {
				player2.addCard(deck.getCard());
				player1.addCard(deck.getCard());
			}
		} else {
			if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
				if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
					pointsPlayer1++;
					rounds++;
					winner = 1;
					if (deck.hasCards()) {
						player1.addCard(deck.getCard());
						player2.addCard(deck.getCard());
					}
				} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
					pointsPlayer2++;
					rounds++;
					winner = 2;
					if (deck.hasCards()) {
						player2.addCard(deck.getCard());
						player1.addCard(deck.getCard());
					}
				}
			} else {
				pointsPlayer1++;
				rounds++;
				winner = 1;
				if (deck.hasCards()) {
					player1.addCard(deck.getCard());
					player2.addCard(deck.getCard());
				}
			}

		}
	}

	public void rulesGameNew(int i) {
		Card p2Card = player2.playCard(0);
		Card p1Card = player1.playCard(i);

		if (p1Card.getSuit().ordinal() == trump.getSuit().ordinal()) {
			if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
				if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
					pointsPlayer1++;
					rounds++;
					winner = 1;
					if (deck.hasCards()) {
						player1.addCard(deck.getCard());
						player2.addCard(deck.getCard());
					}
				} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
					pointsPlayer2++;
					rounds++;
					winner = 2;
					if (deck.hasCards()) {
						player2.addCard(deck.getCard());
						player1.addCard(deck.getCard());
					}
				}
			} else {
				pointsPlayer1++;
				rounds++;
				winner = 1;
				if (deck.hasCards()) {
					player1.addCard(deck.getCard());
					player2.addCard(deck.getCard());
				}
			}

		} else if (p2Card.getSuit().ordinal() == trump.getSuit().ordinal()) {
			pointsPlayer2++;
			rounds++;
			winner = 2;
			if (deck.hasCards()) {
				player2.addCard(deck.getCard());
				player1.addCard(deck.getCard());
			}
		} else {
			if (p1Card.getSuit().ordinal() == p2Card.getSuit().ordinal()) {
				if (p1Card.getValue().ordinal() > p2Card.getValue().ordinal()) {
					pointsPlayer1++;
					rounds++;
					winner = 1;
					if (deck.hasCards()) {
						player1.addCard(deck.getCard());
						player2.addCard(deck.getCard());
					}
				} else if (p1Card.getValue().ordinal() < p2Card.getValue().ordinal()) {
					pointsPlayer2++;
					rounds++;
					winner = 2;
					if (deck.hasCards()) {
						player2.addCard(deck.getCard());
						player1.addCard(deck.getCard());
					}
				}
			} else {
				pointsPlayer2++;
				rounds++;
				winner = 2;
				if (deck.hasCards()) {
					player2.addCard(deck.getCard());
					player1.addCard(deck.getCard());
				}
			}

		}
	}

	public static void main(String[] args) {
		Bisca newgame = new Bisca();

		newgame.giveCards();

		newgame.playgame();

	}

}
