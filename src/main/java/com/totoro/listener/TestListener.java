//package com.totoro.listener;
//
//import net.itbaima.robot.event.RobotListener;
//import net.itbaima.robot.event.RobotListenerHandler;
//import net.mamoe.mirai.contact.Friend;
//import net.mamoe.mirai.event.events.FriendMessageEvent;
//
///**
// * @author: totoro
// * @createDate: 2023 09 07 13 07
// * @description:
// **/
//@RobotListener
//public class TestListener {
//    @RobotListenerHandler(order = 1,concurrency = true)
//    public void handleMessage(FriendMessageEvent event){
//        String message = event.getMessage().contentToString();
//        System.out.println(message);
//    }
//
//    @RobotListenerHandler(order = 2,concurrency = true)
//    public void handleMessage2(FriendMessageEvent event){
//        String message = event.getMessage().contentToString();
//        Friend sender = event.getSender();
//        sender.sendMessage("哈哈哈");
//    }
//}
