package es.gastosApi.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import comun.Gasto;
import comun.GastoImpl;
import es.gastosApi.entidades.GastoConId;

public interface GastoDAO extends JpaRepository<GastoConId, Long> {

}
