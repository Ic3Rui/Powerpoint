
public class Waehrungsumrechner
{
    private double kurs;
    


    public Waehrungsumrechner(double kurs)
    {
        this.kurs = kurs;
    }
    
    public void setKurs(double kurs){
        this.kurs = kurs;
    }
    
    public double inEuro(double geld)
    {
        return geld/kurs;

    }
    
    public double inFremdwaehrung(double euro){
        return kurs * euro;
    }
}
