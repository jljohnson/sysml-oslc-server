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
import org.oasis.oslcop.sysml.FeatureMembership;

import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Feature;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.SysmlPackage;
import org.oasis.oslcop.sysml.Parameter;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.Type;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.PARAMETERMEMBERSHIP_NAMESPACE)
@OslcName(SysmlDomainConstants.PARAMETERMEMBERSHIP_LOCALNAME)
@OslcResourceShape(title = "ParameterMembership Resource Shape", describes = SysmlDomainConstants.PARAMETERMEMBERSHIP_TYPE)
public class ParameterMembership
    extends FeatureMembership
    implements IParameterMembership
{
    // Start of user code attributeAnnotation:memberParameter
    // End of user code
    private Link memberParameter;
    // Start of user code attributeAnnotation:ownedMemberParameter_comp
    // End of user code
    private Link ownedMemberParameter_comp;
    // Start of user code attributeAnnotation:ownedMemberParameter
    // End of user code
    private Link ownedMemberParameter;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public ParameterMembership()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public ParameterMembership(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.PARAMETERMEMBERSHIP_PATH,
        ParameterMembership.class);
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
            result = result + "{a Local ParameterMembership Resource} - update ParameterMembership.toString() to present resource as desired.";
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
    
    
    // Start of user code getterAnnotation:memberParameter
    // End of user code
    @OslcName("memberParameter")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "memberParameter")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PARAMETER_TYPE})
    @OslcReadOnly(false)
    public Link getMemberParameter()
    {
        // Start of user code getterInit:memberParameter
        // End of user code
        return memberParameter;
    }
    
    // Start of user code getterAnnotation:ownedMemberParameter_comp
    // End of user code
    @OslcName("ownedMemberParameter_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedMemberParameter_comp")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PARAMETER_TYPE})
    @OslcReadOnly(false)
    public Link getOwnedMemberParameter_comp()
    {
        // Start of user code getterInit:ownedMemberParameter_comp
        // End of user code
        return ownedMemberParameter_comp;
    }
    
    // Start of user code getterAnnotation:ownedMemberParameter
    // End of user code
    @OslcName("ownedMemberParameter")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedMemberParameter")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.PARAMETER_TYPE})
    @OslcReadOnly(false)
    public Link getOwnedMemberParameter()
    {
        // Start of user code getterInit:ownedMemberParameter
        // End of user code
        return ownedMemberParameter;
    }
    
    
    // Start of user code setterAnnotation:memberParameter
    // End of user code
    public void setMemberParameter(final Link memberParameter )
    {
        // Start of user code setterInit:memberParameter
        // End of user code
        this.memberParameter = memberParameter;
    
        // Start of user code setterFinalize:memberParameter
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedMemberParameter_comp
    // End of user code
    public void setOwnedMemberParameter_comp(final Link ownedMemberParameter_comp )
    {
        // Start of user code setterInit:ownedMemberParameter_comp
        // End of user code
        this.ownedMemberParameter_comp = ownedMemberParameter_comp;
    
        // Start of user code setterFinalize:ownedMemberParameter_comp
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedMemberParameter
    // End of user code
    public void setOwnedMemberParameter(final Link ownedMemberParameter )
    {
        // Start of user code setterInit:ownedMemberParameter
        // End of user code
        this.ownedMemberParameter = ownedMemberParameter;
    
        // Start of user code setterFinalize:ownedMemberParameter
        // End of user code
    }
    
    
}
