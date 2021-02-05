package Anya_programist.multirething;

class PeopleQueue extends Thread    {// Наша очередь из сотрудников, наследник класса Thread
    private String[] names;

    PeopleQueue(String... names) {// Конструктор, аргумент- массив имен сотрудников
        this.names = names;
    }

    @Override
    public void run() { // Этот метод будет вызван при старте потока
        for (int i = 0; i < names.length; i++) { // Вывод в цикле с паузой 0.5 сек очередного сотрудника
            System.out.println("Обработаны документы: " + names[i]);
            try {
                sleep(500); // Задержка в 0.5 сек
            } catch (Exception e) {}
        }
    }
}

public class HR    {// Класс для демонстрации работы потока
    public static void main(String[] args) {
        // Создаем две очереди
        PeopleQueue queue1 = new PeopleQueue("Иван","Сергей","Николай","Фердинанд","Василий");
        PeopleQueue queue2 = new PeopleQueue("Мария","Людмила","Алиса","Карина","Ольга");

        System.out.println("Начали!"); // Сообщение из главного потока программы
        queue1.start();    //Запускаем одну очередь (дочерний поток)
        queue2.start(); //Запускаем вторую (дочерний поток)
    }
}

