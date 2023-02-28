//Создаем открытый класс вывода информации где будем выводить полезную инфу
public class Linker {

    void ShowEnd(byte something){ //метод что говорит о том что отсчет окончен и время истекло.
        switch (something){ // зачем switch? а потому что условие 5-го практикума
            case 1:
                System.out.println("Time over!");
                break;
            case 2:
                System.out.println("Time DOUBLE over!");
                break;
            case 3:
                System.out.println("TIME T-T-TRIPLE OVER!!!");
                break;
        }
    }
    void ShowTime(int hours, byte minutes, byte seconds){ // метод что выводит время
        System.out.println("TIME:\thour(s): " + hours + "\tminute(s): " + minutes + "\tsecond(s): " + seconds);
    }
}
