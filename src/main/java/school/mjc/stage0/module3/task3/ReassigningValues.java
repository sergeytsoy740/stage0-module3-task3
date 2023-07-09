package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        //write code here
        int first = 1, second = 10, third = 100;
        System.out.println(first + "\n" + second + "\n" + third);

        int linkToFirst = first, linkToSecond = second, linkToThird = third;
        System.out.println(linkToFirst + "\n" + linkToSecond + "\n" + linkToThird);

        first = 15; second = 6; third = 4;
        System.out.println(first + "\n" + second + "\n" + third);
    }
}
