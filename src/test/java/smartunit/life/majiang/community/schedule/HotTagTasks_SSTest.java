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
import life.majiang.community.cache.HotTagCache;
import life.majiang.community.mapper.QuestionMapper;
import life.majiang.community.model.Question;
import life.majiang.community.schedule.HotTagTasks;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HotTagTasks_SSTest extends HotTagTasks_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_hotTagSchedule_0()  throws Throwable  {
      HotTagTasks hotTagTasks0 = new HotTagTasks();
      HotTagCache hotTagCache0 = new HotTagCache();

      //prepare data for questionMapper0
      ArrayList<Question> arrayList0 = new ArrayList<Question>();
      Question question0 = new Question();
      Integer integer0 = new Integer(9);
      question0.setCommentCount(integer0);
      arrayList0.add(question0);
      arrayList0.add(question0);
      question0.setTag("bQ6^");
      QuestionMapper questionMapper0 = mock(QuestionMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(arrayList0).when(questionMapper0).selectByExampleWithRowbounds(nullable(life.majiang.community.model.QuestionExample.class) , nullable(org.apache.ibatis.session.RowBounds.class));

      //invoke method for hotTagTasks0
      PrivateAccess.setVariable((Class<?>) HotTagTasks.class, hotTagTasks0, "questionMapper", (Object) questionMapper0);

      //invoke method for hotTagTasks0
      PrivateAccess.setVariable((Class<?>) HotTagTasks.class, hotTagTasks0, "hotTagCache", (Object) hotTagCache0);

      //invoke method for hotTagTasks0
      hotTagTasks0.hotTagSchedule();
  }}
