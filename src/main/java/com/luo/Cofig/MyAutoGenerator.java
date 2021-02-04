package com.luo.Cofig;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyAutoGenerator {
       @Autowired
       MybatisPlusAutoGenerator mybatisPlusAutoGenerator;

       public void autoGenerator(){

              //1、全局配置
              AutoGenerator mpg = new AutoGenerator();
              GlobalConfig gc = new GlobalConfig();
              final String projectPath = System.getProperty("user.dir");//用户目录
              gc.setOutputDir(projectPath + "/src/main/java");    //输出目录
              gc.setAuthor("大哥桦");//作者名称
              gc.setOpen(false);//生成文件后是否打开资源管理器
              gc.setFileOverride(true);//是否覆盖
              gc.setServiceName("%sService");//去掉接口前面的字母I
              gc.setIdType(IdType.AUTO);//设置主键自增策略
              gc.setDateType(DateType.ONLY_DATE);//设置日期
//              gc.setEnableCache(false);// XML 二级缓存
              gc.setBaseResultMap(true);// XML ResultMap
              gc.setBaseColumnList(false);// XML columList
              //集成Swagger2
//              gc.setSwagger2(true);//实体属性Swagger2注解
              mpg.setGlobalConfig(gc);


              //2、数据源配置
              DataSourceConfig dsc = new DataSourceConfig();
              dsc.setUrl(mybatisPlusAutoGenerator.getUrl());
              dsc.setDriverName(mybatisPlusAutoGenerator.getDriver());
              dsc.setUsername(mybatisPlusAutoGenerator.getUsername());
              dsc.setPassword(mybatisPlusAutoGenerator.getPassword());
              dsc.setDbType(DbType.MYSQL);
              mpg.setDataSource(dsc);

              //3、自动生成包配置
              PackageConfig packageConfig = new PackageConfig();
              packageConfig.setParent("com.luo"); //这些生成的包放在哪个包下
              packageConfig.setController("controller");
              packageConfig.setService("service");
              packageConfig.setMapper("mapper");
              packageConfig.setEntity("entity");
              mpg.setPackageInfo(packageConfig);

              //4、策略配置(主要修改配置)password
              StrategyConfig strategy = new StrategyConfig();
              strategy.setInclude("user11");//需要生成的表,可以使用正则表达式
              strategy.setNaming(NamingStrategy.underline_to_camel);//下划线转驼峰
              strategy.setColumnNaming(NamingStrategy.underline_to_camel);//字段生成驼峰
//              strategy.setTablePrefix(mybatisPlusAutoGenerator.getPrefix());//不生成表的前缀
              strategy.setEntityLombokModel(true);//生成lombok
//              strategy.setEntityBuilderModel(true);
//              strategy.setEntityBooleanColumnRemoveIsPrefix(true);//去除Boolean前面的Is前缀

              //4、配置乐观锁或者自动填充，这里只配置了乐观锁
              strategy.setVersionFieldName("version");//乐观锁
              strategy.setRestControllerStyle(true);//开启RestController风格
              strategy.setControllerMappingHyphenStyle(true);//url驼峰命名转换
              mpg.setStrategy(strategy);

              //总执行
              mpg.execute();

       }




}