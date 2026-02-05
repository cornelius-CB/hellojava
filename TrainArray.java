public class TrainArray{
  public static void main(String[] args){
    int[] score={70,87,98,45,67,99,43,44,31};

    for(int i=0;i<score.length;i++){
      System.out.println(score[i]+" ");
    }
    int total=0;
    for(int i=0;i<score.length;i++){
      total+=score[i];
    }
    float average=total/score.length;

    int largest=score[0];

    for(int i=0;i<score.length;i++){
      if(score[i]>largest)largest=score[i];
      }
      int least=score[0];
      for(int i=0;i<score.length;i++){
        if(score[i]<least)least=score[i];
      }
      System.out.println("Total score: "+total);
      System.out.println("Average score: "+average);
      System.out.println("Highest score: "+largest);
      System.out.println("Lowest score: "+least);
  }
}