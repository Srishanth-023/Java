public class Arrays{
    public static void main(String[] args) {
        // // One dimensional Array
        // // int[] nums = {1, 2, 3, 4}; // int nums[] --> Legal

        // // nums[0] = 0;

        // // System.out.println(nums[0]);

        // int[] nums = new int[4]; // By default the arrays holds 0 for all indexes
        // System.out.println(nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
        // System.out.println(nums[3]);
        // System.out.println();

        // nums[0] = 1;
        // nums[1] = 2;
        // nums[2] = 3;
        // nums[3] = 4;
        // // System.out.println(nums[0]);
        // // System.out.println(nums[1]);
        // // System.out.println(nums[2]);
        // // System.out.println(nums[3]);
        
        // for (int i = 0; i < nums.length; i++){
        //     System.out.println(nums[i]);
        // }



        // // Multi-dimensional Array
        // int[][] nums = new int[3][3];

        // nums[0][0] = 1;
        // nums[1][1] = 1;
        // nums[2][2] = 1;

        // for (int i = 0; i < 3; i++){
        //     for (int j = 0; j < 3; j++){
        //         nums[i][j] = (int)(Math.random() * 11);
        //     }
        // }

        // for (int i = 0; i < 3; i++){
        //     for (int j = 0; j < 3; j++){
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println();

        // for (int num[] : nums){
        //     for (int element : num){
        //         System.out.print(element + " ");
        //     }
        //     System.out.println();
        // }



        // // Jagged Array
        // int[][] nums = new int[3][];

        // nums[0] = new int[1];
        // nums[1] = new int[2];
        // nums[2] = new int[3];

        // for (int i = 0; i < nums.length; i++){
        //     for (int j = 0; j < nums[i].length; j++){
        //         nums[i][j] = (int)(Math.random() * 10);
        //     }
        // }

        // for (int num[] : nums){
        //     for (int number : num){
        //         System.out.println(number + " ");
        //     }
        //     System.out.println();
        // }



        // // 3D Array
        // int[][][] nums = new int[3][3][3];

        // for(int i = 0; i < nums.length; i++){
        //     for (int j = 0; j < nums[i].length; j++){
        //         for (int k = 0; k < nums[i][j].length; k++){
        //             nums[i][j][k] = (int)(Math.random() * 10);
        //         }
        //     }
        // }

        // for (int first[][] : nums){
        //     for (int second[]: first){
        //         for (int number : second){
        //             System.out.print(number + " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }



        // // Array of Objects
        // Student s1 = new Student();
        // s1.rollNumber = 1;
        // s1.name = "Sri";
        // s1.marks = 95;
        // s1.grade = 'o';

        // Student s2 = new Student();
        // s2.rollNumber = 2;
        // s2.name = "Mr. X";
        // s2.marks = 99;
        // s2.grade = 'O';

        // Student s3 = new Student();
        // s3.rollNumber = 3;
        // s3.name = "Bumblebee";
        // s3.marks = 85;
        // s3.grade = 'A';

        // Student[] students = new Student[3]; // Student array which contains Student objects

        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        // // System.out.println(s1);
        // // System.out.println(s2);
        // // System.out.println(s3);

        // // System.out.println(s1.name + "(" + s1.rollNumber + ")" + ": " + s1.marks + " | " + "Grade: " + s1.grade);
        // // System.out.println(s2.name + "(" + s2.rollNumber + ")" + ": " + s2.marks + " | " + "Grade: " + s2.grade);
        // // System.out.println(s3.name + "(" + s3.rollNumber + ")" + ": " + s3.marks + " | " + "Grade: " + s3.grade);

        // // for (int i = 0; i < students.length; i++){
        // //     System.out.println(students[i].name + "(" + students[i].rollNumber + ")" + ": " + students[i].marks + " | " + "Grade: " + students[i].grade);
        // // }

        // for (Student student : students){
        //     System.out.println(student.name + "(" + student.rollNumber + ")" + ": " + student.marks + " | " + "Grade: " + student.grade);
        // }


        // String[] cars = new String[4];

        // // for (int i = 0; i < cars.length; i++){
        // //     System.out.println(cars[i]);
        // // }

        // for (String car : cars){
        //     System.out.println(car);
        // }


        // Examples
        int[] ages = {10, 15, 90, 36, 19};

        int sum = 0;

        for (int  age : ages){
            sum += age;
        }

        double avg = sum / (double)ages.length;

        System.out.println(avg);

    }
}