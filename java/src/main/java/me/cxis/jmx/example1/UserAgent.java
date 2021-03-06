package me.cxis.jmx.example1;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class UserAgent {

    public static void main(String[] args) throws NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, MalformedObjectNameException {
        // 获取MBeanServer，作为MBean的容器
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        // 域名:name=MBean名称，域名和MBean名可以任意
        ObjectName name = new ObjectName("jmxBean:name=user");
        // 注册到MBeanServer中
        mBeanServer.registerMBean(new User(), name);

        while (true) {

        }
    }
}
