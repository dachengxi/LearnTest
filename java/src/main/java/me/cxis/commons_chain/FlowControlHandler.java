package me.cxis.commons_chain;

public class FlowControlHandler extends AbstractCommand {

    @Override
    public boolean execute(CommonContext context) {
        System.out.println("FlowControlHandler...");
        return false;
    }
}
