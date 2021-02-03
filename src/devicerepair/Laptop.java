package devicerepair;

import java.util.ArrayList;

public class Laptop extends Device {

    ArrayList<Component> componentList = new ArrayList<>();

    public Laptop(String IdentificationCode, String MakeandModel, String Owner, String ProblemDescription, String RepairNotes, int Priority) {
        super(IdentificationCode, MakeandModel, Owner, ProblemDescription, RepairNotes, Priority);
    }

    public ArrayList<Component> getComponentList() {
        return componentList;
    }

    public void addComponent(Component component) {
        componentList.add(component);

    }

    public void deleteComponent(int index) {
        if(index >= 0 && index< componentList.size()){
         componentList.remove(index);
    }

    

    }
    
    

}
