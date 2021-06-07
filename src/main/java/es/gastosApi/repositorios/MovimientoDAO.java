package es.gastosApi.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import comun.Movimiento;
import comun.MovimientoImpl;
import es.gastosApi.entidades.MovimientoConId;

public interface MovimientoDAO extends JpaRepository<MovimientoConId, Long>{

}
