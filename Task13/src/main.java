
public class main {
    public static void main(String[] args) {

        String name = "some data for write text";

        task task = new task();
        System.out.println("1: Реализовать запись в файл введённой с клавиатуры информации");
        task.t_1(name);
        System.out.println("2: Реализовать вывод информации из файла на экран");
        task.t_2(name);
        System.out.println('\n' + "3: Заменить информацию в файле на информацию, введённую с клавиатуры");
        task.t_1(name);
        System.out.println("4: Добавить в конец исходного файла текст, введённый с клавиатуры");
        task.t_4(name);
        System.out.println("Result");
        task.t_2(name);
    }
}