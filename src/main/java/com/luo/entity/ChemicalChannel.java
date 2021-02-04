package com.luo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 危化管道
 * </p>
 *
 * @author 大哥桦
 * @since 2020-11-25
 */
//-------------------------------------------
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_chemical_channel")
public class ChemicalChannel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 管线编号
     */
    private String channelNumber;

    /**
     * 管线长度（m）
     */
    private Double channelLength;

    /**
     * 管线位置
     */
    private String channelLocation;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 输送物质
     */
    private String shipment;

    /**
     * 材质
     */
    private String material;

    /**
     * 长度（m）
     */
    private Double length;

    /**
     * 宽度（mm）
     */
    private Double width;

    /**
     * 高度（mm)
     */
    private Double high;

    /**
     * 埋深（m）
     */
    private Double depth;

    /**
     * 埋设方式
     */
    private String buryingMethod;


}
