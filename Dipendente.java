public class Dipendente
{
   String nome;
   String cognome;
   double stipendio;

   public Dipendente()
   {
      nome= null;
      stipendio=0;
   }
   public Dipendente(String nome,String cognome,double stipendio)
   {
   	this.nome=nome;
   	this.cognome=cognome;
   	this.stipendio=stipendio;
   }
   public String getNome()
   {
   	return this.nome;
   }
   public String getCognome()
   {
   	return this.cognome;
   }
   public double getStipendio()
   {
   	return this.stipendio;
   }

   public void setStipendio(double stipendio)
   {
   	this.stipendio=stipendio;
   }
   public void stipendioMensile(double stipendio)
   {
     this.stipendio =+ stipendio;
   }
   public void stampaInfoDipendente()
   {
   	System.out.println("Dipendente: "+ getNome()+" "+ getCognome());
   	System.out.println("Stipendio momentaneo: "+ getStipendio());
   }


}