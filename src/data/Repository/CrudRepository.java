package data.Repository;

public interface CrudRepository <T, Long> {
    public T save(T t);
    public void delete(T entity);
    void deleteAll();
    void deleteById(Long id);
    public T findByCode(String code);

}
