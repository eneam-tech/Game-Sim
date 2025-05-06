package it.eneaminelli.backpack;

public class Item implements BackpackItem {

    private String name;

    public Item(String name) {
        this.name = name;
    }
    
    @Override
    public void display(String indent) {
        System.out.println(indent + "- " + name);
    }
    
}
