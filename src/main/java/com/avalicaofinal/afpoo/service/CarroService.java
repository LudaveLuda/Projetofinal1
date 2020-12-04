package com.avalicaofinal.afpoo.service;

import com.avalicaofinal.afpoo.dto.CarroDTO;
import com.avalicaofinal.afpoo.modelo.Carro;

public class CarroService {
    public Carro fromDTO(CarroDTO dto){

        Carro carro = new Carro();

        carro.setModelo(dto.getModelo());
        return carro;
    }
}
