import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Map<String, Double> score = new HashMap<>();
        
        score.put("A+",	4.5);
        score.put("A0",	4.0);
        score.put("B+",	3.5);
        score.put("B0",	3.0);
        score.put("C+",	2.5);
        score.put("C0",	2.0);
        score.put("D+",	1.5);
        score.put("D0",	1.0);
        score.put("F", 0.0);
        score.put("P", 0.0);
        
        double totalSum = 0.0; // (학점x과목평점)의 합
        double creditSum = 0.0; // 학점의 총합
        
        for(int i=0; i<20; i++){
            String str = br.readLine();
            String arr[] = str.split(" ");
            
            double credit = Double.parseDouble(arr[1]);
            String grade = arr[2];        
            double point = score.get(grade);
            
            if(!grade.equals("P")){
                creditSum += credit;
                totalSum += credit * point;
            }
        }
        
        double avg = totalSum / creditSum;
        
        System.out.print(avg);
    }
}