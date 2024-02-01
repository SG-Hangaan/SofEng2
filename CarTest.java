
public class CarTest {
    public static void main (String[] args){
      
      Car CarAssemble = new Car.CarBuilder()
      .transmission("Automatic")
      .brand("Hyudai")
      .engineType("Diesel")
      .color("RED")
      .capacity(6)
      .build();

      System.out.println("Car Builder Pattern");
      System.out.println("Transmission" + CarAssemble.transmission);
      System.out.println("Brand" + CarAssemble.brand);
      System.out.println("egineType" + CarAssemble.engineType);
      System.out.println("color" + CarAssemble.color);
      System.out.println("capacity" + CarAssemble.capacity);

    }
  
  
}
