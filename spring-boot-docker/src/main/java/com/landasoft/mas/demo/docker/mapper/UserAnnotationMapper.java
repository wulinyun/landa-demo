package com.landasoft.mas.demo.docker.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.landasoft.mas.demo.docker.model.vo.UserOriginImage;

/**
 * 用户信息操作AnnotationMapper接口
 * @author wulinyun
 * @version 2017年9月8日下午1:29:46
 */
@Mapper
public interface UserAnnotationMapper {
	@Select("select id,type,userId,imageId,createTime,updateTime from user_face_image where userId=#{userId}")
	public List<UserOriginImage> findUserOriginImageByUserId(@Param("userId") String userId);
	@Select("select id,type,userId,imageId,createTime,updateTime from user_face_image where userId=#{map.userId}")
	public List<UserOriginImage> findUserOriginImageByMapUserId(@Param("map") Map<String, Object> map);
	
}
