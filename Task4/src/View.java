
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyApp extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    private Model Model;

    MyApp() {

        super("awesome app");

        Model = new Model();


        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(300, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Button btn = new Button("AC Milan");
        btn.setSize(200, 100);
        btn.setLocation(0, 0);
        var scoreLabel = new JLabel(BorderLayout.SOUTH);

        var lastScorerLabel = new JLabel(BorderLayout.WEST);

        btn.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        System.out.println("on madrid clicked");
                        Model.onMilanWin();
                        scoreLabel.setText(Model.GetScore());
                        lastScorerLabel.setText(Model.GetLastScorer());
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

        Button btn2 = new Button("Real Madrid");
        btn2.setSize(200, 50);
        btn2.setLocation(0, 100);
        btn2.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        System.out.println("on madrid clicked");
                        Model.onMadridWin();
                        scoreLabel.setText(Model.GetScore());
                        lastScorerLabel.setText(Model.GetLastScorer());
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
        add(btn2);

        add(scoreLabel,BorderLayout.SOUTH);
        add(lastScorerLabel,BorderLayout.WEST);
        var jta = new JTextField(3);
        add(jta);
        jta.setForeground(Color.PINK);
        jta.setFont( new Font("Times new roman",Font.BOLD,20));

        
    }
}