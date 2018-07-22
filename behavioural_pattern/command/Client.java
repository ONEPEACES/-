package behavioural_pattern.command;

public class Client {
    public static void main(String[] args) {
        FBSettingWindow window = new FBSettingWindow("窗口");
        FunctionButton button1 = new FunctionButton("按键1");
        FunctionButton button2 = new FunctionButton("按键2");
        window.addFunctionButton(button1);
        window.addFunctionButton(button2);

        button1.setCommand(new WindowCommand());
        button2.setCommand(new HelpCommand());

        window.display();
        button1.onClick();
        button2.onClick();
        // 如果需要新增功能键实现自动截屏功能
        // 只需要对应新增一个新的具体命令类，在该命令类与屏幕处理者之间创建一个关联关系
        // 符合开闭原则
        // 每一个具体命令类对应一个请求的处理者，通过向请求发送者注入不同的具体命令对象
        // 可以使得相同的发送者对应不同的接收者，从而实现“将一个请求封装为一个对象，用不同的请求对客户进行参数化”
        // 客户只需要将具体的命令作为参数注入请求发送者，无需直接操作请求的接收者

    }
}
