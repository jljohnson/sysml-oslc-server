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
import org.oasis.oslcop.sysml.Membership;

import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.SysmlPackage;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.Type;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.FEATUREMEMBERSHIP_NAMESPACE)
@OslcName(SysmlDomainConstants.FEATUREMEMBERSHIP_LOCALNAME)
@OslcResourceShape(title = "FeatureMembership Resource Shape", describes = SysmlDomainConstants.FEATUREMEMBERSHIP_TYPE)
public class FeatureMembership
    extends Membership
    implements IFeatureMembership
{
    // Start of user code attributeAnnotation:isDerived
    // End of user code
    private Boolean isDerived;
    // Start of user code attributeAnnotation:isReadOnly
    // End of user code
    private Boolean isReadOnly;
    // Start of user code attributeAnnotation:isComposite
    // End of user code
    private Boolean isComposite;
    // Start of user code attributeAnnotation:isPortion
    // End of user code
    private Boolean isPortion;
    // Start of user code attributeAnnotation:isPort
    // End of user code
    private Boolean isPort;
    // Start of user code attributeAnnotation:direction
    // End of user code
    private String direction;
    // Start of user code attributeAnnotation:memberFeature
    // End of user code
    private Link memberFeature;
    // Start of user code attributeAnnotation:ownedMemberFeature_comp
    // End of user code
    private Link ownedMemberFeature_comp;
    // Start of user code attributeAnnotation:owningType
    // End of user code
    private Link owningType;
    // Start of user code attributeAnnotation:ownedMemberFeature
    // End of user code
    private Link ownedMemberFeature;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public FeatureMembership()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public FeatureMembership(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.FEATUREMEMBERSHIP_PATH,
        FeatureMembership.class);
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
            result = result + "{a Local FeatureMembership Resource} - update FeatureMembership.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = String.valueOf(getAbout());
        }
    
        // Start of user code toString_finalize
        // End of user code
    
        return result;
    }
    
    
    // Start of user code getterAnnotation:isDerived
    // End of user code
    @OslcName("isDerived")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isDerived")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsDerived()
    {
        // Start of user code getterInit:isDerived
        // End of user code
        return isDerived;
    }
    
    // Start of user code getterAnnotation:isReadOnly
    // End of user code
    @OslcName("isReadOnly")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isReadOnly")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsReadOnly()
    {
        // Start of user code getterInit:isReadOnly
        // End of user code
        return isReadOnly;
    }
    
    // Start of user code getterAnnotation:isComposite
    // End of user code
    @OslcName("isComposite")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isComposite")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsComposite()
    {
        // Start of user code getterInit:isComposite
        // End of user code
        return isComposite;
    }
    
    // Start of user code getterAnnotation:isPortion
    // End of user code
    @OslcName("isPortion")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isPortion")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsPortion()
    {
        // Start of user code getterInit:isPortion
        // End of user code
        return isPortion;
    }
    
    // Start of user code getterAnnotation:isPort
    // End of user code
    @OslcName("isPort")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "isPort")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isIsPort()
    {
        // Start of user code getterInit:isPort
        // End of user code
        return isPort;
    }
    
    // Start of user code getterAnnotation:direction
    // End of user code
    @OslcName("direction")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "direction")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    @OslcAllowedValue({"in", "inout", "out"})
    public String getDirection()
    {
        // Start of user code getterInit:direction
        // End of user code
        return direction;
    }
    
    // Start of user code getterAnnotation:memberFeature
    // End of user code
    @OslcName("memberFeature")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "memberFeature")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Link getMemberFeature()
    {
        // Start of user code getterInit:memberFeature
        // End of user code
        return memberFeature;
    }
    
    // Start of user code getterAnnotation:ownedMemberFeature_comp
    // End of user code
    @OslcName("ownedMemberFeature_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedMemberFeature_comp")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Link getOwnedMemberFeature_comp()
    {
        // Start of user code getterInit:ownedMemberFeature_comp
        // End of user code
        return ownedMemberFeature_comp;
    }
    
    // Start of user code getterAnnotation:owningType
    // End of user code
    @OslcName("owningType")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningType")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.TYPE_TYPE})
    @OslcReadOnly(false)
    public Link getOwningType()
    {
        // Start of user code getterInit:owningType
        // End of user code
        return owningType;
    }
    
    // Start of user code getterAnnotation:ownedMemberFeature
    // End of user code
    @OslcName("ownedMemberFeature")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedMemberFeature")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.FEATURE_TYPE})
    @OslcReadOnly(false)
    public Link getOwnedMemberFeature()
    {
        // Start of user code getterInit:ownedMemberFeature
        // End of user code
        return ownedMemberFeature;
    }
    
    
    // Start of user code setterAnnotation:isDerived
    // End of user code
    public void setIsDerived(final Boolean isDerived )
    {
        // Start of user code setterInit:isDerived
        // End of user code
        this.isDerived = isDerived;
    
        // Start of user code setterFinalize:isDerived
        // End of user code
    }
    
    // Start of user code setterAnnotation:isReadOnly
    // End of user code
    public void setIsReadOnly(final Boolean isReadOnly )
    {
        // Start of user code setterInit:isReadOnly
        // End of user code
        this.isReadOnly = isReadOnly;
    
        // Start of user code setterFinalize:isReadOnly
        // End of user code
    }
    
    // Start of user code setterAnnotation:isComposite
    // End of user code
    public void setIsComposite(final Boolean isComposite )
    {
        // Start of user code setterInit:isComposite
        // End of user code
        this.isComposite = isComposite;
    
        // Start of user code setterFinalize:isComposite
        // End of user code
    }
    
    // Start of user code setterAnnotation:isPortion
    // End of user code
    public void setIsPortion(final Boolean isPortion )
    {
        // Start of user code setterInit:isPortion
        // End of user code
        this.isPortion = isPortion;
    
        // Start of user code setterFinalize:isPortion
        // End of user code
    }
    
    // Start of user code setterAnnotation:isPort
    // End of user code
    public void setIsPort(final Boolean isPort )
    {
        // Start of user code setterInit:isPort
        // End of user code
        this.isPort = isPort;
    
        // Start of user code setterFinalize:isPort
        // End of user code
    }
    
    // Start of user code setterAnnotation:direction
    // End of user code
    public void setDirection(final String direction )
    {
        // Start of user code setterInit:direction
        // End of user code
        this.direction = direction;
    
        // Start of user code setterFinalize:direction
        // End of user code
    }
    
    // Start of user code setterAnnotation:memberFeature
    // End of user code
    public void setMemberFeature(final Link memberFeature )
    {
        // Start of user code setterInit:memberFeature
        // End of user code
        this.memberFeature = memberFeature;
    
        // Start of user code setterFinalize:memberFeature
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedMemberFeature_comp
    // End of user code
    public void setOwnedMemberFeature_comp(final Link ownedMemberFeature_comp )
    {
        // Start of user code setterInit:ownedMemberFeature_comp
        // End of user code
        this.ownedMemberFeature_comp = ownedMemberFeature_comp;
    
        // Start of user code setterFinalize:ownedMemberFeature_comp
        // End of user code
    }
    
    // Start of user code setterAnnotation:owningType
    // End of user code
    public void setOwningType(final Link owningType )
    {
        // Start of user code setterInit:owningType
        // End of user code
        this.owningType = owningType;
    
        // Start of user code setterFinalize:owningType
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedMemberFeature
    // End of user code
    public void setOwnedMemberFeature(final Link ownedMemberFeature )
    {
        // Start of user code setterInit:ownedMemberFeature
        // End of user code
        this.ownedMemberFeature = ownedMemberFeature;
    
        // Start of user code setterFinalize:ownedMemberFeature
        // End of user code
    }
    
    
}