import java.io.ObjectInputStream;

public class FeMaleMenu extends Abstract{ //класс FeMaleMenu наследник класса Abstract, класс Abstract является абстрактным, классом FeMaleMenu является вторым наследником

    public FeMaleMenu(String name, int age){     //  конструктор класса FeMaleMenu //не помню зачем я его сделал но пусть будет
        System.out.println("Hello! Im " + name + "and my age is " + age);
    }

    private static String name; //сделаем приватные атрибуты чтобы потом мучаться с сеттерами и геттерами
    private static int age;

    @Override       //     Переопределение метода equals()
    public boolean equals(Object o){
        if(this == o){ //сравнение объектов. Если this & o указывает на один объект то возвращаем true
            return true;
        }

        if(o == null || getClass() != o.getClass()){ // проверка на совподение классов
            return false;
        }

        FeMaleMenu fm = (FeMaleMenu)o; // Приведение типов. o приводится к FeMaleMenu

        if(GetAge() != FeMaleMenu.GetAge()){ // проверяем на соответствия каждый елемент отдельно
            return false;
        }

        if(GetName() != FeMaleMenu.GetName()){ // проверяем на соответствия каждый елемент отдельно
            return false;
        }

        return GetName() != null ? GetName().equals(FeMaleMenu.GetName()) : FeMaleMenu.GetName() == null; // используем тернарник(аналог if else) и отправляем результат сравнения имени к null
    }

    @Override       //     Переопределение метода hashCode()
    public int hashCode(){
        int result = GetAge();
        result = 31 * result + (GetName() != null ? GetName().hashCode() : 0);
        return result;
    }

    @Override //     Переопределение метода clone()
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public FeMaleMenu (FeMaleMenu other){ //конструктор копирования
        this(other.GetName(), other.GetAge());
    }

    public void SetName(String name){ //сеттер имя
        this.name = name;
    }

    public void SetAge(int age){    //сеттер возраста
        this.age = age;
    }

    public static String GetName(){ //геттер имя
        return name;
    }

    public static int GetAge(){     //геттер возраста
        return age;
    }

    void Start(){
        System.out.println("Hello!");
        System.out.println("Enter waiting time");

        hours = IntInput("Enter hour(s):");     // устанавливаем время
        minutes = ByteInput("Enter minute(s):");
        seconds = ByteInput("Enter second(s):");

        Calc.Run(hours, minutes, seconds); // это наши вычисления. Отсчет времени.
    }
}
