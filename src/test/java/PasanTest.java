import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PasanTest {

    @Mock
    AutoDetector autoDetector;

    @InjectMocks
    Autopista autopista;

    @Before
    public void init(){
        reset(autoDetector);
        when(autoDetector.isAuto(eq(1))).thenReturn(true);
        when(autoDetector.isAuto(eq(0))).thenReturn(false);
    }

    //test con estructura binaria de solo ceros.
    @Test
    public void autopistaCamiones() {

        //given
        int[] camionesC = {0,0,0,0,0,0,0,0,0,0,0}; // pasan 0 autos


        //when
        int pasan = autopista.peaje(camionesC);

        //then
        assertEquals(0,pasan);
        verify(autoDetector,times(0)).isAuto(eq(1));
        verify(autoDetector,times(11+1)).isAuto(eq(0));

    }

    // test con estructura binaria donde solo hay "unos" a los laterales.
    @Test
    public void autopistaAutos(){

        //given
        int []autosC = {1,0,0,0,0,0,0,0,0,0,0,1}; //pasan 10 autos

        //when
        int pasan = autopista.peaje(autosC);

        //then
        assertEquals( 10,pasan);

    }

    // test donde no se ingresa una estructura binaria.
    @Test
    public void autopistaVehiculos(){

        //given
        int [] vehiculosC = {4,5,8,6}; // pasan 0 autos

        //when
        int pasan = autopista.peaje(vehiculosC);

        //then
        assertEquals(0,pasan);
    }

    // test donde la estructura binaria solo tiene un uno en el medio.
    @Test
    public void autopistaCarros(){

        //given
        int [] carrosC = {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0}; // pasan 8 autos

        //when
        int pasan = autopista.peaje(carrosC);

        //then
        assertEquals(8,pasan);
    }

}