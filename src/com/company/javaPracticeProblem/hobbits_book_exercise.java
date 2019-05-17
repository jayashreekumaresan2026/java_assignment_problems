package com.company.javaPracticeProblem;

public class hobbits_book_exercise {
    private String name;
    public static void main(String[] args){
        hobbits_book_exercise[] h =new hobbits_book_exercise[3];
        int z=-1;
        while(z<2){
            z=z+1;
            h[z]=new hobbits_book_exercise();
            h[z].name="oviya";
            if(z==1)
            {
                h[z].name ="pavi";
            }
            if(z==2)
            {
                h[z].name="app";
            }
            System.out.println(h[z].name+"  is a");
            System.out.println("good hobbit name");
        }
    }
}
