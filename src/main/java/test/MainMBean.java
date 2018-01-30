package test;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

//import com.ntqsolution.SiteProject.config.MyInfomation;

public class MainMBean {
	public static void main(String[] args) throws Exception { 
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer(); 
        ObjectName name = new ObjectName("test:type=MyInfomation"); 
//        MyInfomation constant = new MyInfomation();
//        mbs.registerMBean(constant, name); 
        System.out.println("Waiting forever..."); 
        Thread.sleep(Long.MAX_VALUE); 
    }
}
