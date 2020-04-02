package design_patterns;

public class Adapter {
    public static void main(String[] args) {
        AmericanSocket socket = new SimpleAmericanSocket();
        Radio radio = new Radio();
        EuroSocket euroSocket = new SocketAdapter(socket);
        radio.ListenMusic(euroSocket);
    }
}

interface EuroSocket {
    void getPower();
}

class SocketAdapter implements EuroSocket {

    AmericanSocket americanSocket;

    public SocketAdapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    public void getPower() {
        americanSocket.getPower();
    }
}

interface AmericanSocket {
    void getPower();
}

class SimpleAmericanSocket implements AmericanSocket {

    public void getPower() {
        System.out.println("110v");
    }
}

class Radio {
    public void ListenMusic (EuroSocket euroSocket){
        euroSocket.getPower();
    }
}

