package com.luo.controller;


import com.luo.entity.ChemicalChannel;
import com.luo.service.impl.ChemicalChannelServiceImpl;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 危化管道 前端控制器
 * </p>
 *
 * @author 大哥桦
 * @since 2020-11-25
 */
@RestController
@RequestMapping("/chemicalchannel")
public class ChemicalChannelController {

    @Autowired
    ChemicalChannelServiceImpl chemicalChannelServiceImpl;

    @GetMapping("/{id}")
    @ResponseBody
    public ChemicalChannel getChemicalChannel(@PathVariable("id") Integer id){
        ChemicalChannel chemicalChannel = chemicalChannelServiceImpl.getChemicalChannel(id);
        return chemicalChannel;


    }

}

