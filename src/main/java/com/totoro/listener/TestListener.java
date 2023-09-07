package com.totoro.listener;

import net.itbaima.robot.event.RobotListener;
import net.itbaima.robot.event.RobotListenerHandler;
import net.mamoe.mirai.event.events.FriendMessageEvent;

/**
 * @author: totoro
 * @createDate: 2023 09 07 13 07
 * @description:
 **/
@RobotListener
public class TestListener {
    @RobotListenerHandler
    public void handleMessage(FriendMessageEvent event){
        String message = event.getMessage().contentToString();
        System.out.println(message);
    }
}
