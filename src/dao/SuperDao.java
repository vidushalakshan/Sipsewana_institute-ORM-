package dao;

import com.sun.xml.bind.v2.model.core.ID;
import entity.SuperEntity;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface SuperDao<Entity extends SuperEntity, ID> {
    public boolean add(Entity entity) throws Exception;

    public boolean update(Entity entity) throws Exception;

    public boolean delete(ID id) throws Exception;

    public Entity find(ID id) throws Exception;

    public List<Entity> findAll() throws Exception;
}
