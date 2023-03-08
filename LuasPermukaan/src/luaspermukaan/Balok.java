/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luaspermukaan;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    private final double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * super.hitungLuas() + (tinggi * getPanjang()) + (tinggi * getLebar());
    }}

  