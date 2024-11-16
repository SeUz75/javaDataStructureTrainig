
class main {

// Task: Create an array that stores the grades of a class. Write methods to:
// Calculate the average grade.
// Find the highest and lowest grades.
// Sort the array (using any sorting algorithm).
// Extra: Implement a search algorithm (linear or binary search) to find a specific grade in the array.


    public static void main(String[] args)
    {
        System.out.println("hello world");

        int[] grades = new int[]{3,5,6,6,6,2,4};

        for(int i=0;i<grades.length;i++){
            System.out.println("grades are : " + grades[i]);
        }

        avg(grades);
        minmax(grades);
        sorting(grades);
        search(grades);
        
    }

    public static void avg(int[] grades){
        int sum=0;
        for(int i=0; i<grades.length;i++){
            sum += grades[i];
        }
        System.out.println("The average of the greades is : " + sum/grades.length);
    }

    public static void minmax(int[] grades){
        int max=0;
        int min =grades[1];

        for(int i=0; i<grades.length;i++){
            if(max < grades[i]){
                max = grades[i];
            }else if(min > grades[i]){
                min = grades[i];
            }
        }
        System.out.println("Min grade is : " + min);
        System.out.println("Max grade is : " + max);
    }

    public static void sorting(int[] grades){
        int min= grades[1];
        int  max = grades[1];
        int temp;
        for(int i=0; i<grades.length;i++){
            for(int j=i+1;j<grades.length;j++){
                if(grades[i]>grades[j]){
                    temp = grades[i];
                    grades[i] = grades[j];
                    grades[j]=temp;
                }
            }
        }
        for(int i=0;i<grades.length;i++){
            System.out.print(grades[i]+ ",");
        }
    }

    public static void search(int[] grades){
        System.out.println("What num you searchugn ? ");
        // scanner.scan 6 lets say 

        int num=6;
        for(int i=0; i<grades.length;i++){
            if(grades[i]== num){
                System.out.println("num found in " + i +" place");
            }
        }

        int left =0;
        int right = grades.length;
        System.out.println("Binary search");
        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents overflow

            if (grades[mid] == num) {
                System.out.println("num found in " + mid +" place");
            }
            if (grades[mid] < num) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

    }
}