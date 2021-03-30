package br.com.microservices.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.microservices.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	
}
