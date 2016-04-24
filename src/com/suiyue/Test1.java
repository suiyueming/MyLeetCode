package com.suiyue;

import java.util.Scanner;

/**
 * Created by suiyue on 2016/4/6 0006.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m =0;
        String[] rule = null;
        String[] address = null;
        while(scanner.hasNext()) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            rule = new String[n];
            address = new String[n];
            break;
        }
        scanner.nextLine();
        while(scanner.hasNext()) {
            for(int i=0; i<n; i++) {
                String s = scanner.nextLine();
                String [] tmp = s.split(" ");
                if(tmp[1].contains("/")) {
                    rule[i] = tmp[0];
                    String tmpS = iptolong(tmp[1].split("/")[0]);
                    for(int j=tmpS.length(); j<32; j++) {
                        tmpS = "0" + tmpS;
                    }
                    address[i] = tmpS.substring(0, Integer.parseInt(tmp[1].split("/")[1]));
                } else {
                    rule[i] = tmp[0];
                    address[i] = iptolong(tmp[1]);
                }
            }
            in:for (int i=0; i<m; i++) {
                String s = scanner.nextLine();
                for(int j=0; j<n; j++) {
                    System.out.println("add = " + address[j]);
                    if (iptolong(s).startsWith(address[j])) {
                        System.out.println("j = " + j);
                        System.out.println("s = " + iptolong(s));

                        if(rule[j].equals("allow")) {
                            System.out.println("YES");
                            continue in;
                        } else {
                            System.out.println("NO");
                            continue in;
                        }
                    }
                }
                System.out.println("YES");
            }
            return;
        }

    }

    private static String iptolong(String strip) {
        long[]ip=new long[4];
        int position1=strip.indexOf(".");
        int position2=strip.indexOf(".",position1+1);
        int position3=strip.indexOf(".",position2+1);
        ip[0]=Long.parseLong(strip.substring(0,position1));
        ip[1]=Long.parseLong(strip.substring(position1+1,position2));
        ip[2]=Long.parseLong(strip.substring(position2+1,position3));
        ip[3]=Long.parseLong(strip.substring(position3+1));
        String result = Long.toBinaryString((ip[0]<<24)+(ip[1]<<16)+(ip[2]<<8)+ip[3]);
        return result;
    }
}
