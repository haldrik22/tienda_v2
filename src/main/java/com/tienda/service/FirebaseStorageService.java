package com.tienda.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-5a0b5.appspot.com";

    //Esta es la ruta bÃ¡sica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";

    //UbicaciÃ³n donde se encuentra el archivo de configuraciÃ³n Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-5a0b5-firebase-adminsdk-2yf2c-ddb111a96b.json";
}