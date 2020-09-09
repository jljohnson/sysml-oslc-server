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
 *       Sam Padgett          - initial API and implementation
 *     Michael Fiedler      - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (422448)
 *     Matthieu Helleboid   - Support for multiple Service Providers.
 *     Anass Radouani       - Support for multiple Service Providers.
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

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
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
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;

import org.oasis.oslcop.sysml.SysmlDomainConstants;
import org.oasis.oslcop.sysml.Connector;

import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.Association;
import org.oasis.oslcop.sysml.Conjugation;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Expression;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.FeatureMembership;
import org.oasis.oslcop.sysml.FeatureTyping;
import org.oasis.oslcop.sysml.Generalization;
import org.oasis.oslcop.sysml.SysmlImport;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.Multiplicity;
import org.oasis.oslcop.sysml.SysmlPackage;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.Redefinition;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.Step;
import org.oasis.oslcop.sysml.Subsetting;
import org.oasis.oslcop.sysml.Type;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.SUCCESSION_NAMESPACE)
@OslcName(SysmlDomainConstants.SUCCESSION_LOCALNAME)
@OslcResourceShape(title = "Succession Resource Shape", describes = SysmlDomainConstants.SUCCESSION_TYPE)
public class Succession
    extends Connector
    implements ISuccession
{
    // Start of user code attributeAnnotation:transitionStep
    // End of user code
    private Link transitionStep;
    // Start of user code attributeAnnotation:triggerStep
    // End of user code
    private Set<Link> triggerStep = new HashSet<Link>();
    // Start of user code attributeAnnotation:effectStep
    // End of user code
    private Set<Link> effectStep = new HashSet<Link>();
    // Start of user code attributeAnnotation:guardExpression
    // End of user code
    private Set<Link> guardExpression = new HashSet<Link>();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public Succession()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public Succession(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.SUCCESSION_PATH,
        Succession.class);
    }
    
    
    public String toString()
    {
        return toString(false);
    }
    
    public String toString(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toString_init
        // End of user code
    
        if (asLocalResource) {
            result = result + "{a Local Succession Resource} - update Succession.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = String.valueOf(getAbout());
        }
    
        // Start of user code toString_finalize
        result = getIdentifier() + " (" + (null == getShortTitle() ? "No Short Title Defined" : getShortTitle()) + ")";
        // End of user code
    
        return result;
    }
    
    public void addTriggerStep(final Link triggerStep)
    {
        this.triggerStep.add(triggerStep);
    }
    
    public void addEffectStep(final Link effectStep)
    {
        this.effectStep.add(effectStep);
    }
    
    public void addGuardExpression(final Link guardExpression)
    {
        this.guardExpression.add(guardExpression);
    }
    
    
    // Start of user code getterAnnotation:transitionStep
    // End of user code
    @OslcName("transitionStep")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "transitionStep")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.STEP_TYPE})
    @OslcReadOnly(false)
    public Link getTransitionStep()
    {
        // Start of user code getterInit:transitionStep
        // End of user code
        return transitionStep;
    }
    
    // Start of user code getterAnnotation:triggerStep
    // End of user code
    @OslcName("triggerStep")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "triggerStep")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.STEP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getTriggerStep()
    {
        // Start of user code getterInit:triggerStep
        // End of user code
        return triggerStep;
    }
    
    // Start of user code getterAnnotation:effectStep
    // End of user code
    @OslcName("effectStep")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "effectStep")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.STEP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getEffectStep()
    {
        // Start of user code getterInit:effectStep
        // End of user code
        return effectStep;
    }
    
    // Start of user code getterAnnotation:guardExpression
    // End of user code
    @OslcName("guardExpression")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "guardExpression")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.EXPRESSION_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getGuardExpression()
    {
        // Start of user code getterInit:guardExpression
        // End of user code
        return guardExpression;
    }
    
    
    // Start of user code setterAnnotation:transitionStep
    // End of user code
    public void setTransitionStep(final Link transitionStep )
    {
        // Start of user code setterInit:transitionStep
        // End of user code
        this.transitionStep = transitionStep;
    
        // Start of user code setterFinalize:transitionStep
        // End of user code
    }
    
    // Start of user code setterAnnotation:triggerStep
    // End of user code
    public void setTriggerStep(final Set<Link> triggerStep )
    {
        // Start of user code setterInit:triggerStep
        // End of user code
        this.triggerStep.clear();
        if (triggerStep != null)
        {
            this.triggerStep.addAll(triggerStep);
        }
    
        // Start of user code setterFinalize:triggerStep
        // End of user code
    }
    
    // Start of user code setterAnnotation:effectStep
    // End of user code
    public void setEffectStep(final Set<Link> effectStep )
    {
        // Start of user code setterInit:effectStep
        // End of user code
        this.effectStep.clear();
        if (effectStep != null)
        {
            this.effectStep.addAll(effectStep);
        }
    
        // Start of user code setterFinalize:effectStep
        // End of user code
    }
    
    // Start of user code setterAnnotation:guardExpression
    // End of user code
    public void setGuardExpression(final Set<Link> guardExpression )
    {
        // Start of user code setterInit:guardExpression
        // End of user code
        this.guardExpression.clear();
        if (guardExpression != null)
        {
            this.guardExpression.addAll(guardExpression);
        }
    
        // Start of user code setterFinalize:guardExpression
        // End of user code
    }
    
    
}
