package behavioural_pattern.mediator;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        //定义同事类（要交互的）
        Button button = new Button();
        List list = new List();
        ComboBox box = new ComboBox();
        TextBox textBox = new TextBox();

        //同事类添加相同中介者
        button.setMediator(mediator);
        list.setMediator(mediator);
        box.setMediator(mediator);
        textBox.setMediator(mediator);

        //中介者维持对多个同事的引用
        mediator.setButton(button).setComboBox(box).setList(list).setTextBox(textBox);

        //通过button调用同事的方法
        //统一通过mediator进行交互
        button.changed();
        System.out.println("----------------------");
        list.changed();
        box.changed();

    }
}
