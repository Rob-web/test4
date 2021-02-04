package com.luo;

import com.luo.entity.ChemicalChannel;
import com.luo.mapper.ChemicalChannelMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTestApplicationTests {

    @Autowired
    ChemicalChannelMapper chemicalChannelMapper;

    @Autowired
    ChemicalChannel chemicalChannel;

    @Test
    void contextLoads() {
        ChemicalChannel chemicalChannelByID = chemicalChannelMapper.getChemicalChannelByID(323146);
        System.out.println(chemicalChannelByID);
    }

    @Test
    public void delete(){
        chemicalChannelMapper.deleteChemicalChannelByID(323113);
    }

    }


