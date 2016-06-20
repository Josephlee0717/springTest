package joe.levante.dao;

import joe.levante.model.transfee;

public interface transfeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(transfee record);

    int insertSelective(transfee record);

    transfee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(transfee record);

    int updateByPrimaryKey(transfee record);
}