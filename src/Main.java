import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        checkLeapYear(1700);

        int currentYear = LocalDate.now().getYear();
        int clientOS = ThreadLocalRandom.current().nextInt(2);
        checkOS(clientOS,currentYear);

        countDelivery();

        int arr[] = {5, 6, 1, 2, 3};
        System.out.println("task 5");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        arr = reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\n");

    }
    static void checkLeapYear(int year) {
        System.out.println("task 1");
        if (year % 4 == 0 && year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " is leap year\n");
        } else {
            System.out.println(year + " is not leap year\n");
        }
    }

    static void checkOS(int versionOS, int year) {
        System.out.println("task 2");
        if (year < 2015) {
            if (versionOS == 0) {
                System.out.println("iOS lite\n");
            } else {
                System.out.println("Android lite\n");
            }
        } else {
            if (versionOS == 0) {
                System.out.println("iOS\n");
            } else {
                System.out.println("Android\n");

            }
        }
    }

    static void countDelivery() {
        System.out.println("task 3");
        int distance = 95;
        int days = countDaysDelivery(distance);
        System.out.println(days);
        System.out.println("\n");
    }

    static int countDaysDelivery(int distance) {
        int firstDayDistance = 20;
        int additionalDistance = 40;
        int days = 0;
        if((distance-firstDayDistance)%additionalDistance==0){
            days = 1+(distance-firstDayDistance)/additionalDistance;
        }else{
            days = 2+(distance-firstDayDistance)/additionalDistance;
        }

        return days;
    }

    static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int sumOpositeElem = arr[i] + arr[arr.length - 1 - i];
            arr[i] = sumOpositeElem - arr[i];
            arr[arr.length - 1 - i] = sumOpositeElem - arr[arr.length - 1 - i];
        }
        return arr;
    }

}