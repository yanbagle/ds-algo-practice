package main.ItemFile;

/* ItemCategory enum for tax calculation purposes */
public enum ItemCategory {
    FOOD("food"),
    MEDICAL("medical"),
    BOOK("book"),
    GENERAL("general");

    private String categoryStr;

    ItemCategory(String categoryStr) {
        this.categoryStr = categoryStr;
    }

    public String getCategoryStr() {
        return this.categoryStr;
    }

    //get ItemCategory from item name
    public static ItemCategory fromItemName(String itemName){
        ItemTable itemFileHashMap = new ItemTable();
        return itemFileHashMap.get(itemName);
    }

    //get corresponding ItemCategory from the string version
    public static ItemCategory fromString(String text) {
        if (text != null) {
            for (ItemCategory c : ItemCategory.values()) {
                if (text.replaceAll(" ","").equalsIgnoreCase(c.categoryStr)) {
                    return c;
                }
            }
        }
        return null;
    }
}
