 
import java.util.ArrayList;
import java.util.Collection;

class main{
    public void main(String[] args){
        System.out.println("Hello world");
        // Basic things about arratlist

        // Declaration
        ArrayList<String> jobs = new ArrayList<>();

        // Adding variables to the arrraylist
        jobs.add("Water flowers");
        jobs.add("Feed the dog");
        jobs.add("Get them hoes");

        // Printing the arraylist
        System.out.println("Jobs" + jobs);

        // Specific element in array
        System.out.println("The first element to show :  " + jobs.get(0) );

        // Modify element
        System.out.println("Water flowers -> Buy milk");
        jobs.set(0, "Buy milk");
        System.out.println(jobs.get(0));

        //Remove element from ArrayList
       // jobs.remove("Buy milk");
        System.out.println(jobs.get(0));
       // jobs.remove("Get them hoes");
        System.out.println("Jobs" + jobs);

        // Checking if element exists in arrayList
        System.out.println("Does Get them hoes exist ? " + jobs.contains("Get them hoes"));

        // Loop through the ArrayList using a for-each loop
        System.out.println("All Jobs:");
        for (String job : jobs) {
            System.out.println(job);
        }
        // Clear all elements in ArrayList
        jobs.clear();
        System.out.println("Is the array list empty : " + jobs.isEmpty());




        //  Real program/ task;
        ArrayList<ToDoList> jobsList = new ArrayList<>();

        jobsList.add(new ToDoList("BDogs","Feed the dog", 4));
        jobsList.add(new ToDoList("ADogs","Walk the dog", 2));
        jobsList.add(new ToDoList("CDishes", "Do the dishes", 3));
        System.out.println("Jobs" + jobsList.toString());

       ArrayList<ToDoList> listSortedByName = ToDoList.sortByName(jobsList);
        System.out.println("Jobs sorted by alphabetic way" + listSortedByName.toString());

        ArrayList<ToDoList> listSortedByPriority = ToDoList.sortByPrior(jobsList);
        System.out.println("Jobs sorted by priority way" + listSortedByPriority.toString());
        

    }
}