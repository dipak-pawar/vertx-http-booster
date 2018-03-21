package io.openshift.booster;

import org.junit.Assert;
import org.junit.Test;

public class ClassLoaderTest {
   @Test
   public void should_not_load_graphene() {
      Assert.assertFalse(isGrapheneOnClassPath());
   }

   @Test
   public void should_not_load_st() {
      Assert.assertTrue(isSmartTestingRulesOnClassPath());
   }

   private boolean isGrapheneOnClassPath() {
      try {
         getClass().getClassLoader().loadClass("org.jboss.arquillian.graphene.location.ContainerCustomizableURLResourceProvider");
         return true;
      } catch (ClassNotFoundException e) {
         return false;
      }
   }

   private boolean isSmartTestingRulesOnClassPath() {
      try {
         getClass().getClassLoader().loadClass("org.arquillian.smart.testing.rules.git.GitClone");
         return true;
      } catch (ClassNotFoundException e) {
         return false;
      }
   }
}
