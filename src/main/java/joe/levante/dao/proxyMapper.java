package joe.levante.dao;

import joe.levante.model.proxy;

public interface proxyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(proxy record);

    int insertSelective(proxy record);

    proxy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(proxy record);

    int updateByPrimaryKey(proxy record);
}