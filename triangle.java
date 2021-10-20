import java.util.Scanner; // import รับข้อมูล
public class triangle{

        public static void main(String[] args) {
        
        Scanner kk = new Scanner(System.in);
           float base, hight, sum ;
             
        System.out.println("ฺโปรแกรมหาฟื้นที่ 3 เหลี่ยม โปรดใส่พื้นที่ ฐาน ความ สูง ตามลำดับ");  
           
        base = kk.nextFloat();  
        System.out.println("ฺพื้นที่ฐาน:"+base);
        
        hight = kk.nextFloat();    
        System.out.println("ความสูง: "+hight);
        
                             
        sum=base*hight;
        sum=sum/2;
        System.out.println("ตอบ " +sum);
        

        
}


}
