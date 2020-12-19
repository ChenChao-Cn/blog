package com.chenc.dao;

import com.chenc.entity.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author Chenc
 * @Date 2020/12/13
 * @Description AUTO
 * @Version 1.0
 */
public interface CommentRepository extends JpaRepository<Comment,Long> {


    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
