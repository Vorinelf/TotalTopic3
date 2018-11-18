import java.io.*;

public class TotalTopic3 {
    private static final String DIRECTORY = "D:/TotalTopic3";

    public static void main(String[] args) throws IOException {

        System.out.println("------------------------------------");
        try {
            City gomel = new City();
            gomel.name = "Gomel";
            gomel.since = 862;
            gomel.population = 535693;
            gomel.area = (float) 5;
            gomel.consol();
            System.out.println("------------------------------------");
            System.out.println("Записываю информацию о " + gomel.name + " в файл на диск D\n" +
                    "Файл будет иметь название " + gomel.name + ".txt");
            FileOutputStream total = new FileOutputStream(DIRECTORY + gomel.name + ".txt");
            ObjectOutputStream totaltopic = new ObjectOutputStream(total);
            totaltopic.writeObject(gomel);
        } catch (FileNotFoundException ex) {
            System.out.println("Произошла ошибка. Файл не найден!");
        } catch (IOException io) {
            System.out.println("Произошла ошибка при записи файла!");
        } catch (ArithmeticException ar) {
            System.out.println("У Вас ошибка в методе consol\n" +
                    "Файл не будет запиcан на диск!\n" +
                    "УСТРАНИТЕ НЕИСПРАВНОСТЬ!");
        }

        System.out.println("------------------------------------");

        try {
            City minsk = new City();

            minsk.name = "Minsk";
            minsk.since = 1067;
            minsk.population = 1982444;
            minsk.area = (float) 348.84;
            minsk.consol();
            System.out.println("------------------------------------");
            System.out.println("Записываю информацию о " + minsk.name + " в файл на диск D\n" +
                    "Файл будет иметь название " + minsk.name + ".txt");

            FileOutputStream total1 = new FileOutputStream(DIRECTORY + minsk.name + ".txt");
            ObjectOutputStream totaltopic1 = new ObjectOutputStream(total1);
            totaltopic1.writeObject(minsk);
        } catch (
                FileNotFoundException ex1) {
            System.out.println("Произошла ошибка. Файл не найден!");
        } catch (
                IOException io1) {
            System.out.println("Произошла ошибка при записи файла!");
        }

        System.out.println("------------------------------------");
        try {
            City minsk2 = new City();
            minsk2.name = "Minsk-2";
            minsk2.since = 1067;
            minsk2.population = 1982444;
            minsk2.area = (float) 348.84;
            minsk2.consol();
            ByteArrayOutputStream buff = new ByteArrayOutputStream();
            ObjectOutput byminsk = new ObjectOutputStream(buff);
            byminsk.writeObject(minsk2);
            System.out.println("------------------------------------");
            System.out.println("Превращаем " + minsk2.name + " в массив байтов и выводим его в консоль.\n" +
                    "Он будет иметь следующий вид:\n");
            System.out.println(buff.toString());
            System.out.println("------------------------------------");
            System.out.println("Записываем полученный массив байтов класса  " + minsk2.name + " в файл на диск D \n"
                    + "Файл будет иметь название Array" + minsk2.name + ".txt");
            System.out.println("------------------------------------");
            FileOutputStream total1 = new FileOutputStream(DIRECTORY + "Array" + minsk2.name + ".txt");
            ObjectOutputStream totaltopic2 = new ObjectOutputStream(total1);
            totaltopic2.writeObject(minsk2);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи файла!");
        }
        System.out.println("Считываем записаный файл с диска D в буфер.\n" +
                "Выводим его на консоль:");
        try {
            FileInputStream input = new FileInputStream("D:/TotalTopic3ArrayMinsk-2.txt");
            byte[] buffer = new byte[input.available()];
            input.read(buffer, 0, input.available());
            for (int i = 0; i < buffer.length; i++) {
                System.out.print((char) buffer[i]);
            }
        } catch (FileNotFoundException fex) {
            System.out.printf("Произошла ошибка при чтении файла!");
        }

    }
}


