/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl2.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl2.MyDsl2RuntimeModule;
import org.xtext.example.mydsl2.MyDsl2StandaloneSetup;
import org.xtext.example.mydsl2.ide.MyDsl2IdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MyDsl2IdeSetup extends MyDsl2StandaloneSetup {
  @Override
  public Injector createInjector() {
    MyDsl2RuntimeModule _myDsl2RuntimeModule = new MyDsl2RuntimeModule();
    MyDsl2IdeModule _myDsl2IdeModule = new MyDsl2IdeModule();
    return Guice.createInjector(Modules2.mixin(_myDsl2RuntimeModule, _myDsl2IdeModule));
  }
}
