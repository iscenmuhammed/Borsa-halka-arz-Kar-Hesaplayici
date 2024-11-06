
package halkaarzkârhesaplama;

import java.util.Scanner;


public class HalkaArzKârHesaplama {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tavan_sayisi,lot;
        double lot_birim_fiyat;  
        System.out.println("Tahmini tavan sayısını,lotu,lot birim fiyatı giriniz:");
        System.out.print("Tavan sayısı:"); tavan_sayisi=scanner.nextInt();
        
        System.out.print("lot sayısı:"); lot=scanner.nextInt();
        
        System.out.print("Lot birim fiyat:");  lot_birim_fiyat=scanner.nextDouble();
        
        scanner.nextLine();
        
        double fiyat=lot*lot_birim_fiyat;
        double ilkFiyat=fiyat;
        while(tavan_sayisi>0){
            fiyat+=fiyat*0.1;
            lot_birim_fiyat+=lot_birim_fiyat*0.1;
            tavan_sayisi--;
        }
        double sonFiyat=fiyat;
        double kazanç=sonFiyat-ilkFiyat;
        System.out.println("************************************");
        System.out.println("Başlangıç param:"+ilkFiyat);        
        System.out.println("En sondaki param:"+sonFiyat);
        System.out.println("Toplam kâr:"+kazanç+"  (İki hesapla girersem kârım):"+kazanç*2);
        System.out.println("Yeni lot birim fiyatı:"+lot_birim_fiyat);
        
    }
    
}
