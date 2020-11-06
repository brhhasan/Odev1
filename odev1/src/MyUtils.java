
public class MyUtils {
	
    public static float ucgenCevre(float a, float b, float c){
       
       return (a+b+c);
    }

    public static double ucgenAlan(float a, float b, float c){
        float u = (a+b+c)/2;
        float x = u*(u-a)*(u-b)*(u-c);
        double t = Double.parseDouble(Float.toString(x));
        double sonuc = Math.sqrt(x);
        return sonuc;
    }

    public static float cokgenCevre(float ... kenar){
        float toplam = 0;
        for (float item : kenar) {
            toplam += item;
        }
        return toplam;
    }

    public static double cokgenAlan(float ... kenar){
        double a = Double.parseDouble(Float.toString(kenar[0])) ;
        double n = kenar.length;
        double x = Math.PI / n;
         System.out.println("n:"+n);
         System.out.println("a:"+a);
         double cot =  (Math.toRadians(Math.cos(x))/Math.toRadians(Math.sin(x)));
         double sonuc = (n * a*a)/4 * cot;
         return sonuc;
               }

    public static double hesaplama(int[] sayilar){
        float[] sonuc = new float[10];
        double e = 0.0001;
        double sonuc1=0;
         for (int i = 0; i < sayilar.length; i++) {
          int x = sayilar[i];
          double f1 = (3*sayilar*sayilar) - 2*Math.pow(e,x) + Math.sqrt(x);
          double f2 = 1 / (1+ Math.pow(e,f1));
              }
        return sonuc1;
    }

    
    
    
    public static void main(String[] args)
    {
    System.out.println("��gen alan"+(cokgenAlan(4,4,4,4,4)));	
    	
    }

}	
