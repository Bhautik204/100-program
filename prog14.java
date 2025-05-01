//WAP to calculate an angle between hour and minute hand. (Hours and minutes should be taken from user).

import java.util.Scanner;

public class prog14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the hour (0-12) : ");
        int hour = sc.nextInt();
        System.out.println("Enter the minute (0-59) : ");
        int minute = sc.nextInt();

        if(hour < 0 || hour > 12 || minute < 0 || minute > 59)
        {
            System.out.println("Invaild Input.Please Enter the vaild Hours and Minutes.");
            return;
        }
        double hourAngel = (hour % 12)*30 + (minute * 0.5);
        double minuteAngle = minute * 6;

        double angle = Math.abs(hourAngel - minuteAngle);

        angle = Math.min(angle, 360 - angle);

        System.out.println("The Angel between hour and minute hands is :" + angle +" degrees.");
        sc.close();
    }
}