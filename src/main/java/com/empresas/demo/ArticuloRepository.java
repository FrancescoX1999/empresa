package com.empresas.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<Articulo, Long> {
}
