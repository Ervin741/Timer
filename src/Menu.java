//Создаем открытый класс меню где будем описывать менюшку
public class Menu extends Abstract { // класс Menu наследник класса Abstract, класс Abstract является абстрактным, классом Menu является наследником
    void Start(){
        System.out.println("Hello!");
        System.out.println("Enter waiting time");

        hours = IntInput("Enter hour(s):");     // устанавливаем время
        minutes = ByteInput("Enter minute(s):");
        seconds = ByteInput("Enter second(s):");

        Calc.Run(hours, minutes, seconds); // это наши вычисления. Отсчет времени.
    }
}
