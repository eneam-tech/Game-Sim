package it.eneaminelli.backpack;

import java.util.ArrayList;
import java.util.List;

public class Package implements BackpackItem {

    private List<BackpackItem> content;
    private String name;

    public Package(String name) {
        this.content = new ArrayList<BackpackItem>();
        this.name = name;
    }

    public void addItem(BackpackItem item) {
        content.add(item);
    }

    /**
     * TODO: search list for item removal, remove it and return
     * 
     * @param item is the item to remove
     * @return
     */
    public BackpackItem removeItem(BackpackItem item) {
        //return content.remove(index);
        return null;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "- Package " + name);
        for(BackpackItem backpackItem : content){
            backpackItem.display(indent + "-");
        }
    }
    
}
