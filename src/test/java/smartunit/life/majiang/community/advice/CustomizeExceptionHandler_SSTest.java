/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.life.majiang.community.advice;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import life.majiang.community.advice.CustomizeExceptionHandler;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CustomizeExceptionHandler_SSTest extends CustomizeExceptionHandler_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_handle_0()  throws Throwable  {
      CustomizeExceptionHandler customizeExceptionHandler0 = new CustomizeExceptionHandler();
      Throwable throwable0 = mock(Throwable.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for model1
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(nullable(java.lang.String.class) , any());

      //prepare data for httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("CGfh!S{").when(httpServletRequest0).getContentType();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ModelAndView modelAndView0 = (ModelAndView)PrivateAccess.callMethod((Class<CustomizeExceptionHandler>) CustomizeExceptionHandler.class, customizeExceptionHandler0, "handle", (Object) throwable0, (Class<?>) Throwable.class, (Object) model1, (Class<?>) Model.class, (Object) httpServletRequest0, (Class<?>) HttpServletRequest.class, (Object) httpServletResponse0, (Class<?>) HttpServletResponse.class);
      assertEquals("error", modelAndView0.getViewName());
  }
  }
