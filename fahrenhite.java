package practice;

public class fahrenhite {
    public static void main(String args[]){
        int farenhiteMin = 0 ;
        int farenhiteMax = 400;
        int temp = 0;

        while(temp <= farenhiteMax){
            float C = (float)((5.0/9)*(temp - 32));
            System.out.println("Temprature in f:"+temp+"Temprature in C:"+C);
            temp+=20;
        }
    }
}
