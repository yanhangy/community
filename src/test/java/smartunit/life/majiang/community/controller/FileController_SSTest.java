/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.life.majiang.community.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import javax.servlet.http.HttpServletRequest;
import life.majiang.community.controller.FileController;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FileController_SSTest extends FileController_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_upload_0()  throws Throwable  {
      FileController fileController0 = new FileController();
      // Undeclared exception!
      try { 

        //invoke method for fileController0
        fileController0.upload((HttpServletRequest) null);
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }}
