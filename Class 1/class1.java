import java.util.*;

class Main {
  public static void main(String[] args) {

    Intro();
    Average();
    Prime();
    
  }

  public static void Intro() {

    System.out.println("Parth");
    System.out.println("Kolkata");
    
  }

  public static void Average() {

    Scanner s = new Scanner(System.in);

    System.out.println("Enter 1st integer");
    int a = s.nextInt();

    System.out.println("Enter 2nd integer");
    int b = s.nextInt();

    System.out.println("Enter 3nd integer");
    int c = s.nextInt();

    double avg = (a+b+c) / 3;
    System.out.println("The average is " + avg);
    
  }

  public static void Prime() {

    Scanner s = new Scanner(System.in);

    System.out.println("Enter the number");
    int num = s.nextInt();

    if (num <= 1) {

      System.out.println("Not Prime");
      System.exit(0);

    }

    int flag = 0;
    
    for(int i=2; i<=Math.floor(Math.sqrt(num));i++)
      {
        
        if(num%i == 0) {

          flag = 1;
          break;

        }
      }

    if(flag == 1)
      System.out.println("Not Prime");
    else
      System.out.println("Prime");
  
  }
}