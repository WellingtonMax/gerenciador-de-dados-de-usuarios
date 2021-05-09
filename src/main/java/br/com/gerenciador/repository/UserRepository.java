package br.com.gerenciador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gerenciador.entity.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario,Long>{

}
