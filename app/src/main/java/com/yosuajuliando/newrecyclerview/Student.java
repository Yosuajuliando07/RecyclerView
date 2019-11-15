package com.yosuajuliando.newrecyclerview;

public class Student {
    private String Nama;
    private String Nim;
    private int Avatar;

    public Student() {
    }

    public Student(String nama, String nim, int avatar) {
        Nama = nama;
        Nim = nim;
        Avatar = avatar;
    }
   // ====================================
    public String getNama() {
        return Nama;
    }

    public String getNim() {
        return Nim;
    }

    public int getAvatar() {
        return Avatar;
    }
    // ====================================

    public void setNama(String nama) {
        Nama = nama;
    }

    public void setNim(String nim) {
        Nim = nim;
    }

    public void setAvatar(int avatar) {
        Avatar = avatar;
    }
}
