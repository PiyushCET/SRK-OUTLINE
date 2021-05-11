package srk;
import java.lang.Math;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.*;

import javax.swing.JFrame;
public class SRK extends Canvas{
    double p(double m){
return m*m;
}
   double a(double x,double a,double b,double c,double d,double e,double f,double g,double h){
     double t;
         a=a/(2.0);
          b=-b/(2.0);
         c=c/(2.0);
          d=-d/(2.0);
         e=e/(2.0);
          f=-f/(2.0);
         g=g/(2.0);
         h=-h/(2.0);
         if(x<0){
             t=a;
             a=b;
             b=t;
              t=c;
             c=d;
             d=t;
              t=e;
             e=f;
             f=t;
              t=g;
             g=h;
             h=t;
         }
return ((b/((a-c)*(a-e)*(a-g)))*((x-c)*(x-e)*(x-g)))
        +((d/((c-a)*(c-e)*(c-g)))*(((x-a)*(x-e)*(x-g))))
        +((f/((e-c)*(e-a)*(e-g)))*(((x-c)*(x-a)*(x-g))))
        +((h/((g-c)*(g-e)*(g-a)))*((x-c)*(x-e)*(x-a)));
} 
    double abs(double n){
    if(n<0)
        return -n;
    else 
        return n;
    }
    
    public void paint(Graphics g){

for(int i=0;i<1930;i++){
for(int j=0;j<1008;j++){
    int ci=0,cj=0;
 int x=(i)-ci;
 int y=(-j)+cj;
 
 if((a(x,1760,135,1783,78,1828,50,1881,50)>y&&a(x,1760,135,1783,135,1828,135,1881,135)<y&&2*x>1760&&2*x<=1881)
        || (a(x,1881,37,1950,69,1981,94,2025,135)>y&&a(x,1881,135,1950,135,1981,135,2025,135)<y&&2*x>1881&&2*x<=2025)
        || (a(y,1760,135,1767,202,1791,264,1836,317)<x&&a(y,2025,135,2008,202,2005,264,1989,317)>x&&-2*y>135&&-2*y<=317)
        || (a(y,1836,317,1840,336,1834,354,1809,377)<x&&a(y,1989,317,1987,336,1983,354,1977,377)>x&&-2*y>317&&-2*y<=377)
        || (a(x,1722,390,1893,378,2073,355,2201,386)>y&&a(x,1722,589,1893,560,2073,553,2201,548)<y&&2*x>1722&&2*x<=2201)
        || (a(x,1499,455,1567,442,1631,439,1722,390)>y&&a(x,1499,584,1567,588,1631,590,1722,589)<y&&2*x>1499&2*x<=1722)
        || (a(x,1197,396,1304,432,1390,441,1499,455)>y&&a(x,1197,483,1304,522,1390,556,1499,584)<y&&2*x>1197&2*x<=1499)
        || (a(x,1005,403,1074,450,1124,470,1208,483)<y&&a(x,1005,403,1074,383,1124,382,1208,394)>y&&2*x>1025&2*x<=1208)
        || (a(y,1170,336,1152,360,1146,368,1127,401)<x&&a(y,1170,336,1196,360,1200,368,1217,401)>x&&-2*y>336&&-2*y<=411)
        || (a(y,1139,293,1124,316,1146,343,1153,361)<x&&a(y,1139,293,1155,316,1173,343,1195,361)>x&&-2*y>293&&-2*y<=361)
        || (a(x,2201,386,2279,392,2351,405,2408,420)>y&&a(x,2201,548,2279,543,2351,535,2408,528)<y&&2*x>2201&2*x<=2408)
        || (a(x,2408,420,2489,399,2571,383,2705,328)>y&&a(x,2408,528,2489,511,2571,476,2705,413)<y&&2*x>2408&2*x<=2705)
        || (a(x,2710,311,2766,308,2802,311,2848,301)>y&&a(x,2710,415,2766,398,2802,379,2848,354)<y&&2*x>2690&&((2*y)+311)<=-1*((2*x)-2808)&&2*x<=2848)
        || (a(y,2699,238,2676,276,2663,309,2655,347)<x&&a(y,2699,238,2708,276,2701,309,2704,347)>x&&-2*y>238&&-2*y<=347)
        || (a(y,1722,589,1740,622,1780,767,1800,883)<x&&a(y,2201,548,2209,621,2220,720,2260,845)>x&&-2*y>548&&a(x,1800,883,1966,901,2120,887,2260,845)<y)
        || (a(y,1982,845,2071,1037,2138,1221,2202,1377)<x&&a(y,2260,845,2315,1037,2356,1221,2373,1377)>x&&-2*y>845&&-2*y<=1377)
        || (a(y,1853,892,1879,1034,1888,1176,1874,1363)<x&&a(y,2155,892,2147,1034,2120,1176,2062,1363)>x&&-2*y>892&&-2*y<=1363)
        || (a(y,1874,1363,1823,1470,1775,1612,1685,1893)<x&&a(y,2062,1363,2017,1470,1943,1612,1802,1893)>x&&-2*y>1363&&-2*y<=1893)
         || (a(y,1685,1893,1666,1924,1657,1966,1659,2008)<x&&a(y,1802,1893,1796,1924,1796,1966,1787,2008)>x&&-2*y>1893&&-2*y<=2008)
         || (a(y,2202,1377,2293,1595,2327,1719,2396,1900)<x&&a(y,2373,1377,2450,1595,2472,1719,2514,1900)>x&&-2*y>1377&&-2*y<=1900)
          || (a(y,2396,1900,2396,1937,2395,1975,2393,2013)<x&&a(y,2514,1900,2526,1937,2545,1975,2571,2013)>x&&-2*y>1900&&-2*y<=2013)
         || (p(x-1250)/p(60)+p(y+1000)/p(35)<=1)
         /*(        || (a(x,,,,,,,,)>y&&a(x,,,,,,,,)<y&&2*x>&2*x<=)
         || (a(y,,,,,,,,)<x&&a(y,,,,,,,,)>x&&-2*y>&&-2*y<=)
         */){ 
          if(j%24<24&&j<72){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(139,230,252);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
          else if(j%24>=6&&j%24<=19){
             Color A=new Color(63,214,252);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
    Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));
  g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
          
          
          
          else if(j%24<24&&j<144){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(142,216,251);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else if(j%24>=6&&j%24<=19){
             Color A=new Color(71,182,255);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
    Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));
  g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
              
              
              
              
    else if(j%24<24&&j<216){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(159,185,251);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else if(j%24>=6&&j%24<=19){
             Color A=new Color(73,132,254);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
    Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));
  g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
                     
              
              
              
    else if(j%24<24&&j<288){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(166,150,244);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else if(j%24>=6&&j%24<=19){
             Color A=new Color(90,50,202);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
    Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));
          g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
                             
              
              
              
    else if(j%24<24&&j<360){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(201,132,239);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else if(j%24>=6&&j%24<=19){
             Color A=new Color(174,61,235);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
    Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));
          g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
                             
              
              
              
    else if(j%24<24&&j<432){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(213,139,252);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else if(j%24>=6&&j%24<=19){
             Color A=new Color(255,100,254);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
    Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));
          g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
                                    
              
              
              
    else if(j%24<24&&j<504){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(251,139,244);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else if(j%24>=6&&j%24<=19){
             Color A=new Color(234,82,219);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
    Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));
          g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
      
    
    
    
    else if(j%24<24&&j<576){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(250,169,222);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else if(j%24>=6&&j%24<=19){
             Color A=new Color(235,68,185);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
    Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));
          g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
            
    
    
    
    else if(j%24<24&&j<648){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(247,143,189);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else if(j%24>=6&&j%24<=19){
             Color A=new Color(251,82,148);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
    Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));
          g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
                      
    
    
    
    else if(j%24<24&&j<720){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(255,131,158);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else if(j%24>=6&&j%24<=19){
             Color A=new Color(252,78,106);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
    Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));
          g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
                               
    
    
    
    else if(j%24<24&&j<792){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(253,142,146);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else if(j%24>=6&&j%24<=19){
             Color A=new Color(253,50,50);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
    Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));
          g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
                                       
    
    
    
    else if(j%24<24&&j<864){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(246,197,140);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else if(j%24>=6&&j%24<=19){
             Color A=new Color(254,171,64);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
    Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));
          g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
          
    
    
    
    else if(j%24<24&&j<936){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(248,225,131);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else if(j%24>=6&&j%24<=19){
             Color A=new Color(247,208,91);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
    Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));
          g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
          
      


    else if(j%24<24&&j<1008){
         if(j%24>=9&&j%24<=15){
            Color A=new Color(255,255,200);
            g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else if(j%24>=6&&j%24<=19){
             Color A=new Color(254,255,9);
             g.drawLine(i, j, i, j);
  g.setColor(A);
         }
         else{
              Color A=new Color((int) ((((j))*0)), (int) (100-(((j))*0.09)), (int) ((((j))*0)));

          g.setColor(A);   
  g.drawLine(i, j, i, j);
         }
     }
     }
 else{
  Color A=new Color((int) ((((j))*0.009)), (int) ((((j))*0.058)), (int) ((((j))*0.124)));

  g.setColor(A);      
g.drawLine(i, j, i, j);
 
 
 }
}}
    
  
       
  

     
    }
public static void main(String[] args) {
SRK m=new SRK();
JFrame f=new JFrame();
f.add(m);
f.setSize(10000,10000);
f.setVisible(true);
}
}
