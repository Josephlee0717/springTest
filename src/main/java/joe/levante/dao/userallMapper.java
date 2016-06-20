package joe.levante.dao;

import joe.levante.model.userall;

public interface userallMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(userall record);

    int insertSelective(userall record);

    userall selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(userall record);

    int updateByPrimaryKey(userall record);
}