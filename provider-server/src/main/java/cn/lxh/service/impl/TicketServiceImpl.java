package cn.lxh.service.impl;

import cn.lxh.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author xihualiu
 * @date 2020/4/12 13:29
 */
@Service
@Component
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicker() {
        return "liuxihua";
    }
}
