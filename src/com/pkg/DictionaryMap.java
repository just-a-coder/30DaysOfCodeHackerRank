package com.pkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMap {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> hmap = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hmap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (hmap.get(s) != null) {
                System.out.println(s + "=" + hmap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
