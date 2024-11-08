//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var clientOS = 0;
        switch (clientOS) {
            case 1:
            case 0:
                if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");
        break;
        default:
            System.out.println("Такой ОС нет");}


            var clientDeviceYear = 2013;
        switch (clientOS) {
            case 1:
            case 0:
         if (clientOS == 0) {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else System.out.println("Установите версию приложения для Android по ссылке");
            }
                break;
            default:
                System.out.println("Такой ОС нет");}



            int year = 2021;
            if (year > 1584) {
                if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                    System.out.println("Год високосный");
                } else
                    System.out.println("Год не високосный");
            } else System.out.println("Год не может быть меньше 1584");


            var deliveryDistance = 105;
            var deliveryTime = 1;
            if (deliveryDistance > 100) {
                System.out.println("Доставки нет");
            } else {
                if (deliveryDistance > 20) {
                    deliveryTime++;
                }
                if (deliveryDistance > 60) {
                    deliveryTime++;
                }
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





