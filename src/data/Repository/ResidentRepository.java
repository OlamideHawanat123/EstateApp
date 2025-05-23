package data.Repository;

import data.models.Resident;

import java.util.Optional;

public interface ResidentRepository {
    Resident save(Resident resident);
    Optional<Resident> findById(int id);
    Object[] findAll();
    void deleteById(int id);
    Optional<Resident> findByFullName(String fullName);
    void deleteAll();
    Long count();
}
