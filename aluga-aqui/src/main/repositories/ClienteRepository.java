import com.equoterapia.web.entities.Pacient;
import com.equoterapia.web.entities.enums.PacientStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Pacient, Long> {
    List<Cliente> findAllByStatus(ClienteStatus clientestatus);
}