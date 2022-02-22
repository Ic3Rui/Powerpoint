// Klasse zur Ermittlung von Kennzahlen aus
// einer Fogle von Zahlen

public class Akkumulator
{
    private double summe;
    private double maximum;
    private double minimum;
    private int anzahl;
    private double quadratzahl;
    private double quadratsumme;
    private double Varianz;

    public Akkumulator()
    {
        summe = 0;
        anzahl = 0;
    }
    public double getsumme()
    {
        return summe;
    }
    public double getmaximum()
    {
        return maximum;
    }
    public double getminimum()
    {
        return minimum;
    }
    public double calcmittel()
    {
        return summe/anzahl;
    }
    public void aktualisiere(double wert)
    {
        summe = summe + wert;
        anzahl = anzahl +1;
        quadratzahl= wert*wert;
        if (wert > maximum || anzahl ==1)
            maximum = wert;
        if (wert < minimum || anzahl ==1)
        minimum = wert;
        quadratsumme = quadratsumme + quadratzahl;
        Varianz = 1.0/anzahl * (quadratsumme)-1.0/(anzahl*anzahl) * (summe*summe);
    }
    public double calcspannweite()
    {
        return maximum-minimum;
    }
    
}
