import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(345);
        System.out.print(564);

        System.out.println();

        int a = 2;
        int b = 3;

        int x, y, z;
        x = y = z = 50;

        System.out.println(x + y + z);
        System.out.println();
        System.out.println(a + b);
        String name = "Desmond";
        System.out.println(name);

        String StudentName = "Michael";
        int StudentId = 1234;
        int StudentAge = 50;
        float StudentFee = 75.25f;
        char StudentGrade = 'A';

        System.out.println("Student Name: " + StudentName);
        System.out.println("Student ID: " + StudentId);
        System.out.println("Student Age: " + StudentAge);
        System.out.println("Student Fee: " + StudentFee);
        System.out.println("Student Grade: " + StudentGrade);

        int length;
        int width;
        int area;
        length = 30;
        width = 40;

        area = length * width;
        System.out.println("Area: " + area);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("isJavaFun: " + isJavaFun);
        System.out.println("isFishTasty: " + isFishTasty);

        String txt = "It\'s feels\f " +
                "\f a. " +
                "\f b. great to meet something like this." +
                "\f c. beans";
        System.out.println(txt);


        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        String[] newStringArray = {"this", "rgerge", "ebrfw"};
        System.out.println(newStringArray[0]);

        for (String s : newStringArray) {
            System.out.println(s);
        }

        for (int i = 0; i < newStringArray.length; i++) {
            System.out.println(newStringArray[i]);
        }

        int ages[] = {20, 57, 23, 56, 16};

        for (int age : ages) {
            System.out.println(age);
        }

        int[][] numbers = {{5, 6, 5}, {2, 5, 8}};

        System.out.println(numbers[1][2]);

        GetName("Batowei");
        CheckAge(20);

        int result = Sum(10);
        System.out.println(result);

        var learning = new Learn();
        System.out.println(learning.age);
        System.out.println(learning.name);


        Scanner obj = new Scanner(System.in);
        System.out.println("Enter UserName: ");

        String userName = obj.nextLine();
        System.out.println("UserName: " + userName);

        var share = ZenithShareProfit.ShareHolder();

        System.out.println(share);
    }

    static void GetName(String name) {
        System.out.println(name + " " + "Michael");
    }

    static void CheckAge(int age){
        if(age < 18){
            System.out.println("Access denied....you are not old enough!");
        }else{
            System.out.println("Access granted....you are old enough!");
        }
    }

    //recursion
    public static int Sum(int k){
        if(k > 0){
            return k + Sum(k-1);
        }
        return 0;
    }

    public static class Learn{
        final int age = 130;
        final String name = "Sterling";
    }

    public static class ZenithShareProfit{
        public static float ShareHolder(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Amount: ");
            float Amount = scan.nextFloat();

            System.out.println("Enter bonus: ");
            float bonus = scan.nextFloat();

            return Amount * bonus;
        }
    }

    public static class Person{
        private String name;

        //Getter
        public String getName() {
            return name;
        }

        //Setter
        public void setName(String newName) {
            this.name = newName;
        }
    }
}

