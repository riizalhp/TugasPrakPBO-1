/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luaspermukaan;

/**
 *
 * @author LENOVO
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return (2 * super.hitungLuas()) + (super.hitungKeliling() * tinggi);
    }
}
