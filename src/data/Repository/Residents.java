package data.Repository;

import data.models.Resident;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Residents implements ResidentRepository{
    private List<Resident> residents = new ArrayList<>();
    private int countId;
    Resident resident = new Resident();
    @Override
    public Resident save(Resident resident) {

        resident.setId(generateId());
        residents.add(resident);
        return resident;
    }

    private void saveNew() {

    }

    private int generateId() {
        return ++countId;
    }

    @Override
    public Optional<Resident> findById(int id) {
        for (Resident resident : residents) {
            if (resident.getId() == id) {
                return Optional.of(resident);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Resident> findAll() {
        return List.of(resident).stream().toList();
    }

    @Override
    public void deleteById(int id) {
        residents.removeIf(resident -> resident.getId() == id);

    }

    @Override
    public Optional<Resident> findByFullName(String fullName) {
        for(Resident resident : residents) {
            if(resident.getFullName().equals(fullName)) {
                return Optional.of(resident);
            }
        }
        return Optional.empty();
    }

    @Override
    public void deleteAll() {
        residents.clear();

    }

    @Override
    public Long count() {
        return (long) residents.size();
    }


}
