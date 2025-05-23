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
       if(isNew(resident)){
           saveNew(resident);
       }
       else {
           update(resident);
       }
        return resident;
    }

    private void saveNew(Resident resident) {
        resident.setId(generateId());
        residents.add(resident);
    }

    private boolean isNew(Resident resident) {
        return resident.getId() == 0;

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
    public Object[] findAll() {
        return residents.toArray();
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

    private void update(Resident resident){
        for(int count = 0; count < residents.size(); count++){
            if(residents.get(count).getId() == resident.getId()){
                residents.set(count, resident);
            }
        }
    }


}
