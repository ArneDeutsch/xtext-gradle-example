/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl2;

import org.xtext.example.mydsl2.MyDsl2StandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MyDsl2StandaloneSetup extends MyDsl2StandaloneSetupGenerated {
  public static void doSetup() {
    new MyDsl2StandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
