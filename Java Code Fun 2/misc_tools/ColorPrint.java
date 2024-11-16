package misc_tools;

public class ColorPrint {
    /**
     * 
     * @param info text to be printed
     * @param color this happens "\u001b["+color+"m"
     * @see reset resets everything for the next print
     */
    public static void print(String info, int color)
    {
        System.out.print("\u001b["+color+"m");
        System.out.println(info);
        System.out.print("\u001b[0m");
    }
}
