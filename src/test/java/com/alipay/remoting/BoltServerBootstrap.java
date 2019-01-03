package com.alipay.remoting;

import com.alipay.remoting.rpc.common.BoltServer;
import com.alipay.remoting.rpc.common.SimpleServerUserProcessor;

/**
 * Created by Administrator on 2019/1/3.
 */
public class BoltServerBootstrap {

    private static BoltServer boltServer;

    public static void main(String[] args) {
        boltServer = new BoltServer(5201, true);
        boltServer.registerUserProcessor(new SimpleServerUserProcessor());
        boltServer.start();
    }

}
