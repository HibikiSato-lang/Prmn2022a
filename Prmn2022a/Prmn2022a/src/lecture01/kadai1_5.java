package lecture01;

public class kadai1_5 {
    public static void main(String[] args) {

        int[] score = {41, 85, 72, 38, 80};
        String grade;

        for(int i = 0; i < 5; i++){
            if(score[i] < 60){
                grade = "不可";
            }
            else if(score[i] < 70){
                grade = "可";
            }
            else if(score[i] < 80){
                grade = "良";
            }
            else if(score[i] < 90){
                grade = "優";
            }
            else{
                grade = "秀";
            }
            System.out.println(i + "番　"+ score[i] +"点　"+ grade);
        }
        int min = min(score);
        int max = max(score);
        double average = average(score);

        System.out.println("最高点:" + max);
        System.out.println("最低点:" + min);
        System.out.println("平均点:" + average);
    }
    static int max(int[] score){

        int max = score[0];
        for(int i = 1; i < score.length; i++){

            if(max < score[i]){
                max = score[i];
            }
        }
        return max;
    }
    static int min(int[] score){

        int min = score[0];
        for(int i = 1; i < score.length; i++){

            if(min > score[i]){
                min = score[i];
            }
        }
        return min;
    }

    static double average(int[] score){

        int sum = 0;
        double average;
        for(int i = 0; i < score.length; i++){
            sum = sum + score[i];
        }
        average = (double)sum / score.length;
        return average;
    }
}
