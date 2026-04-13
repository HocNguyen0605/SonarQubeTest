package model;
public class Calculator {

    // Hàm cộng
    public int add(int a, int b) {
        return a + b;
    }

    // Hàm chia (có bug tiềm ẩn)
    public int divide(int a, int b) {
        return a / b; // chưa xử lý chia cho 0
    }

    // Hàm kiểm tra số chẵn
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false; // Sonar sẽ báo code smell (có thể viết gọn)
        }
    }
}