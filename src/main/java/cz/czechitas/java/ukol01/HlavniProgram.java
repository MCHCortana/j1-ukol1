package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

//    ----------------------Procvičení---------------------------------
//    zofka.setLocation(250,130);
//
//    drawPolygonRegular(60, 6, 30); /*kreslim šetiuhelnik*/

//  zofka.setPenWidth(5);
//
//  zofka.setLocation(280,125);
//  zofka.setPenColor(Color.blue);
//  drawPolygonRegular(10, 36, 2); /*kreslim kolecko*/
//  zofka.setLocation(285,130);
//  zofka.setPenColor(Color.black);
//  drawPolygonRegular(10, 36, 1); /*kreslim kolecko*/
//
//  zofka.setLocation(200,100);
//  zofka.setPenColor(Color.yellow);
//  drawSun(); /*sluníčko kouká na čuníka*/


//----------------------Obrázek full------------------------------------------
    //čuník
    zofka.setSpeed(200);
    zofka.setLocation(700,700);
    zofka.setPenColor(Color.pink);
    nakresliPrasatko();

    // sluníčko
    zofka.setPenWidth(5);
    zofka.setLocation(280,125);
    zofka.setPenColor(Color.yellow);
    drawSun();

    // jméno
    zofka.setPenColor(Color.blue);
    zofka.setLocation(500,300);
    jmenoTyna();

    zofka.setLocation(200,700);
    zofka.setPenColor(Color.red);
    zofka.setPenWidth(10);
  //suburbia
    //domek 1
    domkyVedleSebe(1);

    //domek 2+

    zofka.setLocation(200,400);
    domkyVedleSebe(5);

    //domek poslední + zofka cetuje na místo
    zofka.setLocation(900, 700);
    domkyVedleSebe(1);
  }
public void nakresliPrasatko(){
  drawRectangle(100, 50);/*head and body def*/
  zofka.turnLeft(45);
  drawPolygonRegular(90, 2, 34);
  zofka.turnRight(45);
  zofkaChangesPlace(60);
  zofka.turnLeft(45);/* front legs*/
  zofkaChangesPlace(15);
  zofka.turnLeft(90);
  drawPolygonRegular(90, 2, 20);

  zofka.turnLeft(135);/*belly, sort of*/
  zofkaChangesPlace(15);

  zofka.turnLeft(45);
  drawPolygonRegular(90, 2, 20);/*back legs*/

  zofka.setPenWidth(2);
  zofka.turnLeft(190);/*tail*/
  zofkaChangesPlace(36);
  drawPolygonRegular(10, 14, 3);
  zofka.turnRight(100);
  drawPolygonRegular(10, 10, 3);

  zofka.turnLeft(15); // žofka se srovná horizontálně
};
  public void drawPolygonRegular (int angle, int turns, int brushLength){
  for (int i=0; i<turns; i++){
    zofka.move(brushLength);
    zofka.turnRight(angle);
  }/*nakreslíme mnohoúhelník, při volání zadáváme úhel, počet otáček a délku tahu*/
  }
  public void zofkaChangesPlace (int howFar){
    zofka.penUp();
    zofka.move(howFar);
    zofka.penDown();
  }
  public void drawRectangle (int brushSizeLong, int brushSizeShort){
    for (int i=0; i<2; i++) {zofka.move(brushSizeShort);
      zofka.turnRight(90);
      zofka.move(brushSizeLong);
      zofka.turnRight(90);}}
  public void drawSun(){
    for(int i=0; i<36;i++){
      zofka.turnLeft(90);
      zofka.move(11);
      zofka.turnRight(180);
      zofka.move(11);
      zofka.turnLeft(90);
      zofka.turnRight(10);
      zofka.move(10);
    }
  }
  public void domkyVedleSebe(int reruns){
//    zofka.turnRight(90);
//    drawRectangle(100, 80);
//    zofka.turnLeft(45);
//    drawPolygonRegular(90, 2, 55);
    for(int i=0; i<reruns;i++){
      zofka.turnRight(90);
      drawRectangle(100, 80);
      zofka.turnLeft(45);
      drawPolygonRegular(90, 2, 55);
      zofka.turnLeft(135);
      if(i < (reruns-1)){zofkaChangesPlace(100);};
      zofka.turnLeft(90);
    }
  }

  public void charT(){
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(30);
    zofka.turnRight(180);
    zofka.move(60);
    zofka.turnRight(90); //zofka se srovná vertikálně
  }
  public void charY(){
    zofka.turnRight(45);
    zofka.move(50);
    zofka.turnRight(45);
    zofka.move(70);
    zofka.turnRight(180);
    zofka.move(70);
    zofka.turnRight(45);
    zofka.move(50);
    zofka.turnLeft(45); //zofka se srovná vertikálně
  }
  public void charN(){
    zofka.turnRight(90);
    zofkaChangesPlace(100);
    zofka.turnLeft(180);
    zofka.move(100);
    zofka.turnRight(135);
    zofka.move(135);
    zofka.turnLeft(135);
    zofka.move(100);
     //zofka je srovnnaná horizontálně
  }
public void slovoMezera(int angle, int distance){
  zofka.turnRight(angle);
  zofkaChangesPlace(distance);

}
  public void charA(){
    zofka.turnRight(118);
    zofkaChangesPlace(130);
    zofka.turnLeft(180);
    zofka.move(120);
    zofka.turnRight(130);
    zofka.move(120);
    zofka.turnLeft(180);
    zofkaChangesPlace(40);
    zofka.turnLeft(68);
    zofka.move(75);
    zofka.turnLeft(180);
    zofkaChangesPlace(50);
    zofka.turnRight(45);
    zofkaChangesPlace(50);
    zofka.turnLeft(135);//zofka se srovná ventikálné a končí vpravo dole
  }

  public void jmenoTyna(){
    charT();
    slovoMezera(90,100);
    charY();
    slovoMezera(90,50);
    charN();
    slovoMezera(90,100);
    charA();
  }
}
