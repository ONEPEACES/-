package behavioural_pattern.mediator;

public class ConcreteMediator extends Mediator {

    private Button button;
    private List list;
    private ComboBox comboBox;
    private TextBox textBox;

    @Override
    public void componentChanged(Component c) {
        // 单击按钮
        if (c instanceof Button) {
            System.out.println("--单击增加按钮--");
            list.update();
            comboBox.update();
            textBox.update();
        } else if (c instanceof List) {
            System.out.println("--从列表框选择客户--");
            comboBox.select();
            textBox.setText();
        } else if (c instanceof ComboBox) {
            System.out.println("--从组合框选择客户--");
            comboBox.select();
            textBox.setText();
        }
    }


    public ConcreteMediator setButton(Button button) {
        this.button = button;
        return this;
    }

    public ConcreteMediator setList(List list) {
        this.list = list;
        return this;
    }

    public ConcreteMediator setComboBox(ComboBox comboBox) {
        this.comboBox = comboBox;
        return this;
    }

    public ConcreteMediator setTextBox(TextBox textBox) {
        this.textBox = textBox;
        return this;
    }
}
