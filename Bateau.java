public class Bateau {
    
    public int orientation;   
    public String orientStr;          
    public int typeDeBateau;
    public int tailleBateau;
    public String nomBateau;
    public int coordonneesBateauX;
    public int coordonneesBateauY;
    public boolean[] bateauTouche;
    public boolean bateauCoule;
    
    // rentrer (1,true,2,2) pour créer une barque en B2,C2
    // rentrer (3,true,3,9) pour créer un cargo en I3,I4,I5,I6
    public Bateau(int nb,int orient, int x, int y) {
        if( nb == 4){
		    this.tailleBateau = 2;
		    this.nomBateau = "barque";
		}else if(nb ==3 ){
			this.tailleBateau = 3;
			this.nomBateau = "voilier";
    	}else if( nb == 2){
			this.tailleBateau = 4;
			this.nomBateau = "cargo";
        }else if( nb == 1){
			this.tailleBateau = 5;
			this.nomBateau = "porte-avion";
        }else{
			System.out.println("le bateau est invalide, veuillez recommencer");	
		}
		System.out.println("X "+x + " Y " + y);
		this.orientation = orient;
		this.coordonneesBateauX = x;
		this.coordonneesBateauY = y;
		this.bateauTouche = new boolean[tailleBateau];
		if(orient == 1){
			orientStr ="vertical";
		}else if(orient == 2){
			orientStr = "horizontal";
		}
		System.out.println(orientStr+ " ok");
        
    }
    
    public int estTouche(){
		int n = 0 ;
        for(int i = 0; i < this.bateauTouche.length; i++){
            if(bateauTouche[i]){
                n++;
            }
        }
        return n;
    }
	
    public boolean estCoule(boolean[] caseDuBateau){
        int a = 0;
        for(int i = 0; i < caseDuBateau.length; i++){
            if(caseDuBateau[i] == true){
                a = a+1;
			}
        }
		return a == this.tailleBateau;
	}
	 public String toString() {
        String description = "Le bateau est un " + this.nomBateau 
                             + " orienté " + this.orientStr 
                             + " avec pour coordonnées " +coordonneesBateauX +","+coordonneesBateauY
                             + " de taille " + this.tailleBateau ;
        return description;
    }
}
