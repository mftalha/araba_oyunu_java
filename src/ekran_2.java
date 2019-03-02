

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;



public class ekran_2 extends JPanel implements KeyListener,ActionListener{
  
   AnaEkran ekran=new AnaEkran("");
    giris g=new giris();
    int h=0;
     int i;
    BufferedImage yol,araba1,araba2;
    Random random=new Random();
    int z;
    int Ky=0;
    int Kx=0;
    Timer t=new Timer(18,this);
     ArrayList <Rectangle> araçlar;
    Rectangle araba;
    int K_hız=8;
    int Ax=44;
    int Ay=515;
    int Yy=-36250;
    int aralık=400;
    int sayaç=0;
    int süre=0;
    
    public ekran_2(){
              
        araçlar=new ArrayList <Rectangle> ();
        try {
            yol=ImageIO.read(new File("yoldddd.png"));
            araba1=ImageIO.read(new File("araba.png"));
            araba2=ImageIO.read(new File("araba14.png"));
        } catch (IOException ex) {
            Logger.getLogger(ekran_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for( i=1;i<=140;i++){
           
            karsı();
              
        }
        
        t.start();
    }

    @Override
    public void paint(Graphics g) {
        
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
       
      Graphics2D g2=(Graphics2D)g;
      
      g2.drawImage(yol,-310,Yy,(int)(yol.getWidth()/2.1),yol.getHeight(),this);//yol konum genişlik uzunluk
      g2.drawImage(araba1,Ax,Ay,(int)(araba1.getWidth()/1.4),(int)(araba1.getHeight()/1.6),this);
     
      for(Rectangle r:araçlar){
         g2.drawImage(araba2,r.x,r.y,(int)(araba2.getWidth()/8.5),(int)(araba2.getHeight()/10.5),this);
         
      }
      repaint();
    }

    @Override
    public void repaint() {
        süre++;
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            if(Ax<=-56){
                Ax=-56;
            }
            else
            sola();
        }
      else  if(e.getKeyCode()==KeyEvent.VK_RIGHT){
          if(Ax>=264){
              Ax=264;
          }
          else
            saga();
        }
      else if(e.getKeyCode()==KeyEvent.VK_DOWN){
          if(Ay>=510){
              Ay=510;
          }
          else
          assagı();
      }
      else if(e.getKeyCode()==KeyEvent.VK_UP){
          if(Ay<=0){
             Ay=0;
          }
          else
          yukarı();
      }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
    public void yukarı(){
        Ay-=20;
        
    }
    public void assagı(){
       
        Ay+=20;
    }
    public void saga(){
        Ax+=20;
    }
     public void sola(){
         Ax-=20;
     }

    @Override
    
    public void actionPerformed(ActionEvent a) {
        
        süre++;
        if(Yy>=-1000){
           t.stop();
            String message="Tebriler Kazandınız"
                    + "\n Skorunuz="+i
                        +"\n Geçen Süre"+(süre*2.3)/1000.0+" Saniye";                      
                  JOptionPane.showMessageDialog(this, message);
                  System.exit(0);    
                  
       }      
        
        Yy+=6; //yoll hareket etme
        
        Rectangle hız;
        for(int i=0;i<araçlar.size();i++){   //karşıdan gelen arabaların hızı
            
            hız=araçlar.get(i);
            hız.y+=K_hız;
                       
         for(Rectangle r:araçlar ){
              if((r.getY()+158>=Ay&&r.getY()<=Ay+128) &&(Ax>=r.getX()-120&&Ax<=r.getX()+28)){//çarpışma durumu//127 128 -100 34
                 h=i;
                  //x in sagındaki karenin sagı arabanın sol tarafı ayarı oluyor ,x in solundaki karenin solo arabanın sagı oluyor
                  //
               t.stop();
                String message="Kaybettiniz !!!"
                     + "\n Skorunuz="+i
                        +"\n Geçen Süre"+(süre*2.3)/1000.0+" Saniye";
                  JOptionPane.showMessageDialog(this, message);
                 
                  System.exit(0);
        }
            }
       
        }
        
   /*     for(int i=0;i<araçlar.size();i++){
         Rectangle rect=araçlar.get(i);
         
        if(rect.y==aralık);
        araçlar.remove(rect);
        karsı(true);
                            
            
        } */
        repaint();
    }
    public void karsı(){   //karşıdan gelen arabaların konumları
        z=random.nextInt()%6;   
            
           Ky=0;
           
           if(z==0){        
            Kx=105;
           }         
           else if(z==1){
               Kx=290;
           }
           else if(z==2){
               Kx=185;
           }
           else if(z==3){
               Kx=80;
           }
           else if(z==4){
               Kx=225;
           }                
           else{ 
               Kx=-2;              
           }    
           araçlar.add(new Rectangle(Kx,Ky-100-(araçlar.size()*aralık),80,80)); //y-100-(ocars.size()*space)     Ky-(araçlar.size()-1)*50
                     
    }
    
}




