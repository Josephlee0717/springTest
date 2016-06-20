package joe.levante.dao;

import joe.levante.model.transfer;

public interface transferMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(transfer record);

    int insertSelective(transfer record);

    transfer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(transfer record);

    int updateByPrimaryKey(transfer record);
}