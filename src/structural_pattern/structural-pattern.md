# 结构型模式
结构型模式描述如何将类或者对象结合在一起形成更大的结构，就像搭积木，可以通过简单积木的组合形式形成更为复杂、功能更为强大的结构。
结构型模式仍然可以分为类结构模式和对象结构模式：

- 类结构型模式关心类的组合，由多个类可以组合成更大的一个系统，在类结构模式中一般只存在继承关系和实现关系
- 对象结构型模式关心类与对象的组合，通过**关联关系**使得在一个类中定义另一个类的实例对象，然后通过该对象调用其方法。根据“合成复用原则”，在系统中尽量使用关联关系来替代继承关系，因此大部分结构型模式都是对象结构型模式

包含模式
- [适配器模式(Adapter)](./adapter/adapter.md)
- [桥接模式(Bridge)](./bridge/bridge.md)
- [组合模式(Composite)](./composite/composite.md)
- [装饰模式(Decorator)](decorator/decorator.md)
- [外观模式(Facade)](facade/facade.md)
- [享元模式(Flyweight)](flyweight/flyweight.md)
- [代理模式(Proxy)](proxy/proxy.md)

