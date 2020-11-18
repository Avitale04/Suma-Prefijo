public class Pasan {

    int A[];
    public int contador = 0;

    public Pasan(int A[]){

        this.A = A;
    }

    public int autopista(){

        for(int i = 0; i<=A.length -1; i++){

            if(A[i]==0){

                for(int x = i; x<=A.length -1;x++){

                    if(A[x] == 1){

                        contador ++;
                    }
                }
            }

        }

        if(contador >= 1000000000) {
            contador = -1;
        }

        //System.out.println("Pasan "+ contador + " Autos");
        return contador;
    }
}
