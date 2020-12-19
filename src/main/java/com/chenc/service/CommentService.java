package com.chenc.service;

import com.chenc.entity.Comment;

import java.util.List;

/**
 * @Author Chenc
 * @Date 2020/12/13
 * @Description AUTO
 * @Version 1.0
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
