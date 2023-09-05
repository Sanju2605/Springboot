package com.example.demo.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ApiModel;

//import jakarta.transaction.Transactional;

@Repository//represents repository
public interface ApiRepo extends JpaRepository<ApiModel, Integer>{

//	@Query(value="select * from Book where id=:s or title=:sn",nativeQuery=true)
//	public List<ApiModel> getInfo(@Param("s") int id,@Param("sn") String name);
//	
//	@Modifying
//	@Transactional
//	@Query(value="delete from Book where id=:s",nativeQuery=true)
//	public int deleteInfo(@Param("s")int id);
//	
//	@Modifying
//	@Transactional
//	@Query(value = "UPDATE Book SET id = ?1 WHERE id = ?2", nativeQuery = true)
//	public int updateInfo(int newid, int oldid);
	
}