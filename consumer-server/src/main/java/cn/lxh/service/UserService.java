package cn.lxh.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author xihualiu
 * @date 2020/4/12 13:33
 */
@Service
public class UserService {

    @Reference
    private TicketService ticketService;

    public void getTicket() {
        String ticker = ticketService.getTicker();
        System.out.println("从注册中心拿到了" + ticker);
    }
}
