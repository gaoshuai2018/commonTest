/*
  @description: 异步任务
 * @author: gaoshuai
 * @date: 2019/5/7 9:23
 * 来源：https://www.cnblogs.com/chenmo-xpw/p/5652029.html
 */
//　最近做项目的时候遇到了一个小问题:从前台提交到服务端A,A调用服务端B处理超时,
//
// 原因是前端一次请求往db插1万数据,插完之后会去清理缓存、发送消息。
//
// 服务端的有三个操作 a、插DB b、清理cache  c、发送消息。
//
// 1万条数据,说多不多,说少不少.况且不是单单insert。出现超时现象,不足为奇了吧~~
package cn.gs.test.asyncTask;