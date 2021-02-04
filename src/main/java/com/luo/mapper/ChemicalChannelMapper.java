package com.luo.mapper;

import com.luo.entity.ChemicalChannel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;

/**
 * <p>
 * 危化管道 Mapper 接口
 * </p>
 *
 * @author 大哥桦
 * @since 2020-11-25
 */
@Mapper
public interface ChemicalChannelMapper extends BaseMapper<ChemicalChannel> {

    //根据id查询
    @Select("SELECT *FROM tb_chemical_channel where id = #{id}")
    public ChemicalChannel getChemicalChannelByID(Integer id);

    //根据id修改
    @Update("UPDATE tb_chemical_channel SET channelNumber= #{channelNumber},channelLocation = #{channelLocation} where id = #{id}")
    public void updateChemicalChannel(ChemicalChannel chemicalChannel);

    //根据id删除
    @Delete("DELETE FROM tb_chemical_channel where id = #{id}")
    public void deleteChemicalChannelByID(Integer id);

    //保存一个员工
    @Insert("INSERT INFO tb_chemical_channel(channelNumber,channelLocation) VALUES(#{channelNumber},#{channelLocation})")
    public void insertChemicalChannel(ChemicalChannel chemicalChannel);
}
