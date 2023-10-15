package Task7.src;/*
Напишите интерактивную программу с использованием GUI
имитирует таблицу результатов матчей между командами Милан и Мадрид.
Создайте JFrame приложение у которого есть следующие компоненты GUI:
•
 одна кнопка JButton labeled “AC Milan”
•
 другая JButton подписана “Real Madrid”
•
 надпись JLabel содержит текст “Result: 0 X 0”
•
 надпись JLabel содержит текст “Last Scorer: N/A”
•
 надпись Label содержит текст “Winner: DRAW”;
Всякий раз, когда пользователь нажимает на кнопку AC Milan,
результат будет увеличиваться для Милана, сначала 1 X 0, затем 2 X 0 и так далее. Last Scorer означает последнюю забившую команду. В этом случае:
AC Milan. Если пользователь нажимает кнопку для команды Мадрид, то счет
приписывается ей. Победителем становится команда, которая имеет больше
кликов кнопку на соответствующую, чем другая.
 */

public class Model {
    private Team Milan;
    private Team Madrid;

    private Team LastScorer;

    public Model(){
        Milan = new Team("Milan");
        Madrid = new Team("Madrid");
    }

    public void onMadridWin(){
        Madrid.IncreaseScore();
        LastScorer = Madrid;
    }

    public void onMilanWin(){
        Milan.IncreaseScore();
        LastScorer = Milan;
    }

    public String GetScore() {
        return "Result:  " + Milan.GetScore() + " X " + Madrid.GetScore() + "          " + GetLastScorer();
    }

    public String GetWinner(){
        return " Winner: " +(Madrid.GetScore() > Milan.GetScore() ? Madrid.GetName() : Milan.GetName());
    }

    public String GetLastScorer(){
        return " Last Scorer: " + LastScorer.GetName();
    }
}
