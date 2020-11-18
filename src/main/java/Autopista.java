public class Autopista {

    public static final int LIMITE_AUTOS_CONTADOS = 1000000000;
    AutoDetector autoDetector;

    public Autopista(AutoDetector autoDetector){
        this.autoDetector = autoDetector;
    }

    /**
     * cuenta cantidad de autos que pasan
     * @param A
     * @return
     */
    public int peaje(int A[]){
        int contador = 0;

        for(int i = 0; i<=A.length -1; i++){
            if(!this.autoDetector.isAuto(A[i])){
                for(int x = i; x<=A.length -1;x++){
                    if(this.autoDetector.isAuto(A[x])){
                        contador ++;
                    }
                }
                if(contador == 0)
                    return 0;
            }
        }

        if(contador >= LIMITE_AUTOS_CONTADOS) {
            contador = -1;
        }

        //System.out.println("Pasan "+ contador + " Autos");
        return contador;
    }
}
