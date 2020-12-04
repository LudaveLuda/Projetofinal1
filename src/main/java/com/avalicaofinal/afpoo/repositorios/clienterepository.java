package com.avalicaofinal.afpoo.repositorios;

import java.util.List;

import com.avalicaofinal.afpoo.modelo.Cliente;

import org.springframework.stereotype.Component;

@Component
public class clienterepository {
    
    public List<Cliente> clientes;

    public List<Cliente> todososclientes()
    {
        return clientes;
    }

    public Cliente getclientecodigo(int codigo)
    {
        for(Cliente aux: clientes){
            if(aux.getCodigo()== codigo)
            return aux;
        }
        return null;
    }
    public Cliente save(Cliente cliente){
        cliente.setCodigo(clientes.size() + 1);
        clientes.add(cliente);
        return cliente;
    }
    public void RemoverCliente(Cliente cliente)
    {
          clientes.remove(cliente);

    }

	public Cliente updatecCliente(Cliente cliente) {
        Cliente aux = getclientecodigo(cliente.getCodigo());
        if(aux != null)
        aux.setEndereço(cliente.getEndereço());
        aux.setNome(cliente.getNome());
		return aux;
	}

	public Cliente getCarroscodigo(int codigo) {
		return null;
	}

	public void RemoverCarros(Cliente c) {
	}
}
