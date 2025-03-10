package daos;

public interface DAOInterface<T>{
    public T findById(int id);
    public T[] findAll();
    public T update(T t);
    public T create(T t);
    public void delete(int id);
}
