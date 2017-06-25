public class MainDipendente
{
  public static void main(String[] args)
  {
   Dipendente antonio =new Dipendente("antonio","daccampo",1300);
   

   for (int i=0; i<12; i++) 
   {
   	antonio.saldoDipendente(1300);
   }
    antonio.stampaInfoDipendente();






  }





}