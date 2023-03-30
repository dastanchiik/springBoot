package example.springboot2.repository;

import example.springboot2.dto.request.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company,Long> {

}
