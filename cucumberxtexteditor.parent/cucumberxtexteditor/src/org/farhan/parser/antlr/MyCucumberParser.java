/*
 * generated by Xtext 2.32.0
 */
package org.farhan.parser.antlr;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.farhan.parser.antlr.internal.MyCucumberLexer;

public class MyCucumberParser extends CucumberParser {

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new MyCucumberLexer(stream);
	}
}
