# Lab5_673380296-7-SQA
# 🧪 Lab #5 : Equivalence Class Testing

> รายวิชา **CP353201 Software Quality Assurance**  
> ภาคเรียนที่ 1/2569

---

## 👨‍🎓 ผู้จัดทำ

| รายการ | ข้อมูล |
|--------|--------|
| 👤 ชื่อ | นางสาวสโรชา เสาทอง |
| 🆔 รหัสนักศึกษา | 673380296-7 |
| 🏫 สาขา | วิทยาการคอมพิวเตอร์ |
| 🎓 มหาวิทยาลัย | มหาวิทยาลัยขอนแก่น |

---

# 📋 รายละเอียดโครงงาน

โปรเจกต์นี้เป็นส่วนหนึ่งของรายวิชา **Software Quality Assurance (SQA)** มีวัตถุประสงค์เพื่อศึกษาการออกแบบกรณีทดสอบ (Test Case Design) และการพัฒนา Unit Test ด้วย **JUnit 6 Parameterized Test** โดยใช้เทคนิคการทดสอบแบบ **Equivalence Class Testing (EC Testing)** เพื่อแบ่งช่วงข้อมูลออกเป็นกลุ่มที่มีพฤติกรรมเหมือนกัน ช่วยลดจำนวน Test Case แต่ยังคงครอบคลุมการทดสอบได้อย่างมีประสิทธิภาพ

การทดลองใน Lab นี้ประกอบด้วย

- ✅ **Weak Robust Equivalence Class Testing (Domain/Input EC Testing)**
- ✅ **Strong Robust Equivalence Class Testing (Range/Output EC Testing)**
- ✅ **JUnit 6 Parameterized Test**
- ✅ **Test Case Design และ Unit Testing**

โดยนำเทคนิคดังกล่าวมาประยุกต์ใช้ในการตรวจสอบความถูกต้องของโปรแกรม Java และเปรียบเทียบผลลัพธ์ที่คาดหวัง (Expected Result) กับผลลัพธ์ที่ได้จริง (Actual Result)

---

# 📂 โครงสร้างโปรเจกต์ (Maven Project Structure)

โครงสร้างของโปรเจกต์ถูกจัดวางตามรูปแบบมาตรฐานของ Maven Project ภายใน Eclipse IDE ดังนี้

## 📂 Project Structure

## 📂 Project Structure

```text
Lab5_673380296-7-SQA
│
├── Competition
│   ├── src
│   │   ├── main
│   │   │   └── java
│   │   │       └── com.example
│   │   │           └── CompetitionScore.java
│   │   └── test
│   │       └── java
│   │           └── com.example
│   │               └── CompetitionScoreTest.java
│   └── pom.xml
│
├── Lab03_TestShiftCipher
│   ├── src
│   │   ├── main
│   │   │   └── java
│   │   │       └── com.example
│   │   │           └── ShiftCipher.java
│   │   └── test
│   │       └── java
│   │           └── com.example
│   │               └── ShiftCipherTest.java
│   └── pom.xml
│
├── Lab5_EC.xlsx
└── README.md
```

---

# 🛠 สภาพแวดล้อมและเครื่องมือที่ใช้ (Test Environment)

### 💻 System Specifications

- **Laptop Model:** Acer Aspire A515-58M
- **OS:** Windows 11 Home (64-bit, x64)
- **CPU:** 13th Gen Intel(R) Core(TM) i5-13420H (2.10 GHz)
- **RAM:** 16.0 GB

### 🛠 Software Tools & Frameworks

- **Java Version:** Java SE 21
- **IDE:** Eclipse IDE
- **Build Tool:** Maven
- **Testing Framework:** JUnit 6 (JUnit Jupiter)
- **Version Control:** Git & GitHub

---

# 📚 อ้างอิง

- JUnit 6 Documentation
- Maven Documentation
- Eclipse IDE
- GitHub
- เอกสารประกอบการสอนรายวิชา CP353201 Software Quality Assurance

---

<div align="center">

### ⭐ Software Quality Assurance - Lab #5 ⭐

**Equivalence Class Testing using JUnit 6**



</div>
