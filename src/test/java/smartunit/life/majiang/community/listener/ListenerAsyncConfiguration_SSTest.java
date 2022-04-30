/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.life.majiang.community.listener;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import life.majiang.community.listener.ListenerAsyncConfiguration;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ListenerAsyncConfiguration_SSTest extends ListenerAsyncConfiguration_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_getAsyncUncaughtExceptionHandler_0()  throws Throwable  {
      ListenerAsyncConfiguration listenerAsyncConfiguration0 = new ListenerAsyncConfiguration();
      AsyncUncaughtExceptionHandler asyncUncaughtExceptionHandler0 = listenerAsyncConfiguration0.getAsyncUncaughtExceptionHandler();
      assertNull(asyncUncaughtExceptionHandler0);
  }
  @Test(timeout = 4000)
  public void test_getAsyncExecutor_1()  throws Throwable  {
      ListenerAsyncConfiguration listenerAsyncConfiguration0 = new ListenerAsyncConfiguration();
      ThreadPoolTaskExecutor threadPoolTaskExecutor0 = (ThreadPoolTaskExecutor)listenerAsyncConfiguration0.getAsyncExecutor();
      assertEquals(10, threadPoolTaskExecutor0.getMaxPoolSize());
      assertEquals(5, threadPoolTaskExecutor0.getCorePoolSize());
  }}
