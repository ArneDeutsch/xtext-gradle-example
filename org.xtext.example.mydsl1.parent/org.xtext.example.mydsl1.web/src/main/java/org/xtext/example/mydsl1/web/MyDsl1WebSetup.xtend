/*
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.web

import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2
import org.xtext.example.mydsl1.MyDsl1RuntimeModule
import org.xtext.example.mydsl1.MyDsl1StandaloneSetup
import org.xtext.example.mydsl1.ide.MyDsl1IdeModule

/**
 * Initialization support for running Xtext languages in web applications.
 */
class MyDsl1WebSetup extends MyDsl1StandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MyDsl1RuntimeModule, new MyDsl1IdeModule, new MyDsl1WebModule))
	}
	
}
