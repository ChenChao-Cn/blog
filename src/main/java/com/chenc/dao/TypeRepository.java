package com.chenc.dao;

import com.chenc.entity.Type;
import org.hibernate.sql.Select;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author Chenc
 * @Date 2020/11/26
 * @Description AUTO
 * @Version 1.0
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);

    @Query("select t from Type t" )
    List<Type> findTop(Pageable pageable);
}
