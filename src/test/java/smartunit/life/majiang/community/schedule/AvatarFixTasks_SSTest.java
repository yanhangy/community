/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.life.majiang.community.schedule;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import java.util.ArrayList;
import java.util.Stack;
import life.majiang.community.mapper.UserMapper;
import life.majiang.community.model.User;
import life.majiang.community.provider.UFileResult;
import life.majiang.community.provider.UFileService;
import life.majiang.community.schedule.AvatarFixTasks;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AvatarFixTasks_SSTest extends AvatarFixTasks_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_fixUserAvatar_0()  throws Throwable  {
      AvatarFixTasks avatarFixTasks0 = new AvatarFixTasks();

      //prepare data for userMapper0
      ArrayList<User> arrayList0 = new ArrayList<User>();
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      arrayList0.add(user0);
      UserMapper userMapper0 = mock(UserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayList0).when(userMapper0).selectByExampleWithRowbounds(nullable(life.majiang.community.model.UserExample.class) , nullable(org.apache.ibatis.session.RowBounds.class));

      //invoke method for avatarFixTasks0
      PrivateAccess.setVariable((Class<?>) AvatarFixTasks.class, avatarFixTasks0, "userMapper", (Object) userMapper0);

      //invoke method for avatarFixTasks0
      avatarFixTasks0.fixUserAvatar();
  }
  @Test(timeout = 4000)
  public void test_fixUserAvatar_1()  throws Throwable  {
      AvatarFixTasks avatarFixTasks0 = new AvatarFixTasks();

      //prepare data for userMapper0
      Stack<User> stack0 = new Stack<User>();
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("githubusercontent", ", uploadDomain=").when(user0).getAvatarUrl();
      stack0.add(user0);
      UserMapper userMapper0 = mock(UserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0).when(userMapper0).selectByExampleWithRowbounds(nullable(life.majiang.community.model.UserExample.class) , nullable(org.apache.ibatis.session.RowBounds.class));

      //prepare data for uFileService0
      UFileResult uFileResult0 = mock(UFileResult.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      UFileService uFileService0 = mock(UFileService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(uFileResult0).when(uFileService0).upload(nullable(java.lang.String.class));

      //invoke method for avatarFixTasks0
      PrivateAccess.setVariable((Class<?>) AvatarFixTasks.class, avatarFixTasks0, "uFileService", (Object) uFileService0);

      //invoke method for avatarFixTasks0
      PrivateAccess.setVariable((Class<?>) AvatarFixTasks.class, avatarFixTasks0, "userMapper", (Object) userMapper0);

      //invoke method for avatarFixTasks0
      avatarFixTasks0.fixUserAvatar();
  }
  @Test(timeout = 4000)
  public void test_fixUserAvatar_2()  throws Throwable  {
      AvatarFixTasks avatarFixTasks0 = new AvatarFixTasks();

      //prepare data for userMapper0
      Stack<User> stack0 = new Stack<User>();
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("githubusercontent", "githubusercontent").when(user0).getAvatarUrl();
      stack0.add(user0);
      UserMapper userMapper0 = mock(UserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0).when(userMapper0).selectByExampleWithRowbounds(nullable(life.majiang.community.model.UserExample.class) , nullable(org.apache.ibatis.session.RowBounds.class));

      //prepare data for uFileService0
      UFileResult uFileResult0 = mock(UFileResult.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("20").when(uFileResult0).getFileUrl();
      UFileService uFileService0 = mock(UFileService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(uFileResult0).when(uFileService0).upload(nullable(java.lang.String.class));

      //invoke method for avatarFixTasks0
      PrivateAccess.setVariable((Class<?>) AvatarFixTasks.class, avatarFixTasks0, "uFileService", (Object) uFileService0);

      //invoke method for avatarFixTasks0
      PrivateAccess.setVariable((Class<?>) AvatarFixTasks.class, avatarFixTasks0, "userMapper", (Object) userMapper0);

      //invoke method for avatarFixTasks0
      avatarFixTasks0.fixUserAvatar();
  }}