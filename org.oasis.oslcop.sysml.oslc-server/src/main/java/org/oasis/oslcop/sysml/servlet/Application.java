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
 *     Michael Fiedler     - initial API and implementation for Bugzilla adapter
 *     Jad El-khoury       - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *     Matthieu Helleboid  - Support for multiple Service Providers.
 *     Anass Radouani      - Support for multiple Service Providers.
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package org.oasis.oslcop.sysml.servlet;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.AllowedValues;
import org.eclipse.lyo.oslc4j.core.model.Compact;
import org.eclipse.lyo.oslc4j.core.model.CreationFactory;
import org.eclipse.lyo.oslc4j.core.model.Dialog;
import org.eclipse.lyo.oslc4j.core.model.Error;
import org.eclipse.lyo.oslc4j.core.model.ExtendedError;
import org.eclipse.lyo.oslc4j.core.model.OAuthConfiguration;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.PrefixDefinition;
import org.eclipse.lyo.oslc4j.core.model.Preview;
import org.eclipse.lyo.oslc4j.core.model.Property;
import org.eclipse.lyo.oslc4j.core.model.Publisher;
import org.eclipse.lyo.oslc4j.core.model.QueryCapability;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;
import org.eclipse.lyo.oslc4j.core.model.Service;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog;
import org.eclipse.lyo.oslc4j.provider.jena.JenaProvidersRegistry;
import org.eclipse.lyo.oslc4j.provider.json4j.Json4JProvidersRegistry;

import org.oasis.oslcop.sysml.services.ServiceProviderCatalogService;
import org.oasis.oslcop.sysml.services.ServiceProviderService;
import org.oasis.oslcop.sysml.services.ResourceShapeService;

import org.oasis.oslcop.sysml.SysmlClass;
import org.oasis.oslcop.sysml.Classifier;
import org.oasis.oslcop.sysml.Conjugation;
import org.oasis.oslcop.sysml.Element;
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
import org.eclipse.lyo.oslc.domains.am.Resource;
import org.oasis.oslcop.sysml.Subsetting;
import org.oasis.oslcop.sysml.Superclassing;
import org.oasis.oslcop.sysml.Type;
import org.eclipse.lyo.oslc.domains.am.Oslc_amDomainConstants;
import org.eclipse.lyo.oslc.domains.DctermsDomainConstants;
import org.eclipse.lyo.oslc.domains.FoafDomainConstants;
import org.eclipse.lyo.oslc.domains.jazz_am.Jazz_amDomainConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcDomainConstants;
import org.oasis.oslcop.sysml.SysmlDomainConstants;
import org.oasis.oslcop.sysml.services.ServiceProviderService1;
import org.oasis.oslcop.sysml.services.ServiceProviderService2;
import org.oasis.oslcop.sysml.services.ServiceProviderService3;
import org.oasis.oslcop.sysml.services.ServiceProviderService4;
import org.oasis.oslcop.sysml.services.ServiceProviderService5;
import org.oasis.oslcop.sysml.services.SubsettingService;
import org.oasis.oslcop.sysml.services.ElementService;
import org.oasis.oslcop.sysml.services.ClassService;
import org.oasis.oslcop.sysml.services.RelationshipService;
import org.oasis.oslcop.sysml.services.GeneralizationService;

// Start of user code imports
import org.oasis.oslcop.sysml.services.PopulationService;
// End of user code

// Start of user code pre_class_code
// End of user code

/**
 * Generated by Lyo Designer 4.0.0.202009081044
 */
public class Application extends javax.ws.rs.core.Application {

    private static final Set<Class<?>>         RESOURCE_CLASSES                          = new HashSet<Class<?>>();
    private static final Map<String, Class<?>> RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP = new HashMap<String, Class<?>>();

    // Start of user code class_attributes
    // End of user code

    // Start of user code class_methods
    // End of user code

    static
    {
        RESOURCE_CLASSES.addAll(JenaProvidersRegistry.getProviders());
        RESOURCE_CLASSES.addAll(Json4JProvidersRegistry.getProviders());
        RESOURCE_CLASSES.add(ServiceProviderService1.class);
        RESOURCE_CLASSES.add(ServiceProviderService2.class);
        RESOURCE_CLASSES.add(ServiceProviderService3.class);
        RESOURCE_CLASSES.add(ServiceProviderService4.class);
        RESOURCE_CLASSES.add(ServiceProviderService5.class);
        RESOURCE_CLASSES.add(SubsettingService.class);
        RESOURCE_CLASSES.add(ElementService.class);
        RESOURCE_CLASSES.add(ClassService.class);
        RESOURCE_CLASSES.add(RelationshipService.class);
        RESOURCE_CLASSES.add(GeneralizationService.class);

        // Catalog resources
        RESOURCE_CLASSES.add(ServiceProviderCatalogService.class);
        RESOURCE_CLASSES.add(ServiceProviderService.class);
        RESOURCE_CLASSES.add(ResourceShapeService.class);

        // Swagger resources
        RESOURCE_CLASSES.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        RESOURCE_CLASSES.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);

        // Start of user code Custom Resource Classes
        RESOURCE_CLASSES.add(PopulationService.class);
        // End of user code

        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_ALLOWED_VALUES,           AllowedValues.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_COMPACT,                  Compact.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_CREATION_FACTORY,         CreationFactory.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_DIALOG,                   Dialog.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_ERROR,                    Error.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_EXTENDED_ERROR,           ExtendedError.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_OAUTH_CONFIGURATION,      OAuthConfiguration.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_PREFIX_DEFINITION,        PrefixDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_PREVIEW,                  Preview.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_PROPERTY,                 Property.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_PUBLISHER,                Publisher.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_QUERY_CAPABILITY,         QueryCapability.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_RESOURCE_SHAPE,           ResourceShape.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_SERVICE,                  Service.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_SERVICE_PROVIDER,         ServiceProvider.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_SERVICE_PROVIDER_CATALOG, ServiceProviderCatalog.class);

        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CLASS_PATH, SysmlClass.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CLASSIFIER_PATH, Classifier.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.CONJUGATION_PATH, Conjugation.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.ELEMENT_PATH, Element.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.FEATURE_PATH, Feature.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.FEATUREMEMBERSHIP_PATH, FeatureMembership.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.FEATURETYPING_PATH, FeatureTyping.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.GENERALIZATION_PATH, Generalization.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.IMPORT_PATH, SysmlImport.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.MEMBERSHIP_PATH, Membership.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.MULTIPLICITY_PATH, Multiplicity.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.PACKAGE_PATH, SysmlPackage.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(FoafDomainConstants.PERSON_PATH, Person.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.REDEFINITION_PATH, Redefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.RELATIONSHIP_PATH, Relationship.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(Oslc_amDomainConstants.RESOURCE_PATH, Resource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.SUBSETTING_PATH, Subsetting.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.SUPERCLASSING_PATH, Superclassing.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SysmlDomainConstants.TYPE_PATH, Type.class);
    }

    public Application()
           throws OslcCoreApplicationException,
                  URISyntaxException
    {
        final String BASE_URI = "http://localhost/validatingResourceShapes";
        for (final Map.Entry<String, Class<?>> entry : RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.entrySet()) {
            ResourceShapeFactory.createResourceShape(BASE_URI, OslcConstants.PATH_RESOURCE_SHAPES, entry.getKey(), entry.getValue());
        }
    }

    @Override 
    public Set<Class<?>> getClasses() { 
        return RESOURCE_CLASSES; 
    }

    public static Map<String, Class<?>> getResourceShapePathToResourceClassMap() {
        return RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP;
    }
}
