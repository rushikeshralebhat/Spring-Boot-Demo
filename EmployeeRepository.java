package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.EmployeeEntity;
 
@Repository
public interface EmployeeRepository 
        extends JpaRepository<EmployeeEntity, Long> {
 
}