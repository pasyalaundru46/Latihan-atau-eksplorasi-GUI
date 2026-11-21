
# 🎨 Eksplorasi GUI Java (Swing & AWT)

### Tugas 3B – Latihan Graphical User Interface pada Java

## 👤 Identitas

| Keterangan | Detail |
|---|---|
| Nama | [Muhammad Abdiel Pasya Laundru] |
| NIM | [F1D02510080 |
| Mata Kuliah | Pemrograman Berorientasi Objek |
| Tugas | 3B - Latihan/Eksplorasi Materi GUI pada Java |
---

## 🧩 5 Komponen Utama GUI yang Digunakan

### 1️⃣ Top-level Container → `JFrame`

Jendela utama aplikasi yang digunakan sebagai tempat seluruh komponen GUI.

```java
JFrame frame = new JFrame("Kalkulator Luas");
frame.setSize(350, 250);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

### 2️⃣ Intermediate Container → `JPanel`

Wadah untuk mengelompokkan komponen GUI seperti judul, form input, tombol, dan hasil perhitungan.

Aplikasi menggunakan beberapa JPanel untuk mengatur susunan komponen.

### 3️⃣ Atomic Component → `JLabel`, `JTextField`, `JButton`

Komponen dasar yang digunakan untuk berinteraksi dengan pengguna.

| Class | Fungsi |
|---|---|
| `JLabel` | Menampilkan judul, keterangan, dan hasil |
| `JTextField` | Memasukkan nilai panjang dan lebar |
| `JButton` | Tombol Hitung dan Reset |

### 4️⃣ Layout Classes → `BorderLayout`, `GridLayout`, `FlowLayout`

| Layout | Digunakan pada |
|---|---|
| `BorderLayout` | Mengatur posisi judul, form, dan hasil |
| `GridLayout` | Menyusun label dan input dalam bentuk tabel |
| `FlowLayout` | Menyusun tombol Hitung dan Reset |

### 5️⃣ Event Listener → `ActionListener`

Event Listener digunakan untuk menangani interaksi pengguna ketika tombol ditekan.

Terdapat dua interaksi utama:

- Tombol Hitung: Menghitung luas persegi panjang.
- Tombol Reset: Menghapus input dan mengembalikan hasil ke kondisi awal.

Method `actionPerformed()` digunakan untuk menangani proses perhitungan.

```java
tombolHitung.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        double panjang = Double.parseDouble(inputPanjang.getText());
        double lebar = Double.parseDouble(inputLebar.getText());
        double luas = panjang * lebar;
        hasil.setText("Hasil: " + luas);
    }
});
```

---

## 🖱️ Interaksi Aplikasi

| Interaksi | Fungsi |
|---|---|
| Tombol Hitung | Menghitung luas berdasarkan panjang × lebar |
| Tombol Reset | Menghapus seluruh input dan hasil |
| Validasi Input | Memeriksa input kosong atau bukan angka |
| Validasi Angka | Memastikan nilai lebih dari 0 |
---

## ⚙️ Cara Menjalankan Program

1. Pastikan Java JDK sudah terinstal.
2. Buka folder project melalui VS Code.
3. Buka terminal pada folder project.
4. Compile program:

```bash
javac Main.java
```

5. Jalankan program:

```bash
java Main
```

---

## 📝 Deskripsi Aplikasi

Kalkulator Luas Persegi Panjang merupakan aplikasi GUI sederhana yang dibuat menggunakan Java Swing.

Aplikasi ini memungkinkan pengguna memasukkan nilai panjang dan lebar, kemudian menekan tombol Hitung untuk mendapatkan hasil luas secara otomatis.

**Rumus:**

Luas = Panjang × Lebar

Aplikasi juga dilengkapi tombol Reset untuk menghapus input dan validasi sederhana untuk memastikan data yang dimasukkan sesuai.
