package design.hustlelikeaboss.customr.models.data;

import design.hustlelikeaboss.customr.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by quanjin on 7/20/17.
 */
@Repository
@Transactional
public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByRole(String role);
}
