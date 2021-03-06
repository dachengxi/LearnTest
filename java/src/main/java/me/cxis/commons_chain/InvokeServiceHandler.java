package me.cxis.commons_chain;

public class InvokeServiceHandler extends AbstractCommand {

    @Override
    public boolean execute(CommonContext context) {
        System.out.println("InvokeServiceHandler...");
        String request = String.valueOf(context.get("request"));

        String result = "result for request: " + request;
        context.put("result", result);
        return false;
    }
}
