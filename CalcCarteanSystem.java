import java.lang.Math;

class CalcCarteanSystem {
 private double corX1, corX2, corY1, corY2;

 public void setCorX1 (double corX1){
  this.corX1 = corX1;
 }

 public void setCorX2 (double corX2){
  this.corX2 = corX2;
 }

 public void setCorY1 (double corY1){
  this.corY1 = corY1;
 }

 public void setCorY2 (double corY2){
  this.corY2 = corY2;
 }

 public double calculateLength(){
  double result = Math.sqrt( 
    Math.pow(this.corX2 - this.corX1, 2) + Math.pow(this.corY2 - this.corY1, 2) 
  ); 
  return result;
 }


}