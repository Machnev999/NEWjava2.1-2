public class Main {
    public static void main(String[] args) {

        int score = 100;// начальный счет
        int addPay = 20;// сумма пополнения
        int total = score + addPay; // сумма счет и пополнения

        if (addPay > 1000) {
            int bonus = addPay/100;
            int totalBonus = total + bonus;
                    System.out.println("Итоговый счет :" + totalBonus);
            System.out.println("Бонус составил :" + bonus);
        }
        else
            System.out.println("Итоговый счет :" + total);
        System.out.println("Бонус составил : 0");
    }
}