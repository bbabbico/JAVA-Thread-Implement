package ThreadFactory_Implement;

import java.util.concurrent.ThreadFactory;

public class PlatformThreadFactory implements ThreadFactory {


    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }
}
