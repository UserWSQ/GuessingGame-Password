import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        int y=cal.get(Calendar.YEAR);
        int m=cal.get(Calendar.MONTH);
        int d=cal.get(Calendar.DATE);
        int h=cal.get(Calendar.HOUR_OF_DAY);
        int mi=cal.get(Calendar.MINUTE);
        int s=cal.get(Calendar.SECOND);

        System.out.println("which mode do you want to play?please choose");
        System.out.println("(random:enter 1     random with information:enter 2     two players:enter 3)");
        Scanner mode = new Scanner(System.in);
        int b = mode.nextInt();

        if (b == 1){
            //这就是个guessing game的代码，但是并没有直接放在这里，是我上csdn查的一个，并且又稍加改进了一些
            System.out.println("we will summon a random number in 0~5,pls take a guess");
            System.out.println("More information,pls find this man:王善奇");
            System.out.println("there are still many bugs inside,pls don't mention!");

            Random random = new Random();
            for (int i = 0; i < 7355608; i++) {
                int number = random.nextInt(5);
                System.out.println("pls enter the number you guess");
                Scanner GuessNumber = new Scanner(System.in);
                int c = GuessNumber.nextInt();
                if(c == number){
                    System.out.println("you win!");
                    System.out.println("your number:"+c+"     random number:"+number);
                    break;
                }else {
                    System.out.println("you loose!");
                    System.out.println("your number:"+c+"     random number:"+number);
                }

            }

        }

        if (b == 2) {
            System.out.println("we will summon a random number in 0~100,pls take a guess");
            System.out.println("we will give you some information to help you guess the number,enjoy!");
            System.out.println("there are still many bugs inside,pls don't mention!");
            System.out.println("More information,pls find this man:王善奇");

            Random random = new Random();
            for (int i = 0; i < 7355608; i++) {
                int number = random.nextInt(100);
                for (int life2 = 7; life2 > 0; life2--) {

                    System.out.println("pls enter the number you guess");
                    Scanner GuessNumber = new Scanner(System.in);
                    int e = GuessNumber.nextInt();

                    if (e < number) {
                        System.out.println("猜的数太小了");
                        System.out.println("你还有" + life2 + "次机会");
                    }
                    if (e > number) {
                        System.out.println("猜的数太大了");
                        System.out.println("你还有" + life2 + "次机会");
                    }

                    if (e == number) {
                        System.out.println("you win!");
                        System.out.println("your number:" + e + "     random number:" + number);
                        return;
                    }
                    if (life2 == 1) {
                        System.out.println("you loose!");
                        System.out.println("your number:" + e + "     random number:" + number);
                        return;
                    }

                }

            }
        }


        if (b == 3) {
            System.out.println("这个模式的玩法是这样的：一个随机的人出题，另一个随机的人来答（在同一台电脑上操作，暂时没有在线模式）");
            System.out.println("出的数字必须在十位数及以内，否则难度有点儿大");
            System.out.println("每个猜的人有五次机会，机会用完后会公布答案");
            System.out.println("enjoy!");

            System.out.println("出题人，请输入你的名字：");
            Scanner name1 = new Scanner(System.in);
            String name1s = name1.next();
            System.out.println("请你再输入一个数字：");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");

            System.out.println("答题人，请输入你的名字：");
            Scanner name2 = new Scanner(System.in);
            String name2s = name2.next();

            System.out.println("再来猜测一下答案：");
            for (int life = 6; life > 0; life--) {

                Scanner scanner1 = new Scanner(System.in);
                int c = scanner1.nextInt();

                if (c == a) {
                    System.out.println("恭喜答题人"+name2s+"，回答正确！");
                    break;
                } else {
                    System.out.println("对不起，答错了。你还有" + life + "次机会");
                }
                if (life == 1){
                    System.out.println("Game over!出题者"+name1s+"获胜！");
                }

            }

        }

        System.out.println(y+"年"+m+"月"+d+"日"+h+"点"+mi+"分"+s+"秒");
    }

}
