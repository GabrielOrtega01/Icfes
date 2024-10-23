package com.mongodbicfesgabo.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mongodbicfesgabo.app.entity.Estudiante;

public interface EstudianteRepository extends MongoRepository<Estudiante, String> {
	@Query("SELECT e FROM Estudiante e ORDER BY e.puntaje DESC") // Cambia 'puntaje' al nombre correcto del campo que guarda la puntuación
    List<Estudiante> findTop3ByOrderByPuntajeDesc();

}
