import java.util.Scanner; //импортируем класс java.util.Scanner c помощью этого класса можно анализировать простые типы данных и строки.

public class Abstract {
    int hours; // использовал тип integer так как не думаю что число перевалит за его пределы тем более что для лабы это вполне сгодится
    byte minutes; //байтовое значение так как выше 60 не оно не должно подниматься
    byte seconds;

    Scanner sc = new Scanner(System.in); //создаем объект  класса Scanner
    Calculate Calc = new Calculate(); //создаем объект  класса Calculate

    byte ByteInput(String str){    //метод что устанавливает переменные/атрибуты типа byte, в нашем случае секунды и минуты
        for(;;){    //зачем for() ? - а за тем что это одно из условий в 5-м практикуме. (П.С. тут было while(true) )
            System.out.println(str);
            byte time = sc.nextByte();
            if(time <= 59 && time >= 0){ // логика: если кол-во минут/секунд находится в приделах от 0 до 59 значит оно подходящее и может быть использовано и передано //логическое И
                return time;
            }
            else{
                System.out.println("invalid input variable! Try again:"); // выводит сообщение на экран. В нашем случае это означает что были введены не корректные данные
            }
        }
    }

    int IntInput(String str){   //метод что устанавливает переменные/атрибуты типа integer, в нашем случае часы
        while (true){
            System.out.println(str);
            byte time = sc.nextByte();
            if(time >= 0){      // логика: если кол-во часов положительное значит оно подходящее и может быть использовано и передано
                return time;
            }
            else{
                System.out.println("invalid input variable! Try again:");
            }
        }
    }
}
