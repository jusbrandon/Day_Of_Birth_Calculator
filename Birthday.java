import java.awt.*;       // Using layouts
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing components and containers
import java.lang.Math;
import java.util.Scanner;
import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Birthday

{
    public static void main(String[] args) throws IOException
    {
        int a[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4}; //From January- December are the numbers of E for formula Using Schwerdtfeger method, the value above “e” is obtained by ?2.6m - 0.2? mod 7 where m is month with (March = 1, April = 2, May = 3, June = 4 … and February = 12)
        int f[] = {0,5,3,1};
        //additional it could also be used for Gauss's Algorithm where W = (d + 2.6m - .2] + y + (y/4) + (c/4) - 2c) mod 7
        boolean isTrue = false;
        int numberIn = 0;
        int numberIn2 = 0;
        int numberIn3 = 0;
        int CheckLoop = 0;
        int g = 0;
        int c= 0;
        String CheckingType;
        //Scanner input = new Scanner(System.in);
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));


        do
        {

            System.out.println("Enter Year: ");
            CheckingType = input.readLine();

            try
            {
                numberIn = Integer.parseInt(CheckingType);
                CheckLoop = 1;
                isTrue = true;
            }
            catch(Exception e)
            {
                isTrue = false;
                CheckLoop = 0;
                System.out.println("Please Enter a number not a string!!!");
            }
            if(numberIn<0 || numberIn>9999 || numberIn <999)
            {
                isTrue = false;
                CheckLoop = 0;
                System.out.println("Invalid Number");
            }
        }while(isTrue == false && CheckLoop == 0);
        do
        {

            System.out.println("Enter Month: ");
            CheckingType = input.readLine();

            try
            {
                numberIn2 = Integer.parseInt(CheckingType);
                CheckLoop = 1;
                isTrue = true;
            }
            catch(Exception e)
            {
                isTrue = false;
                CheckLoop = 0;
                System.out.println("Please Enter a number not a string!!!");
            }
            if(numberIn2<1 || numberIn2>12)
            {
                isTrue = false;
                CheckLoop = 0;
                System.out.println("Invalid Number");
            }

        }while(isTrue == false && CheckLoop == 0);
        do
        {

            System.out.println("Enter Day: ");
            CheckingType = input.readLine();

            try
            {
                numberIn3 = Integer.parseInt(CheckingType);
                CheckLoop = 1;
                isTrue = true;
            }
            catch(Exception e)
            {
                isTrue = false;
                CheckLoop = 0;
                System.out.println("Please enter a number not a string!!!");
            }
            if(numberIn3<1 || numberIn3>31)
            {
                isTrue = false;
                CheckLoop = 0;
                System.out.println("Invalid Number");
            }
            Calendar myCalendar = new GregorianCalendar (numberIn, numberIn2-1, 1);
            int daysInMonth = myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            if(numberIn3 > daysInMonth)
            {
                isTrue = false;
                CheckLoop = 0;
                System.out.println("That day does not Exist in that time of year!!");
            }
        }while(isTrue == false && CheckLoop == 0);

        if(numberIn2<3)
        {
            c = (int)Math.floor((numberIn-1)/100);
            g = numberIn - 1 - 100*c;
        }
        if (numberIn2>=3)
        {
            c = (int)Math.floor (numberIn/100);
            g = numberIn - 100*c;
        }

        int week = (int) (numberIn3 + a[numberIn2-1] + f[c%4] + g + Math.floor(g/4)) %7;

        switch (week)
        {

            case 0:
                System.out.println("You were born on a Sunday");
                break;
            case 1:
                System.out.println("You were born on a Monday");
                break;
            case 2:
                System.out.println("You were born on a Tuesday");
                break;
            case 3:
                System.out.println("You were born on a Wednesday");
                break;
            case 4:
                System.out.println("You were born on a Thursday");
                break;
            case 5:
                System.out.println("You were born on a Friday");
                break;
            case 6:
                System.out.println("You were born on a Saturday");
                break;
        }

    }

}


