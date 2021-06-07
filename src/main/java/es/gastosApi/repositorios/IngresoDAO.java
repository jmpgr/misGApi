package es.gastosApi.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import comun.Ingreso;
import comun.IngresoImpl;
import es.gastosApi.entidades.IngresoConId;

public interface IngresoDAO extends JpaRepository<IngresoConId, Long> {

}
