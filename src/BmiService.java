public class BmiService {

  public int calculate(int weight, double height) {
    return (int) (weight / Math.pow(height, 2));
    //IDEA подсказала, что можно так сократить)))
  }


}


