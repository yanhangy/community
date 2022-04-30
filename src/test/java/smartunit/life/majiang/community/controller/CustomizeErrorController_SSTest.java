/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.life.majiang.community.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import javax.servlet.http.HttpServletRequest;
import javax.swing.JLayeredPane;
import life.majiang.community.controller.CustomizeErrorController;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CustomizeErrorController_SSTest extends CustomizeErrorController_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_getErrorPath_0()  throws Throwable  {
      CustomizeErrorController customizeErrorController0 = new CustomizeErrorController();
      String string0 = customizeErrorController0.getErrorPath();
      assertEquals("error", string0);
  }
  @Test(timeout = 4000)
  public void test_errorHtml_1()  throws Throwable  {
      CustomizeErrorController customizeErrorController0 = new CustomizeErrorController();

      //prepare data for httpServletRequest0
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(httpServletRequest0).getAttribute(nullable(java.lang.String.class));

      //prepare data for model1
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(nullable(java.lang.String.class) , any());
      ModelAndView modelAndView0 = customizeErrorController0.errorHtml(httpServletRequest0, model1);
      assertEquals("error", modelAndView0.getViewName());
  }
  @Test(timeout = 4000)
  public void test_errorHtml_2()  throws Throwable  {
      CustomizeErrorController customizeErrorController0 = new CustomizeErrorController();

      //prepare data for httpServletRequest0
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(integer0).when(httpServletRequest0).getAttribute(nullable(java.lang.String.class));
      ExtendedModelMap extendedModelMap0 = new ExtendedModelMap();
      ModelAndView modelAndView0 = customizeErrorController0.errorHtml(httpServletRequest0, extendedModelMap0);
      assertEquals(1, extendedModelMap0.size());
      assertEquals("error", modelAndView0.getViewName());
  }}
