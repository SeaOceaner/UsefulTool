package org.example.tool;

import org.example.notions.Laser;

public class EnergyTransEfficiency {
    public static void main(String[] args) {
        Laser laser = new Laser(10,50,20,1064,100);
        System.out.println(laser);
        laser.setA_spot(10);
        System.out.println(laser);
        laser.setR_spot(3);
        System.out.println(laser);
        //0.95*2000[W/cm^2]*(0.08/w(z))^2*exp((-2*(x^2+y^2))/(w(z)^2))
    }


}
