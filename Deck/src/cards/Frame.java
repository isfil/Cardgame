package cards;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame {
	private Hand player1 = new Hand();
	private static final long serialVersionUID = 1L;
    private JPanel cardPanel, jp1, jp2, jp3, buttonPanel;
    private JLabel jl1, jl2, jl3;
    private JButton btn1, btn2, btn3;
    private CardLayout cardLayout = new CardLayout();
    
    public Frame () {
        setTitle("Test med CardLayout");
        setSize(400, 300);
        cardPanel = new JPanel();
        buttonPanel = new JPanel();
        cardPanel.setLayout(cardLayout);
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jl1 = new JLabel("Card 1");
        jl2 = new JLabel("Card 2");
        jl3 = new JLabel("Card 3");
        jp1.add(jl1);
        jp2.add(jl2);
        jp3.add(jl3);
        cardPanel.add(jp1, "");
        cardPanel.add(jp2, "2");
        cardPanel.add(jp3, "3");
        btn1 = new JButton("Show Card 1");
        btn1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "1");
            }
        });
        btn2 = new JButton("Show Card 2");
        btn2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "2");
            }
        });
        btn3 = new JButton("Show Card 3");
        btn3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "3");
            }
        });
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        add(cardPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
    	 EventQueue.invokeLater(new Runnable() {

             @Override
             public void run() {
            	 Frame frame = new Frame();
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame.setVisible(true);
             }
         });
    }

}
