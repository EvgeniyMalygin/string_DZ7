public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("========== Задание 1 ==========");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника - %s \n", fullName);

        // Задание 2
        System.out.println("========== Задание 2 ==========");
        System.out.printf("ФИО сотрудника - %s \n", fullName.toUpperCase());
    }
}