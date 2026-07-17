import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // สร้าง Array สำหรับเก็บตัวเลขจำนวนเต็ม 10 จำนวน
        int[] numbers = new int[10];
        
        // รับค่าตัวเลข 10 จำนวนจากผู้ใช้
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // กำหนดค่าเริ่มต้นสำหรับค่าต่ำสุดและสูงสุดโดยใช้สมาชิกตัวแรกของ Array
        int min = numbers[0];
        int max = numbers[0];
        
        // วนลูปเพื่อหาค่าต่ำสุดและค่าสูงสุดใน Array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; // เปลี่ยนค่า min ถ้าเจอตัวที่น้อยกว่า
            }
            if (numbers[i] > max) {
                max = numbers[i]; // เปลี่ยนค่า max ถ้าเจอตัวที่มากกว่า
            }
        }
        
        // แสดงผลลัพธ์ตามรูปแบบ Output ที่โจทย์ต้องการ
        System.out.println("Minimum number = " + min);
        System.out.println("Maximum number = " + max);
        
        scanner.close();
    }
}