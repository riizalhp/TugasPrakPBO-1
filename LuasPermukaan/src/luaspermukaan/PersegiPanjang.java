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
public class PersegiPanjang implements MenghitungBidang {
    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getPanjang(){
        return panjang;
    }
    
    /**
     *
     * @return
     */
    public double getLebar(){
        return lebar;
    }
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
}

