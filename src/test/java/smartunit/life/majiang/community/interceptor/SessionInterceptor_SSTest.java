/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.life.majiang.community.interceptor;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import life.majiang.community.interceptor.SessionInterceptor;
import life.majiang.community.mapper.UserMapper;
import life.majiang.community.model.Ad;
import life.majiang.community.model.User;
import life.majiang.community.service.AdService;
import life.majiang.community.service.NotificationService;
import org.apache.catalina.connector.Response;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.mock.web.MockServletContext;
import org.springframework.web.servlet.ModelAndView;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SessionInterceptor_SSTest extends SessionInterceptor_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_postHandle_0()  throws Throwable  {
      SessionInterceptor sessionInterceptor0 = new SessionInterceptor();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ModelAndView modelAndView0 = mock(ModelAndView.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for sessionInterceptor0
      sessionInterceptor0.postHandle(httpServletRequest0, httpServletResponse0, "", modelAndView0);
  }
  @Test(timeout = 4000)
  public void test_afterCompletion_1()  throws Throwable  {
      SessionInterceptor sessionInterceptor0 = new SessionInterceptor();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Exception exception0 = mock(Exception.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for sessionInterceptor0
      sessionInterceptor0.afterCompletion(httpServletRequest0, httpServletResponse0, "1", exception0);
  }
  @Test(timeout = 4000)
  public void test_preHandle_2()  throws Throwable  {
      SessionInterceptor sessionInterceptor0 = new SessionInterceptor();

      //prepare data for adService0
      Vector<Ad> vector0 = new Vector<Ad>();
      LinkedList<Ad> linkedList0 = new LinkedList<Ad>();
      AdService adService0 = mock(AdService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0, linkedList0, vector0, vector0).when(adService0).list(nullable(java.lang.String.class));

      //invoke method for sessionInterceptor0
      PrivateAccess.setVariable((Class<?>) SessionInterceptor.class, sessionInterceptor0, "adService", (Object) adService0);

      //prepare data for httpServletRequest0
      ServletContext servletContext0 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Cookie[] cookieArray0 = new Cookie[0];
      ServletContext servletContext1 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ServletContext servletContext2 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ServletContext servletContext3 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ServletContext servletContext4 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      MockServletContext mockServletContext0 = new MockServletContext("giteeRedirectUri");
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(servletContext0, mockServletContext0, servletContext4, servletContext3, servletContext2, servletContext1).when(httpServletRequest0).getServletContext();
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      boolean boolean0 = sessionInterceptor0.preHandle(httpServletRequest0, httpServletResponse0, httpServletResponse0);
      assertTrue(boolean0);
  }
  @Test(timeout = 4000)
  public void test_preHandle_3()  throws Throwable  {
      SessionInterceptor sessionInterceptor0 = new SessionInterceptor();
      AdService adService0 = mock(AdService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for sessionInterceptor0
      PrivateAccess.setVariable((Class<?>) SessionInterceptor.class, sessionInterceptor0, "adService", (Object) adService0);

      //prepare data for httpServletRequest0
      ServletContext servletContext0 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(servletContext0).when(httpServletRequest0).getServletContext();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      boolean boolean0 = sessionInterceptor0.preHandle(httpServletRequest0, httpServletResponse0, httpServletRequest0);
      assertTrue(boolean0);
  }
  @Test(timeout = 4000)
  public void test_preHandle_4()  throws Throwable  {
      SessionInterceptor sessionInterceptor0 = new SessionInterceptor();

      //prepare data for adService0
      Stack<Ad> stack0 = new Stack<Ad>();
      AdService adService0 = mock(AdService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0, stack0, stack0, stack0).when(adService0).list(nullable(java.lang.String.class));

      //invoke method for sessionInterceptor0
      PrivateAccess.setVariable((Class<?>) SessionInterceptor.class, sessionInterceptor0, "adService", (Object) adService0);

      //prepare data for httpServletRequest0
      ServletContext servletContext0 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Cookie[] cookieArray0 = new Cookie[1];
      Cookie cookie0 = new Cookie("token", "token");
      cookieArray0[0] = cookie0;
      cookie0.setValue("");
      MockServletContext mockServletContext0 = new MockServletContext();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(servletContext0, mockServletContext0, mockServletContext0, mockServletContext0, mockServletContext0, mockServletContext0).when(httpServletRequest0).getServletContext();
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Object object0 = new Object();
      boolean boolean0 = sessionInterceptor0.preHandle(httpServletRequest0, httpServletResponse0, object0);
      assertTrue(boolean0);
  }
  @Test(timeout = 4000)
  public void test_preHandle_5()  throws Throwable  {
      SessionInterceptor sessionInterceptor0 = new SessionInterceptor();

      //prepare data for adService0
      Stack<Ad> stack0 = new Stack<Ad>();
      AdService adService0 = mock(AdService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0, stack0, stack0, stack0).when(adService0).list(nullable(java.lang.String.class));

      //invoke method for sessionInterceptor0
      PrivateAccess.setVariable((Class<?>) SessionInterceptor.class, sessionInterceptor0, "adService", (Object) adService0);

      //prepare data for httpServletRequest0
      MockServletContext mockServletContext0 = new MockServletContext();
      Cookie[] cookieArray0 = new Cookie[1];
      Cookie cookie0 = mock(Cookie.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1.0").when(cookie0).getName();
      cookieArray0[0] = cookie0;
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(mockServletContext0, mockServletContext0, mockServletContext0, mockServletContext0, mockServletContext0, mockServletContext0).when(httpServletRequest0).getServletContext();
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Object object0 = new Object();
      boolean boolean0 = sessionInterceptor0.preHandle(httpServletRequest0, httpServletResponse0, object0);
      assertTrue(boolean0);
  }
  @Test(timeout = 4000)
  public void test_preHandle_6()  throws Throwable  {
      SessionInterceptor sessionInterceptor0 = new SessionInterceptor();

      //prepare data for userMapper0
      Vector<User> vector0 = new Vector<User>();
      UserMapper userMapper0 = mock(UserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(vector0).when(userMapper0).selectByExample(nullable(life.majiang.community.model.UserExample.class));

      //prepare data for adService0
      Stack<Ad> stack0 = new Stack<Ad>();
      AdService adService0 = mock(AdService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0, stack0, stack0, stack0).when(adService0).list(nullable(java.lang.String.class));

      //invoke method for sessionInterceptor0
      PrivateAccess.setVariable((Class<?>) SessionInterceptor.class, sessionInterceptor0, "adService", (Object) adService0);

      //invoke method for sessionInterceptor0
      PrivateAccess.setVariable((Class<?>) SessionInterceptor.class, sessionInterceptor0, "userMapper", (Object) userMapper0);

      //prepare data for httpServletRequest0
      MockServletContext mockServletContext0 = new MockServletContext("token");
      Cookie[] cookieArray0 = new Cookie[1];
      Cookie cookie0 = new Cookie("token", "token");
      cookieArray0[0] = cookie0;
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(mockServletContext0, mockServletContext0, mockServletContext0, mockServletContext0, mockServletContext0, mockServletContext0).when(httpServletRequest0).getServletContext();
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Object object0 = new Object();
      boolean boolean0 = sessionInterceptor0.preHandle(httpServletRequest0, httpServletResponse0, object0);
      assertTrue(boolean0);
  }
  @Test(timeout = 4000)
  public void test_preHandle_7()  throws Throwable  {
      SessionInterceptor sessionInterceptor0 = new SessionInterceptor();
      Vector<User> vector0 = new Vector<User>();
      UserMapper userMapper0 = mock(UserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(vector0).when(userMapper0).selectByExample(nullable(life.majiang.community.model.UserExample.class));
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      vector0.add(user0);

      //prepare data for adService0
      Stack<Ad> stack0 = new Stack<Ad>();
      AdService adService0 = mock(AdService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(stack0, stack0, stack0, stack0).when(adService0).list(nullable(java.lang.String.class));
      NotificationService notificationService0 = mock(NotificationService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for sessionInterceptor0
      PrivateAccess.setVariable((Class<?>) SessionInterceptor.class, sessionInterceptor0, "notificationService", (Object) notificationService0);

      //invoke method for sessionInterceptor0
      PrivateAccess.setVariable((Class<?>) SessionInterceptor.class, sessionInterceptor0, "adService", (Object) adService0);

      //invoke method for sessionInterceptor0
      PrivateAccess.setVariable((Class<?>) SessionInterceptor.class, sessionInterceptor0, "userMapper", (Object) userMapper0);

      //prepare data for httpServletRequest0
      MockServletContext mockServletContext0 = new MockServletContext("token");
      Cookie[] cookieArray0 = new Cookie[1];
      Cookie cookie0 = new Cookie("token", "token");
      cookieArray0[0] = cookie0;
      HttpSession httpSession0 = mock(HttpSession.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(mockServletContext0, mockServletContext0, mockServletContext0, mockServletContext0, mockServletContext0, mockServletContext0).when(httpServletRequest0).getServletContext();
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      doReturn(httpSession0).when(httpServletRequest0).getSession();
      Response response0 = new Response();
      Object object0 = new Object();
      boolean boolean0 = sessionInterceptor0.preHandle(httpServletRequest0, response0, object0);
      assertTrue(boolean0);
  }}