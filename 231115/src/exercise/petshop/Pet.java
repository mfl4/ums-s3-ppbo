package exercise.petshop;

public class Pet {
    private String name;
    
    public void giveName(String giveName){
        this.name = giveName;
    }
    public String callName(){
        return this.name;
    }
    public String behavior(){
        return "Hewan Penurut";
    }
}
