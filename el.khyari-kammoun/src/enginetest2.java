
import java.io.IOException;
import java.net.InetAddress;
import messages.engine.ConnectCallbackImpl;
import messages.engine.NioEngine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fanny
 */
public class enginetest2 {

    public static void main(String[] args) throws IOException {

        final NioEngine engine2 = new NioEngine(52002);
        engine2.connect(InetAddress.getLocalHost(), 52003, new ConnectCallbackImpl());

        engine2.mainloop();

    }
}
