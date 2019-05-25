package behavioural_pattern.interpreter;

import java.util.Stack;

/**
 * @author Xue
 * @date 2018/7/20 16:53
 * @description 指令处理器，用于收集指令，并向解释器发送指令
 */
public class InstructionHandler {
    private String instruction;
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;
        // 声明一个栈对象用于存储抽象语法树
        Stack<AbstractNode> stack = new Stack<>();
        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            //遇到and时则说明stack已经存入了左节点
            if ("and".equalsIgnoreCase(words[i])) {
                left = stack.pop();
                //取and右节点
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
            } else {
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        this.node = stack.pop();
    }

    public String output() {
        return node.interpret();
    }

}
