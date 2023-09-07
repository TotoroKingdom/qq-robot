package com.totoro.listener;

import net.itbaima.robot.event.RobotListener;
import net.itbaima.robot.event.RobotListenerHandler;
import net.itbaima.robot.listener.MessageListener;
import net.mamoe.mirai.event.events.GroupMessageEvent;

import java.util.List;

/**
 * @author: totoro
 * @createDate: 2023 09 07 13 29
 * @description:
 **/
@RobotListener
public class GroupListener extends MessageListener {

    public GroupListener(){
        super(List.of("原神","OP"),true);
    }

    @RobotListenerHandler(contactId = 920554695)
    public void groupHandler(GroupMessageEvent event){
        String message = event.getMessage().contentToString();
        if (this.invalidText(message)){
            System.out.printf("检测到违禁词");
            event.getSender().mute(60);
        }
    }
}
