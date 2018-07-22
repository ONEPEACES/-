package behavioural_pattern.command;

import java.util.ArrayList;

public class FBSettingWindow {
    private String title;
    private ArrayList<FunctionButton> buttons = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton button) {
        buttons.add(button);
    }

    public void removeFunctionButton(FunctionButton button) {
        buttons.remove(button);
    }

    //显示窗口及功能键
    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (Object obj : buttons) {
            System.out.println(((FunctionButton) obj).getName());
        }
        System.out.println("------------------------------");
    }
}
