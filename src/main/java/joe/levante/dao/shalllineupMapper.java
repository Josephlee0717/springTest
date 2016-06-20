package joe.levante.dao;

import joe.levante.model.shalllineup;

public interface shalllineupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(shalllineup record);

    int insertSelective(shalllineup record);

    shalllineup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(shalllineup record);

    int updateByPrimaryKey(shalllineup record);
}