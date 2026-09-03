public class selectionsort2 {	
	public static void main (String[] arguments) {
        int[] zusortieren = {2,9,11,3,1,6,8,4,5,7};
        int temp = 0;
        
        for(int i=0;i<zusortieren.length;i++){
            int lowposition = i;
            int low = zusortieren[i];
            for(int j=i;j<(zusortieren.length);j++){
                if(zusortieren[j]<low){
                    low = zusortieren[j];
                    lowposition = j;
                }
            }
            temp = zusortieren[i];
            zusortieren[i] = low;
            zusortieren[lowposition] = temp;
        }
        for(int i=0;i<zusortieren.length;i++){
            System.out.print(zusortieren[i] + " ");
        }
	}
}
//Durch die zusortieren läuft die Suche, man speichert erst Zahl in low, if(i+1) < low, low = i+1
//Nach dem Suchgang wird low in zusortieren[i] gespeichert und die Suche beginnt erneut in i+1
//Initialisierung, eine Zahl in low ist notwendig

//Am Anfang ist die sortierte Liste leer
//Bei gefüllter sortierten Liste fängt der Suchprozess im Index[i+1]
//