package com.wayneyong.javacourse.designpattern;

/**
 * Proxy Pattern -
 * Use the proxy pattern to create a representative object
 * that controls access to other object
 * <p>
 * Types -
 * Remote Proxy - For accessing a remote object
 * Virtual Proxy - For deferred initialization
 * Protection Proxy - For secured and controlled access to the object
 */

interface StockAPI {
    String getQuote(String ticker);
}

//-----------Remote service (assume)--------
//Actual impl
class StockAPIImpl implements StockAPI {
    @Override
    public String getQuote(String ticker) {
        return "100";
    }
}

//--------------------------
class StockAPIProxy implements StockAPI {
    @Override
    public String getQuote(String ticker) {
        //make an REST API call to the webservice.....
        // Just first simulation
        StockAPIImpl impl = new StockAPIImpl();
        return impl.getQuote(ticker);
    }
}

public class ProxyPatternEx1Remote {
    public static void main(String[] args) {
        //Client
        StockAPI api = new StockAPIProxy();
        String quote = api.getQuote("someticker");
        System.out.println(quote);
    }
}
