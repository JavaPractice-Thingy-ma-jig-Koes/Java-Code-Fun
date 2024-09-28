package misc_tools;

import misc_tools.Convert;

public class FunnyPrint {

    
    private String defaultColor = "black";
    private int defaultTime = 0;
    private int staggerTime =0;

    public FunnyPrint (String defaultColor, int defaultTime) throws Exception
    {
        this.defaultColor = defaultColor;
        this.defaultTime = defaultTime;

    }
    public FunnyPrint(){
    }

    public void regPrint(String info, boolean isBackground) throws Exception
    {
        Convert.printColor(defaultColor, isBackground);
        for(int length = info.length();length>0;length--){
            System.out.print(info.substring(info.length()-length,info.length()-length+1));
            Thread.sleep(defaultTime);
        }
    }

    public void stagPrint(String info, int stagTime, boolean isBackground) throws Exception
    {

        staggerTime=stagTime;

        Convert.printColor(defaultColor, isBackground);
        for(int length = info.length();length>0;length--){

            System.out.print(info.substring(info.length()-length,info.length()-length+1));

            Thread.sleep(Math.abs(defaultTime-RNG.RIG(0,staggerTime)));
            if (info.substring(info.length()-length,info.length()-length+1).equals("."))
            {
                Thread.sleep(defaultTime+RNG.RIG(staggerTime,staggerTime*2));

            }


            if (Math.random()> 0.9)
            {
                Thread.sleep(defaultTime*staggerTime);
            }
        }
    }  


}
