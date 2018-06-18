# 创建型模式
创建型模式(creational pattern)通过对类的实例的创建进行抽象，将对象的创建和使用分离开来，即业务用户无需知道实例的具体创建过程或创建时机，通常只需要知道这类对象的共同接口即可。

创建型模式隐藏了类的实例的创建细节，通过隐藏对象如何被创建和组合在一起让系统达到独立的目的。

业务用户通过创建型模式构造对象，通常都不是直接`new Object()`，而是用给定的类进行对象的获取。

- [简单工厂模式(Simple Factory)](simple_factory)
- [工厂方法模式(Factory Method)](factory_method)
- [抽象工厂模式(Abstract Factory)](abstract_factory)
- [建造者模式(Builder)](builder)
- [原型模式(Prototype)](prototype)
- [单例模式](singleton)

