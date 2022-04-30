/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.life.majiang.community.service;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import life.majiang.community.dto.NotificationDTO;
import life.majiang.community.dto.PaginationDTO;
import life.majiang.community.mapper.NotificationMapper;
import life.majiang.community.model.Notification;
import life.majiang.community.model.User;
import life.majiang.community.service.NotificationService;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NotificationService_SSTest extends NotificationService_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_read_0()  throws Throwable  {
      NotificationService notificationService0 = new NotificationService();

      //prepare data for notificationMapper0
      Notification notification0 = new Notification();
      NotificationMapper notificationMapper0 = mock(NotificationMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(notification0).when(notificationMapper0).selectByPrimaryKey(nullable(java.lang.Long.class));

      //invoke method for notificationService0
      PrivateAccess.setVariable((Class<?>) NotificationService.class, notificationService0, "notificationMapper", (Object) notificationMapper0);
      User user0 = new User();
      // Undeclared exception!
      try { 

        //invoke method for notificationService0
        notificationService0.read((Long) null, user0);
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test_read_1()  throws Throwable  {
      NotificationService notificationService0 = new NotificationService();

      //prepare data for notificationMapper0
      Integer integer0 = new Integer(0);
      Notification notification0 = new Notification();
      Long long0 = notification0.getGmtCreate();
      Notification notification1 = mock(Notification.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(notification1).getGmtCreate();
      doReturn(long0).when(notification1).getId();
      doReturn(long0).when(notification1).getNotifier();
      doReturn("1").when(notification1).getNotifierName();
      doReturn("READ_NOTIFICATION_FAIL").when(notification1).getOuterTitle();
      doReturn(long0).when(notification1).getOuterid();
      doReturn((Long) null).when(notification1).getReceiver();
      doReturn(integer0).when(notification1).getStatus();
      doReturn(integer0, integer0).when(notification1).getType();
      NotificationMapper notificationMapper0 = mock(NotificationMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(notification1).when(notificationMapper0).selectByPrimaryKey(nullable(java.lang.Long.class));
      doReturn(82).when(notificationMapper0).updateByPrimaryKey(nullable(life.majiang.community.model.Notification.class));

      //invoke method for notificationService0
      PrivateAccess.setVariable((Class<?>) NotificationService.class, notificationService0, "notificationMapper", (Object) notificationMapper0);

      //prepare data for user0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((Long) null).when(user0).getId();
      NotificationDTO notificationDTO0 = notificationService0.read((Long) null, user0);
      assertEquals(0, (int)notificationDTO0.getStatus());
  }
  @Test(timeout = 4000)
  public void test_read_2()  throws Throwable  {
      NotificationService notificationService0 = new NotificationService();

      //prepare data for notificationMapper0
      Notification notification0 = new Notification();
      NotificationMapper notificationMapper0 = mock(NotificationMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1L)).when(notificationMapper0).countByExample(nullable(life.majiang.community.model.NotificationExample.class));
      doReturn(notification0).when(notificationMapper0).selectByPrimaryKey(nullable(java.lang.Long.class));
      doReturn(2009).when(notificationMapper0).updateByPrimaryKey(nullable(life.majiang.community.model.Notification.class));

      //invoke method for notificationService0
      PrivateAccess.setVariable((Class<?>) NotificationService.class, notificationService0, "notificationMapper", (Object) notificationMapper0);
      Long long0 = new Long((-1L));

      //invoke method for notificationService0
      notificationService0.unreadCount(long0);
      User user0 = new User();
      // Undeclared exception!
      try { 

        //invoke method for notificationService0
        notificationService0.read(long0, user0);
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test_list_3()  throws Throwable  {
      NotificationService notificationService0 = new NotificationService();

      //prepare data for notificationMapper0
      ArrayList<Notification> arrayList0 = new ArrayList<Notification>();
      NotificationMapper notificationMapper0 = mock(NotificationMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(761L).when(notificationMapper0).countByExample(nullable(life.majiang.community.model.NotificationExample.class));
      doReturn(arrayList0).when(notificationMapper0).selectByExampleWithRowbounds(nullable(life.majiang.community.model.NotificationExample.class) , nullable(org.apache.ibatis.session.RowBounds.class));

      //invoke method for notificationService0
      PrivateAccess.setVariable((Class<?>) NotificationService.class, notificationService0, "notificationMapper", (Object) notificationMapper0);
      Long long0 = new Long(761L);
      Integer integer0 = new Integer((-22));
      PaginationDTO paginationDTO0 = notificationService0.list(long0, integer0, integer0);
      assertEquals((-33), (int)paginationDTO0.getPage());
      assertEquals((-33), (int)paginationDTO0.getTotalPage());
  }
  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      NotificationService notificationService0 = new NotificationService();

      //prepare data for notificationMapper0
      LinkedList<Notification> linkedList0 = new LinkedList<Notification>();
      Notification notification0 = mock(Notification.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      linkedList0.add(notification0);
      NotificationMapper notificationMapper0 = mock(NotificationMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(180L).when(notificationMapper0).countByExample(nullable(life.majiang.community.model.NotificationExample.class));
      doReturn(linkedList0).when(notificationMapper0).selectByExampleWithRowbounds(nullable(life.majiang.community.model.NotificationExample.class) , nullable(org.apache.ibatis.session.RowBounds.class));

      //invoke method for notificationService0
      PrivateAccess.setVariable((Class<?>) NotificationService.class, notificationService0, "notificationMapper", (Object) notificationMapper0);
      Long long0 = new Long(1657L);
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 

        //invoke method for notificationService0
        notificationService0.list(long0, integer0, integer0);
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test_list_5()  throws Throwable  {
      NotificationService notificationService0 = new NotificationService();

      //prepare data for notificationMapper0
      LinkedList<Notification> linkedList0 = new LinkedList<Notification>();
      Integer integer0 = new Integer(146);
      Long long0 = Long.valueOf(703L);
      Notification notification0 = mock(Notification.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(notification0).getGmtCreate();
      doReturn(long0).when(notification0).getId();
      doReturn(long0).when(notification0).getNotifier();
      doReturn("H|").when(notification0).getNotifierName();
      doReturn("1").when(notification0).getOuterTitle();
      doReturn(long0).when(notification0).getOuterid();
      doReturn(integer0).when(notification0).getStatus();
      doReturn(integer0, integer0).when(notification0).getType();
      linkedList0.add(notification0);
      NotificationMapper notificationMapper0 = mock(NotificationMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0L).when(notificationMapper0).countByExample(nullable(life.majiang.community.model.NotificationExample.class));
      doReturn(linkedList0).when(notificationMapper0).selectByExampleWithRowbounds(nullable(life.majiang.community.model.NotificationExample.class) , nullable(org.apache.ibatis.session.RowBounds.class));

      //invoke method for notificationService0
      PrivateAccess.setVariable((Class<?>) NotificationService.class, notificationService0, "notificationMapper", (Object) notificationMapper0);
      PaginationDTO paginationDTO0 = notificationService0.list(long0, integer0, integer0);
      assertEquals(0, (int)paginationDTO0.getPage());
      assertEquals(0, (int)paginationDTO0.getTotalPage());
  }
  @Test(timeout = 4000)
  public void test_list_6()  throws Throwable  {
      NotificationService notificationService0 = new NotificationService();

      //prepare data for notificationMapper0
      Vector<Notification> vector0 = new Vector<Notification>();
      Notification notification0 = new Notification();
      Integer integer0 = new Integer((-1));
      notification0.setType(integer0);
      vector0.add(notification0);
      NotificationMapper notificationMapper0 = mock(NotificationMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(2306L).when(notificationMapper0).countByExample(nullable(life.majiang.community.model.NotificationExample.class));
      doReturn(vector0).when(notificationMapper0).selectByExampleWithRowbounds(nullable(life.majiang.community.model.NotificationExample.class) , nullable(org.apache.ibatis.session.RowBounds.class));

      //invoke method for notificationService0
      PrivateAccess.setVariable((Class<?>) NotificationService.class, notificationService0, "notificationMapper", (Object) notificationMapper0);
      Long long0 = new Long(0L);
      PaginationDTO paginationDTO0 = notificationService0.list(long0, integer0, integer0);
      assertEquals((-2306), (int)paginationDTO0.getPage());
      assertEquals((-2306), (int)paginationDTO0.getTotalPage());
  }}