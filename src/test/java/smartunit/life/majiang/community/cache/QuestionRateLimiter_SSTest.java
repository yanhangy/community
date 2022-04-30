/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.life.majiang.community.cache;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import life.majiang.community.cache.QuestionRateLimiter;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.context.ApplicationContext;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class QuestionRateLimiter_SSTest extends QuestionRateLimiter_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_reachLimit_0()  throws Throwable  {
      QuestionRateLimiter questionRateLimiter0 = new QuestionRateLimiter();
      Long long0 = new Long((-830L));
      // Undeclared exception!
      try { 

        //invoke method for questionRateLimiter0
        questionRateLimiter0.reachLimit(long0);
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test_reachLimit_1()  throws Throwable  {
      QuestionRateLimiter questionRateLimiter0 = new QuestionRateLimiter();
      ApplicationContext applicationContext0 = mock(ApplicationContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for questionRateLimiter0
      PrivateAccess.setVariable((Class<?>) QuestionRateLimiter.class, questionRateLimiter0, "applicationContext", (Object) applicationContext0);
      Long long0 = new Long(799L);
      boolean boolean0 = questionRateLimiter0.reachLimit(long0);
      assertFalse(boolean0);
  }
  @Test(timeout = 4000)
  public void test_reachLimit_2()  throws Throwable  {
      QuestionRateLimiter questionRateLimiter0 = new QuestionRateLimiter();
      ApplicationContext applicationContext0 = mock(ApplicationContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for questionRateLimiter0
      PrivateAccess.setVariable((Class<?>) QuestionRateLimiter.class, questionRateLimiter0, "applicationContext", (Object) applicationContext0);
      Long long0 = new Long(0L);
      boolean boolean0 = questionRateLimiter0.reachLimit(long0);
      assertFalse(boolean0);
  }}