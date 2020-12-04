package com.avalicaofinal.afpoo.control;

import java.net.URI;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.avalicaofinal.afpoo.dto.ClienteDTO;
import com.avalicaofinal.afpoo.modelo.Carro;
import com.avalicaofinal.afpoo.modelo.Cliente;
import com.avalicaofinal.afpoo.repositorios.clienterepository;
import com.avalicaofinal.afpoo.repositorios.repositoriocarro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import jdk.jfr.internal.Repository;

@RestController
@RequestMapping("/clientes")
public class MyControl {

    @Autowired
    private clienterepository repositorioc;
    @Autowired
    private repositoriocarro repositorioca;
    

    @GetMapping()
    public List<Cliente> getClientes()
    {
        return repositorioc.todososclientes();
    }
    @GetMapping("/{codigo}")
    public ResponseEntity<Cliente> pegaCliente(@PathVariable int codigo)
    {
        Cliente c = repositorioc.getclientecodigo(codigo);
        if(c != null)
        {
            return ResponseEntity.ok(c);
        }
        else
           return ResponseEntity.notFound().build();
    }
    @PostMapping()
    public ResponseEntity<Cliente> salvar(@RequestBody ClienteDTO clienteDTO,  HttpServletRequest request, UriComponentsBuilder builder)
    {                                     
        
        cliente = repositorioc.save(cliente);
        
        UriComponents uriComponents = builder.path( request.getRequestURI() + "/" + cliente.getCodigo()).build()

       

        return ResponseEntity.created(u).build();


    }
    @DeleteMapping("/{codigo}")
     public ResponseEntity<Void> Removercliente(@PathVariable int codigo) 
     {
        Cliente c = repositorioc.getclientecodigo(codigo);
        if(c != null)
        {
            repositorioc.RemoverCliente(c);

            return ResponseEntity.noContent().build();
        }
        else
           return ResponseEntity.notFound().build();

        }
        @PutMapping("/{codigo}")
        public ResponseEntity<Carros> atualizar(@PathVariable int cod, @RequestBody Cliente Carros)
        {
            if(repositorioc.getclientecodigo(cod) != null)
            {
                Carros.setCodigo(cod);
                Carros = repositorioca.update(Carros);
                return ResponseEntity.ok(Carros);
            }
            return ResponseEntity.notFound().build();

        }
        @GetMapping()
        public List<Carro> getCarros()
        {
            return repositorioca.todososcarros();
        }
        @GetMapping("/{codigo}")
        public ResponseEntity<Carro> pegaCarros(@PathVariable int codigo)
        {
            Carro c = repositorioca.getcarrocodigo(codigo);

            if(c != null)
            {
                return ResponseEntity.ok(c);
            }
            else
               return ResponseEntity.notFound().build();
        }
        @PostMapping()
        public ResponseEntity<Cliente> salvar(@RequestBody ClienteDTO carroDTO,  HttpServletRequest request, UriComponentsBuilder builder)
        {                                     
            
            carro = repositorioc.save(carro);
            
            UriComponents uriComponents = builder.path( request.getRequestURI() + "/" + carro.getCodigo()).build()
    
           
    
            return ResponseEntity.created(u).build();
    
    
        }
        @DeleteMapping("/{codigo}")
         public ResponseEntity<Void> RemoverCarros(@PathVariable int codigo) 
         {
            Cliente c = repositorioc.getCarroscodigo(codigo);
            if(c != null)
            {
                repositorioc.RemoverCarros(c);
    
                return ResponseEntity.noContent().build();
            }
            else
               return ResponseEntity.notFound().build();
    
            }
            @PutMapping("/{codigo}")
            public ResponseEntity<Carro> atualizar(@PathVariable int cod, @RequestBody Carro carro)
            {
                if(repositorioc.getclientecodigo(cod) != null)
                {
                    carro.setCodigo(cod);
                    carro = repositorioca.update(carro);
                    return ResponseEntity.ok(carro);
                }
                return ResponseEntity.notFound().build();
    
            }
        @PostMapping("/{id-cliente}/veiculos/{id-veiculo}")
        public ResponseEntity Reserva(@PathVariable int cod, @RequestBody Carro carro, @RequestBody Cliente cliente)
        {
            Date datahj = new Date();
            Date diamarcado = new Date();
            GregorianCalendar c = new GregorianCalendar();

            d.toLocalDate();

            int diadedomingo = c.get(GregorianCalendar.SUNDAY);
            if(diamarcado > datahj && diamarcado != diadedomingo)
            {
                return ResponseEntity.created(location)
            }
            else
            return ResponseEntity.notFound().build();
        }

}
