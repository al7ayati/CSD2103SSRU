import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // 1. สร้างวัตถุ Scanner เพื่อรับค่าจากผู้ใช้
        Scanner scanner = new Scanner(System.in);
        
        // แสดงข้อความแจ้งเตือนให้กรอกข้อมูล
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        
        // 2. และ 3. ตรวจสอบเงื่อนไขหารลงตัวด้วย 2
        if (number % 2 == 0) {
            // ถ้าหารด้วย 2 ลงตัว (เศษเป็น 0) ให้แสดง Even number
            System.out.println("Even number");
        } else {
            // ถ้าหารด้วย 2 ไม่ลงตัว ให้แสดง Odd number
            System.out.println("Odd number");
        }
        
        // ปิดการใช้งาน Scanner
        scanner.close();
    }
}