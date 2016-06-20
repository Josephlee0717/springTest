package joe.levante.dao;

import joe.levante.model.lineup;

public interface lineupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(lineup record);

    int insertSelective(lineup record);

    lineup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(lineup record);

    int updateByPrimaryKey(lineup record);
}