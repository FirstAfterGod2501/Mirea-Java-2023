package Task7.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class View extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    private Model Model;

    View() {

        super("awesome app");

        Model = new Model();


        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setLocation(300, 300);

        setLayout(new BorderLayout());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Button btn = new Button("Real Madrid");
        btn.setSize(200, 200);
        btn.setLocation(0, 0);
        var scoreLabel = new JLabel();
        var winnerLable = new JLabel();
        winnerLable.setLocation(300,300);
        var lastScorerLabel = new JLabel();

        btn.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        System.out.println("on madrid clicked");
                        Model.onMadridWin();
                        scoreLabel.setText(Model.GetScore());
                        lastScorerLabel.setText(Model.GetLastScorer());
                        winnerLable.setText(Model.GetWinner());
                    }

                    @Override
                    public void mousePressed(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseExited(MouseEvent mouseEvent) {

                    }
                }
        );
        add(btn);

        add(btn,BorderLayout.EAST);

        Button btn2 = new Button("AC Milan");
        btn2.setSize(200, 200);
        btn2.setLocation(200, 200);
        btn2.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        System.out.println("on milan clicked");
                        Model.onMilanWin();
                        scoreLabel.setText(Model.GetScore());
                        lastScorerLabel.setText(Model.GetLastScorer());
                        winnerLable.setText(Model.GetWinner());
                    }

                    @Override
                    public void mousePressed(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent mouseEvent) {

                    }

                    @Override
                    public void mouseExited(MouseEvent mouseEvent) {

                    }
                }
        );
        add(btn2,BorderLayout.WEST);
        add(winnerLable,BorderLayout.NORTH);
        add(scoreLabel,BorderLayout.SOUTH);
       // add(lastScorerLabel,BorderLayout.SOUTH);
        var jta = new JTextField(3);
        add(jta);
        jta.setForeground(Color.PINK);
        jta.setFont( new Font("Times new roman",Font.BOLD,20));
    }
}