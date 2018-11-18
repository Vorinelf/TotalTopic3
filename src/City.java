import java.io.Serializable;

public class City implements Serializable {
    String name;
    int since;
    float population;
    float area;


    int age() throws Exception {
        int cityage = 2018 - since;
        if (cityage <= 1156) {
            return cityage;
        } else {
            throw new Exception();
        }
    }

    float density() throws Exception {
        float den = population / area;
        if (den <= 5682.961) {
            return den;
        } else {
            throw new Exception();
        }

    }

    void consol() throws ArithmeticException {
        System.out.println("Город " + name + " ");
        System.out.println("Основан в " + since + " году");
        try {
            System.out.println("Сегодня его возраст - " + age() + " лет");
        } catch (Exception age) {
            System.out.println("*****У ВАС ОШИБКА С ВОЗРАСТОМ ГОРОДА!!!*****");
            System.out.println("---|* Возраст вашего города не соответствует дейтсвительности.\n" +
                    "Вы неправильно ввели дату основания города. \n" +
                    "Ваш город получился старше Полоцка,\n" +
                    "а он самый старый в Беларуси и основан в 862 году! *|---");
            throw new ArithmeticException();
        }
        try {
            System.out.println("Плотность населения на 1 км.кв. составляет " + density() + " человек");
        } catch (Exception density) {
            System.out.println("*****У ВАС ОШИБКА С ПЛОТНОСТЬЮ НАСЕЛЕНИЯ!!!*****");
            System.out.println("---|* Ваша плотность населения не соответствует дествительности.\n" +
                    "Она превышает плотность населения Минска, \n" +
                    "который занимает первое место по этому показателю!!! *|---");
            throw new ArithmeticException();
        }
    }
}




