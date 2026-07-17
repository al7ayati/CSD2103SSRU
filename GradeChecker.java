import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. รับคะแนนกลางภาค
        System.out.print("Enter midterm score: ");
        int midtermScore = scanner.nextInt();
        
        // 2. รับคะแนนปลายภาค
        System.out.print("Enter final score: ");
        int finalScore = scanner.nextInt();
        
        // 3. คำนวณคะแนนรวม และแสดงผล
        int totalScore = midtermScore + finalScore;
        System.out.println("Total score = " + totalScore);
        
        // 4. และ 5. ตรวจสอบเงื่อนไขผ่าน (ตั้งแต่ 50 ขึ้นไป) หรือ ไม่ผ่าน (น้อยกว่า 50)
        if (totalScore >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        // ปิดการใช้งาน Scanner
        scanner.close();
    }
}