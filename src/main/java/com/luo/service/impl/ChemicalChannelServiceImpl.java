package com.luo.service.impl;

import com.luo.entity.ChemicalChannel;
import com.luo.mapper.ChemicalChannelMapper;
import com.luo.service.ChemicalChannelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 危化管道 服务实现类
 * </p>
 *
 * @author 大哥桦
 * @since 2020-11-25
 */
@Service
public class ChemicalChannelServiceImpl extends ServiceImpl<ChemicalChannelMapper, ChemicalChannel> implements ChemicalChannelService {

    @Autowired
    ChemicalChannelMapper chemicalChannelMapper;

    public ChemicalChannel getChemicalChannel(Integer id){
        System.out.println("查询"+id+"员工");
        ChemicalChannel cc = chemicalChannelMapper.getChemicalChannelByID(id);
        return cc;
    };

}
