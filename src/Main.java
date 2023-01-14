public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        System.out.println("Задача 1.");
     int i = 0;
     int deposit = 0;
     while (deposit < 2459000) {
         i= i +1;
         deposit = deposit + 15000;
            System.out.println("Месяц " +  i + " сумма накоплений равна " + deposit  + " рублей.");}
        }
    public static void task2() {
        System.out.println("Задача 2.");
        int i = 0;
        while (i < 10){
            i = i + 1;
            System.out.print( i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i = i - 1) {
            System.out.print( i +" ");
            System.out.println();
        }
    }
    public static void task3(){
        System.out.println("Задача 3.");
     int population = 12_000_000;
     int year = 0;
     int lives = 17;
     int death = 9;
     while (year < 10 ) {
         year++;
         population = population/1000 * (lives- death) + population;
         System.out.println("Год " + year + " численность населения составляет " + population);
     }

    }

    }