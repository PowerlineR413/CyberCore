import java.util.Scanner;

/**
 * @author El Baron 25.07.2022
 */
public class los_animales
{
    public static void main(String[] args)
    {
        String a = "Please choose your animal from the list down below, "+"\n"+"type it's number " +
                "and press ENTER";
        System.out.println(a);
        String b = " 1-Cat,\n 2-Mouse,\n 3-Dog,\n 4-Elefant,\n 5-Fish,\n" +
                " 6-Pig,\n 7-Cow,\n 8-Snake,\n 9-Chicken,\n" +
                "10-Duck";
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        switch (c)
        {
            case 1:
                System.out.println("The Catz sayы Meow");
                break;
            case 2:
                System.out.println("The Mouse sayы Squeak");
                break;
            case 3:
                System.out.println("The Dog sayы Woof ");
                break;
            case 4:
                System.out.println("The Elefant says Auuu");
                break;
            case 5:
                System.out.println("The Fish says.....");
                break;
            case 6:
                System.out.println("The pig says Hru-Hru");
                break;
            case 7:
                System.out.println("The Cow says Muuuu");
                break;
            case 8:
                System.out.println("The Snake says Hsssss");
                break;
            case 9:
                System.out.println("The Chicken says Сackles");
                break;
            case 10:
                System.out.println("The Duck says Quacks");
                break;
        }

    }
}
