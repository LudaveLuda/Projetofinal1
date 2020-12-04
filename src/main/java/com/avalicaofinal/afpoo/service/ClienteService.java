package com.avalicaofinal.afpoo.service;

import com.avalicaofinal.afpoo.dto.ClienteDTO;
import com.avalicaofinal.afpoo.modelo.Cliente;

import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    public Cliente fromDTO(ClienteDTO dto){

        Cliente cliente = new Cliente();

        cliente.setEndereço(dto.getEndereço());
        cliente.setNome(dto.getNome());
        return cliente;
    }
    
}
