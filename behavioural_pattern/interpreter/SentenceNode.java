package behavioural_pattern.interpreter;

public class SentenceNode extends AbstractNode {
    private AbstractNode actionNode;
    private AbstractNode distanceNode;
    private AbstractNode directionNode;

    public SentenceNode(AbstractNode directionNode, AbstractNode actionNode, AbstractNode distanceNode) {
        this.actionNode = actionNode;
        this.distanceNode = distanceNode;
        this.directionNode = directionNode;
    }

    @Override
    public String interpret() {
        return directionNode.interpret() + actionNode.interpret() + distanceNode.interpret();
    }
}
