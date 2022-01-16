import java.util.Scanner;

public class LineComparisionProblem {
    public static void main(String[] args){
        double x1, x2, y1, y2;
        double distance1;
        Scanner scan= new Scanner(System.in);
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        System.out.println("enter x1 coordinates");
        x1 = scan.nextInt();
        System.out.println("enter y1 coordinates");
        y1 = scan.nextInt();
        System.out.println("enter x2 coordinates");
        x2 = scan.nextInt();
        System.out.println("enter y2 coordinates");
        x2 = scan.nextInt();
        System.out.println();
        distance1 = Math.sqrt(Math.pow(x1 - x2, 2) + (Math.pow(y1 - y2, 2)));
        System.out.printf("The distance" + distance1);

        //case-2 line-2
        System.out.println();
        double p1, p2, q1, q2;
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        System.out.println("enter p1 coordinates");
        p1 = scan.nextInt();
        System.out.println("enter q1 coordinates");
        q1 = scan.nextInt();
        System.out.println("enter p2 coordinates");
        p2 = scan.nextInt();
        System.out.println("enter q2 coordinates");
        q2 = scan.nextInt();
        double distance2 = Math.sqrt(Math.pow(p1 - p2, 2) + (Math.pow(q1 - q2, 2)));
        System.out.printf("The distance" + distance2);
        scan.close();
        //case-3 using comparator operator
        System.out.println();
        if (distance1 > distance2) {
            System.out.println("The length of line is " + distance1);
        } else if (distance1 < distance2) {
            System.out.println("The length of line is" + distance2);
        } else if (distance1 == distance2) {
            System.out.println("The length of two lines is equal");
        }
        scan.close();

    }


}