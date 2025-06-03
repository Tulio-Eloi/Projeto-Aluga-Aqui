// package com.alugaaqui.aluga_aqui.service;

// import java.util.List;
// import java.util.Optional;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import com.alugaaqui.aluga_aqui.model.ClientesModel;
// import com.alugaaqui.aluga_aqui.repositories.ClientesRepositories;
// import jakarta.persistence.EntityNotFoundException;

// @Service
// public class ClienteServices {

//     @Autowired
//     private ClientesRepositories clienteRepositories;
   

//     public ClientesModel salvarCliente(ClientesModel cliente) {

//         // Validação de CPF único
//        /* if (cliente.getCpf_clientes() != null && clienteRepositories.findByCpf(cliente.getCpf_clientes()).isPresent()) {
//             throw new IllegalArgumentException("CPF já cadastrado: " + cliente.getCpf_clientes());
//         }

//         //Validar email único
//         if (cliente.getEmail() != null && clienteRepositories.findByEmail(cliente.getEmail()).isPresent()) {
//             throw new IllegalArgumentException("Email já cadastrado: " + cliente.getEmail());
//         }*/
        

//         return clienteRepositories.save(cliente);
//     }


    
//     public List<ClientesModel> listarTodosClientes() {
//         return clienteRepositories.findAll();
//     }


    
//     public Optional<ClientesModel> buscarClientePorId(Long id) {
//         return clienteRepositories.findById(id);
//     }

  
//     /*public List<ClientesModel> buscarClientesPorNome(String nomeParcial) {
//         if (nomeParcial == null || nomeParcial.trim().isEmpty()) {
//             return List.of();
//         }
//         return clienteRepositories.findByNomeCompletoContainingIgnoreCase(nomeParcial);
//     }*/




//                 clienteExistente.setNome_completo(clienteAtualizado.getNome_completo());
//                 // clienteExistente.setDataNascimento(clienteAtualizado.getDataNascimento());
//                 clienteExistente.setTelefone(clienteAtualizado.getTelefone());
//                 clienteExistente.setEndereco(clienteAtualizado.getEndereco());
//                 // clienteExistente.setDataValidadeCnh(clienteAtualizado.getDataValidadeCnh());

//                 return clienteRepositories.save(clienteExistente);
//     }*/



//     public void deletarCliente(Long id) {
//         if (!clienteRepositories.existsById(id)) {
//             throw new EntityNotFoundException("Cliente não encontrado com o ID: " + id);
//         }
//         clienteRepositories.deleteById(id);
//     }

//    /*  public Optional<ClientesModel> buscarClientePorCpf(String cpf) {
//         return clienteRepositories.findByCpf(cpf);
//     }

//     public Optional<ClientesModel> buscarClientePorEmail(String email) {
//         return clienteRepositories.findByEmail(email);
//     }*/


// }
