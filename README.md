# 设计模式
仓库内容总结[图说设计模式](http://design-patterns.readthedocs.io/zh_CN/latest/index.html)而来。

## 模式类型
- 创建型模式(Creational Pattern)
    - 类创建型
        - Factory Method
    - 对象创建型
        - Abstract Factory
        - Builder
        - Prototype
        - Singleton
- 结构型模式(Structural Pattern)
    - 类结构型模式
        - Adapter(类)
    - 对象结构型模式
        - Adapter(对象)
        - Bridge
        - Composite
        - Decorator
        - Facade
        - Flyweight
        - Proxy
- 行为型模式(Behavioral Pattern)
    - 类行为型模式
        - Interpreter
        - Template Method
    - 对象行为型模式
        - Chain of Responsibility
        - Command
        - Iterator
        - Mediator
        - Memento
        - Observer
        - State
        - Strategy
        - Visitor

## 模式的目的准则
模式依据其目的可分为创建型、结构型、行为型。创建型模式与**对象的创建有关**，结构型模式**处理类或对象的组合**，行为型模式**对类或对象怎样交互和怎么分配职责进行描述**。

## 模式范围准则
指定模式主要是用于类还是用于对象。**类模式处理类和子类之间的关系，这些关系通过继承建立，是静态的，在编译时刻便确定下来了**。**对象模式处理对象间的关系，这些关系在运行时是可以变化的，更具动态性**。从某种意义上来说，几乎所有模式都使用继承机制，所以“类模式”只指那些**集中于处理类间关系的模式**，大部分模式都属于对象模式范畴。

创建型类模式将对象的部分创建工作延迟到子类，而创建型对象模式则将它延迟到另一个对象中。结构型类模式使用继承机制来组合类，而结构型对象模式则描述了对象的组装方式。行为型类模式使用继承描述算法和控制流，而行为型对象模式则描述了一组对象怎样协作完成单个对象所无法完成的任务。











