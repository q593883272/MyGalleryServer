package com.raven.gallery.data.sql.dao.pictorial;

import com.raven.gallery.data.sql.po.pictorial.PictorialPageFile;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created By Raven on 2020/2/7 14:55
 * 画报信息DAO
 */
@Repository
@org.apache.ibatis.annotations.Mapper
public interface PictorialPageFileDao extends Mapper<PictorialPageFile> {

}