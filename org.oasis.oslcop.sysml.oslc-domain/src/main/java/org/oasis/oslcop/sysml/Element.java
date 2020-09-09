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
import org.eclipse.lyo.oslc.domains.am.Resource;

import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.SysmlPackage;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.Relationship;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.ELEMENT_NAMESPACE)
@OslcName(SysmlDomainConstants.ELEMENT_LOCALNAME)
@OslcResourceShape(title = "Element Resource Shape", describes = SysmlDomainConstants.ELEMENT_TYPE)
public class Element
    extends Resource
    implements IElement
{
    // Start of user code attributeAnnotation:sysmlIdentifier
    // End of user code
    private String sysmlIdentifier;
    // Start of user code attributeAnnotation:name
    // End of user code
    private String name;
    // Start of user code attributeAnnotation:owningMembership
    // End of user code
    private Link owningMembership;
    // Start of user code attributeAnnotation:ownedRelationship_comp
    // End of user code
    private Set<Link> ownedRelationship_comp = new HashSet<Link>();
    // Start of user code attributeAnnotation:owningRelationship
    // End of user code
    private Link owningRelationship;
    // Start of user code attributeAnnotation:owningNamespace
    // End of user code
    private Link owningNamespace;
    // Start of user code attributeAnnotation:owner
    // End of user code
    private Link owner;
    // Start of user code attributeAnnotation:ownedElement
    // End of user code
    private Set<Link> ownedElement = new HashSet<Link>();
    // Start of user code attributeAnnotation:ownedRelationship
    // End of user code
    private Set<Link> ownedRelationship = new HashSet<Link>();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public Element()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public Element(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.ELEMENT_PATH,
        Element.class);
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
            result = result + "{a Local Element Resource} - update Element.toString() to present resource as desired.";
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
    
    public void addOwnedRelationship_comp(final Link ownedRelationship_comp)
    {
        this.ownedRelationship_comp.add(ownedRelationship_comp);
    }
    
    public void addOwnedElement(final Link ownedElement)
    {
        this.ownedElement.add(ownedElement);
    }
    
    public void addOwnedRelationship(final Link ownedRelationship)
    {
        this.ownedRelationship.add(ownedRelationship);
    }
    
    
    // Start of user code getterAnnotation:sysmlIdentifier
    // End of user code
    @OslcName("identifier")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "identifier")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getSysmlIdentifier()
    {
        // Start of user code getterInit:sysmlIdentifier
        // End of user code
        return sysmlIdentifier;
    }
    
    // Start of user code getterAnnotation:name
    // End of user code
    @OslcName("name")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "name")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getName()
    {
        // Start of user code getterInit:name
        // End of user code
        return name;
    }
    
    // Start of user code getterAnnotation:owningMembership
    // End of user code
    @OslcName("owningMembership")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningMembership")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.MEMBERSHIP_TYPE})
    @OslcReadOnly(false)
    public Link getOwningMembership()
    {
        // Start of user code getterInit:owningMembership
        // End of user code
        return owningMembership;
    }
    
    // Start of user code getterAnnotation:ownedRelationship_comp
    // End of user code
    @OslcName("ownedRelationship_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedRelationship_comp")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.RELATIONSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedRelationship_comp()
    {
        // Start of user code getterInit:ownedRelationship_comp
        // End of user code
        return ownedRelationship_comp;
    }
    
    // Start of user code getterAnnotation:owningRelationship
    // End of user code
    @OslcName("owningRelationship")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningRelationship")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.RELATIONSHIP_TYPE})
    @OslcReadOnly(false)
    public Link getOwningRelationship()
    {
        // Start of user code getterInit:owningRelationship
        // End of user code
        return owningRelationship;
    }
    
    // Start of user code getterAnnotation:owningNamespace
    // End of user code
    @OslcName("owningNamespace")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owningNamespace")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PACKAGE_TYPE})
    @OslcReadOnly(false)
    public Link getOwningNamespace()
    {
        // Start of user code getterInit:owningNamespace
        // End of user code
        return owningNamespace;
    }
    
    // Start of user code getterAnnotation:owner
    // End of user code
    @OslcName("owner")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "owner")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Link getOwner()
    {
        // Start of user code getterInit:owner
        // End of user code
        return owner;
    }
    
    // Start of user code getterAnnotation:ownedElement
    // End of user code
    @OslcName("ownedElement")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedElement")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedElement()
    {
        // Start of user code getterInit:ownedElement
        // End of user code
        return ownedElement;
    }
    
    // Start of user code getterAnnotation:ownedRelationship
    // End of user code
    @OslcName("ownedRelationship")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedRelationship")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.RELATIONSHIP_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOwnedRelationship()
    {
        // Start of user code getterInit:ownedRelationship
        // End of user code
        return ownedRelationship;
    }
    
    
    // Start of user code setterAnnotation:sysmlIdentifier
    // End of user code
    public void setSysmlIdentifier(final String identifier )
    {
        // Start of user code setterInit:sysmlIdentifier
        // End of user code
        this.sysmlIdentifier = identifier;
    
        // Start of user code setterFinalize:sysmlIdentifier
        // End of user code
    }
    
    // Start of user code setterAnnotation:name
    // End of user code
    public void setName(final String name )
    {
        // Start of user code setterInit:name
        // End of user code
        this.name = name;
    
        // Start of user code setterFinalize:name
        // End of user code
    }
    
    // Start of user code setterAnnotation:owningMembership
    // End of user code
    public void setOwningMembership(final Link owningMembership )
    {
        // Start of user code setterInit:owningMembership
        // End of user code
        this.owningMembership = owningMembership;
    
        // Start of user code setterFinalize:owningMembership
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedRelationship_comp
    // End of user code
    public void setOwnedRelationship_comp(final Set<Link> ownedRelationship_comp )
    {
        // Start of user code setterInit:ownedRelationship_comp
        // End of user code
        this.ownedRelationship_comp.clear();
        if (ownedRelationship_comp != null)
        {
            this.ownedRelationship_comp.addAll(ownedRelationship_comp);
        }
    
        // Start of user code setterFinalize:ownedRelationship_comp
        // End of user code
    }
    
    // Start of user code setterAnnotation:owningRelationship
    // End of user code
    public void setOwningRelationship(final Link owningRelationship )
    {
        // Start of user code setterInit:owningRelationship
        // End of user code
        this.owningRelationship = owningRelationship;
    
        // Start of user code setterFinalize:owningRelationship
        // End of user code
    }
    
    // Start of user code setterAnnotation:owningNamespace
    // End of user code
    public void setOwningNamespace(final Link owningNamespace )
    {
        // Start of user code setterInit:owningNamespace
        // End of user code
        this.owningNamespace = owningNamespace;
    
        // Start of user code setterFinalize:owningNamespace
        // End of user code
    }
    
    // Start of user code setterAnnotation:owner
    // End of user code
    public void setOwner(final Link owner )
    {
        // Start of user code setterInit:owner
        // End of user code
        this.owner = owner;
    
        // Start of user code setterFinalize:owner
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedElement
    // End of user code
    public void setOwnedElement(final Set<Link> ownedElement )
    {
        // Start of user code setterInit:ownedElement
        // End of user code
        this.ownedElement.clear();
        if (ownedElement != null)
        {
            this.ownedElement.addAll(ownedElement);
        }
    
        // Start of user code setterFinalize:ownedElement
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedRelationship
    // End of user code
    public void setOwnedRelationship(final Set<Link> ownedRelationship )
    {
        // Start of user code setterInit:ownedRelationship
        // End of user code
        this.ownedRelationship.clear();
        if (ownedRelationship != null)
        {
            this.ownedRelationship.addAll(ownedRelationship);
        }
    
        // Start of user code setterFinalize:ownedRelationship
        // End of user code
    }
    
    
}
