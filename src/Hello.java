
// Brindusoiu Andrei Es 17 Data: 7-03-2017
import javax.swing.*;
//Creazione della classe cerchio
class Cerchio
{
        //definizione attributi della classe Cerchio
        private double raggio;
 	//metodo costruttore non parametrico
        public void Cerchio()
        {
        }
        //metodo costruttore parametrico
        public Cerchio(double raggio)
        {
          setRaggio(raggio);
        }
        //metodo che restituisce il valore del raggio
        public double getRaggio()
	{
          return raggio;
        } 
        //metodo che inizializza l'attributo raggio con il valore contenuto nel parametro raggio
        public void setRaggio(double raggio)
        {
          if (raggio>0)
          {
            this.raggio=raggio;
          }
          else
          {
            this.raggio=raggio*(-1);
          }
        }
        //metodo che calcola e restituisce il diametro del cerchio
        public double getDiametro()
        {
          return 2*raggio;
        }
        //metodo che calcola e restituisce l'area del cerchio
        public double getArea()
        {
          System.out.println("area 1");
            return raggio*raggio*3.14;
        }
        //metodo che calcola e restituisce il perimetro del cerchio
        public double getCirconferenza()
        {
          double perimetro;
          perimetro=raggio*6.28;
          perimetro=Math.floor(perimetro*100);
          perimetro=perimetro/100;
          return perimetro;
        }
        public String toString()
        {
            return "Sono un cerchio di raggio "+getRaggio()+" cm con un diametro di "+getDiametro()+" cm, una circonferenza di "+getCirconferenza()+" cm e un'area di "+getArea()+" cm^2.";
        }
}

class Cilindro extends  Cerchio
{
        private double altezza;
        //metodo costruttore parametrico
        public Cilindro(double raggio, double altezza)
        {
            super(raggio);
            setAltezza(altezza);
        }
        public void setAltezza(double altezza)
        {
          if (altezza>0)
          {
            this.altezza=altezza;
          }
          else
          {
            this.altezza=altezza*(-1);
          }
        }
        public double getAltezza()
        {
            return altezza;
        }
        //metodo che calcola il volume del cilindro
        public double getVolume()
        {
            return 3.14*(getRaggio()*getRaggio())*altezza;
        }
        //metodo che calcola la superficie del cilindro
        public double getArea()
        {
            double superficie;
            superficie=2*3.14*getRaggio()*(getRaggio()+altezza);
            superficie=Math.floor(superficie*100);
            superficie=superficie/100;
            System.out.println("area 2");
            return superficie;
        }        
        public String toString()
        {
            return ""+super.toString()+"\nCon un'altezza di "+getAltezza()+" cm sono diventato un cilindro con una superficie di "+getArea()+" cm^2 ed un volume di "+getVolume()+" cm^3.";
        }
}
class Hello
{
    public static void main(String args[])
    {
        double raggio,altezza;
        //cerchio
        raggio=Double.parseDouble(JOptionPane.showInputDialog("Oggetto cerchio\nInserire il valore del raggio(>0) in cm."));
        Cerchio cerchio=new Cerchio(raggio);
        JOptionPane.showMessageDialog(null,
        cerchio.toString(),
        "Figura geometrica",
        JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
        "Cerchio\nCirconferenza: "+cerchio.getCirconferenza()+" cm\nArea: "+cerchio.getArea()+" cm^2.",
        "Figura geometrica",
        JOptionPane.INFORMATION_MESSAGE);
        //cilindro
        raggio=Double.parseDouble(JOptionPane.showInputDialog("Oggetto cilindro\nInserire il valore del raggio(>0) in cm."));
        altezza=Double.parseDouble(JOptionPane.showInputDialog("Oggetto cilindro\nInserire il valore dell'altezza(>0) in cm."));
        Cilindro cilindro=new Cilindro(raggio,altezza);
        JOptionPane.showMessageDialog(null,
        cilindro.toString(),
        "Figura geometrica",
        JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
        "Cilindro\nCirconferenza: "+cilindro.getCirconferenza()+" cm\nSuperficie totale: "+cilindro.getArea()+" cm^2\nVolume: "+cilindro.getVolume()+" cm^3.",
        "Figura geometrica",
        JOptionPane.INFORMATION_MESSAGE);
    }
}
