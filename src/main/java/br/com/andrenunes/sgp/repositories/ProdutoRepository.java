package br.com.andrenunes.sgp.repositories;

import br.com.andrenunes.sgp.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
