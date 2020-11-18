import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PasanTest {

    //test con estructura binaria de solo ceros.
    @Test
    public void autopistaCamiones() {

        //given
        int []camionesC = {0,0,0,0,0,0,0,0,0,0,0}; // pasan 0 autos
        Pasan camiones = new Pasan(camionesC);

        //when
        int pasan = camiones.autopista();

        //then
        assertEquals(0,pasan);

    }

    // test con estructura binaria donde solo hay "unos" a los laterales.
    @Test
    public void autopistaAutos(){

        //given
        int []autosC = {1,0,0,0,0,0,0,0,0,0,0,1}; //pasan 10 autos
        Pasan autos = new Pasan(autosC);

        //when
        int pasan = autos.autopista();

        //then
        assertEquals( 10,pasan);
    }

    // test donde no se ingresa una estructura binaria.
    @Test
    public void autopistaVehiculos(){

        //given
        int [] vehiculosC = {4,5,8,6}; // pasan 0 autos
        Pasan vehiculos = new Pasan(vehiculosC);

        //when
        int pasan = vehiculos.autopista();

        //then
        assertEquals(0,pasan);
    }

    // test donde la estructura binaria solo tiene un uno en el medio.
    @Test
    public void autopistaCarros(){

        //given
        int [] carrosC = {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0}; // pasan 8 autos
        Pasan carros = new Pasan(carrosC);

        //when
        int pasan = carros.autopista();

        //then
        assertEquals(8,pasan);
    }

}