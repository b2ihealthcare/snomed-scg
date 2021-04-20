/*
 * Copyright 2020-2021 B2i Healthcare Pte Ltd, http://b2i.sg
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
parser grammar InternalScgParser;

options {
	tokenVocab=InternalScgLexer;
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@header {
package com.b2international.snomed.scg.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.b2international.snomed.scg.services.ScgGrammarAccess;

}
@members {
	private ScgGrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
	}

	public void setGrammarAccess(ScgGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		String result = tokenNameToValue.get(tokenName);
		if (result == null)
			result = tokenName;
		return result;
	}
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getGroup()); }
		(rule__Expression__Group__0)
		{ after(grammarAccess.getExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubExpression
entryRuleSubExpression
:
{ before(grammarAccess.getSubExpressionRule()); }
	 ruleSubExpression
{ after(grammarAccess.getSubExpressionRule()); } 
	 EOF 
;

// Rule SubExpression
ruleSubExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubExpressionAccess().getGroup()); }
		(rule__SubExpression__Group__0)
		{ after(grammarAccess.getSubExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRefinement
entryRuleRefinement
:
{ before(grammarAccess.getRefinementRule()); }
	 ruleRefinement
{ after(grammarAccess.getRefinementRule()); } 
	 EOF 
;

// Rule Refinement
ruleRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRefinementAccess().getGroup()); }
		(rule__Refinement__Group__0)
		{ after(grammarAccess.getRefinementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeGroup
entryRuleAttributeGroup
:
{ before(grammarAccess.getAttributeGroupRule()); }
	 ruleAttributeGroup
{ after(grammarAccess.getAttributeGroupRule()); } 
	 EOF 
;

// Rule AttributeGroup
ruleAttributeGroup 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeGroupAccess().getGroup()); }
		(rule__AttributeGroup__Group__0)
		{ after(grammarAccess.getAttributeGroupAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeValue
entryRuleAttributeValue
:
{ before(grammarAccess.getAttributeValueRule()); }
	 ruleAttributeValue
{ after(grammarAccess.getAttributeValueRule()); } 
	 EOF 
;

// Rule AttributeValue
ruleAttributeValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeValueAccess().getAlternatives()); }
		(rule__AttributeValue__Alternatives)
		{ after(grammarAccess.getAttributeValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringValue
entryRuleStringValue
:
{ before(grammarAccess.getStringValueRule()); }
	 ruleStringValue
{ after(grammarAccess.getStringValueRule()); } 
	 EOF 
;

// Rule StringValue
ruleStringValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringValueAccess().getValueAssignment()); }
		(rule__StringValue__ValueAssignment)
		{ after(grammarAccess.getStringValueAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValue
entryRuleIntegerValue
:
{ before(grammarAccess.getIntegerValueRule()); }
	 ruleIntegerValue
{ after(grammarAccess.getIntegerValueRule()); } 
	 EOF 
;

// Rule IntegerValue
ruleIntegerValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueAccess().getGroup()); }
		(rule__IntegerValue__Group__0)
		{ after(grammarAccess.getIntegerValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValue
entryRuleDecimalValue
:
{ before(grammarAccess.getDecimalValueRule()); }
	 ruleDecimalValue
{ after(grammarAccess.getDecimalValueRule()); } 
	 EOF 
;

// Rule DecimalValue
ruleDecimalValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueAccess().getGroup()); }
		(rule__DecimalValue__Group__0)
		{ after(grammarAccess.getDecimalValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConceptReference
entryRuleConceptReference
:
{ before(grammarAccess.getConceptReferenceRule()); }
	 ruleConceptReference
{ after(grammarAccess.getConceptReferenceRule()); } 
	 EOF 
;

// Rule ConceptReference
ruleConceptReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConceptReferenceAccess().getGroup()); }
		(rule__ConceptReference__Group__0)
		{ after(grammarAccess.getConceptReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSnomedIdentifier
entryRuleSnomedIdentifier
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getSnomedIdentifierRule()); }
	 ruleSnomedIdentifier
{ after(grammarAccess.getSnomedIdentifierRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule SnomedIdentifier
ruleSnomedIdentifier 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getGroup()); }
		(rule__SnomedIdentifier__Group__0)
		{ after(grammarAccess.getSnomedIdentifierAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNonNegativeInteger
entryRuleNonNegativeInteger
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getNonNegativeIntegerRule()); }
	 ruleNonNegativeInteger
{ after(grammarAccess.getNonNegativeIntegerRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule NonNegativeInteger
ruleNonNegativeInteger 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); }
		(rule__NonNegativeInteger__Alternatives)
		{ after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInteger
entryRuleInteger
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getIntegerRule()); }
	 ruleInteger
{ after(grammarAccess.getIntegerRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Integer
ruleInteger 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerAccess().getGroup()); }
		(rule__Integer__Group__0)
		{ after(grammarAccess.getIntegerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleDecimal
entryRuleDecimal
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getDecimalRule()); }
	 ruleDecimal
{ after(grammarAccess.getDecimalRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Decimal
ruleDecimal 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalAccess().getGroup()); }
		(rule__Decimal__Group__0)
		{ after(grammarAccess.getDecimalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNonNegativeDecimal
entryRuleNonNegativeDecimal
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getNonNegativeDecimalRule()); }
	 ruleNonNegativeDecimal
{ after(grammarAccess.getNonNegativeDecimalRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule NonNegativeDecimal
ruleNonNegativeDecimal 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNonNegativeDecimalAccess().getGroup()); }
		(rule__NonNegativeDecimal__Group__0)
		{ after(grammarAccess.getNonNegativeDecimalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

rule__Expression__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getPrimitiveAssignment_1_0_0()); }
		(rule__Expression__PrimitiveAssignment_1_0_0)
		{ after(grammarAccess.getExpressionAccess().getPrimitiveAssignment_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getEQUIVALENT_TOTerminalRuleCall_1_0_1()); }
		RULE_EQUIVALENT_TO
		{ after(grammarAccess.getExpressionAccess().getEQUIVALENT_TOTerminalRuleCall_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefinementAccess().getGroup_0_0()); }
		(rule__Refinement__Group_0_0__0)
		{ after(grammarAccess.getRefinementAccess().getGroup_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getRefinementAccess().getGroupsAssignment_0_1()); }
		(rule__Refinement__GroupsAssignment_0_1)
		{ after(grammarAccess.getRefinementAccess().getGroupsAssignment_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeValueAccess().getConceptReferenceParserRuleCall_0()); }
		ruleConceptReference
		{ after(grammarAccess.getAttributeValueAccess().getConceptReferenceParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeValueAccess().getGroup_1()); }
		(rule__AttributeValue__Group_1__0)
		{ after(grammarAccess.getAttributeValueAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeValueAccess().getStringValueParserRuleCall_2()); }
		ruleStringValue
		{ after(grammarAccess.getAttributeValueAccess().getStringValueParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeValueAccess().getIntegerValueParserRuleCall_3()); }
		ruleIntegerValue
		{ after(grammarAccess.getAttributeValueAccess().getIntegerValueParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeValueAccess().getDecimalValueParserRuleCall_4()); }
		ruleDecimalValue
		{ after(grammarAccess.getAttributeValueAccess().getDecimalValueParserRuleCall_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0()); }
		RULE_ZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getGroup_1()); }
		(rule__NonNegativeInteger__Group_1__0)
		{ after(grammarAccess.getNonNegativeIntegerAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1()); }
		RULE_ZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0()); }
		RULE_PLUS
		{ after(grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1()); }
		RULE_DASH
		{ after(grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0()); }
		RULE_PLUS
		{ after(grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1()); }
		RULE_DASH
		{ after(grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1()); }
		RULE_ZERO
		{ after(grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group__0__Impl
	rule__Expression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getExpressionAction_0()); }
	()
	{ after(grammarAccess.getExpressionAccess().getExpressionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getGroup_1()); }
	(rule__Expression__Group_1__0)?
	{ after(grammarAccess.getExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__0__Impl
	rule__Expression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); }
	(rule__Expression__Alternatives_1_0)?
	{ after(grammarAccess.getExpressionAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getExpressionAssignment_1_1()); }
	(rule__Expression__ExpressionAssignment_1_1)
	{ after(grammarAccess.getExpressionAccess().getExpressionAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group__0__Impl
	rule__SubExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_0()); }
	(rule__SubExpression__FocusConceptsAssignment_0)
	{ after(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group__1__Impl
	rule__SubExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getGroup_1()); }
	(rule__SubExpression__Group_1__0)*
	{ after(grammarAccess.getSubExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getGroup_2()); }
	(rule__SubExpression__Group_2__0)?
	{ after(grammarAccess.getSubExpressionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group_1__0__Impl
	rule__SubExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getPLUSTerminalRuleCall_1_0()); }
	RULE_PLUS
	{ after(grammarAccess.getSubExpressionAccess().getPLUSTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_1_1()); }
	(rule__SubExpression__FocusConceptsAssignment_1_1)
	{ after(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubExpression__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group_2__0__Impl
	rule__SubExpression__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getCOLONTerminalRuleCall_2_0()); }
	RULE_COLON
	{ after(grammarAccess.getSubExpressionAccess().getCOLONTerminalRuleCall_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubExpression__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubExpressionAccess().getRefinementAssignment_2_1()); }
	(rule__SubExpression__RefinementAssignment_2_1)
	{ after(grammarAccess.getSubExpressionAccess().getRefinementAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Refinement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group__0__Impl
	rule__Refinement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getAlternatives_0()); }
	(rule__Refinement__Alternatives_0)
	{ after(grammarAccess.getRefinementAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getGroup_1()); }
	(rule__Refinement__Group_1__0)*
	{ after(grammarAccess.getRefinementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Refinement__Group_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group_0_0__0__Impl
	rule__Refinement__Group_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_0()); }
	(rule__Refinement__AttributesAssignment_0_0_0)
	{ after(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getGroup_0_0_1()); }
	(rule__Refinement__Group_0_0_1__0)*
	{ after(grammarAccess.getRefinementAccess().getGroup_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Refinement__Group_0_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group_0_0_1__0__Impl
	rule__Refinement__Group_0_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_0_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_0_0_1_0()); }
	RULE_COMMA
	{ after(grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_0_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_0_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group_0_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_0_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_1_1()); }
	(rule__Refinement__AttributesAssignment_0_0_1_1)
	{ after(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Refinement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group_1__0__Impl
	rule__Refinement__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_1_0()); }
	(RULE_COMMA)?
	{ after(grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Refinement__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinementAccess().getGroupsAssignment_1_1()); }
	(rule__Refinement__GroupsAssignment_1_1)
	{ after(grammarAccess.getRefinementAccess().getGroupsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeGroup__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeGroup__Group__0__Impl
	rule__AttributeGroup__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_0()); }
	RULE_CURLY_OPEN
	{ after(grammarAccess.getAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeGroup__Group__1__Impl
	rule__AttributeGroup__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_1()); }
	(rule__AttributeGroup__AttributesAssignment_1)
	{ after(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeGroup__Group__2__Impl
	rule__AttributeGroup__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeGroupAccess().getGroup_2()); }
	(rule__AttributeGroup__Group_2__0)*
	{ after(grammarAccess.getAttributeGroupAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeGroup__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3()); }
	RULE_CURLY_CLOSE
	{ after(grammarAccess.getAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeGroup__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeGroup__Group_2__0__Impl
	rule__AttributeGroup__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeGroupAccess().getCOMMATerminalRuleCall_2_0()); }
	RULE_COMMA
	{ after(grammarAccess.getAttributeGroupAccess().getCOMMATerminalRuleCall_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeGroup__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_2_1()); }
	(rule__AttributeGroup__AttributesAssignment_2_1)
	{ after(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getNameAssignment_0()); }
	(rule__Attribute__NameAssignment_0)
	{ after(grammarAccess.getAttributeAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getAttributeAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getValueAssignment_2()); }
	(rule__Attribute__ValueAssignment_2)
	{ after(grammarAccess.getAttributeAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeValue__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValue__Group_1__0__Impl
	rule__AttributeValue__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValue__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueAccess().getROUND_OPENTerminalRuleCall_1_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getAttributeValueAccess().getROUND_OPENTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValue__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValue__Group_1__1__Impl
	rule__AttributeValue__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValue__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueAccess().getSubExpressionParserRuleCall_1_1()); }
	ruleSubExpression
	{ after(grammarAccess.getAttributeValueAccess().getSubExpressionParserRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValue__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValue__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValue__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueAccess().getROUND_CLOSETerminalRuleCall_1_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getAttributeValueAccess().getROUND_CLOSETerminalRuleCall_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValue__Group__0__Impl
	rule__IntegerValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueAccess().getHASHTerminalRuleCall_0()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueAccess().getHASHTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValue__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueAccess().getValueAssignment_1()); }
	(rule__IntegerValue__ValueAssignment_1)
	{ after(grammarAccess.getIntegerValueAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValue__Group__0__Impl
	rule__DecimalValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueAccess().getHASHTerminalRuleCall_0()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueAccess().getHASHTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValue__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueAccess().getValueAssignment_1()); }
	(rule__DecimalValue__ValueAssignment_1)
	{ after(grammarAccess.getDecimalValueAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConceptReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptReference__Group__0__Impl
	rule__ConceptReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptReferenceAccess().getIdAssignment_0()); }
	(rule__ConceptReference__IdAssignment_0)
	{ after(grammarAccess.getConceptReferenceAccess().getIdAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConceptReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConceptReferenceAccess().getTermAssignment_1()); }
	(rule__ConceptReference__TermAssignment_1)?
	{ after(grammarAccess.getConceptReferenceAccess().getTermAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SnomedIdentifier__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__0__Impl
	rule__SnomedIdentifier__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); }
	RULE_DIGIT_NONZERO
	{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__1__Impl
	rule__SnomedIdentifier__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1()); }
	(rule__SnomedIdentifier__Alternatives_1)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__2__Impl
	rule__SnomedIdentifier__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2()); }
	(rule__SnomedIdentifier__Alternatives_2)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__3__Impl
	rule__SnomedIdentifier__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3()); }
	(rule__SnomedIdentifier__Alternatives_3)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__4__Impl
	rule__SnomedIdentifier__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4()); }
	(rule__SnomedIdentifier__Alternatives_4)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
		(rule__SnomedIdentifier__Alternatives_5)
		{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
	)
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
		(rule__SnomedIdentifier__Alternatives_5)*
		{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NonNegativeInteger__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeInteger__Group_1__0__Impl
	rule__NonNegativeInteger__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
	RULE_DIGIT_NONZERO
	{ after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeInteger__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1()); }
	(rule__NonNegativeInteger__Alternatives_1_1)*
	{ after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Integer__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Integer__Group__0__Impl
	rule__Integer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerAccess().getAlternatives_0()); }
	(rule__Integer__Alternatives_0)?
	{ after(grammarAccess.getIntegerAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Integer__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1()); }
	ruleNonNegativeInteger
	{ after(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Decimal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Decimal__Group__0__Impl
	rule__Decimal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalAccess().getAlternatives_0()); }
	(rule__Decimal__Alternatives_0)?
	{ after(grammarAccess.getDecimalAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Decimal__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1()); }
	ruleNonNegativeDecimal
	{ after(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NonNegativeDecimal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeDecimal__Group__0__Impl
	rule__NonNegativeDecimal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0()); }
	ruleNonNegativeInteger
	{ after(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeDecimal__Group__1__Impl
	rule__NonNegativeDecimal__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1()); }
	RULE_DOT
	{ after(grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeDecimal__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2()); }
	(rule__NonNegativeDecimal__Alternatives_2)*
	{ after(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__PrimitiveAssignment_1_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getPrimitiveSUBTYPE_OFTerminalRuleCall_1_0_0_0()); }
		RULE_SUBTYPE_OF
		{ after(grammarAccess.getExpressionAccess().getPrimitiveSUBTYPE_OFTerminalRuleCall_1_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ExpressionAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getExpressionSubExpressionParserRuleCall_1_1_0()); }
		ruleSubExpression
		{ after(grammarAccess.getExpressionAccess().getExpressionSubExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__FocusConceptsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubExpressionAccess().getFocusConceptsConceptReferenceParserRuleCall_0_0()); }
		ruleConceptReference
		{ after(grammarAccess.getSubExpressionAccess().getFocusConceptsConceptReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__FocusConceptsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubExpressionAccess().getFocusConceptsConceptReferenceParserRuleCall_1_1_0()); }
		ruleConceptReference
		{ after(grammarAccess.getSubExpressionAccess().getFocusConceptsConceptReferenceParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpression__RefinementAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubExpressionAccess().getRefinementRefinementParserRuleCall_2_1_0()); }
		ruleRefinement
		{ after(grammarAccess.getSubExpressionAccess().getRefinementRefinementParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__AttributesAssignment_0_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_0_0()); }
		ruleAttribute
		{ after(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__AttributesAssignment_0_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_1_1_0()); }
		ruleAttribute
		{ after(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__GroupsAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_0_1_0()); }
		ruleAttributeGroup
		{ after(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Refinement__GroupsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_1_1_0()); }
		ruleAttributeGroup
		{ after(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__AttributesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_1_0()); }
		ruleAttribute
		{ after(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeGroup__AttributesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_2_1_0()); }
		ruleAttribute
		{ after(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getNameConceptReferenceParserRuleCall_0_0()); }
		ruleConceptReference
		{ after(grammarAccess.getAttributeAccess().getNameConceptReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_2_0()); }
		ruleAttributeValue
		{ after(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValue__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValue__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueAccess().getValueIntegerParserRuleCall_1_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueAccess().getValueIntegerParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValue__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueAccess().getValueDecimalParserRuleCall_1_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueAccess().getValueDecimalParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptReference__IdAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0()); }
		ruleSnomedIdentifier
		{ after(grammarAccess.getConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConceptReference__TermAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); }
		RULE_TERM_STRING
		{ after(grammarAccess.getConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
