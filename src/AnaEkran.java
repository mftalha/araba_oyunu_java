


import javax.swing.JFrame;

public class AnaEkran extends JFrame {    
  String Oyun_ismi;  
  public AnaEkran(String s){
      Oyun_ismi=s;
      setTitle(s);
    
  }
    public static void main(String[] args) {
//        AnaEkran ekran =new AnaEkran("Araba Oyunu");
//        ekran.setSize(400,700);
//        ekran.setLocation(700,15);
//        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        ekran.setResizable(false);
//        
//       ekran_1 e = new ekran_1();
//        e.requestFocus();//klavyeden işlemleri anlaması için direk odagı veriyoruz böyle bir anlamı var.
//        e.addKeyListener(e);//direk fareden işlemleri almaya yarıyor. 
//        //oyun içine KeyListenere implements edince hata gidiyor. hata sebebi KeyListenere baglı olmasını istiyor.
//        //oyunu bunun içine verince KeyListener sadece JPanel içinde çalışacak
//        e.setFocusable(true);//odagı oyuna verdik
//        e.setFocusTraversalKeysEnabled(false);//klavye işlemlerinin gerçekleşmesi için
//        ekran.add(e);
//        ekran.setVisible(true);
        giris g =new giris();            
        g.setVisible(true);
        
    }
}
