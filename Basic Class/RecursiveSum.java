public class RecursiveSum {
    // ฟังก์ชัน recursive ที่จะบวกเลขตั้งแต่ 1 ถึง n
    public static int sum(int n) {
        // กรณีฐาน (Base case): ถ้า n เป็น 0 หรือ 1 ก็ให้คืนค่า n ไป
        if (n <= 0) {
            return 0;
        } else {
            // ฟังก์ชัน recursive: บวก n กับผลลัพธ์จากการเรียกตัวเอง
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;  // ตัวอย่างการบวกเลขตั้งแต่ 1 ถึง 5
        System.out.println("Sum of numbers from 1 to " + number + " is: " + sum(number));
    }
}
