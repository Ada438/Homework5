//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var clientOS = 1;
        var clientDeviceYear = 2018;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else System.out.println("Установите версию приложения для Android по ссылке");
        }


        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 && year > 1584) {
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");


        var deliveryDistance = 95;
        var deliveryTime = 0;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            if (deliveryDistance <= 20) {
                deliveryTime = 1;
            } else if (deliveryDistance <= 60) {
                deliveryTime = 2;
            } else deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        }

        var monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }
}

