package org.example.notions;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Laser {
    private int f;
    private double P;
    private double pulseWidth;
    private int waveLength;
    private double H;
    private double R_spot;
    private double A_spot;
    public Laser(int f, double p, double pulseWidth, int waveLength, double r_spot) {
        this.f = f;
        this.P = p;
        this.pulseWidth = pulseWidth;
        this.waveLength = waveLength;
        this.R_spot = r_spot;
        this.A_spot = Math.pow(R_spot,2)*Math.PI;
    }

    public void setR_spot(double r_spot) {
        R_spot = r_spot;
        A_spot = Math.pow(R_spot,2)*Math.PI;
    }

    public void setA_spot(double a_spot) {
        A_spot = a_spot;
        R_spot = Math.sqrt(A_spot/Math.PI);
    }
}
