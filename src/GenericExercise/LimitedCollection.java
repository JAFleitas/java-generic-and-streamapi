package GenericExercise;

import java.util.ArrayList;
import java.util.List;


public class LimitedCollection <T extends Person> {
    private int limit;
    private List<T> dataCollection;

    public LimitedCollection(int limit) {
        this.limit = limit;
        this.dataCollection = new ArrayList<>();
    }

    public void addData (T data){
        if(this.dataCollection.size()<this.limit){
            this.dataCollection.add(data);
        }
        else{
            System.out.println("Collection is completed");
        }

    }

    public void getAll(){
        for (T data:this.dataCollection) {
            System.out.println(data.toString());
        }
    }
}
