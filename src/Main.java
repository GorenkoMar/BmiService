public class Main {

  public static void main(String[] args) {
    BmiService service = new BmiService();

    double height = 2.01; //рост в метрах
    int weight = 98;
    int bmiIndex = service.calculate(weight, height);

    System.out.println("body mass index = " + bmiIndex);
  }
}
