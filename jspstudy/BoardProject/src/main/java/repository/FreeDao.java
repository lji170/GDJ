package repository;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.Free;

public class FreeDao {

private SqlSessionFactory factory;
	
	
	private static FreeDao dao = new FreeDao();
	private FreeDao() {
		try {
			
			String resource = "mybatis/config/mybatis-config.xml";
			InputStream in = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static FreeDao getInstance() {
		return dao;
	}
	
	
	
	public List<Free> selectAllFrees(){
		SqlSession ss = factory.openSession();  
		List<Free> frees = ss.selectList("mybatis.mapper.free.selectAllFrees");  
		ss.close();  
		return frees;
	}
	
	
	public Free selectFreeByNo(int freeNo) {
		SqlSession ss = factory.openSession();
		Free free = ss.selectOne("mybatis.mapper.free.selectFreeByNo", freeNo);  
		ss.close();
		return free;
	}
	
	
	public int insertFree(Free free) {
		SqlSession ss = factory.openSession(false);	
		int result = ss.insert("mybatis.mapper.free.insertFree", free);	
		if(result > 0) { 
			ss.commit();
		}
		ss.close();
		return result;
	}
	
	
	public int deleteFree(int freeNo) {
		SqlSession ss = factory.openSession(false);	
		int result = ss.delete("mybatis.mapper.free.deleteFree", freeNo);
		if(result > 0) {
			ss.commit();
		}
		ss.close();
		return result;
	}
	
	
	public int updateFree(Free free) {
		SqlSession ss = factory.openSession(false);	
		int result = ss.update("mybatis.mapper.free.updatefree", free);
		if(result > 0) {
			ss.commit();
		}
		ss.close();
		return result;
}
	}