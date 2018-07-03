package InitDB;
import Model.*;
public interface Service<T> {
	Iterable<T> findAll();

    T find(Long id);

    void delete(Long id);

    T createOrUpdate(T Object);
}
