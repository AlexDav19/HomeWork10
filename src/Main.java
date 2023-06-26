public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");
        String firstName = "Ivan", lastName = "Ivanov", middleName = "Ivanovich",
                fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("Задание 2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");
        fullNameTrue = fullNameTrue.replace("Ё" , "Е");
        System.out.println("Данные ФИО сотрудника — " + fullNameTrue);
    }
}