import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_clientes;

    @Column(nullable = false)
    private String nome_clientes;

    @Column(nullable = false)
    private String email_clientes;

    @Column(nullable = false)
    private String telefone_clientes;

    @Column(nullable = false)
    private String endereco_clientes;
    
    @Column(nullable = false)
    private String cpf_clientes;
}