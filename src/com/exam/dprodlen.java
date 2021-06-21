package com.exam;

public class dprodlen {

        static int getvalue(int[] values,int rodlen){
            int [] subSolutions=new int[rodlen+1];
            for (int i=1;i<=rodlen;i++){
                int tmpmax=-1;
                for (int j=0;j<i;j++){
                    tmpmax=Math.max(tmpmax,values[j]+subSolutions[i-j-1]);

                }
                subSolutions[i]=tmpmax;

            }
            return  subSolutions[rodlen];
        }
        public static void main(String[] args) {

            int[] values=new int[]{3,7,1,3,9};
            int rodlen=values.length;
            System.out.println("Max rod Length="+getvalue(values,rodlen));
        }
    }




