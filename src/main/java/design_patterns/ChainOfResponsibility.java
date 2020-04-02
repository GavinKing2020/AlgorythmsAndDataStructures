package design_patterns;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageAddExclamationMarkHandler(
                                        new MessageVerifyHandler(
                                        new MessagePrintHandler(null)));
        messageHandler.handle("hello world");

    }
}

abstract class MessageHandler {
    MessageHandler messageHandler;

    public MessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    abstract void handle (String message);

}


class MessagePrintHandler extends MessageHandler{

    public MessagePrintHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String message) {
        System.out.println(message);
    }
}

class MessageVerifyHandler extends MessageHandler{

    public MessageVerifyHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String message) {
        System.out.println(message);
        if (!message.matches(".*\\d.*")) {
            messageHandler.handle(message);
        }
    }
}

class MessageAddExclamationMarkHandler extends MessageHandler{

    public MessageAddExclamationMarkHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String message) {
        System.out.println(message);
            messageHandler.handle(message + " !");
    }
}