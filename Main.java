import java.util.Scanner;

class Main {
 
 public static void main(String[] args) {
  double inputCoordinateX1; 
  double inputCoordinateX2;  
  double inputCoordinateY1; 
  double inputCoordinateY2; 
  
  CartesianSystem cs = new CartesianSystem();
  Scanner Input = new Scanner(System.in);

  System.out.print("Coordinate X1: ");
  inputCoordinateX1 = Input.nextDouble();
  System.out.print("Coordinate X2: ");
  inputCoordinateX2 = Input.nextDouble();
  System.out.print("Coordinate Y1: ");
  inputCoordinateY1 = Input.nextDouble();
  System.out.print("Coordinate Y2: ");
  inputCoordinateY2 = Input.nextDouble();
    
  cs.setCoordinateX1(inputCoordinateX1);
  cs.setCoordinateX2(inputCoordinateX2);
  cs.setCoordinateY1(inputCoordinateY1);
  cs.setCoordinateY2(inputCoordinateY2);

  double lengthCSTwoPoint = cs.calculateLength();

  System.out.println(lengthCSTwoPoint);
 }

}
