package com.avalicaofinal.afpoo.repositorios;

import java.util.List;

import com.avalicaofinal.afpoo.modelo.Carro;
import com.avalicaofinal.afpoo.modelo.Cliente;

import org.springframework.stereotype.Component;

@Component
public class repositoriocarro {

    public List<Carro> carros;

    public List<Carro> todososcarros()
    {
        return carros;
    }

    public Carro getcarrocodigo(int codigo)
    {
        for(Carro aux: carros){
            if(aux.getCodigo()== codigo)
            return aux;
        }
        return null;
    }
    public Carro save(Carro carro){
        carro.setCodigo(carros.size() + 1);
        carros.add(carro);
        return carro;
    }
    public void RemoverCliente(Carro cliente)
    {
        carros.remove(cliente);

    }

	public Carro updatecarros(Carro carros) {
        Carro aux = getcarrocodigo(carros.getCodigo());
        if(aux != null)
        aux.setModelo(carros.getModelo());
        aux.setValordiaria(carros.getValordiaria());
		return aux;
	}

	
}
