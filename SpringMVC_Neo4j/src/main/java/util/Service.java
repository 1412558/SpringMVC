package util;

import java.util.Collection;

public interface Service <T>{
    Collection<T> findAll();

    T find(long id);

    void delete(long id);

    T createOrUpdate(T Object);
}
