package it.eneaminelli.backpack;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private List<BackpackItem> content;

    public Backpack() {
        this.content = new ArrayList<BackpackItem>();
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

    public void display() {
        System.out.println("- Backpack ");
        for(BackpackItem backpackItem : content){
            backpackItem.display("| ");
        }
    }
}
