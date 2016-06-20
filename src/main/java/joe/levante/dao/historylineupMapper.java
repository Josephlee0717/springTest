package joe.levante.dao;

import joe.levante.model.historylineup;

public interface historylineupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(historylineup record);

    int insertSelective(historylineup record);

    historylineup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(historylineup record);

    int updateByPrimaryKey(historylineup record);
}