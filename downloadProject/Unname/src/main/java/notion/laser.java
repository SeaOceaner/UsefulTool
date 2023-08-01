package notion;

import jdk.nashorn.internal.objects.annotations.Getter;

@Getter
public class laser {
    private int f;
    private double pulseWidth;
    private double P;

    private double spotR;
    private double wavelength;

    public laser(int f, double pulseWidth, double p, double spotR, double wavelength) {
        this.f = f;
        this.pulseWidth = pulseWidth;
        P = p;
        this.spotR = spotR;
        this.wavelength = wavelength;
    }

    public laser(double pulseWidth, double spotR, double wavelength) {
        this.pulseWidth = pulseWidth;
        this.spotR = spotR;
        this.wavelength = wavelength;
    }

}
