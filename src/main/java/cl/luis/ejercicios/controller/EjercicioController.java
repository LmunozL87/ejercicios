package cl.luis.ejercicios.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ejercicio")
public class EjercicioController {

    private static final Logger logger = LoggerFactory.getLogger(EjercicioController.class);

    @GetMapping("/casoUso1")
    public String obtenerStatus() {

        logger.info("Se esta consultando el endpoint /casoUso1.");

        String mensaje = "El ms está activo 👌.";
        
        return mensaje;
    }

    @PostMapping("/casoUso2")
    public String devolverDatosUsuario(@RequestBody String datoDeLaSolicitud){

        logger.info("El dato que llego de la solicitud fue " + datoDeLaSolicitud);

        String datoQueDevolvere = datoDeLaSolicitud + "- data llego OK";

        logger.info(datoQueDevolvere);

        return datoQueDevolvere;
    }
    
}
