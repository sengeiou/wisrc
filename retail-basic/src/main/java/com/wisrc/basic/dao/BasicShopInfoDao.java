package com.wisrc.basic.dao;


import com.wisrc.basic.dao.sql.BasicShopSQL;
import com.wisrc.basic.entity.BasicShopDetailsInfoEntity;
import com.wisrc.basic.entity.BasicShopInfoEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BasicShopInfoDao {

    @SelectProvider(type = BasicShopSQL.class, method = "search")
    List<BasicShopDetailsInfoEntity> search(@Param("platformName") String platformName,
                                            @Param("shopId") String shopId,
                                            @Param("shopName") String shopName,
                                            @Param("statusCd") String statusCd);

    @Select("select shop_id,plat_id,shop_name,shop_owner_id,security_key,aws_access_key,status_cd,modify_user,modify_time from basic_shop_info")
    List<BasicShopInfoEntity> findAll();

    @Select("select shop_id,plat_id,shop_name,shop_owner_id,security_key,aws_access_key,status_cd,modify_user,modify_time from basic_shop_info where shop_id = #{shopId}")
    BasicShopInfoEntity findById(String shopId);

    @Update("update basic_shop_info set status_cd = #{statusCd} where shop_id = #{shopId}")
    void changeStatus(@Param("shopId") String shopId, @Param("statusCd") int statusCd);

    @Update("update basic_shop_info set plat_id = #{platId}, shop_name = #{shopName}, shop_owner_id = #{shopOwnerId}, security_key = #{securityKey}, aws_access_key = #{awsAccessKey}, status_cd = #{statusCd}, modify_user = #{modifyUser}, modify_time = #{modifyTime} where shop_id = #{shopId}")
    void update(BasicShopInfoEntity ele);

    @Delete("delete from basic_shop_info where shop_id = #{shopId}")
    void delete(String shopId);

    @Insert("insert into basic_shop_info(shop_id,plat_id,shop_name,shop_owner_id,security_key,aws_access_key,status_cd,modify_user,modify_time) values(#{shopId},#{platId},#{shopName},#{shopOwnerId},#{securityKey},#{awsAccessKey},#{statusCd},#{modifyUser},#{modifyTime})")
    void add(BasicShopInfoEntity ele);

}