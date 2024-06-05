package repositorios;

import entidades.EntidadBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepositorio <E extends EntidadBase, ID extends Serializable> extends JpaRepository<E, ID> {
}
