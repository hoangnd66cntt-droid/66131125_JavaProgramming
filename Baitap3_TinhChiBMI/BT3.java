
public class BT3 {
     public static void main(String[] args) {
        double weight = 100.0;
        double height = 1.70;  
        
        double bmi = weight/(height * height);
        
        System.out.println("nặng: " + weight + " kg");
        System.out.println("cao: " + height + " m");
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Phân loại: Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Phân loại: Thừa cân");
        } else {
            System.out.println("Phân loại: Béo phì");
        }
    }
}   
