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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalScgParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQUIVALENT_TO", "RULE_SUBTYPE_OF", "RULE_TERM_STRING", "RULE_ZERO", "RULE_DIGIT_NONZERO", "RULE_CURLY_OPEN", "RULE_CURLY_CLOSE", "RULE_COMMA", "RULE_EQUAL", "RULE_COLON", "RULE_PLUS", "RULE_DASH", "RULE_DOT", "RULE_ROUND_OPEN", "RULE_ROUND_CLOSE", "RULE_HASH", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING"
    };
    public static final int RULE_DIGIT_NONZERO=8;
    public static final int RULE_CURLY_OPEN=9;
    public static final int RULE_ROUND_CLOSE=18;
    public static final int RULE_STRING=23;
    public static final int RULE_SL_COMMENT=22;
    public static final int RULE_HASH=19;
    public static final int RULE_EQUIVALENT_TO=4;
    public static final int RULE_DASH=15;
    public static final int RULE_ROUND_OPEN=17;
    public static final int RULE_PLUS=14;
    public static final int RULE_DOT=16;
    public static final int EOF=-1;
    public static final int RULE_EQUAL=12;
    public static final int RULE_SUBTYPE_OF=5;
    public static final int RULE_COMMA=11;
    public static final int RULE_WS=20;
    public static final int RULE_CURLY_CLOSE=10;
    public static final int RULE_ZERO=7;
    public static final int RULE_COLON=13;
    public static final int RULE_ML_COMMENT=21;
    public static final int RULE_TERM_STRING=6;

    // delegates
    // delegators


        public InternalScgParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScgParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScgParser.tokenNames; }
    public String getGrammarFileName() { return "InternalScgParser.g"; }


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



    // $ANTLR start "entryRuleExpression"
    // InternalScgParser.g:68:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalScgParser.g:69:1: ( ruleExpression EOF )
            // InternalScgParser.g:70:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalScgParser.g:77:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:81:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalScgParser.g:82:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalScgParser.g:82:2: ( ( rule__Expression__Group__0 ) )
            // InternalScgParser.g:83:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalScgParser.g:84:3: ( rule__Expression__Group__0 )
            // InternalScgParser.g:84:4: rule__Expression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalScgParser.g:93:1: entryRuleSubExpression : ruleSubExpression EOF ;
    public final void entryRuleSubExpression() throws RecognitionException {
        try {
            // InternalScgParser.g:94:1: ( ruleSubExpression EOF )
            // InternalScgParser.g:95:1: ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSubExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // InternalScgParser.g:102:1: ruleSubExpression : ( ( rule__SubExpression__Group__0 ) ) ;
    public final void ruleSubExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:106:2: ( ( ( rule__SubExpression__Group__0 ) ) )
            // InternalScgParser.g:107:2: ( ( rule__SubExpression__Group__0 ) )
            {
            // InternalScgParser.g:107:2: ( ( rule__SubExpression__Group__0 ) )
            // InternalScgParser.g:108:3: ( rule__SubExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup()); 
            }
            // InternalScgParser.g:109:3: ( rule__SubExpression__Group__0 )
            // InternalScgParser.g:109:4: rule__SubExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleRefinement"
    // InternalScgParser.g:118:1: entryRuleRefinement : ruleRefinement EOF ;
    public final void entryRuleRefinement() throws RecognitionException {
        try {
            // InternalScgParser.g:119:1: ( ruleRefinement EOF )
            // InternalScgParser.g:120:1: ruleRefinement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // InternalScgParser.g:127:1: ruleRefinement : ( ( rule__Refinement__Group__0 ) ) ;
    public final void ruleRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:131:2: ( ( ( rule__Refinement__Group__0 ) ) )
            // InternalScgParser.g:132:2: ( ( rule__Refinement__Group__0 ) )
            {
            // InternalScgParser.g:132:2: ( ( rule__Refinement__Group__0 ) )
            // InternalScgParser.g:133:3: ( rule__Refinement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getGroup()); 
            }
            // InternalScgParser.g:134:3: ( rule__Refinement__Group__0 )
            // InternalScgParser.g:134:4: rule__Refinement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Refinement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleAttributeGroup"
    // InternalScgParser.g:143:1: entryRuleAttributeGroup : ruleAttributeGroup EOF ;
    public final void entryRuleAttributeGroup() throws RecognitionException {
        try {
            // InternalScgParser.g:144:1: ( ruleAttributeGroup EOF )
            // InternalScgParser.g:145:1: ruleAttributeGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeGroup"


    // $ANTLR start "ruleAttributeGroup"
    // InternalScgParser.g:152:1: ruleAttributeGroup : ( ( rule__AttributeGroup__Group__0 ) ) ;
    public final void ruleAttributeGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:156:2: ( ( ( rule__AttributeGroup__Group__0 ) ) )
            // InternalScgParser.g:157:2: ( ( rule__AttributeGroup__Group__0 ) )
            {
            // InternalScgParser.g:157:2: ( ( rule__AttributeGroup__Group__0 ) )
            // InternalScgParser.g:158:3: ( rule__AttributeGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getGroup()); 
            }
            // InternalScgParser.g:159:3: ( rule__AttributeGroup__Group__0 )
            // InternalScgParser.g:159:4: rule__AttributeGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeGroup"


    // $ANTLR start "entryRuleAttribute"
    // InternalScgParser.g:168:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalScgParser.g:169:1: ( ruleAttribute EOF )
            // InternalScgParser.g:170:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalScgParser.g:177:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:181:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalScgParser.g:182:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalScgParser.g:182:2: ( ( rule__Attribute__Group__0 ) )
            // InternalScgParser.g:183:3: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // InternalScgParser.g:184:3: ( rule__Attribute__Group__0 )
            // InternalScgParser.g:184:4: rule__Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalScgParser.g:193:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // InternalScgParser.g:194:1: ( ruleAttributeValue EOF )
            // InternalScgParser.g:195:1: ruleAttributeValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalScgParser.g:202:1: ruleAttributeValue : ( ( rule__AttributeValue__Alternatives ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:206:2: ( ( ( rule__AttributeValue__Alternatives ) ) )
            // InternalScgParser.g:207:2: ( ( rule__AttributeValue__Alternatives ) )
            {
            // InternalScgParser.g:207:2: ( ( rule__AttributeValue__Alternatives ) )
            // InternalScgParser.g:208:3: ( rule__AttributeValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            }
            // InternalScgParser.g:209:3: ( rule__AttributeValue__Alternatives )
            // InternalScgParser.g:209:4: rule__AttributeValue__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalScgParser.g:218:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalScgParser.g:219:1: ( ruleStringValue EOF )
            // InternalScgParser.g:220:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalScgParser.g:227:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:231:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalScgParser.g:232:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalScgParser.g:232:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalScgParser.g:233:3: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalScgParser.g:234:3: ( rule__StringValue__ValueAssignment )
            // InternalScgParser.g:234:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalScgParser.g:243:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalScgParser.g:244:1: ( ruleIntegerValue EOF )
            // InternalScgParser.g:245:1: ruleIntegerValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIntegerValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalScgParser.g:252:1: ruleIntegerValue : ( ( rule__IntegerValue__Group__0 ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:256:2: ( ( ( rule__IntegerValue__Group__0 ) ) )
            // InternalScgParser.g:257:2: ( ( rule__IntegerValue__Group__0 ) )
            {
            // InternalScgParser.g:257:2: ( ( rule__IntegerValue__Group__0 ) )
            // InternalScgParser.g:258:3: ( rule__IntegerValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueAccess().getGroup()); 
            }
            // InternalScgParser.g:259:3: ( rule__IntegerValue__Group__0 )
            // InternalScgParser.g:259:4: rule__IntegerValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleDecimalValue"
    // InternalScgParser.g:268:1: entryRuleDecimalValue : ruleDecimalValue EOF ;
    public final void entryRuleDecimalValue() throws RecognitionException {
        try {
            // InternalScgParser.g:269:1: ( ruleDecimalValue EOF )
            // InternalScgParser.g:270:1: ruleDecimalValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDecimalValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalValue"


    // $ANTLR start "ruleDecimalValue"
    // InternalScgParser.g:277:1: ruleDecimalValue : ( ( rule__DecimalValue__Group__0 ) ) ;
    public final void ruleDecimalValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:281:2: ( ( ( rule__DecimalValue__Group__0 ) ) )
            // InternalScgParser.g:282:2: ( ( rule__DecimalValue__Group__0 ) )
            {
            // InternalScgParser.g:282:2: ( ( rule__DecimalValue__Group__0 ) )
            // InternalScgParser.g:283:3: ( rule__DecimalValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueAccess().getGroup()); 
            }
            // InternalScgParser.g:284:3: ( rule__DecimalValue__Group__0 )
            // InternalScgParser.g:284:4: rule__DecimalValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalValue"


    // $ANTLR start "entryRuleConceptReference"
    // InternalScgParser.g:293:1: entryRuleConceptReference : ruleConceptReference EOF ;
    public final void entryRuleConceptReference() throws RecognitionException {
        try {
            // InternalScgParser.g:294:1: ( ruleConceptReference EOF )
            // InternalScgParser.g:295:1: ruleConceptReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConceptReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConceptReference"


    // $ANTLR start "ruleConceptReference"
    // InternalScgParser.g:302:1: ruleConceptReference : ( ( rule__ConceptReference__Group__0 ) ) ;
    public final void ruleConceptReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:306:2: ( ( ( rule__ConceptReference__Group__0 ) ) )
            // InternalScgParser.g:307:2: ( ( rule__ConceptReference__Group__0 ) )
            {
            // InternalScgParser.g:307:2: ( ( rule__ConceptReference__Group__0 ) )
            // InternalScgParser.g:308:3: ( rule__ConceptReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptReferenceAccess().getGroup()); 
            }
            // InternalScgParser.g:309:3: ( rule__ConceptReference__Group__0 )
            // InternalScgParser.g:309:4: rule__ConceptReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConceptReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptReferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConceptReference"


    // $ANTLR start "entryRuleSnomedIdentifier"
    // InternalScgParser.g:318:1: entryRuleSnomedIdentifier : ruleSnomedIdentifier EOF ;
    public final void entryRuleSnomedIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalScgParser.g:322:1: ( ruleSnomedIdentifier EOF )
            // InternalScgParser.g:323:1: ruleSnomedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSnomedIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleSnomedIdentifier"


    // $ANTLR start "ruleSnomedIdentifier"
    // InternalScgParser.g:333:1: ruleSnomedIdentifier : ( ( rule__SnomedIdentifier__Group__0 ) ) ;
    public final void ruleSnomedIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:338:2: ( ( ( rule__SnomedIdentifier__Group__0 ) ) )
            // InternalScgParser.g:339:2: ( ( rule__SnomedIdentifier__Group__0 ) )
            {
            // InternalScgParser.g:339:2: ( ( rule__SnomedIdentifier__Group__0 ) )
            // InternalScgParser.g:340:3: ( rule__SnomedIdentifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getGroup()); 
            }
            // InternalScgParser.g:341:3: ( rule__SnomedIdentifier__Group__0 )
            // InternalScgParser.g:341:4: rule__SnomedIdentifier__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleSnomedIdentifier"


    // $ANTLR start "entryRuleNonNegativeInteger"
    // InternalScgParser.g:351:1: entryRuleNonNegativeInteger : ruleNonNegativeInteger EOF ;
    public final void entryRuleNonNegativeInteger() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalScgParser.g:355:1: ( ruleNonNegativeInteger EOF )
            // InternalScgParser.g:356:1: ruleNonNegativeInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeIntegerRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNonNegativeInteger"


    // $ANTLR start "ruleNonNegativeInteger"
    // InternalScgParser.g:366:1: ruleNonNegativeInteger : ( ( rule__NonNegativeInteger__Alternatives ) ) ;
    public final void ruleNonNegativeInteger() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:371:2: ( ( ( rule__NonNegativeInteger__Alternatives ) ) )
            // InternalScgParser.g:372:2: ( ( rule__NonNegativeInteger__Alternatives ) )
            {
            // InternalScgParser.g:372:2: ( ( rule__NonNegativeInteger__Alternatives ) )
            // InternalScgParser.g:373:3: ( rule__NonNegativeInteger__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); 
            }
            // InternalScgParser.g:374:3: ( rule__NonNegativeInteger__Alternatives )
            // InternalScgParser.g:374:4: rule__NonNegativeInteger__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeInteger__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNonNegativeInteger"


    // $ANTLR start "entryRuleInteger"
    // InternalScgParser.g:384:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalScgParser.g:388:1: ( ruleInteger EOF )
            // InternalScgParser.g:389:1: ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalScgParser.g:399:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:404:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalScgParser.g:405:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalScgParser.g:405:2: ( ( rule__Integer__Group__0 ) )
            // InternalScgParser.g:406:3: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalScgParser.g:407:3: ( rule__Integer__Group__0 )
            // InternalScgParser.g:407:4: rule__Integer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Integer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDecimal"
    // InternalScgParser.g:417:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalScgParser.g:421:1: ( ruleDecimal EOF )
            // InternalScgParser.g:422:1: ruleDecimal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDecimal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // InternalScgParser.g:432:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:437:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // InternalScgParser.g:438:2: ( ( rule__Decimal__Group__0 ) )
            {
            // InternalScgParser.g:438:2: ( ( rule__Decimal__Group__0 ) )
            // InternalScgParser.g:439:3: ( rule__Decimal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalAccess().getGroup()); 
            }
            // InternalScgParser.g:440:3: ( rule__Decimal__Group__0 )
            // InternalScgParser.g:440:4: rule__Decimal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Decimal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleNonNegativeDecimal"
    // InternalScgParser.g:450:1: entryRuleNonNegativeDecimal : ruleNonNegativeDecimal EOF ;
    public final void entryRuleNonNegativeDecimal() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalScgParser.g:454:1: ( ruleNonNegativeDecimal EOF )
            // InternalScgParser.g:455:1: ruleNonNegativeDecimal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeDecimalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeDecimalRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNonNegativeDecimal"


    // $ANTLR start "ruleNonNegativeDecimal"
    // InternalScgParser.g:465:1: ruleNonNegativeDecimal : ( ( rule__NonNegativeDecimal__Group__0 ) ) ;
    public final void ruleNonNegativeDecimal() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:470:2: ( ( ( rule__NonNegativeDecimal__Group__0 ) ) )
            // InternalScgParser.g:471:2: ( ( rule__NonNegativeDecimal__Group__0 ) )
            {
            // InternalScgParser.g:471:2: ( ( rule__NonNegativeDecimal__Group__0 ) )
            // InternalScgParser.g:472:3: ( rule__NonNegativeDecimal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeDecimalAccess().getGroup()); 
            }
            // InternalScgParser.g:473:3: ( rule__NonNegativeDecimal__Group__0 )
            // InternalScgParser.g:473:4: rule__NonNegativeDecimal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeDecimal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeDecimalAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNonNegativeDecimal"


    // $ANTLR start "rule__Expression__Alternatives_1_0"
    // InternalScgParser.g:482:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__PrimitiveAssignment_1_0_0 ) ) | ( RULE_EQUIVALENT_TO ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:486:1: ( ( ( rule__Expression__PrimitiveAssignment_1_0_0 ) ) | ( RULE_EQUIVALENT_TO ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_SUBTYPE_OF) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_EQUIVALENT_TO) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalScgParser.g:487:2: ( ( rule__Expression__PrimitiveAssignment_1_0_0 ) )
                    {
                    // InternalScgParser.g:487:2: ( ( rule__Expression__PrimitiveAssignment_1_0_0 ) )
                    // InternalScgParser.g:488:3: ( rule__Expression__PrimitiveAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getPrimitiveAssignment_1_0_0()); 
                    }
                    // InternalScgParser.g:489:3: ( rule__Expression__PrimitiveAssignment_1_0_0 )
                    // InternalScgParser.g:489:4: rule__Expression__PrimitiveAssignment_1_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Expression__PrimitiveAssignment_1_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getPrimitiveAssignment_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScgParser.g:493:2: ( RULE_EQUIVALENT_TO )
                    {
                    // InternalScgParser.g:493:2: ( RULE_EQUIVALENT_TO )
                    // InternalScgParser.g:494:3: RULE_EQUIVALENT_TO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getEQUIVALENT_TOTerminalRuleCall_1_0_1()); 
                    }
                    match(input,RULE_EQUIVALENT_TO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getEQUIVALENT_TOTerminalRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives_1_0"


    // $ANTLR start "rule__Refinement__Alternatives_0"
    // InternalScgParser.g:503:1: rule__Refinement__Alternatives_0 : ( ( ( rule__Refinement__Group_0_0__0 ) ) | ( ( rule__Refinement__GroupsAssignment_0_1 ) ) );
    public final void rule__Refinement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:507:1: ( ( ( rule__Refinement__Group_0_0__0 ) ) | ( ( rule__Refinement__GroupsAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DIGIT_NONZERO) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_CURLY_OPEN) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalScgParser.g:508:2: ( ( rule__Refinement__Group_0_0__0 ) )
                    {
                    // InternalScgParser.g:508:2: ( ( rule__Refinement__Group_0_0__0 ) )
                    // InternalScgParser.g:509:3: ( rule__Refinement__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRefinementAccess().getGroup_0_0()); 
                    }
                    // InternalScgParser.g:510:3: ( rule__Refinement__Group_0_0__0 )
                    // InternalScgParser.g:510:4: rule__Refinement__Group_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Refinement__Group_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRefinementAccess().getGroup_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScgParser.g:514:2: ( ( rule__Refinement__GroupsAssignment_0_1 ) )
                    {
                    // InternalScgParser.g:514:2: ( ( rule__Refinement__GroupsAssignment_0_1 ) )
                    // InternalScgParser.g:515:3: ( rule__Refinement__GroupsAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRefinementAccess().getGroupsAssignment_0_1()); 
                    }
                    // InternalScgParser.g:516:3: ( rule__Refinement__GroupsAssignment_0_1 )
                    // InternalScgParser.g:516:4: rule__Refinement__GroupsAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Refinement__GroupsAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRefinementAccess().getGroupsAssignment_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Alternatives_0"


    // $ANTLR start "rule__AttributeValue__Alternatives"
    // InternalScgParser.g:524:1: rule__AttributeValue__Alternatives : ( ( ruleConceptReference ) | ( ( rule__AttributeValue__Group_1__0 ) ) | ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleDecimalValue ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:528:1: ( ( ruleConceptReference ) | ( ( rule__AttributeValue__Group_1__0 ) ) | ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleDecimalValue ) )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalScgParser.g:529:2: ( ruleConceptReference )
                    {
                    // InternalScgParser.g:529:2: ( ruleConceptReference )
                    // InternalScgParser.g:530:3: ruleConceptReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeValueAccess().getConceptReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleConceptReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeValueAccess().getConceptReferenceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScgParser.g:535:2: ( ( rule__AttributeValue__Group_1__0 ) )
                    {
                    // InternalScgParser.g:535:2: ( ( rule__AttributeValue__Group_1__0 ) )
                    // InternalScgParser.g:536:3: ( rule__AttributeValue__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeValueAccess().getGroup_1()); 
                    }
                    // InternalScgParser.g:537:3: ( rule__AttributeValue__Group_1__0 )
                    // InternalScgParser.g:537:4: rule__AttributeValue__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AttributeValue__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeValueAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalScgParser.g:541:2: ( ruleStringValue )
                    {
                    // InternalScgParser.g:541:2: ( ruleStringValue )
                    // InternalScgParser.g:542:3: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeValueAccess().getStringValueParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeValueAccess().getStringValueParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalScgParser.g:547:2: ( ruleIntegerValue )
                    {
                    // InternalScgParser.g:547:2: ( ruleIntegerValue )
                    // InternalScgParser.g:548:3: ruleIntegerValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeValueAccess().getIntegerValueParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIntegerValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeValueAccess().getIntegerValueParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalScgParser.g:553:2: ( ruleDecimalValue )
                    {
                    // InternalScgParser.g:553:2: ( ruleDecimalValue )
                    // InternalScgParser.g:554:3: ruleDecimalValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeValueAccess().getDecimalValueParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDecimalValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeValueAccess().getDecimalValueParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Alternatives"


    // $ANTLR start "rule__SnomedIdentifier__Alternatives_1"
    // InternalScgParser.g:563:1: rule__SnomedIdentifier__Alternatives_1 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:567:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DIGIT_NONZERO) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ZERO) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalScgParser.g:568:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalScgParser.g:568:2: ( RULE_DIGIT_NONZERO )
                    // InternalScgParser.g:569:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScgParser.g:574:2: ( RULE_ZERO )
                    {
                    // InternalScgParser.g:574:2: ( RULE_ZERO )
                    // InternalScgParser.g:575:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Alternatives_1"


    // $ANTLR start "rule__SnomedIdentifier__Alternatives_2"
    // InternalScgParser.g:584:1: rule__SnomedIdentifier__Alternatives_2 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:588:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DIGIT_NONZERO) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ZERO) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalScgParser.g:589:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalScgParser.g:589:2: ( RULE_DIGIT_NONZERO )
                    // InternalScgParser.g:590:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScgParser.g:595:2: ( RULE_ZERO )
                    {
                    // InternalScgParser.g:595:2: ( RULE_ZERO )
                    // InternalScgParser.g:596:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Alternatives_2"


    // $ANTLR start "rule__SnomedIdentifier__Alternatives_3"
    // InternalScgParser.g:605:1: rule__SnomedIdentifier__Alternatives_3 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:609:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DIGIT_NONZERO) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ZERO) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalScgParser.g:610:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalScgParser.g:610:2: ( RULE_DIGIT_NONZERO )
                    // InternalScgParser.g:611:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScgParser.g:616:2: ( RULE_ZERO )
                    {
                    // InternalScgParser.g:616:2: ( RULE_ZERO )
                    // InternalScgParser.g:617:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Alternatives_3"


    // $ANTLR start "rule__SnomedIdentifier__Alternatives_4"
    // InternalScgParser.g:626:1: rule__SnomedIdentifier__Alternatives_4 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:630:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DIGIT_NONZERO) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ZERO) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalScgParser.g:631:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalScgParser.g:631:2: ( RULE_DIGIT_NONZERO )
                    // InternalScgParser.g:632:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScgParser.g:637:2: ( RULE_ZERO )
                    {
                    // InternalScgParser.g:637:2: ( RULE_ZERO )
                    // InternalScgParser.g:638:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Alternatives_4"


    // $ANTLR start "rule__SnomedIdentifier__Alternatives_5"
    // InternalScgParser.g:647:1: rule__SnomedIdentifier__Alternatives_5 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:651:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DIGIT_NONZERO) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ZERO) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalScgParser.g:652:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalScgParser.g:652:2: ( RULE_DIGIT_NONZERO )
                    // InternalScgParser.g:653:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScgParser.g:658:2: ( RULE_ZERO )
                    {
                    // InternalScgParser.g:658:2: ( RULE_ZERO )
                    // InternalScgParser.g:659:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Alternatives_5"


    // $ANTLR start "rule__NonNegativeInteger__Alternatives"
    // InternalScgParser.g:668:1: rule__NonNegativeInteger__Alternatives : ( ( RULE_ZERO ) | ( ( rule__NonNegativeInteger__Group_1__0 ) ) );
    public final void rule__NonNegativeInteger__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:672:1: ( ( RULE_ZERO ) | ( ( rule__NonNegativeInteger__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ZERO) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_DIGIT_NONZERO) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalScgParser.g:673:2: ( RULE_ZERO )
                    {
                    // InternalScgParser.g:673:2: ( RULE_ZERO )
                    // InternalScgParser.g:674:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScgParser.g:679:2: ( ( rule__NonNegativeInteger__Group_1__0 ) )
                    {
                    // InternalScgParser.g:679:2: ( ( rule__NonNegativeInteger__Group_1__0 ) )
                    // InternalScgParser.g:680:3: ( rule__NonNegativeInteger__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonNegativeIntegerAccess().getGroup_1()); 
                    }
                    // InternalScgParser.g:681:3: ( rule__NonNegativeInteger__Group_1__0 )
                    // InternalScgParser.g:681:4: rule__NonNegativeInteger__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__NonNegativeInteger__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonNegativeIntegerAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeInteger__Alternatives"


    // $ANTLR start "rule__NonNegativeInteger__Alternatives_1_1"
    // InternalScgParser.g:689:1: rule__NonNegativeInteger__Alternatives_1_1 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__NonNegativeInteger__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:693:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DIGIT_NONZERO) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ZERO) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalScgParser.g:694:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalScgParser.g:694:2: ( RULE_DIGIT_NONZERO )
                    // InternalScgParser.g:695:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScgParser.g:700:2: ( RULE_ZERO )
                    {
                    // InternalScgParser.g:700:2: ( RULE_ZERO )
                    // InternalScgParser.g:701:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeInteger__Alternatives_1_1"


    // $ANTLR start "rule__Integer__Alternatives_0"
    // InternalScgParser.g:710:1: rule__Integer__Alternatives_0 : ( ( RULE_PLUS ) | ( RULE_DASH ) );
    public final void rule__Integer__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:714:1: ( ( RULE_PLUS ) | ( RULE_DASH ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_PLUS) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_DASH) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalScgParser.g:715:2: ( RULE_PLUS )
                    {
                    // InternalScgParser.g:715:2: ( RULE_PLUS )
                    // InternalScgParser.g:716:3: RULE_PLUS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_PLUS,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScgParser.g:721:2: ( RULE_DASH )
                    {
                    // InternalScgParser.g:721:2: ( RULE_DASH )
                    // InternalScgParser.g:722:3: RULE_DASH
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_DASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Alternatives_0"


    // $ANTLR start "rule__Decimal__Alternatives_0"
    // InternalScgParser.g:731:1: rule__Decimal__Alternatives_0 : ( ( RULE_PLUS ) | ( RULE_DASH ) );
    public final void rule__Decimal__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:735:1: ( ( RULE_PLUS ) | ( RULE_DASH ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_PLUS) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_DASH) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalScgParser.g:736:2: ( RULE_PLUS )
                    {
                    // InternalScgParser.g:736:2: ( RULE_PLUS )
                    // InternalScgParser.g:737:3: RULE_PLUS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_PLUS,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScgParser.g:742:2: ( RULE_DASH )
                    {
                    // InternalScgParser.g:742:2: ( RULE_DASH )
                    // InternalScgParser.g:743:3: RULE_DASH
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_DASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Alternatives_0"


    // $ANTLR start "rule__NonNegativeDecimal__Alternatives_2"
    // InternalScgParser.g:752:1: rule__NonNegativeDecimal__Alternatives_2 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__NonNegativeDecimal__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:756:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DIGIT_NONZERO) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ZERO) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalScgParser.g:757:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalScgParser.g:757:2: ( RULE_DIGIT_NONZERO )
                    // InternalScgParser.g:758:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalScgParser.g:763:2: ( RULE_ZERO )
                    {
                    // InternalScgParser.g:763:2: ( RULE_ZERO )
                    // InternalScgParser.g:764:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Alternatives_2"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalScgParser.g:773:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:777:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalScgParser.g:778:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalScgParser.g:785:1: rule__Expression__Group__0__Impl : ( () ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:789:1: ( ( () ) )
            // InternalScgParser.g:790:1: ( () )
            {
            // InternalScgParser.g:790:1: ( () )
            // InternalScgParser.g:791:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionAction_0()); 
            }
            // InternalScgParser.g:792:2: ()
            // InternalScgParser.g:792:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalScgParser.g:800:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:804:1: ( rule__Expression__Group__1__Impl )
            // InternalScgParser.g:805:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalScgParser.g:811:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:815:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalScgParser.g:816:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalScgParser.g:816:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalScgParser.g:817:2: ( rule__Expression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1()); 
            }
            // InternalScgParser.g:818:2: ( rule__Expression__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_EQUIVALENT_TO && LA14_0<=RULE_SUBTYPE_OF)||LA14_0==RULE_DIGIT_NONZERO) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalScgParser.g:818:3: rule__Expression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalScgParser.g:827:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:831:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalScgParser.g:832:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalScgParser.g:839:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 )? ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:843:1: ( ( ( rule__Expression__Alternatives_1_0 )? ) )
            // InternalScgParser.g:844:1: ( ( rule__Expression__Alternatives_1_0 )? )
            {
            // InternalScgParser.g:844:1: ( ( rule__Expression__Alternatives_1_0 )? )
            // InternalScgParser.g:845:2: ( rule__Expression__Alternatives_1_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            }
            // InternalScgParser.g:846:2: ( rule__Expression__Alternatives_1_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_EQUIVALENT_TO && LA15_0<=RULE_SUBTYPE_OF)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalScgParser.g:846:3: rule__Expression__Alternatives_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Expression__Alternatives_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalScgParser.g:854:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:858:1: ( rule__Expression__Group_1__1__Impl )
            // InternalScgParser.g:859:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalScgParser.g:865:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:869:1: ( ( ( rule__Expression__ExpressionAssignment_1_1 ) ) )
            // InternalScgParser.g:870:1: ( ( rule__Expression__ExpressionAssignment_1_1 ) )
            {
            // InternalScgParser.g:870:1: ( ( rule__Expression__ExpressionAssignment_1_1 ) )
            // InternalScgParser.g:871:2: ( rule__Expression__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionAssignment_1_1()); 
            }
            // InternalScgParser.g:872:2: ( rule__Expression__ExpressionAssignment_1_1 )
            // InternalScgParser.g:872:3: rule__Expression__ExpressionAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__ExpressionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpressionAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__SubExpression__Group__0"
    // InternalScgParser.g:881:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:885:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // InternalScgParser.g:886:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__SubExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group__0"


    // $ANTLR start "rule__SubExpression__Group__0__Impl"
    // InternalScgParser.g:893:1: rule__SubExpression__Group__0__Impl : ( ( rule__SubExpression__FocusConceptsAssignment_0 ) ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:897:1: ( ( ( rule__SubExpression__FocusConceptsAssignment_0 ) ) )
            // InternalScgParser.g:898:1: ( ( rule__SubExpression__FocusConceptsAssignment_0 ) )
            {
            // InternalScgParser.g:898:1: ( ( rule__SubExpression__FocusConceptsAssignment_0 ) )
            // InternalScgParser.g:899:2: ( rule__SubExpression__FocusConceptsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_0()); 
            }
            // InternalScgParser.g:900:2: ( rule__SubExpression__FocusConceptsAssignment_0 )
            // InternalScgParser.g:900:3: rule__SubExpression__FocusConceptsAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__FocusConceptsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group__0__Impl"


    // $ANTLR start "rule__SubExpression__Group__1"
    // InternalScgParser.g:908:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl rule__SubExpression__Group__2 ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:912:1: ( rule__SubExpression__Group__1__Impl rule__SubExpression__Group__2 )
            // InternalScgParser.g:913:2: rule__SubExpression__Group__1__Impl rule__SubExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__SubExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group__1"


    // $ANTLR start "rule__SubExpression__Group__1__Impl"
    // InternalScgParser.g:920:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:924:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // InternalScgParser.g:925:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // InternalScgParser.g:925:1: ( ( rule__SubExpression__Group_1__0 )* )
            // InternalScgParser.g:926:2: ( rule__SubExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // InternalScgParser.g:927:2: ( rule__SubExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_PLUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalScgParser.g:927:3: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    rule__SubExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group__1__Impl"


    // $ANTLR start "rule__SubExpression__Group__2"
    // InternalScgParser.g:935:1: rule__SubExpression__Group__2 : rule__SubExpression__Group__2__Impl ;
    public final void rule__SubExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:939:1: ( rule__SubExpression__Group__2__Impl )
            // InternalScgParser.g:940:2: rule__SubExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group__2"


    // $ANTLR start "rule__SubExpression__Group__2__Impl"
    // InternalScgParser.g:946:1: rule__SubExpression__Group__2__Impl : ( ( rule__SubExpression__Group_2__0 )? ) ;
    public final void rule__SubExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:950:1: ( ( ( rule__SubExpression__Group_2__0 )? ) )
            // InternalScgParser.g:951:1: ( ( rule__SubExpression__Group_2__0 )? )
            {
            // InternalScgParser.g:951:1: ( ( rule__SubExpression__Group_2__0 )? )
            // InternalScgParser.g:952:2: ( rule__SubExpression__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_2()); 
            }
            // InternalScgParser.g:953:2: ( rule__SubExpression__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_COLON) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalScgParser.g:953:3: rule__SubExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__SubExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group__2__Impl"


    // $ANTLR start "rule__SubExpression__Group_1__0"
    // InternalScgParser.g:962:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:966:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // InternalScgParser.g:967:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__SubExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1__0"


    // $ANTLR start "rule__SubExpression__Group_1__0__Impl"
    // InternalScgParser.g:974:1: rule__SubExpression__Group_1__0__Impl : ( RULE_PLUS ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:978:1: ( ( RULE_PLUS ) )
            // InternalScgParser.g:979:1: ( RULE_PLUS )
            {
            // InternalScgParser.g:979:1: ( RULE_PLUS )
            // InternalScgParser.g:980:2: RULE_PLUS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getPLUSTerminalRuleCall_1_0()); 
            }
            match(input,RULE_PLUS,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getPLUSTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SubExpression__Group_1__1"
    // InternalScgParser.g:989:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:993:1: ( rule__SubExpression__Group_1__1__Impl )
            // InternalScgParser.g:994:2: rule__SubExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1__1"


    // $ANTLR start "rule__SubExpression__Group_1__1__Impl"
    // InternalScgParser.g:1000:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__FocusConceptsAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1004:1: ( ( ( rule__SubExpression__FocusConceptsAssignment_1_1 ) ) )
            // InternalScgParser.g:1005:1: ( ( rule__SubExpression__FocusConceptsAssignment_1_1 ) )
            {
            // InternalScgParser.g:1005:1: ( ( rule__SubExpression__FocusConceptsAssignment_1_1 ) )
            // InternalScgParser.g:1006:2: ( rule__SubExpression__FocusConceptsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_1_1()); 
            }
            // InternalScgParser.g:1007:2: ( rule__SubExpression__FocusConceptsAssignment_1_1 )
            // InternalScgParser.g:1007:3: rule__SubExpression__FocusConceptsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__FocusConceptsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getFocusConceptsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SubExpression__Group_2__0"
    // InternalScgParser.g:1016:1: rule__SubExpression__Group_2__0 : rule__SubExpression__Group_2__0__Impl rule__SubExpression__Group_2__1 ;
    public final void rule__SubExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1020:1: ( rule__SubExpression__Group_2__0__Impl rule__SubExpression__Group_2__1 )
            // InternalScgParser.g:1021:2: rule__SubExpression__Group_2__0__Impl rule__SubExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__SubExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_2__0"


    // $ANTLR start "rule__SubExpression__Group_2__0__Impl"
    // InternalScgParser.g:1028:1: rule__SubExpression__Group_2__0__Impl : ( RULE_COLON ) ;
    public final void rule__SubExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1032:1: ( ( RULE_COLON ) )
            // InternalScgParser.g:1033:1: ( RULE_COLON )
            {
            // InternalScgParser.g:1033:1: ( RULE_COLON )
            // InternalScgParser.g:1034:2: RULE_COLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getCOLONTerminalRuleCall_2_0()); 
            }
            match(input,RULE_COLON,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getCOLONTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_2__0__Impl"


    // $ANTLR start "rule__SubExpression__Group_2__1"
    // InternalScgParser.g:1043:1: rule__SubExpression__Group_2__1 : rule__SubExpression__Group_2__1__Impl ;
    public final void rule__SubExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1047:1: ( rule__SubExpression__Group_2__1__Impl )
            // InternalScgParser.g:1048:2: rule__SubExpression__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_2__1"


    // $ANTLR start "rule__SubExpression__Group_2__1__Impl"
    // InternalScgParser.g:1054:1: rule__SubExpression__Group_2__1__Impl : ( ( rule__SubExpression__RefinementAssignment_2_1 ) ) ;
    public final void rule__SubExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1058:1: ( ( ( rule__SubExpression__RefinementAssignment_2_1 ) ) )
            // InternalScgParser.g:1059:1: ( ( rule__SubExpression__RefinementAssignment_2_1 ) )
            {
            // InternalScgParser.g:1059:1: ( ( rule__SubExpression__RefinementAssignment_2_1 ) )
            // InternalScgParser.g:1060:2: ( rule__SubExpression__RefinementAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getRefinementAssignment_2_1()); 
            }
            // InternalScgParser.g:1061:2: ( rule__SubExpression__RefinementAssignment_2_1 )
            // InternalScgParser.g:1061:3: rule__SubExpression__RefinementAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpression__RefinementAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getRefinementAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__Group_2__1__Impl"


    // $ANTLR start "rule__Refinement__Group__0"
    // InternalScgParser.g:1070:1: rule__Refinement__Group__0 : rule__Refinement__Group__0__Impl rule__Refinement__Group__1 ;
    public final void rule__Refinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1074:1: ( rule__Refinement__Group__0__Impl rule__Refinement__Group__1 )
            // InternalScgParser.g:1075:2: rule__Refinement__Group__0__Impl rule__Refinement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Refinement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Refinement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group__0"


    // $ANTLR start "rule__Refinement__Group__0__Impl"
    // InternalScgParser.g:1082:1: rule__Refinement__Group__0__Impl : ( ( rule__Refinement__Alternatives_0 ) ) ;
    public final void rule__Refinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1086:1: ( ( ( rule__Refinement__Alternatives_0 ) ) )
            // InternalScgParser.g:1087:1: ( ( rule__Refinement__Alternatives_0 ) )
            {
            // InternalScgParser.g:1087:1: ( ( rule__Refinement__Alternatives_0 ) )
            // InternalScgParser.g:1088:2: ( rule__Refinement__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getAlternatives_0()); 
            }
            // InternalScgParser.g:1089:2: ( rule__Refinement__Alternatives_0 )
            // InternalScgParser.g:1089:3: rule__Refinement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Refinement__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group__0__Impl"


    // $ANTLR start "rule__Refinement__Group__1"
    // InternalScgParser.g:1097:1: rule__Refinement__Group__1 : rule__Refinement__Group__1__Impl ;
    public final void rule__Refinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1101:1: ( rule__Refinement__Group__1__Impl )
            // InternalScgParser.g:1102:2: rule__Refinement__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Refinement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group__1"


    // $ANTLR start "rule__Refinement__Group__1__Impl"
    // InternalScgParser.g:1108:1: rule__Refinement__Group__1__Impl : ( ( rule__Refinement__Group_1__0 )* ) ;
    public final void rule__Refinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1112:1: ( ( ( rule__Refinement__Group_1__0 )* ) )
            // InternalScgParser.g:1113:1: ( ( rule__Refinement__Group_1__0 )* )
            {
            // InternalScgParser.g:1113:1: ( ( rule__Refinement__Group_1__0 )* )
            // InternalScgParser.g:1114:2: ( rule__Refinement__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getGroup_1()); 
            }
            // InternalScgParser.g:1115:2: ( rule__Refinement__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_CURLY_OPEN||LA18_0==RULE_COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalScgParser.g:1115:3: rule__Refinement__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__Refinement__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group__1__Impl"


    // $ANTLR start "rule__Refinement__Group_0_0__0"
    // InternalScgParser.g:1124:1: rule__Refinement__Group_0_0__0 : rule__Refinement__Group_0_0__0__Impl rule__Refinement__Group_0_0__1 ;
    public final void rule__Refinement__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1128:1: ( rule__Refinement__Group_0_0__0__Impl rule__Refinement__Group_0_0__1 )
            // InternalScgParser.g:1129:2: rule__Refinement__Group_0_0__0__Impl rule__Refinement__Group_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Refinement__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Refinement__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group_0_0__0"


    // $ANTLR start "rule__Refinement__Group_0_0__0__Impl"
    // InternalScgParser.g:1136:1: rule__Refinement__Group_0_0__0__Impl : ( ( rule__Refinement__AttributesAssignment_0_0_0 ) ) ;
    public final void rule__Refinement__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1140:1: ( ( ( rule__Refinement__AttributesAssignment_0_0_0 ) ) )
            // InternalScgParser.g:1141:1: ( ( rule__Refinement__AttributesAssignment_0_0_0 ) )
            {
            // InternalScgParser.g:1141:1: ( ( rule__Refinement__AttributesAssignment_0_0_0 ) )
            // InternalScgParser.g:1142:2: ( rule__Refinement__AttributesAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_0()); 
            }
            // InternalScgParser.g:1143:2: ( rule__Refinement__AttributesAssignment_0_0_0 )
            // InternalScgParser.g:1143:3: rule__Refinement__AttributesAssignment_0_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Refinement__AttributesAssignment_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group_0_0__0__Impl"


    // $ANTLR start "rule__Refinement__Group_0_0__1"
    // InternalScgParser.g:1151:1: rule__Refinement__Group_0_0__1 : rule__Refinement__Group_0_0__1__Impl ;
    public final void rule__Refinement__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1155:1: ( rule__Refinement__Group_0_0__1__Impl )
            // InternalScgParser.g:1156:2: rule__Refinement__Group_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Refinement__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group_0_0__1"


    // $ANTLR start "rule__Refinement__Group_0_0__1__Impl"
    // InternalScgParser.g:1162:1: rule__Refinement__Group_0_0__1__Impl : ( ( rule__Refinement__Group_0_0_1__0 )* ) ;
    public final void rule__Refinement__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1166:1: ( ( ( rule__Refinement__Group_0_0_1__0 )* ) )
            // InternalScgParser.g:1167:1: ( ( rule__Refinement__Group_0_0_1__0 )* )
            {
            // InternalScgParser.g:1167:1: ( ( rule__Refinement__Group_0_0_1__0 )* )
            // InternalScgParser.g:1168:2: ( rule__Refinement__Group_0_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getGroup_0_0_1()); 
            }
            // InternalScgParser.g:1169:2: ( rule__Refinement__Group_0_0_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMA) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_DIGIT_NONZERO) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalScgParser.g:1169:3: rule__Refinement__Group_0_0_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__Refinement__Group_0_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getGroup_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group_0_0__1__Impl"


    // $ANTLR start "rule__Refinement__Group_0_0_1__0"
    // InternalScgParser.g:1178:1: rule__Refinement__Group_0_0_1__0 : rule__Refinement__Group_0_0_1__0__Impl rule__Refinement__Group_0_0_1__1 ;
    public final void rule__Refinement__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1182:1: ( rule__Refinement__Group_0_0_1__0__Impl rule__Refinement__Group_0_0_1__1 )
            // InternalScgParser.g:1183:2: rule__Refinement__Group_0_0_1__0__Impl rule__Refinement__Group_0_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Refinement__Group_0_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Refinement__Group_0_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group_0_0_1__0"


    // $ANTLR start "rule__Refinement__Group_0_0_1__0__Impl"
    // InternalScgParser.g:1190:1: rule__Refinement__Group_0_0_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Refinement__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1194:1: ( ( RULE_COMMA ) )
            // InternalScgParser.g:1195:1: ( RULE_COMMA )
            {
            // InternalScgParser.g:1195:1: ( RULE_COMMA )
            // InternalScgParser.g:1196:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_0_0_1_0()); 
            }
            match(input,RULE_COMMA,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group_0_0_1__0__Impl"


    // $ANTLR start "rule__Refinement__Group_0_0_1__1"
    // InternalScgParser.g:1205:1: rule__Refinement__Group_0_0_1__1 : rule__Refinement__Group_0_0_1__1__Impl ;
    public final void rule__Refinement__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1209:1: ( rule__Refinement__Group_0_0_1__1__Impl )
            // InternalScgParser.g:1210:2: rule__Refinement__Group_0_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Refinement__Group_0_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group_0_0_1__1"


    // $ANTLR start "rule__Refinement__Group_0_0_1__1__Impl"
    // InternalScgParser.g:1216:1: rule__Refinement__Group_0_0_1__1__Impl : ( ( rule__Refinement__AttributesAssignment_0_0_1_1 ) ) ;
    public final void rule__Refinement__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1220:1: ( ( ( rule__Refinement__AttributesAssignment_0_0_1_1 ) ) )
            // InternalScgParser.g:1221:1: ( ( rule__Refinement__AttributesAssignment_0_0_1_1 ) )
            {
            // InternalScgParser.g:1221:1: ( ( rule__Refinement__AttributesAssignment_0_0_1_1 ) )
            // InternalScgParser.g:1222:2: ( rule__Refinement__AttributesAssignment_0_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_1_1()); 
            }
            // InternalScgParser.g:1223:2: ( rule__Refinement__AttributesAssignment_0_0_1_1 )
            // InternalScgParser.g:1223:3: rule__Refinement__AttributesAssignment_0_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Refinement__AttributesAssignment_0_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getAttributesAssignment_0_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group_0_0_1__1__Impl"


    // $ANTLR start "rule__Refinement__Group_1__0"
    // InternalScgParser.g:1232:1: rule__Refinement__Group_1__0 : rule__Refinement__Group_1__0__Impl rule__Refinement__Group_1__1 ;
    public final void rule__Refinement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1236:1: ( rule__Refinement__Group_1__0__Impl rule__Refinement__Group_1__1 )
            // InternalScgParser.g:1237:2: rule__Refinement__Group_1__0__Impl rule__Refinement__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Refinement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Refinement__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group_1__0"


    // $ANTLR start "rule__Refinement__Group_1__0__Impl"
    // InternalScgParser.g:1244:1: rule__Refinement__Group_1__0__Impl : ( ( RULE_COMMA )? ) ;
    public final void rule__Refinement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1248:1: ( ( ( RULE_COMMA )? ) )
            // InternalScgParser.g:1249:1: ( ( RULE_COMMA )? )
            {
            // InternalScgParser.g:1249:1: ( ( RULE_COMMA )? )
            // InternalScgParser.g:1250:2: ( RULE_COMMA )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_1_0()); 
            }
            // InternalScgParser.g:1251:2: ( RULE_COMMA )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_COMMA) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalScgParser.g:1251:3: RULE_COMMA
                    {
                    match(input,RULE_COMMA,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getCOMMATerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group_1__0__Impl"


    // $ANTLR start "rule__Refinement__Group_1__1"
    // InternalScgParser.g:1259:1: rule__Refinement__Group_1__1 : rule__Refinement__Group_1__1__Impl ;
    public final void rule__Refinement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1263:1: ( rule__Refinement__Group_1__1__Impl )
            // InternalScgParser.g:1264:2: rule__Refinement__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Refinement__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group_1__1"


    // $ANTLR start "rule__Refinement__Group_1__1__Impl"
    // InternalScgParser.g:1270:1: rule__Refinement__Group_1__1__Impl : ( ( rule__Refinement__GroupsAssignment_1_1 ) ) ;
    public final void rule__Refinement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1274:1: ( ( ( rule__Refinement__GroupsAssignment_1_1 ) ) )
            // InternalScgParser.g:1275:1: ( ( rule__Refinement__GroupsAssignment_1_1 ) )
            {
            // InternalScgParser.g:1275:1: ( ( rule__Refinement__GroupsAssignment_1_1 ) )
            // InternalScgParser.g:1276:2: ( rule__Refinement__GroupsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getGroupsAssignment_1_1()); 
            }
            // InternalScgParser.g:1277:2: ( rule__Refinement__GroupsAssignment_1_1 )
            // InternalScgParser.g:1277:3: rule__Refinement__GroupsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Refinement__GroupsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getGroupsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeGroup__Group__0"
    // InternalScgParser.g:1286:1: rule__AttributeGroup__Group__0 : rule__AttributeGroup__Group__0__Impl rule__AttributeGroup__Group__1 ;
    public final void rule__AttributeGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1290:1: ( rule__AttributeGroup__Group__0__Impl rule__AttributeGroup__Group__1 )
            // InternalScgParser.g:1291:2: rule__AttributeGroup__Group__0__Impl rule__AttributeGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__AttributeGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__Group__0"


    // $ANTLR start "rule__AttributeGroup__Group__0__Impl"
    // InternalScgParser.g:1298:1: rule__AttributeGroup__Group__0__Impl : ( RULE_CURLY_OPEN ) ;
    public final void rule__AttributeGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1302:1: ( ( RULE_CURLY_OPEN ) )
            // InternalScgParser.g:1303:1: ( RULE_CURLY_OPEN )
            {
            // InternalScgParser.g:1303:1: ( RULE_CURLY_OPEN )
            // InternalScgParser.g:1304:2: RULE_CURLY_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_0()); 
            }
            match(input,RULE_CURLY_OPEN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__Group__0__Impl"


    // $ANTLR start "rule__AttributeGroup__Group__1"
    // InternalScgParser.g:1313:1: rule__AttributeGroup__Group__1 : rule__AttributeGroup__Group__1__Impl rule__AttributeGroup__Group__2 ;
    public final void rule__AttributeGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1317:1: ( rule__AttributeGroup__Group__1__Impl rule__AttributeGroup__Group__2 )
            // InternalScgParser.g:1318:2: rule__AttributeGroup__Group__1__Impl rule__AttributeGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__AttributeGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__Group__1"


    // $ANTLR start "rule__AttributeGroup__Group__1__Impl"
    // InternalScgParser.g:1325:1: rule__AttributeGroup__Group__1__Impl : ( ( rule__AttributeGroup__AttributesAssignment_1 ) ) ;
    public final void rule__AttributeGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1329:1: ( ( ( rule__AttributeGroup__AttributesAssignment_1 ) ) )
            // InternalScgParser.g:1330:1: ( ( rule__AttributeGroup__AttributesAssignment_1 ) )
            {
            // InternalScgParser.g:1330:1: ( ( rule__AttributeGroup__AttributesAssignment_1 ) )
            // InternalScgParser.g:1331:2: ( rule__AttributeGroup__AttributesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_1()); 
            }
            // InternalScgParser.g:1332:2: ( rule__AttributeGroup__AttributesAssignment_1 )
            // InternalScgParser.g:1332:3: rule__AttributeGroup__AttributesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__AttributesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__Group__1__Impl"


    // $ANTLR start "rule__AttributeGroup__Group__2"
    // InternalScgParser.g:1340:1: rule__AttributeGroup__Group__2 : rule__AttributeGroup__Group__2__Impl rule__AttributeGroup__Group__3 ;
    public final void rule__AttributeGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1344:1: ( rule__AttributeGroup__Group__2__Impl rule__AttributeGroup__Group__3 )
            // InternalScgParser.g:1345:2: rule__AttributeGroup__Group__2__Impl rule__AttributeGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__AttributeGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__Group__2"


    // $ANTLR start "rule__AttributeGroup__Group__2__Impl"
    // InternalScgParser.g:1352:1: rule__AttributeGroup__Group__2__Impl : ( ( rule__AttributeGroup__Group_2__0 )* ) ;
    public final void rule__AttributeGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1356:1: ( ( ( rule__AttributeGroup__Group_2__0 )* ) )
            // InternalScgParser.g:1357:1: ( ( rule__AttributeGroup__Group_2__0 )* )
            {
            // InternalScgParser.g:1357:1: ( ( rule__AttributeGroup__Group_2__0 )* )
            // InternalScgParser.g:1358:2: ( rule__AttributeGroup__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getGroup_2()); 
            }
            // InternalScgParser.g:1359:2: ( rule__AttributeGroup__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalScgParser.g:1359:3: rule__AttributeGroup__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__AttributeGroup__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__Group__2__Impl"


    // $ANTLR start "rule__AttributeGroup__Group__3"
    // InternalScgParser.g:1367:1: rule__AttributeGroup__Group__3 : rule__AttributeGroup__Group__3__Impl ;
    public final void rule__AttributeGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1371:1: ( rule__AttributeGroup__Group__3__Impl )
            // InternalScgParser.g:1372:2: rule__AttributeGroup__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__Group__3"


    // $ANTLR start "rule__AttributeGroup__Group__3__Impl"
    // InternalScgParser.g:1378:1: rule__AttributeGroup__Group__3__Impl : ( RULE_CURLY_CLOSE ) ;
    public final void rule__AttributeGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1382:1: ( ( RULE_CURLY_CLOSE ) )
            // InternalScgParser.g:1383:1: ( RULE_CURLY_CLOSE )
            {
            // InternalScgParser.g:1383:1: ( RULE_CURLY_CLOSE )
            // InternalScgParser.g:1384:2: RULE_CURLY_CLOSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3()); 
            }
            match(input,RULE_CURLY_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__Group__3__Impl"


    // $ANTLR start "rule__AttributeGroup__Group_2__0"
    // InternalScgParser.g:1394:1: rule__AttributeGroup__Group_2__0 : rule__AttributeGroup__Group_2__0__Impl rule__AttributeGroup__Group_2__1 ;
    public final void rule__AttributeGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1398:1: ( rule__AttributeGroup__Group_2__0__Impl rule__AttributeGroup__Group_2__1 )
            // InternalScgParser.g:1399:2: rule__AttributeGroup__Group_2__0__Impl rule__AttributeGroup__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__AttributeGroup__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__Group_2__0"


    // $ANTLR start "rule__AttributeGroup__Group_2__0__Impl"
    // InternalScgParser.g:1406:1: rule__AttributeGroup__Group_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__AttributeGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1410:1: ( ( RULE_COMMA ) )
            // InternalScgParser.g:1411:1: ( RULE_COMMA )
            {
            // InternalScgParser.g:1411:1: ( RULE_COMMA )
            // InternalScgParser.g:1412:2: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getCOMMATerminalRuleCall_2_0()); 
            }
            match(input,RULE_COMMA,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getCOMMATerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__Group_2__0__Impl"


    // $ANTLR start "rule__AttributeGroup__Group_2__1"
    // InternalScgParser.g:1421:1: rule__AttributeGroup__Group_2__1 : rule__AttributeGroup__Group_2__1__Impl ;
    public final void rule__AttributeGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1425:1: ( rule__AttributeGroup__Group_2__1__Impl )
            // InternalScgParser.g:1426:2: rule__AttributeGroup__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__Group_2__1"


    // $ANTLR start "rule__AttributeGroup__Group_2__1__Impl"
    // InternalScgParser.g:1432:1: rule__AttributeGroup__Group_2__1__Impl : ( ( rule__AttributeGroup__AttributesAssignment_2_1 ) ) ;
    public final void rule__AttributeGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1436:1: ( ( ( rule__AttributeGroup__AttributesAssignment_2_1 ) ) )
            // InternalScgParser.g:1437:1: ( ( rule__AttributeGroup__AttributesAssignment_2_1 ) )
            {
            // InternalScgParser.g:1437:1: ( ( rule__AttributeGroup__AttributesAssignment_2_1 ) )
            // InternalScgParser.g:1438:2: ( rule__AttributeGroup__AttributesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_2_1()); 
            }
            // InternalScgParser.g:1439:2: ( rule__AttributeGroup__AttributesAssignment_2_1 )
            // InternalScgParser.g:1439:3: rule__AttributeGroup__AttributesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeGroup__AttributesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getAttributesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalScgParser.g:1448:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1452:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalScgParser.g:1453:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalScgParser.g:1460:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1464:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalScgParser.g:1465:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalScgParser.g:1465:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalScgParser.g:1466:2: ( rule__Attribute__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            }
            // InternalScgParser.g:1467:2: ( rule__Attribute__NameAssignment_0 )
            // InternalScgParser.g:1467:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalScgParser.g:1475:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1479:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalScgParser.g:1480:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalScgParser.g:1487:1: rule__Attribute__Group__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1491:1: ( ( RULE_EQUAL ) )
            // InternalScgParser.g:1492:1: ( RULE_EQUAL )
            {
            // InternalScgParser.g:1492:1: ( RULE_EQUAL )
            // InternalScgParser.g:1493:2: RULE_EQUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEQUALTerminalRuleCall_1()); 
            }
            match(input,RULE_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEQUALTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalScgParser.g:1502:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1506:1: ( rule__Attribute__Group__2__Impl )
            // InternalScgParser.g:1507:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalScgParser.g:1513:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__ValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1517:1: ( ( ( rule__Attribute__ValueAssignment_2 ) ) )
            // InternalScgParser.g:1518:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            {
            // InternalScgParser.g:1518:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            // InternalScgParser.g:1519:2: ( rule__Attribute__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_2()); 
            }
            // InternalScgParser.g:1520:2: ( rule__Attribute__ValueAssignment_2 )
            // InternalScgParser.g:1520:3: rule__Attribute__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__AttributeValue__Group_1__0"
    // InternalScgParser.g:1529:1: rule__AttributeValue__Group_1__0 : rule__AttributeValue__Group_1__0__Impl rule__AttributeValue__Group_1__1 ;
    public final void rule__AttributeValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1533:1: ( rule__AttributeValue__Group_1__0__Impl rule__AttributeValue__Group_1__1 )
            // InternalScgParser.g:1534:2: rule__AttributeValue__Group_1__0__Impl rule__AttributeValue__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__AttributeValue__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeValue__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Group_1__0"


    // $ANTLR start "rule__AttributeValue__Group_1__0__Impl"
    // InternalScgParser.g:1541:1: rule__AttributeValue__Group_1__0__Impl : ( RULE_ROUND_OPEN ) ;
    public final void rule__AttributeValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1545:1: ( ( RULE_ROUND_OPEN ) )
            // InternalScgParser.g:1546:1: ( RULE_ROUND_OPEN )
            {
            // InternalScgParser.g:1546:1: ( RULE_ROUND_OPEN )
            // InternalScgParser.g:1547:2: RULE_ROUND_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueAccess().getROUND_OPENTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueAccess().getROUND_OPENTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeValue__Group_1__1"
    // InternalScgParser.g:1556:1: rule__AttributeValue__Group_1__1 : rule__AttributeValue__Group_1__1__Impl rule__AttributeValue__Group_1__2 ;
    public final void rule__AttributeValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1560:1: ( rule__AttributeValue__Group_1__1__Impl rule__AttributeValue__Group_1__2 )
            // InternalScgParser.g:1561:2: rule__AttributeValue__Group_1__1__Impl rule__AttributeValue__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__AttributeValue__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeValue__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Group_1__1"


    // $ANTLR start "rule__AttributeValue__Group_1__1__Impl"
    // InternalScgParser.g:1568:1: rule__AttributeValue__Group_1__1__Impl : ( ruleSubExpression ) ;
    public final void rule__AttributeValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1572:1: ( ( ruleSubExpression ) )
            // InternalScgParser.g:1573:1: ( ruleSubExpression )
            {
            // InternalScgParser.g:1573:1: ( ruleSubExpression )
            // InternalScgParser.g:1574:2: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueAccess().getSubExpressionParserRuleCall_1_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueAccess().getSubExpressionParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeValue__Group_1__2"
    // InternalScgParser.g:1583:1: rule__AttributeValue__Group_1__2 : rule__AttributeValue__Group_1__2__Impl ;
    public final void rule__AttributeValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1587:1: ( rule__AttributeValue__Group_1__2__Impl )
            // InternalScgParser.g:1588:2: rule__AttributeValue__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeValue__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Group_1__2"


    // $ANTLR start "rule__AttributeValue__Group_1__2__Impl"
    // InternalScgParser.g:1594:1: rule__AttributeValue__Group_1__2__Impl : ( RULE_ROUND_CLOSE ) ;
    public final void rule__AttributeValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1598:1: ( ( RULE_ROUND_CLOSE ) )
            // InternalScgParser.g:1599:1: ( RULE_ROUND_CLOSE )
            {
            // InternalScgParser.g:1599:1: ( RULE_ROUND_CLOSE )
            // InternalScgParser.g:1600:2: RULE_ROUND_CLOSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueAccess().getROUND_CLOSETerminalRuleCall_1_2()); 
            }
            match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueAccess().getROUND_CLOSETerminalRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Group_1__2__Impl"


    // $ANTLR start "rule__IntegerValue__Group__0"
    // InternalScgParser.g:1610:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1614:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // InternalScgParser.g:1615:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__IntegerValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__0"


    // $ANTLR start "rule__IntegerValue__Group__0__Impl"
    // InternalScgParser.g:1622:1: rule__IntegerValue__Group__0__Impl : ( RULE_HASH ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1626:1: ( ( RULE_HASH ) )
            // InternalScgParser.g:1627:1: ( RULE_HASH )
            {
            // InternalScgParser.g:1627:1: ( RULE_HASH )
            // InternalScgParser.g:1628:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueAccess().getHASHTerminalRuleCall_0()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueAccess().getHASHTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__0__Impl"


    // $ANTLR start "rule__IntegerValue__Group__1"
    // InternalScgParser.g:1637:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1641:1: ( rule__IntegerValue__Group__1__Impl )
            // InternalScgParser.g:1642:2: rule__IntegerValue__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__1"


    // $ANTLR start "rule__IntegerValue__Group__1__Impl"
    // InternalScgParser.g:1648:1: rule__IntegerValue__Group__1__Impl : ( ( rule__IntegerValue__ValueAssignment_1 ) ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1652:1: ( ( ( rule__IntegerValue__ValueAssignment_1 ) ) )
            // InternalScgParser.g:1653:1: ( ( rule__IntegerValue__ValueAssignment_1 ) )
            {
            // InternalScgParser.g:1653:1: ( ( rule__IntegerValue__ValueAssignment_1 ) )
            // InternalScgParser.g:1654:2: ( rule__IntegerValue__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueAccess().getValueAssignment_1()); 
            }
            // InternalScgParser.g:1655:2: ( rule__IntegerValue__ValueAssignment_1 )
            // InternalScgParser.g:1655:3: rule__IntegerValue__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValue__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__1__Impl"


    // $ANTLR start "rule__DecimalValue__Group__0"
    // InternalScgParser.g:1664:1: rule__DecimalValue__Group__0 : rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 ;
    public final void rule__DecimalValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1668:1: ( rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1 )
            // InternalScgParser.g:1669:2: rule__DecimalValue__Group__0__Impl rule__DecimalValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__DecimalValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__0"


    // $ANTLR start "rule__DecimalValue__Group__0__Impl"
    // InternalScgParser.g:1676:1: rule__DecimalValue__Group__0__Impl : ( RULE_HASH ) ;
    public final void rule__DecimalValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1680:1: ( ( RULE_HASH ) )
            // InternalScgParser.g:1681:1: ( RULE_HASH )
            {
            // InternalScgParser.g:1681:1: ( RULE_HASH )
            // InternalScgParser.g:1682:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueAccess().getHASHTerminalRuleCall_0()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueAccess().getHASHTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__0__Impl"


    // $ANTLR start "rule__DecimalValue__Group__1"
    // InternalScgParser.g:1691:1: rule__DecimalValue__Group__1 : rule__DecimalValue__Group__1__Impl ;
    public final void rule__DecimalValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1695:1: ( rule__DecimalValue__Group__1__Impl )
            // InternalScgParser.g:1696:2: rule__DecimalValue__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__1"


    // $ANTLR start "rule__DecimalValue__Group__1__Impl"
    // InternalScgParser.g:1702:1: rule__DecimalValue__Group__1__Impl : ( ( rule__DecimalValue__ValueAssignment_1 ) ) ;
    public final void rule__DecimalValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1706:1: ( ( ( rule__DecimalValue__ValueAssignment_1 ) ) )
            // InternalScgParser.g:1707:1: ( ( rule__DecimalValue__ValueAssignment_1 ) )
            {
            // InternalScgParser.g:1707:1: ( ( rule__DecimalValue__ValueAssignment_1 ) )
            // InternalScgParser.g:1708:2: ( rule__DecimalValue__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueAccess().getValueAssignment_1()); 
            }
            // InternalScgParser.g:1709:2: ( rule__DecimalValue__ValueAssignment_1 )
            // InternalScgParser.g:1709:3: rule__DecimalValue__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValue__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__Group__1__Impl"


    // $ANTLR start "rule__ConceptReference__Group__0"
    // InternalScgParser.g:1718:1: rule__ConceptReference__Group__0 : rule__ConceptReference__Group__0__Impl rule__ConceptReference__Group__1 ;
    public final void rule__ConceptReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1722:1: ( rule__ConceptReference__Group__0__Impl rule__ConceptReference__Group__1 )
            // InternalScgParser.g:1723:2: rule__ConceptReference__Group__0__Impl rule__ConceptReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ConceptReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConceptReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptReference__Group__0"


    // $ANTLR start "rule__ConceptReference__Group__0__Impl"
    // InternalScgParser.g:1730:1: rule__ConceptReference__Group__0__Impl : ( ( rule__ConceptReference__IdAssignment_0 ) ) ;
    public final void rule__ConceptReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1734:1: ( ( ( rule__ConceptReference__IdAssignment_0 ) ) )
            // InternalScgParser.g:1735:1: ( ( rule__ConceptReference__IdAssignment_0 ) )
            {
            // InternalScgParser.g:1735:1: ( ( rule__ConceptReference__IdAssignment_0 ) )
            // InternalScgParser.g:1736:2: ( rule__ConceptReference__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptReferenceAccess().getIdAssignment_0()); 
            }
            // InternalScgParser.g:1737:2: ( rule__ConceptReference__IdAssignment_0 )
            // InternalScgParser.g:1737:3: rule__ConceptReference__IdAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConceptReference__IdAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptReferenceAccess().getIdAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptReference__Group__0__Impl"


    // $ANTLR start "rule__ConceptReference__Group__1"
    // InternalScgParser.g:1745:1: rule__ConceptReference__Group__1 : rule__ConceptReference__Group__1__Impl ;
    public final void rule__ConceptReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1749:1: ( rule__ConceptReference__Group__1__Impl )
            // InternalScgParser.g:1750:2: rule__ConceptReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConceptReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptReference__Group__1"


    // $ANTLR start "rule__ConceptReference__Group__1__Impl"
    // InternalScgParser.g:1756:1: rule__ConceptReference__Group__1__Impl : ( ( rule__ConceptReference__TermAssignment_1 )? ) ;
    public final void rule__ConceptReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1760:1: ( ( ( rule__ConceptReference__TermAssignment_1 )? ) )
            // InternalScgParser.g:1761:1: ( ( rule__ConceptReference__TermAssignment_1 )? )
            {
            // InternalScgParser.g:1761:1: ( ( rule__ConceptReference__TermAssignment_1 )? )
            // InternalScgParser.g:1762:2: ( rule__ConceptReference__TermAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptReferenceAccess().getTermAssignment_1()); 
            }
            // InternalScgParser.g:1763:2: ( rule__ConceptReference__TermAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_TERM_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalScgParser.g:1763:3: rule__ConceptReference__TermAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ConceptReference__TermAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptReferenceAccess().getTermAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptReference__Group__1__Impl"


    // $ANTLR start "rule__SnomedIdentifier__Group__0"
    // InternalScgParser.g:1772:1: rule__SnomedIdentifier__Group__0 : rule__SnomedIdentifier__Group__0__Impl rule__SnomedIdentifier__Group__1 ;
    public final void rule__SnomedIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1776:1: ( rule__SnomedIdentifier__Group__0__Impl rule__SnomedIdentifier__Group__1 )
            // InternalScgParser.g:1777:2: rule__SnomedIdentifier__Group__0__Impl rule__SnomedIdentifier__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__SnomedIdentifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__0"


    // $ANTLR start "rule__SnomedIdentifier__Group__0__Impl"
    // InternalScgParser.g:1784:1: rule__SnomedIdentifier__Group__0__Impl : ( RULE_DIGIT_NONZERO ) ;
    public final void rule__SnomedIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1788:1: ( ( RULE_DIGIT_NONZERO ) )
            // InternalScgParser.g:1789:1: ( RULE_DIGIT_NONZERO )
            {
            // InternalScgParser.g:1789:1: ( RULE_DIGIT_NONZERO )
            // InternalScgParser.g:1790:2: RULE_DIGIT_NONZERO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); 
            }
            match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__0__Impl"


    // $ANTLR start "rule__SnomedIdentifier__Group__1"
    // InternalScgParser.g:1799:1: rule__SnomedIdentifier__Group__1 : rule__SnomedIdentifier__Group__1__Impl rule__SnomedIdentifier__Group__2 ;
    public final void rule__SnomedIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1803:1: ( rule__SnomedIdentifier__Group__1__Impl rule__SnomedIdentifier__Group__2 )
            // InternalScgParser.g:1804:2: rule__SnomedIdentifier__Group__1__Impl rule__SnomedIdentifier__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__SnomedIdentifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__1"


    // $ANTLR start "rule__SnomedIdentifier__Group__1__Impl"
    // InternalScgParser.g:1811:1: rule__SnomedIdentifier__Group__1__Impl : ( ( rule__SnomedIdentifier__Alternatives_1 ) ) ;
    public final void rule__SnomedIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1815:1: ( ( ( rule__SnomedIdentifier__Alternatives_1 ) ) )
            // InternalScgParser.g:1816:1: ( ( rule__SnomedIdentifier__Alternatives_1 ) )
            {
            // InternalScgParser.g:1816:1: ( ( rule__SnomedIdentifier__Alternatives_1 ) )
            // InternalScgParser.g:1817:2: ( rule__SnomedIdentifier__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1()); 
            }
            // InternalScgParser.g:1818:2: ( rule__SnomedIdentifier__Alternatives_1 )
            // InternalScgParser.g:1818:3: rule__SnomedIdentifier__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__1__Impl"


    // $ANTLR start "rule__SnomedIdentifier__Group__2"
    // InternalScgParser.g:1826:1: rule__SnomedIdentifier__Group__2 : rule__SnomedIdentifier__Group__2__Impl rule__SnomedIdentifier__Group__3 ;
    public final void rule__SnomedIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1830:1: ( rule__SnomedIdentifier__Group__2__Impl rule__SnomedIdentifier__Group__3 )
            // InternalScgParser.g:1831:2: rule__SnomedIdentifier__Group__2__Impl rule__SnomedIdentifier__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__SnomedIdentifier__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__2"


    // $ANTLR start "rule__SnomedIdentifier__Group__2__Impl"
    // InternalScgParser.g:1838:1: rule__SnomedIdentifier__Group__2__Impl : ( ( rule__SnomedIdentifier__Alternatives_2 ) ) ;
    public final void rule__SnomedIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1842:1: ( ( ( rule__SnomedIdentifier__Alternatives_2 ) ) )
            // InternalScgParser.g:1843:1: ( ( rule__SnomedIdentifier__Alternatives_2 ) )
            {
            // InternalScgParser.g:1843:1: ( ( rule__SnomedIdentifier__Alternatives_2 ) )
            // InternalScgParser.g:1844:2: ( rule__SnomedIdentifier__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2()); 
            }
            // InternalScgParser.g:1845:2: ( rule__SnomedIdentifier__Alternatives_2 )
            // InternalScgParser.g:1845:3: rule__SnomedIdentifier__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__2__Impl"


    // $ANTLR start "rule__SnomedIdentifier__Group__3"
    // InternalScgParser.g:1853:1: rule__SnomedIdentifier__Group__3 : rule__SnomedIdentifier__Group__3__Impl rule__SnomedIdentifier__Group__4 ;
    public final void rule__SnomedIdentifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1857:1: ( rule__SnomedIdentifier__Group__3__Impl rule__SnomedIdentifier__Group__4 )
            // InternalScgParser.g:1858:2: rule__SnomedIdentifier__Group__3__Impl rule__SnomedIdentifier__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__SnomedIdentifier__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__3"


    // $ANTLR start "rule__SnomedIdentifier__Group__3__Impl"
    // InternalScgParser.g:1865:1: rule__SnomedIdentifier__Group__3__Impl : ( ( rule__SnomedIdentifier__Alternatives_3 ) ) ;
    public final void rule__SnomedIdentifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1869:1: ( ( ( rule__SnomedIdentifier__Alternatives_3 ) ) )
            // InternalScgParser.g:1870:1: ( ( rule__SnomedIdentifier__Alternatives_3 ) )
            {
            // InternalScgParser.g:1870:1: ( ( rule__SnomedIdentifier__Alternatives_3 ) )
            // InternalScgParser.g:1871:2: ( rule__SnomedIdentifier__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3()); 
            }
            // InternalScgParser.g:1872:2: ( rule__SnomedIdentifier__Alternatives_3 )
            // InternalScgParser.g:1872:3: rule__SnomedIdentifier__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__3__Impl"


    // $ANTLR start "rule__SnomedIdentifier__Group__4"
    // InternalScgParser.g:1880:1: rule__SnomedIdentifier__Group__4 : rule__SnomedIdentifier__Group__4__Impl rule__SnomedIdentifier__Group__5 ;
    public final void rule__SnomedIdentifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1884:1: ( rule__SnomedIdentifier__Group__4__Impl rule__SnomedIdentifier__Group__5 )
            // InternalScgParser.g:1885:2: rule__SnomedIdentifier__Group__4__Impl rule__SnomedIdentifier__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__SnomedIdentifier__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__4"


    // $ANTLR start "rule__SnomedIdentifier__Group__4__Impl"
    // InternalScgParser.g:1892:1: rule__SnomedIdentifier__Group__4__Impl : ( ( rule__SnomedIdentifier__Alternatives_4 ) ) ;
    public final void rule__SnomedIdentifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1896:1: ( ( ( rule__SnomedIdentifier__Alternatives_4 ) ) )
            // InternalScgParser.g:1897:1: ( ( rule__SnomedIdentifier__Alternatives_4 ) )
            {
            // InternalScgParser.g:1897:1: ( ( rule__SnomedIdentifier__Alternatives_4 ) )
            // InternalScgParser.g:1898:2: ( rule__SnomedIdentifier__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4()); 
            }
            // InternalScgParser.g:1899:2: ( rule__SnomedIdentifier__Alternatives_4 )
            // InternalScgParser.g:1899:3: rule__SnomedIdentifier__Alternatives_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__4__Impl"


    // $ANTLR start "rule__SnomedIdentifier__Group__5"
    // InternalScgParser.g:1907:1: rule__SnomedIdentifier__Group__5 : rule__SnomedIdentifier__Group__5__Impl ;
    public final void rule__SnomedIdentifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1911:1: ( rule__SnomedIdentifier__Group__5__Impl )
            // InternalScgParser.g:1912:2: rule__SnomedIdentifier__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__5"


    // $ANTLR start "rule__SnomedIdentifier__Group__5__Impl"
    // InternalScgParser.g:1918:1: rule__SnomedIdentifier__Group__5__Impl : ( ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* ) ) ;
    public final void rule__SnomedIdentifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1922:1: ( ( ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* ) ) )
            // InternalScgParser.g:1923:1: ( ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* ) )
            {
            // InternalScgParser.g:1923:1: ( ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* ) )
            // InternalScgParser.g:1924:2: ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* )
            {
            // InternalScgParser.g:1924:2: ( ( rule__SnomedIdentifier__Alternatives_5 ) )
            // InternalScgParser.g:1925:3: ( rule__SnomedIdentifier__Alternatives_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); 
            }
            // InternalScgParser.g:1926:3: ( rule__SnomedIdentifier__Alternatives_5 )
            // InternalScgParser.g:1926:4: rule__SnomedIdentifier__Alternatives_5
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__SnomedIdentifier__Alternatives_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); 
            }

            }

            // InternalScgParser.g:1929:2: ( ( rule__SnomedIdentifier__Alternatives_5 )* )
            // InternalScgParser.g:1930:3: ( rule__SnomedIdentifier__Alternatives_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); 
            }
            // InternalScgParser.g:1931:3: ( rule__SnomedIdentifier__Alternatives_5 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ZERO && LA23_0<=RULE_DIGIT_NONZERO)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalScgParser.g:1931:4: rule__SnomedIdentifier__Alternatives_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__SnomedIdentifier__Alternatives_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__5__Impl"


    // $ANTLR start "rule__NonNegativeInteger__Group_1__0"
    // InternalScgParser.g:1941:1: rule__NonNegativeInteger__Group_1__0 : rule__NonNegativeInteger__Group_1__0__Impl rule__NonNegativeInteger__Group_1__1 ;
    public final void rule__NonNegativeInteger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1945:1: ( rule__NonNegativeInteger__Group_1__0__Impl rule__NonNegativeInteger__Group_1__1 )
            // InternalScgParser.g:1946:2: rule__NonNegativeInteger__Group_1__0__Impl rule__NonNegativeInteger__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__NonNegativeInteger__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeInteger__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeInteger__Group_1__0"


    // $ANTLR start "rule__NonNegativeInteger__Group_1__0__Impl"
    // InternalScgParser.g:1953:1: rule__NonNegativeInteger__Group_1__0__Impl : ( RULE_DIGIT_NONZERO ) ;
    public final void rule__NonNegativeInteger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1957:1: ( ( RULE_DIGIT_NONZERO ) )
            // InternalScgParser.g:1958:1: ( RULE_DIGIT_NONZERO )
            {
            // InternalScgParser.g:1958:1: ( RULE_DIGIT_NONZERO )
            // InternalScgParser.g:1959:2: RULE_DIGIT_NONZERO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); 
            }
            match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeInteger__Group_1__0__Impl"


    // $ANTLR start "rule__NonNegativeInteger__Group_1__1"
    // InternalScgParser.g:1968:1: rule__NonNegativeInteger__Group_1__1 : rule__NonNegativeInteger__Group_1__1__Impl ;
    public final void rule__NonNegativeInteger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1972:1: ( rule__NonNegativeInteger__Group_1__1__Impl )
            // InternalScgParser.g:1973:2: rule__NonNegativeInteger__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeInteger__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeInteger__Group_1__1"


    // $ANTLR start "rule__NonNegativeInteger__Group_1__1__Impl"
    // InternalScgParser.g:1979:1: rule__NonNegativeInteger__Group_1__1__Impl : ( ( rule__NonNegativeInteger__Alternatives_1_1 )* ) ;
    public final void rule__NonNegativeInteger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1983:1: ( ( ( rule__NonNegativeInteger__Alternatives_1_1 )* ) )
            // InternalScgParser.g:1984:1: ( ( rule__NonNegativeInteger__Alternatives_1_1 )* )
            {
            // InternalScgParser.g:1984:1: ( ( rule__NonNegativeInteger__Alternatives_1_1 )* )
            // InternalScgParser.g:1985:2: ( rule__NonNegativeInteger__Alternatives_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1()); 
            }
            // InternalScgParser.g:1986:2: ( rule__NonNegativeInteger__Alternatives_1_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_ZERO && LA24_0<=RULE_DIGIT_NONZERO)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalScgParser.g:1986:3: rule__NonNegativeInteger__Alternatives_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__NonNegativeInteger__Alternatives_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeInteger__Group_1__1__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // InternalScgParser.g:1995:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:1999:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalScgParser.g:2000:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Integer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Integer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // InternalScgParser.g:2007:1: rule__Integer__Group__0__Impl : ( ( rule__Integer__Alternatives_0 )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2011:1: ( ( ( rule__Integer__Alternatives_0 )? ) )
            // InternalScgParser.g:2012:1: ( ( rule__Integer__Alternatives_0 )? )
            {
            // InternalScgParser.g:2012:1: ( ( rule__Integer__Alternatives_0 )? )
            // InternalScgParser.g:2013:2: ( rule__Integer__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getAlternatives_0()); 
            }
            // InternalScgParser.g:2014:2: ( rule__Integer__Alternatives_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_PLUS && LA25_0<=RULE_DASH)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalScgParser.g:2014:3: rule__Integer__Alternatives_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Integer__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // InternalScgParser.g:2022:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2026:1: ( rule__Integer__Group__1__Impl )
            // InternalScgParser.g:2027:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Integer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // InternalScgParser.g:2033:1: rule__Integer__Group__1__Impl : ( ruleNonNegativeInteger ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2037:1: ( ( ruleNonNegativeInteger ) )
            // InternalScgParser.g:2038:1: ( ruleNonNegativeInteger )
            {
            // InternalScgParser.g:2038:1: ( ruleNonNegativeInteger )
            // InternalScgParser.g:2039:2: ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__Decimal__Group__0"
    // InternalScgParser.g:2049:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2053:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // InternalScgParser.g:2054:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Decimal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Decimal__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__0"


    // $ANTLR start "rule__Decimal__Group__0__Impl"
    // InternalScgParser.g:2061:1: rule__Decimal__Group__0__Impl : ( ( rule__Decimal__Alternatives_0 )? ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2065:1: ( ( ( rule__Decimal__Alternatives_0 )? ) )
            // InternalScgParser.g:2066:1: ( ( rule__Decimal__Alternatives_0 )? )
            {
            // InternalScgParser.g:2066:1: ( ( rule__Decimal__Alternatives_0 )? )
            // InternalScgParser.g:2067:2: ( rule__Decimal__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalAccess().getAlternatives_0()); 
            }
            // InternalScgParser.g:2068:2: ( rule__Decimal__Alternatives_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_PLUS && LA26_0<=RULE_DASH)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalScgParser.g:2068:3: rule__Decimal__Alternatives_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Decimal__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__0__Impl"


    // $ANTLR start "rule__Decimal__Group__1"
    // InternalScgParser.g:2076:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2080:1: ( rule__Decimal__Group__1__Impl )
            // InternalScgParser.g:2081:2: rule__Decimal__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Decimal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__1"


    // $ANTLR start "rule__Decimal__Group__1__Impl"
    // InternalScgParser.g:2087:1: rule__Decimal__Group__1__Impl : ( ruleNonNegativeDecimal ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2091:1: ( ( ruleNonNegativeDecimal ) )
            // InternalScgParser.g:2092:1: ( ruleNonNegativeDecimal )
            {
            // InternalScgParser.g:2092:1: ( ruleNonNegativeDecimal )
            // InternalScgParser.g:2093:2: ruleNonNegativeDecimal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__1__Impl"


    // $ANTLR start "rule__NonNegativeDecimal__Group__0"
    // InternalScgParser.g:2103:1: rule__NonNegativeDecimal__Group__0 : rule__NonNegativeDecimal__Group__0__Impl rule__NonNegativeDecimal__Group__1 ;
    public final void rule__NonNegativeDecimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2107:1: ( rule__NonNegativeDecimal__Group__0__Impl rule__NonNegativeDecimal__Group__1 )
            // InternalScgParser.g:2108:2: rule__NonNegativeDecimal__Group__0__Impl rule__NonNegativeDecimal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__NonNegativeDecimal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeDecimal__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Group__0"


    // $ANTLR start "rule__NonNegativeDecimal__Group__0__Impl"
    // InternalScgParser.g:2115:1: rule__NonNegativeDecimal__Group__0__Impl : ( ruleNonNegativeInteger ) ;
    public final void rule__NonNegativeDecimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2119:1: ( ( ruleNonNegativeInteger ) )
            // InternalScgParser.g:2120:1: ( ruleNonNegativeInteger )
            {
            // InternalScgParser.g:2120:1: ( ruleNonNegativeInteger )
            // InternalScgParser.g:2121:2: ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Group__0__Impl"


    // $ANTLR start "rule__NonNegativeDecimal__Group__1"
    // InternalScgParser.g:2130:1: rule__NonNegativeDecimal__Group__1 : rule__NonNegativeDecimal__Group__1__Impl rule__NonNegativeDecimal__Group__2 ;
    public final void rule__NonNegativeDecimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2134:1: ( rule__NonNegativeDecimal__Group__1__Impl rule__NonNegativeDecimal__Group__2 )
            // InternalScgParser.g:2135:2: rule__NonNegativeDecimal__Group__1__Impl rule__NonNegativeDecimal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__NonNegativeDecimal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeDecimal__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Group__1"


    // $ANTLR start "rule__NonNegativeDecimal__Group__1__Impl"
    // InternalScgParser.g:2142:1: rule__NonNegativeDecimal__Group__1__Impl : ( RULE_DOT ) ;
    public final void rule__NonNegativeDecimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2146:1: ( ( RULE_DOT ) )
            // InternalScgParser.g:2147:1: ( RULE_DOT )
            {
            // InternalScgParser.g:2147:1: ( RULE_DOT )
            // InternalScgParser.g:2148:2: RULE_DOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1()); 
            }
            match(input,RULE_DOT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Group__1__Impl"


    // $ANTLR start "rule__NonNegativeDecimal__Group__2"
    // InternalScgParser.g:2157:1: rule__NonNegativeDecimal__Group__2 : rule__NonNegativeDecimal__Group__2__Impl ;
    public final void rule__NonNegativeDecimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2161:1: ( rule__NonNegativeDecimal__Group__2__Impl )
            // InternalScgParser.g:2162:2: rule__NonNegativeDecimal__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeDecimal__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Group__2"


    // $ANTLR start "rule__NonNegativeDecimal__Group__2__Impl"
    // InternalScgParser.g:2168:1: rule__NonNegativeDecimal__Group__2__Impl : ( ( rule__NonNegativeDecimal__Alternatives_2 )* ) ;
    public final void rule__NonNegativeDecimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2172:1: ( ( ( rule__NonNegativeDecimal__Alternatives_2 )* ) )
            // InternalScgParser.g:2173:1: ( ( rule__NonNegativeDecimal__Alternatives_2 )* )
            {
            // InternalScgParser.g:2173:1: ( ( rule__NonNegativeDecimal__Alternatives_2 )* )
            // InternalScgParser.g:2174:2: ( rule__NonNegativeDecimal__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2()); 
            }
            // InternalScgParser.g:2175:2: ( rule__NonNegativeDecimal__Alternatives_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ZERO && LA27_0<=RULE_DIGIT_NONZERO)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalScgParser.g:2175:3: rule__NonNegativeDecimal__Alternatives_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__NonNegativeDecimal__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Group__2__Impl"


    // $ANTLR start "rule__Expression__PrimitiveAssignment_1_0_0"
    // InternalScgParser.g:2184:1: rule__Expression__PrimitiveAssignment_1_0_0 : ( RULE_SUBTYPE_OF ) ;
    public final void rule__Expression__PrimitiveAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2188:1: ( ( RULE_SUBTYPE_OF ) )
            // InternalScgParser.g:2189:2: ( RULE_SUBTYPE_OF )
            {
            // InternalScgParser.g:2189:2: ( RULE_SUBTYPE_OF )
            // InternalScgParser.g:2190:3: RULE_SUBTYPE_OF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getPrimitiveSUBTYPE_OFTerminalRuleCall_1_0_0_0()); 
            }
            match(input,RULE_SUBTYPE_OF,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getPrimitiveSUBTYPE_OFTerminalRuleCall_1_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__PrimitiveAssignment_1_0_0"


    // $ANTLR start "rule__Expression__ExpressionAssignment_1_1"
    // InternalScgParser.g:2199:1: rule__Expression__ExpressionAssignment_1_1 : ( ruleSubExpression ) ;
    public final void rule__Expression__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2203:1: ( ( ruleSubExpression ) )
            // InternalScgParser.g:2204:2: ( ruleSubExpression )
            {
            // InternalScgParser.g:2204:2: ( ruleSubExpression )
            // InternalScgParser.g:2205:3: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getExpressionSubExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getExpressionSubExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpressionAssignment_1_1"


    // $ANTLR start "rule__SubExpression__FocusConceptsAssignment_0"
    // InternalScgParser.g:2214:1: rule__SubExpression__FocusConceptsAssignment_0 : ( ruleConceptReference ) ;
    public final void rule__SubExpression__FocusConceptsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2218:1: ( ( ruleConceptReference ) )
            // InternalScgParser.g:2219:2: ( ruleConceptReference )
            {
            // InternalScgParser.g:2219:2: ( ruleConceptReference )
            // InternalScgParser.g:2220:3: ruleConceptReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getFocusConceptsConceptReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConceptReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getFocusConceptsConceptReferenceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__FocusConceptsAssignment_0"


    // $ANTLR start "rule__SubExpression__FocusConceptsAssignment_1_1"
    // InternalScgParser.g:2229:1: rule__SubExpression__FocusConceptsAssignment_1_1 : ( ruleConceptReference ) ;
    public final void rule__SubExpression__FocusConceptsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2233:1: ( ( ruleConceptReference ) )
            // InternalScgParser.g:2234:2: ( ruleConceptReference )
            {
            // InternalScgParser.g:2234:2: ( ruleConceptReference )
            // InternalScgParser.g:2235:3: ruleConceptReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getFocusConceptsConceptReferenceParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConceptReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getFocusConceptsConceptReferenceParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__FocusConceptsAssignment_1_1"


    // $ANTLR start "rule__SubExpression__RefinementAssignment_2_1"
    // InternalScgParser.g:2244:1: rule__SubExpression__RefinementAssignment_2_1 : ( ruleRefinement ) ;
    public final void rule__SubExpression__RefinementAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2248:1: ( ( ruleRefinement ) )
            // InternalScgParser.g:2249:2: ( ruleRefinement )
            {
            // InternalScgParser.g:2249:2: ( ruleRefinement )
            // InternalScgParser.g:2250:3: ruleRefinement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getRefinementRefinementParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getRefinementRefinementParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpression__RefinementAssignment_2_1"


    // $ANTLR start "rule__Refinement__AttributesAssignment_0_0_0"
    // InternalScgParser.g:2259:1: rule__Refinement__AttributesAssignment_0_0_0 : ( ruleAttribute ) ;
    public final void rule__Refinement__AttributesAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2263:1: ( ( ruleAttribute ) )
            // InternalScgParser.g:2264:2: ( ruleAttribute )
            {
            // InternalScgParser.g:2264:2: ( ruleAttribute )
            // InternalScgParser.g:2265:3: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__AttributesAssignment_0_0_0"


    // $ANTLR start "rule__Refinement__AttributesAssignment_0_0_1_1"
    // InternalScgParser.g:2274:1: rule__Refinement__AttributesAssignment_0_0_1_1 : ( ruleAttribute ) ;
    public final void rule__Refinement__AttributesAssignment_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2278:1: ( ( ruleAttribute ) )
            // InternalScgParser.g:2279:2: ( ruleAttribute )
            {
            // InternalScgParser.g:2279:2: ( ruleAttribute )
            // InternalScgParser.g:2280:3: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getAttributesAttributeParserRuleCall_0_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__AttributesAssignment_0_0_1_1"


    // $ANTLR start "rule__Refinement__GroupsAssignment_0_1"
    // InternalScgParser.g:2289:1: rule__Refinement__GroupsAssignment_0_1 : ( ruleAttributeGroup ) ;
    public final void rule__Refinement__GroupsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2293:1: ( ( ruleAttributeGroup ) )
            // InternalScgParser.g:2294:2: ( ruleAttributeGroup )
            {
            // InternalScgParser.g:2294:2: ( ruleAttributeGroup )
            // InternalScgParser.g:2295:3: ruleAttributeGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttributeGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__GroupsAssignment_0_1"


    // $ANTLR start "rule__Refinement__GroupsAssignment_1_1"
    // InternalScgParser.g:2304:1: rule__Refinement__GroupsAssignment_1_1 : ( ruleAttributeGroup ) ;
    public final void rule__Refinement__GroupsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2308:1: ( ( ruleAttributeGroup ) )
            // InternalScgParser.g:2309:2: ( ruleAttributeGroup )
            {
            // InternalScgParser.g:2309:2: ( ruleAttributeGroup )
            // InternalScgParser.g:2310:3: ruleAttributeGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttributeGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinementAccess().getGroupsAttributeGroupParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Refinement__GroupsAssignment_1_1"


    // $ANTLR start "rule__AttributeGroup__AttributesAssignment_1"
    // InternalScgParser.g:2319:1: rule__AttributeGroup__AttributesAssignment_1 : ( ruleAttribute ) ;
    public final void rule__AttributeGroup__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2323:1: ( ( ruleAttribute ) )
            // InternalScgParser.g:2324:2: ( ruleAttribute )
            {
            // InternalScgParser.g:2324:2: ( ruleAttribute )
            // InternalScgParser.g:2325:3: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__AttributesAssignment_1"


    // $ANTLR start "rule__AttributeGroup__AttributesAssignment_2_1"
    // InternalScgParser.g:2334:1: rule__AttributeGroup__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__AttributeGroup__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2338:1: ( ( ruleAttribute ) )
            // InternalScgParser.g:2339:2: ( ruleAttribute )
            {
            // InternalScgParser.g:2339:2: ( ruleAttribute )
            // InternalScgParser.g:2340:3: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeGroupAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeGroup__AttributesAssignment_2_1"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalScgParser.g:2349:1: rule__Attribute__NameAssignment_0 : ( ruleConceptReference ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2353:1: ( ( ruleConceptReference ) )
            // InternalScgParser.g:2354:2: ( ruleConceptReference )
            {
            // InternalScgParser.g:2354:2: ( ruleConceptReference )
            // InternalScgParser.g:2355:3: ruleConceptReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameConceptReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConceptReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameConceptReferenceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__ValueAssignment_2"
    // InternalScgParser.g:2364:1: rule__Attribute__ValueAssignment_2 : ( ruleAttributeValue ) ;
    public final void rule__Attribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2368:1: ( ( ruleAttributeValue ) )
            // InternalScgParser.g:2369:2: ( ruleAttributeValue )
            {
            // InternalScgParser.g:2369:2: ( ruleAttributeValue )
            // InternalScgParser.g:2370:3: ruleAttributeValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttributeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueAssignment_2"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalScgParser.g:2379:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2383:1: ( ( RULE_STRING ) )
            // InternalScgParser.g:2384:2: ( RULE_STRING )
            {
            // InternalScgParser.g:2384:2: ( RULE_STRING )
            // InternalScgParser.g:2385:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__IntegerValue__ValueAssignment_1"
    // InternalScgParser.g:2394:1: rule__IntegerValue__ValueAssignment_1 : ( ruleInteger ) ;
    public final void rule__IntegerValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2398:1: ( ( ruleInteger ) )
            // InternalScgParser.g:2399:2: ( ruleInteger )
            {
            // InternalScgParser.g:2399:2: ( ruleInteger )
            // InternalScgParser.g:2400:3: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueAccess().getValueIntegerParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueAccess().getValueIntegerParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__ValueAssignment_1"


    // $ANTLR start "rule__DecimalValue__ValueAssignment_1"
    // InternalScgParser.g:2409:1: rule__DecimalValue__ValueAssignment_1 : ( ruleDecimal ) ;
    public final void rule__DecimalValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2413:1: ( ( ruleDecimal ) )
            // InternalScgParser.g:2414:2: ( ruleDecimal )
            {
            // InternalScgParser.g:2414:2: ( ruleDecimal )
            // InternalScgParser.g:2415:3: ruleDecimal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueAccess().getValueDecimalParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDecimal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueAccess().getValueDecimalParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValue__ValueAssignment_1"


    // $ANTLR start "rule__ConceptReference__IdAssignment_0"
    // InternalScgParser.g:2424:1: rule__ConceptReference__IdAssignment_0 : ( ruleSnomedIdentifier ) ;
    public final void rule__ConceptReference__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2428:1: ( ( ruleSnomedIdentifier ) )
            // InternalScgParser.g:2429:2: ( ruleSnomedIdentifier )
            {
            // InternalScgParser.g:2429:2: ( ruleSnomedIdentifier )
            // InternalScgParser.g:2430:3: ruleSnomedIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSnomedIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptReference__IdAssignment_0"


    // $ANTLR start "rule__ConceptReference__TermAssignment_1"
    // InternalScgParser.g:2439:1: rule__ConceptReference__TermAssignment_1 : ( RULE_TERM_STRING ) ;
    public final void rule__ConceptReference__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScgParser.g:2443:1: ( ( RULE_TERM_STRING ) )
            // InternalScgParser.g:2444:2: ( RULE_TERM_STRING )
            {
            // InternalScgParser.g:2444:2: ( RULE_TERM_STRING )
            // InternalScgParser.g:2445:3: RULE_TERM_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_TERM_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptReference__TermAssignment_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\7\uffff\2\12\2\uffff\2\12";
    static final String dfa_3s = "\1\10\3\uffff\3\7\1\11\1\7\2\uffff\2\7";
    static final String dfa_4s = "\1\27\3\uffff\1\17\2\10\2\22\2\uffff\2\22";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\5\uffff\1\5\1\4\2\uffff";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\10\uffff\1\2\1\uffff\1\4\3\uffff\1\3",
            "",
            "",
            "",
            "\1\7\1\10\5\uffff\1\5\1\6",
            "\1\7\1\10",
            "\1\7\1\10",
            "\3\12\4\uffff\1\11\1\uffff\1\12",
            "\1\14\1\13\3\12\4\uffff\1\11\1\uffff\1\12",
            "",
            "",
            "\1\14\1\13\3\12\4\uffff\1\11\1\uffff\1\12",
            "\1\14\1\13\3\12\4\uffff\1\11\1\uffff\1\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "524:1: rule__AttributeValue__Alternatives : ( ( ruleConceptReference ) | ( ( rule__AttributeValue__Group_1__0 ) ) | ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleDecimalValue ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000130L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000330L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000B30L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000B32L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000C00L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000008A0130L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000000C180L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000182L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});
    }


}