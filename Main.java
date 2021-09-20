class Main {
 public static void main(String[] args) {
  CalcCarteanSystem ccs = new CalcCarteanSystem();
    
  ccs.setCorX1(1.0);
  ccs.setCorX2(2.0);
  ccs.setCorY1(3.0);
  ccs.setCorY2(4.0);

  double lengthCSTwoPoint = ccs.calculateLength();

  System.out.println(lengthCSTwoPoint);
 }
}
