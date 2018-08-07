/*
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl1.parser.antlr.internal.InternalMyDsl1Parser;
import org.xtext.example.mydsl1.services.MyDsl1GrammarAccess;

public class MyDsl1Parser extends AbstractAntlrParser {

	@Inject
	private MyDsl1GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyDsl1Parser createParser(XtextTokenStream stream) {
		return new InternalMyDsl1Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MyDsl1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDsl1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
