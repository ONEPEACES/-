package creational_pattern.builder;

/**
 *@author Xue
 *@date 2018/7/16 16:52
 *@description  指挥者，指挥建造者的创建部分产品的规则
 */
public class Director {
    public Product construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
