package com.exam;

public class GFG {
    static int minpalpar(String str){
        int n=str.length();
        int[][] c=new int[n][n];
        boolean[][] p=new boolean[n][n];

        int i,j,k,l;

        for (i=0;i<n;i++){
            p[i][i]=true;
            c[i][i]=0;

        }
        for (l=2;l<=n;l++){
            for (i=0;i<n-l+1;i++){
                j=i+l-1;

                if (l==2){
                    p[i][j]=(str.charAt(i)==str.charAt(j));

                }
                else {
                    p[i][j]=(str.charAt(i)==str.charAt(j)) && p[i+1][j-1];

                }
                if (p[i][j]==true){
                    c[i][j]=0;
                }
                else {
                    c[i][j]=Integer.MAX_VALUE;
                    for (k=i;k<=j-1;k++){
                        c[i][j]=Integer.min(c[i][j],c[i][k]+c[k+1][j]+1);

                    }
                }
            }
        }
        return c[0][n-1];
    }

    public static void main(String[] args) {
        //String str="ababbbabbababa";
        String str="abbacba";
        System.out.println("min cuts need for"+"Palindrom  partinoning is="+minpalpar(str));
    }
}
