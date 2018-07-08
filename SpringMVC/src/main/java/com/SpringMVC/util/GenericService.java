package com.SpringMVC.util;

import com.SpringMVC.entities.Entity;
import org.neo4j.ogm.session.Session;

import java.util.Collection;

public abstract class GenericService <T> implements Service<T> {
    private static final int DEPTH_LIST = 0;
    private static final int DEPTH_ENTITY = 1;
    protected Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();

    public Collection<T> findAll() {
        return session.loadAll(getEntityType(), DEPTH_LIST);
    }

    public T find(long i) {
        return session.load(getEntityType(), i, DEPTH_ENTITY);
    }

    public void delete(long id) {
        session.delete(session.load(getEntityType(), id));
    }

    public T createOrUpdate(T entity) {
        session.save(entity, DEPTH_ENTITY);
        return find(((Entity)entity).getId());
    }

    protected abstract Class<T> getEntityType();

    public Session getSession() {
        return session;
    }

}
