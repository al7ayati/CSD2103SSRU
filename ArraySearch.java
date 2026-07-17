import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. กำหนดรายชื่อนักศึกษา 5 คนไว้ใน Array (สมมติตัวอย่างรายชื่อ)
        String[] students = {"Somchai", "Somsri", "Somsak", "Sompong", "Somjai"};
        
        // 2. รับชื่อที่ต้องการค้นหาจากผู้ใช้
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine();
        
        boolean isFound = false;
        
        // 3. ตรวจสอบว่าชื่อนั้นมีอยู่ใน Array หรือไม่
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(searchName)) {
                isFound = true;
                break; // เมื่อเจอแล้วให้หยุดการค้นหาทันที
            }
        }
        
        // 4. และ 5. แสดงผลลัพธ์ Found หรือ Not Found
        if (isFound) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        
        scanner.close();
    }
}