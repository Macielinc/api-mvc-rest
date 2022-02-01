package uia.com.apimvcrest;

import uia.com.apimvcrest.modelo.CotizacionModelo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uia.com.apimvcrest.modelo.PeticionOrdenCompraModelo;
import uia.com.apimvcrest.servicio.CotizacionServicio;
import uia.com.apimvcrest.servicio.PeticionOrdenCompraServicio;

import java.io.IOException;

@SpringBootApplication
public class ApiMvcRestApplication {

    public static void main(String[] args) throws IOException {
        CotizacionModelo newCotizacion = new CotizacionModelo(1, "prueba", "1", 1, 1, 0.0,  1);
        newCotizacion.print();

        CotizacionServicio newCotizacionServicio = new CotizacionServicio();
        newCotizacionServicio.getCotizaciones();
        newCotizacionServicio.print();

        PeticionOrdenCompraModelo newPeticionOrdenCompra = new PeticionOrdenCompraModelo(1, "prueba", "1", "prueba", 1);
        newPeticionOrdenCompra.print();

        PeticionOrdenCompraServicio newPeticionOrdenCompraServicio = new PeticionOrdenCompraServicio();
        newPeticionOrdenCompraServicio.getPeticionOrdenCompra();
        newPeticionOrdenCompraServicio.print();

        SpringApplication.run(ApiMvcRestApplication.class, args);
    }

}
