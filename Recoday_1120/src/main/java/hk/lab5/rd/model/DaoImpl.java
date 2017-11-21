package hk.lab5.rd.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import hk.lab5.rd.dtos.PageDto;

@Repository
public class DaoImpl implements IDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String NAMASPACE = "hk.lab5.rd.";
	
	@Override
	public List<PageDto> selectPageList() {
		
		return sqlSession.selectList(NAMASPACE+"selectPageList");
	}

	
}
