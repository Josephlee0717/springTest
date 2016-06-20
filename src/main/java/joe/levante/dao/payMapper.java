package joe.levante.dao;

import joe.levante.model.pay;

public interface payMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(pay record);

    int insertSelective(pay record);

    pay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(pay record);

    int updateByPrimaryKey(pay record);
}