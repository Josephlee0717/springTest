package joe.levante.dao;

import joe.levante.model.manager;

public interface managerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(manager record);

    int insertSelective(manager record);

    manager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(manager record);

    int updateByPrimaryKey(manager record);
}