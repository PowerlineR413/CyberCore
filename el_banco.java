import java.util.Scanner;

public class el_banco
{
    public static void main(String[] args)
    {
        int a = 13;
        String b = "Добро пожаловать в интерфейс программы подсчёта " +"\n" +
                "процентов по вкладу Подсчётоматик (v0.9) " +"\n" +
                "Ваш годовой процент по новому вкладу в рублях составляет " + a + " % годовых. " + "\n"+
                "Пожалуйста, введите цифрами сумму Вашего вклада, и нажмите ENTER " + "\n" +
                "для подсчёта процентов за два года - это минимальный срок вложения средств. ";
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        double vklad = sc.nextInt();
        double prs = ((vklad / 100) * 13) * 2;
        double marga = vklad + prs;
        String itog = "Ваш процент по вкладу в сумме " + vklad + " рублей за два года " +
                "составит " + prs +" рублей." +"\n" +
                "Общая сумма вашего вклада таким образом составит " + marga +" рублей";
        System.out.println(itog);
        sc.close();













    }
}
