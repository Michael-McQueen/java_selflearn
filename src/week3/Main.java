package week3;
import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> city_num = new HashMap<String,Integer>();  //save and find city
        ArrayList<ArrayList<Integer>> array2D = new ArrayList<ArrayList<Integer>>();  //save data for getting the distance
        String s = in.next();
        int num = 0;
        while(!s.equals("###"))
        {
            city_num.put(s,num);
            s = in.next();
            num++;
        }

        for(int i=0; i<num; i++)
        {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for(int j=0; j<num; j++)
            {
                row.add(in.nextInt());
            }
            array2D.add(row);
        }

        String need1 = in.next();
        String need2 = in.next();
        int need1_index = city_num.get(need1);
        int need2_index = city_num.get(need2);

        System.out.println(array2D.get(need1_index).get(need2_index));
    }
}


