package me.cxis.commons_chain;

public class BlacklistHandler extends AbstractCommand {

    @Override
    public boolean execute(CommonContext context) {
        System.out.println("BlacklistHandler...");
        String request = String.valueOf(context.get("request"));
        if (request.contains("hack")) {
            context.put("error", "ip locked");
            return true;
        }
        return false;
    }
}
