package com.chenc.service;

import com.chenc.entity.Tag;
import com.chenc.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author Chenc
 * @Date 2020/11/27
 * @Description AUTO
 * @Version 1.0
 */
public interface TagService {

    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTag(String ids);

    Tag updateTag(Long id,Tag tag);

    void deleteTag(Long id);

    List<Tag> listTagTop(Integer size);
}
