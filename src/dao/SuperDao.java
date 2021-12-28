package dao;

import entity.SuperEntity;

import java.util.List;

public interface SuperDao<Entity extends SuperEntity, ID> {
    public boolean add(Entity entity) throws Exception;

    public boolean update(Entity entity) throws Exception;

    public boolean delete(ID id) throws Exception;

    public Entity find() throws Exception;

    public List<Entity> findAll() throws Exception;
}
