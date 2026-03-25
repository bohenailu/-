package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import java.io.IOException;

@Configuration
public class AutoRunWeb {
    // 这里是注入你yml配置的端口号
    @Value("${server.port}")
    private String appPort;

    /**
     * 监听事件（当项目启动后），启动浏览器
     */
    @EventListener({ApplicationReadyEvent.class})
    void applicationReadyEvent() {
        System.out.println("应用已经准备就绪 ... 启动浏览器");

        // 前台页面的URL
        String frontUrl = "http://localhost:" + appPort + "/gerenlicai/front/index.html";
        // 后台页面的URL
        String adminUrl = "http://localhost:" + appPort + "/gerenlicai/admin/dist/index.html";

        Runtime runtime = Runtime.getRuntime();
        try {
            // 同时打开前台和后台页面
            runtime.exec("rundll32 url.dll,FileProtocolHandler " + frontUrl);
            Thread.sleep(1000); // 添加短暂延迟，避免同时打开浏览器时出现冲突
            runtime.exec("rundll32 url.dll,FileProtocolHandler " + adminUrl);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}