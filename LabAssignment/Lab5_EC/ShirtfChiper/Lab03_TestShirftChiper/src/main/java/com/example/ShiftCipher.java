package com.example;

public class ShiftCipher {
    
    static final int num_char = 26;

    public String shift(String message, int key) {
        if (message == null) {
            return "";
        }
        
        StringBuilder stbuilder = new StringBuilder();
        int length = message.length();

        // 1. แปลงข้อความอินพุตทั้งหมดให้เป็นตัวพิมพ์ใหญ่ตามข้อกำหนดของคู่มือแล็บ
        message = message.toUpperCase();

        // จัดการกรณีคีย์ติดลบ หรือคีย์เกิน 26
        key = ((key % num_char) + num_char) % num_char;

        for (int i = 0; i < length; i++) {
            char currentChar = message.charAt(i);

            // 2. ตรวจสอบ: ถ้าเป็นตัวอักษรพิมพ์ใหญ่ 'A' ถึง 'Z' ให้ทำการ Shift
            if (currentChar >= 'A' && currentChar <= 'Z') {
                int originalPosition = currentChar - 'A';
                int newPosition = (originalPosition + key) % num_char;
                stbuilder.append((char) ('A' + newPosition));
            } 
            // 3. ถ้าไม่ใช่ตัวอักษร (เช่น เป็นตัวเลข 123 หรือช่องว่าง) ให้คงไว้ตามเดิม ไม่ต้อง Shift
            else {
                stbuilder.append(currentChar);
            }
        }

        return stbuilder.toString();
    }
}