//Создаем открытый класс вычислений где будем производить вычисления и отсчет времени
public class Calculate {
    Linker link = new Linker(); //создаем объект класса Linker
    void Run(int hours, byte minutes, byte seconds) { //метод что производит вычисления
        link.ShowTime(hours, minutes, seconds); //метод класса Linker который выводит время

        while(true){    //логика: если у нас закончились секунды отнимаем минуту и прибавляем 59 секунд. Если закончились и минуты то отнимаем час и прибавляем 59 минут и 60 сек
            if(seconds == 0){ // операция сравнения
                if(minutes > 0){
                    --minutes;
                    seconds += 60;
                }
                else{
                    if(hours > 0){
                        --hours;
                        minutes += 59;
                        seconds += 60;
                    }
                    else{
                        link.ShowEnd((byte)(3-2)); //метод класса Linker который говорит о том что отсчет окончен и время истекло. //конструкция (byte)1 говорит о приведении типов к byte // бинарный операто
                        break;
                    }
                }
            }

            while(seconds > 0) { //логика: используем приостановку потока на 1000 миллисекунд, что равно 1-й секунде, отнимаем секунду. В случае ошибки выбрасываем генерируемое исключение что автоматически блокирует поток выполнения
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                --seconds;
                link.ShowTime(hours, minutes, seconds);
            }
        }
    }
}
