package Equipment;

public class Item {
    

    private String name;
    private int value;


    public Item(String name, int value)
    {
        this.name = name;
        this.value = value;

    }

    /**@see quickDescription returns the item's value */
    public int getValue()
    {
        return value;
    }
    /**@see quickDescription returns the item's name */
    public String getName()
    {
        return name;
    }


}
