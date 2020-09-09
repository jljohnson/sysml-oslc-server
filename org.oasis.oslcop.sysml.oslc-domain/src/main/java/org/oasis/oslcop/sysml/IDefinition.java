// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *	   Sam Padgett	       - initial API and implementation
 *     Michael Fiedler     - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package org.oasis.oslcop.sysml;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRdfCollectionType;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;

import org.oasis.oslcop.sysml.SysmlDomainConstants;
import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.IActionUsage;
import org.oasis.oslcop.sysml.IAnalysisCaseUsage;
import org.oasis.oslcop.sysml.IAttributeUsage;
import org.oasis.oslcop.sysml.ICalculationUsage;
import org.oasis.oslcop.sysml.ICaseUsage;
import org.oasis.oslcop.sysml.IConjugation;
import org.oasis.oslcop.sysml.IConnectionUsage;
import org.oasis.oslcop.sysml.IConstraintUsage;
import org.oasis.oslcop.sysml.IElement;
import org.oasis.oslcop.sysml.IFeature;
import org.oasis.oslcop.sysml.IFeatureMembership;
import org.oasis.oslcop.sysml.IGeneralization;
import org.oasis.oslcop.sysml.ISysmlImport;
import org.oasis.oslcop.sysml.IIndividualUsage;
import org.oasis.oslcop.sysml.IInterfaceUsage;
import org.oasis.oslcop.sysml.IItemUsage;
import org.oasis.oslcop.sysml.IMembership;
import org.oasis.oslcop.sysml.IMultiplicity;
import org.oasis.oslcop.sysml.ISysmlPackage;
import org.oasis.oslcop.sysml.IPartUsage;
import org.eclipse.lyo.oslc.domains.IPerson;
import org.oasis.oslcop.sysml.IPortUsage;
import org.oasis.oslcop.sysml.IReferenceUsage;
import org.oasis.oslcop.sysml.IRelationship;
import org.oasis.oslcop.sysml.IRequirementUsage;
import org.oasis.oslcop.sysml.IStateUsage;
import org.oasis.oslcop.sysml.ISuperclassing;
import org.oasis.oslcop.sysml.ITransitionUsage;
import org.oasis.oslcop.sysml.IUsage;
import org.oasis.oslcop.sysml.IVariantMembership;
// Start of user code imports
// End of user code

@OslcNamespace(SysmlDomainConstants.DEFINITION_NAMESPACE)
@OslcName(SysmlDomainConstants.DEFINITION_LOCALNAME)
@OslcResourceShape(title = "Definition Resource Shape", describes = SysmlDomainConstants.DEFINITION_TYPE)
public interface IDefinition
{

    public void addOwnedUsage(final Link ownedUsage );
    public void addVariant(final Link variant );
    public void addVariantMembership_comp(final Link variantMembership_comp );
    public void addOwnedPort(final Link ownedPort );
    public void addFlow(final Link flow );
    public void addUsage(final Link usage );
    public void addOwnedState(final Link ownedState );
    public void addOwnedConstraint(final Link ownedConstraint );
    public void addOwnedTransition(final Link ownedTransition );
    public void addOwnedRequirement(final Link ownedRequirement );
    public void addOwnedCalculation(final Link ownedCalculation );
    public void addOwnedAnalysisCase(final Link ownedAnalysisCase );
    public void addOwnedCase(final Link ownedCase );
    public void addOwnedReference(final Link ownedReference );
    public void addOwnedAction(final Link ownedAction );
    public void addOwnedConnection(final Link ownedConnection );
    public void addOwnedItem(final Link ownedItem );
    public void addOwnedPart(final Link ownedPart );
    public void addOwnedIndividual(final Link ownedIndividual );
    public void addOwnedInterface(final Link ownedInterface );
    public void addOwnedAttribute(final Link ownedAttribute );
    public void addVariantMembership(final Link variantMembership );

    @OslcName("isVariation")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isVariation")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsVariation();

    @OslcName("ownedUsage")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedUsage")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.USAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedUsage();

    @OslcName("variant")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "variant")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.USAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getVariant();

    @OslcName("variantMembership_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "variantMembership_comp")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.VARIANTMEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getVariantMembership_comp();

    @OslcName("ownedPort")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedPort")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PORTUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedPort();

    @OslcName("flow")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "flow")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.USAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getFlow();

    @OslcName("usage")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "usage")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.USAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getUsage();

    @OslcName("ownedState")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedState")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.STATEUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedState();

    @OslcName("ownedConstraint")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedConstraint")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CONSTRAINTUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedConstraint();

    @OslcName("ownedTransition")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedTransition")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.TRANSITIONUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedTransition();

    @OslcName("ownedRequirement")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedRequirement")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.REQUIREMENTUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedRequirement();

    @OslcName("ownedCalculation")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedCalculation")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CALCULATIONUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedCalculation();

    @OslcName("ownedAnalysisCase")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedAnalysisCase")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ANALYSISCASEUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedAnalysisCase();

    @OslcName("ownedCase")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedCase")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CASEUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedCase();

    @OslcName("ownedReference")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedReference")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.REFERENCEUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedReference();

    @OslcName("ownedAction")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedAction")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ACTIONUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedAction();

    @OslcName("ownedConnection")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedConnection")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.CONNECTIONUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedConnection();

    @OslcName("ownedItem")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedItem")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ITEMUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedItem();

    @OslcName("ownedPart")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedPart")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PARTUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedPart();

    @OslcName("ownedIndividual")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedIndividual")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.INDIVIDUALUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedIndividual();

    @OslcName("ownedInterface")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedInterface")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.INTERFACEUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedInterface();

    @OslcName("ownedAttribute")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedAttribute")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ATTRIBUTEUSAGE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedAttribute();

    @OslcName("variantMembership")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "variantMembership")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.VARIANTMEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getVariantMembership();


    public void setIsVariation(final Boolean isVariation );
    public void setOwnedUsage(final Set<Link> ownedUsage );
    public void setVariant(final Set<Link> variant );
    public void setVariantMembership_comp(final Set<Link> variantMembership_comp );
    public void setOwnedPort(final Set<Link> ownedPort );
    public void setFlow(final Set<Link> flow );
    public void setUsage(final Set<Link> usage );
    public void setOwnedState(final Set<Link> ownedState );
    public void setOwnedConstraint(final Set<Link> ownedConstraint );
    public void setOwnedTransition(final Set<Link> ownedTransition );
    public void setOwnedRequirement(final Set<Link> ownedRequirement );
    public void setOwnedCalculation(final Set<Link> ownedCalculation );
    public void setOwnedAnalysisCase(final Set<Link> ownedAnalysisCase );
    public void setOwnedCase(final Set<Link> ownedCase );
    public void setOwnedReference(final Set<Link> ownedReference );
    public void setOwnedAction(final Set<Link> ownedAction );
    public void setOwnedConnection(final Set<Link> ownedConnection );
    public void setOwnedItem(final Set<Link> ownedItem );
    public void setOwnedPart(final Set<Link> ownedPart );
    public void setOwnedIndividual(final Set<Link> ownedIndividual );
    public void setOwnedInterface(final Set<Link> ownedInterface );
    public void setOwnedAttribute(final Set<Link> ownedAttribute );
    public void setVariantMembership(final Set<Link> variantMembership );
}

