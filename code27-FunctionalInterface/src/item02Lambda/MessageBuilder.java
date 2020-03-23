package item02Lambda;

@FunctionalInterface
public interface MessageBuilder {
    //定义一个拼接信息的抽象方法，返回被拼接的信息
    public abstract String builderMessage();
}
