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
package com.b2international.snomed.scg.ide.contentassist.antlr;

import com.b2international.snomed.scg.ide.contentassist.antlr.internal.InternalScgParser;
import com.b2international.snomed.scg.services.ScgGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ScgParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ScgGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ScgGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExpressionAccess().getAlternatives_1_0(), "rule__Expression__Alternatives_1_0");
			builder.put(grammarAccess.getRefinementAccess().getAlternatives_0(), "rule__Refinement__Alternatives_0");
			builder.put(grammarAccess.getAttributeValueAccess().getAlternatives(), "rule__AttributeValue__Alternatives");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1(), "rule__SnomedIdentifier__Alternatives_1");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2(), "rule__SnomedIdentifier__Alternatives_2");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3(), "rule__SnomedIdentifier__Alternatives_3");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4(), "rule__SnomedIdentifier__Alternatives_4");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5(), "rule__SnomedIdentifier__Alternatives_5");
			builder.put(grammarAccess.getNonNegativeIntegerAccess().getAlternatives(), "rule__NonNegativeInteger__Alternatives");
			builder.put(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1(), "rule__NonNegativeInteger__Alternatives_1_1");
			builder.put(grammarAccess.getIntegerAccess().getAlternatives_0(), "rule__Integer__Alternatives_0");
			builder.put(grammarAccess.getDecimalAccess().getAlternatives_0(), "rule__Decimal__Alternatives_0");
			builder.put(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2(), "rule__NonNegativeDecimal__Alternatives_2");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
			builder.put(grammarAccess.getSubExpressionAccess().getGroup(), "rule__SubExpression__Group__0");
			builder.put(grammarAccess.getSubExpressionAccess().getGroup_1(), "rule__SubExpression__Group_1__0");
			builder.put(grammarAccess.getSubExpressionAccess().getGroup_2(), "rule__SubExpression__Group_2__0");
			builder.put(grammarAccess.getRefinementAccess().getGroup(), "rule__Refinement__Group__0");
			builder.put(grammarAccess.getRefinementAccess().getGroup_0_0(), "rule__Refinement__Group_0_0__0");
			builder.put(grammarAccess.getRefinementAccess().getGroup_0_0_1(), "rule__Refinement__Group_0_0_1__0");
			builder.put(grammarAccess.getRefinementAccess().getGroup_1(), "rule__Refinement__Group_1__0");
			builder.put(grammarAccess.getAttributeGroupAccess().getGroup(), "rule__AttributeGroup__Group__0");
			builder.put(grammarAccess.getAttributeGroupAccess().getGroup_2(), "rule__AttributeGroup__Group_2__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getAttributeValueAccess().getGroup_1(), "rule__AttributeValue__Group_1__0");
			builder.put(grammarAccess.getIntegerValueAccess().getGroup(), "rule__IntegerValue__Group__0");
			builder.put(grammarAccess.getDecimalValueAccess().getGroup(), "rule__DecimalValue__Group__0");
			builder.put(grammarAccess.getConceptReferenceAccess().getGroup(), "rule__ConceptReference__Group__0");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getGroup(), "rule__SnomedIdentifier__Group__0");
			builder.put(grammarAccess.getNonNegativeIntegerAccess().getGroup_1(), "rule__NonNegativeInteger__Group_1__0");
			builder.put(grammarAccess.getIntegerAccess().getGroup(), "rule__Integer__Group__0");
			builder.put(grammarAccess.getDecimalAccess().getGroup(), "rule__Decimal__Group__0");
			builder.put(grammarAccess.getNonNegativeDecimalAccess().getGroup(), "rule__NonNegativeDecimal__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getPrimitiveAssignment_1_0_0(), "rule__Expression__PrimitiveAssignment_1_0_0");
			builder.put(grammarAccess.getExpressionAccess().getExpressionAssignment_1_1(), "rule__Expression__ExpressionAssignment_1_1");
			builder.put(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_0(), "rule__SubExpression__FocusConceptsAssignment_0");
			builder.put(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_1_1(), "rule__SubExpression__FocusConceptsAssignment_1_1");
			builder.put(grammarAccess.getSubExpressionAccess().getRefinementAssignment_2_1(), "rule__SubExpression__RefinementAssignment_2_1");
			builder.put(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_0(), "rule__Refinement__AttributesAssignment_0_0_0");
			builder.put(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_1_1(), "rule__Refinement__AttributesAssignment_0_0_1_1");
			builder.put(grammarAccess.getRefinementAccess().getGroupsAssignment_0_1(), "rule__Refinement__GroupsAssignment_0_1");
			builder.put(grammarAccess.getRefinementAccess().getGroupsAssignment_1_1(), "rule__Refinement__GroupsAssignment_1_1");
			builder.put(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_1(), "rule__AttributeGroup__AttributesAssignment_1");
			builder.put(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_2_1(), "rule__AttributeGroup__AttributesAssignment_2_1");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_0(), "rule__Attribute__NameAssignment_0");
			builder.put(grammarAccess.getAttributeAccess().getValueAssignment_2(), "rule__Attribute__ValueAssignment_2");
			builder.put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
			builder.put(grammarAccess.getIntegerValueAccess().getValueAssignment_1(), "rule__IntegerValue__ValueAssignment_1");
			builder.put(grammarAccess.getDecimalValueAccess().getValueAssignment_1(), "rule__DecimalValue__ValueAssignment_1");
			builder.put(grammarAccess.getConceptReferenceAccess().getIdAssignment_0(), "rule__ConceptReference__IdAssignment_0");
			builder.put(grammarAccess.getConceptReferenceAccess().getTermAssignment_1(), "rule__ConceptReference__TermAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ScgGrammarAccess grammarAccess;

	@Override
	protected InternalScgParser createParser() {
		InternalScgParser result = new InternalScgParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ScgGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ScgGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
