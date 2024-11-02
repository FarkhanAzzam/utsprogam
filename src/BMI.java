/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daisy
 */

public class BMI {
   double hasil;
   
   void kalkulatorBMI (double tinggi, double berat){
       hasil = berat / (tinggi * tinggi);
       System.out.println("jadi hasil BMI saya" + hasil);
       String category = getBMIcategory(hasil);
       System.out.println("category BMI azam " + category);
   }
   
    public String getBMIcategory (double hasil){
        if (hasil < 18.5){
            return "underweight";
        }else if (hasil >= 18.5 && hasil < 29.9){
            return "Normal Weight";
        }else if (hasil >=25 && hasil < 29.9){
            return "Overweight";
        }else {
            return "obesity";
        }
    }
}

           
       
  
     



      
       
      
     
     
     
   
       
   
   
 
