package behavioural_pattern.mediator;

/**
 *@author Xue
 *@date 2018/7/21 9:08
 *@description  列表框类
 */
public class List extends Component{
    @Override
    public void update() {
        System.out.println("列表框增加一项：张无忌");
    }

    public void select(){
        System.out.println("列表框选中一项：小龙女");
    }
}
