package com.alipay.remoting;

import com.alipay.remoting.rpc.RpcClient;
import com.alipay.remoting.rpc.common.RequestBody;
import com.alipay.remoting.rpc.common.SimpleClientUserProcessor;

/**
 * Created by Administrator on 2019/1/3.
 */
public class BoltClientDemo {

    private static RpcClient client;
    public static void main(String[] args) throws Exception {
        client = new RpcClient();
        //client.registerUserProcessor(new SimpleClientUserProcessor());
        client.init();

        RequestBody req = new RequestBody(1, "hello world sync");
        Object o = client.invokeSync("127.0.0.1:5201", req, 5000000);
        System.out.println(o);
    }
}
