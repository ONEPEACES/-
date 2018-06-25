# 创建型模式(creational pattern)
创建型模式通过对类的实例的创建进行抽象，将对象的创建和使用分离开来，即业务用户无需知道实例的具体创建过程或创建时机，通常只需要知道这类对象的共同接口即可。

创建型模式隐藏了类的实例的创建细节，通过隐藏对象如何被创建和组合在一起让系统达到独立的目的。

业务用户通过创建型模式构造对象，通常都不是直接`new Object()`，而是用给定的类进行对象的获取。

- [简单工厂模式(Simple Factory)](simple_factory/simple-factory.md)
- [工厂方法模式(Factory Method)](factory_method/factory-method.md)
- [抽象工厂模式(Abstract Factory)](abstract_factory/abstract-factory.md)
- [建造者模式(Builder)](builder/builder.md)
- [原型模式(Prototype)](prototype/prototype.md)
- [单例模式(Singleton)](singleton/singleton.md)

## 类创建模式与对象创建模式的区分
- 类创建模式：必须继承超类不够灵活
    - 继承，静态
- 对象创建模式：当要修改一个类的行为时不够灵活
    - 组合，动态
- 比如说工厂方法模式和抽象工厂模式，工厂方法模式通过继承抽象工厂，并实现其给定的一个产品等级结构生产唯一的产品对象，是类创建模式；抽象工厂模式提供的抽象工厂父类提供了多个产品等级结构给子类，一个具体的工厂比如说海尔集团旗下的一个工厂可以生产海尔电视机、海尔电冰箱，两者同属于一个产品族，当想要在该工厂生产空调，必须要在抽象工厂类中额外添加一个产品等级结构(即空调这个结构)，并且还要在子类工厂中实现这个抽象方法，这违背了开闭原则

