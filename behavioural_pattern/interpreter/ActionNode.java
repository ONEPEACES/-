package behavioural_pattern.interpreter;

public class ActionNode extends AbstractNode {
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        if("move".equalsIgnoreCase(action)) {
            return "移动";
        }else if ("run".equalsIgnoreCase(action)){
            return "快速移动";
        }else {
            return "无效指令";
        }
    }
}
