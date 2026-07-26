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

```text
Competition
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example
│   │   │       └── CompetitionScore.java
│   │   └── resources
│   │
│   └── test
│       ├── java
│       │   └── com.example
│       │       └── CompetitionScoreTest.java
│       └── resources
│
├── screenshot
│   ├── Weak Robust EC Testing.png
│   └── Strong Robust EC Testing.png
│
├── Lab5_EC.xlsx
├── pom.xml
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

# 🧪 Testing Techniques

## ✅ Lab 5.1 : Weak Robust Equivalence Class Testing

เทคนิคนี้ใช้สำหรับออกแบบ Test Case โดยแบ่งข้อมูลนำเข้าออกเป็นกลุ่ม (Equivalence Classes) และเลือกค่าตัวแทนจากแต่ละกลุ่ม ทั้งข้อมูลที่ถูกต้อง (Valid Class) และข้อมูลที่ไม่ถูกต้อง (Invalid Class) ภายใต้สมมติฐานว่ามีความผิดพลาดเพียงหนึ่งค่าในแต่ละครั้ง

---

## ✅ Lab 5.2 : Strong Robust Equivalence Class Testing

เทคนิคนี้เป็นการขยายจาก Weak Robust EC โดยพิจารณาทั้งข้อมูลที่ถูกต้องและไม่ถูกต้อง พร้อมทั้งรองรับกรณีที่ข้อมูลผิดพลาดหลายตัวแปรพร้อมกัน (Multiple Fault Assumption) เพื่อเพิ่มความครอบคลุมของการทดสอบ

---

# ▶️ การรันโปรเจกต์

Clone Repository

```bash
git clone https://github.com/<your-username>/<repository>.git
```

เข้าสู่โปรเจกต์

```bash
cd Competition
```

รัน Unit Test

```bash
mvn test
```

หรือสามารถรันผ่าน Eclipse IDE โดยเลือก

```
Run As
→ JUnit Test
```

---

# 📷 ผลการทดสอบ

สามารถดูผลการทดสอบได้ภายในโฟลเดอร์

```text
screenshot/
```

ประกอบด้วย

- Weak Robust EC Testing
- Strong Robust EC Testing

---

# 📄 เอกสารประกอบ

- Lab5_EC.xlsx
- README.md
- Source Code
- Unit Test

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

Made with ❤️ by **Sarocha Saothong**

</div>
