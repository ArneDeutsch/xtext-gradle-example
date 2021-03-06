/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl1.MyDsl1RuntimeModule;
import org.xtext.example.mydsl1.MyDsl1StandaloneSetup;
import org.xtext.example.mydsl1.ide.MyDsl1IdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MyDsl1IdeSetup extends MyDsl1StandaloneSetup {
  @Override
  public Injector createInjector() {
    MyDsl1RuntimeModule _myDsl1RuntimeModule = new MyDsl1RuntimeModule();
    MyDsl1IdeModule _myDsl1IdeModule = new MyDsl1IdeModule();
    return Guice.createInjector(Modules2.mixin(_myDsl1RuntimeModule, _myDsl1IdeModule));
  }
}
