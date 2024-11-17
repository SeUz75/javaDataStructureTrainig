import java.util.ArrayList;

public class ToDoList {
    private String name;
    private String descript;
    private int priority;

    // Constructor 
    public ToDoList(String name, String descript, int prior){
        this.name = name;
        this.descript =descript;
        this.priority = prior;
    }

    // Getter for name;
    public String getName(){
        return name ;
    }

    // Setter for name;
    public void setName(String name){
        this.name = name;
    }

    // Getter for descript
    public String getDescript(){
        return descript;
    }

    // Setter for descript
    public void setDescript(String descript){
        this.descript = descript;
    }

    // Getter for prior
    public int getPrior(){
        return priority;
    }

    // Setter for prior
    public void setPrior(int prior){
        this.priority=prior;
    }


    public static ArrayList<ToDoList> sortByName(ArrayList<ToDoList> list){
        ToDoList temp ;
        for(int i=0; i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).getName().compareTo(list.get(j).getName())>0){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static ArrayList<ToDoList> sortByPrior(ArrayList<ToDoList> list){
        ToDoList temp ;
        for(int i=0; i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).getPrior()>list.get(j).getPrior()){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    @Override
    public String toString() {
        return "ToDoList{name='" + name + "', descript='" + descript + "', priority=" + priority + "}";
    }
}       
