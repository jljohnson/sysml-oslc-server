// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2011, 2012 IBM Corporation and others.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 *  The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *  and the Eclipse Distribution License is available at
 *  http://www.eclipse.org/org/documents/edl-v10.php.
 *  
 *  Contributors:
 *  
 *	   Sam Padgett	       - initial API and implementation
 *     Michael Fiedler     - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *     Matthieu Helleboid   - Support for multiple Service Providers.
 *     Anass Radouani       - Support for multiple Service Providers.
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package org.oasis.oslcop.sysml;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletContextEvent;
import java.util.List;

import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.oasis.oslcop.sysml.servlet.ServiceProviderCatalogSingleton;
import org.oasis.oslcop.sysml.ServiceProviderInfo;
import org.oasis.oslcop.sysml.resources.Element;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.resources.Relationship;
import org.eclipse.lyo.oslc.domains.rm.Requirement;
import org.eclipse.lyo.oslc.domains.am.Resource;


// Start of user code imports
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.oasis.oslcop.sysml.api.SysMLClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response;
import org.apache.http.HttpStatus;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import javax.xml.namespace.QName;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.RDFReader;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;
import org.apache.jena.datatypes.BaseDatatype.TypedValue;

import java.io.InputStream;
import java.net.URI;
import java.util.Map;

// End of user code

// Start of user code pre_class_code
// End of user code

public class SysmlServerManager {

    // Start of user code class_attributes
	private static Logger log = LoggerFactory.getLogger(SysmlServerManager.class);

	// translates a SysML REST Services URI to an OSLC URI
	static URI translate(URI uri, URI fromBase, URI toBase) {
		String newURI = uri.toString();
		if (newURI.startsWith(fromBase.toString())) {
			newURI = toBase + uri.getPath();
			newURI = newURI.replaceFirst("commits/.*/elements", "Element");
		}
		return URI.create(newURI);
	}
	// End of user code
    
    
    // Start of user code class_methods
	/** Get the ServiceProviderInfo for the current request
	 * @param httpServletRequest
	 * @param serviceProviderId
	 * @return
	 * @throws Exception
	 */
	public static final ServiceProviderInfo getServiceProviderInfo(final HttpServletRequest httpServletRequest,
			final String serviceProviderId) throws Exception {
		// Need to re-read the organizations in case another was added
		ServiceProviderInfo[] serviceProviderInfos = getServiceProviderInfos(httpServletRequest);
		for (ServiceProviderInfo serviceProviderInfo : serviceProviderInfos) {
			if (serviceProviderInfo.serviceProviderId.equals(serviceProviderId)) {
				return serviceProviderInfo;
			}
		}
		throw new Exception("ServiceProvider for Id " + serviceProviderId + "  not found.");
	}
    // End of user code

    public static void contextInitializeServletListener(final ServletContextEvent servletContextEvent)
    {
        
        // Start of user code contextInitializeServletListener
        // TODO Implement code to establish connection to data backbone etc ...
        // End of user code
    }

    public static void contextDestroyServletListener(ServletContextEvent servletContextEvent) 
    {
        
        // Start of user code contextDestroyed
        // TODO Implement code to shutdown connections to data backbone etc...
        // End of user code
    }

    public static ServiceProviderInfo[] getServiceProviderInfos(HttpServletRequest httpServletRequest)
    {
        ServiceProviderInfo[] serviceProviderInfos = {};
        
        // Start of user code "ServiceProviderInfo[] getServiceProviderInfos(...)"
		// Get all the SysML Projects accessible by the  user
		// Create a service provider for each project

		ServiceProviderInfo serviceProviderInfo;
		int index;
		try {
			SysMLClient apiClient = (SysMLClient)httpServletRequest.getSession().getAttribute(SysMLClient.APICLIENT_ATTRIBUTE);
			JsonArray projects = apiClient.getProjects();
			if (projects == null) {
				log.warn("There are no projects in {}", apiClient.getBasePath());
				return serviceProviderInfos;
			}
			serviceProviderInfos = new ServiceProviderInfo[projects.size()];
			index = 0;
			for (JsonElement project: projects) {
				serviceProviderInfo = new ServiceProviderInfo();
				serviceProviderInfo.name = project.getAsJsonObject().get("name").getAsString();
				serviceProviderInfo.serviceProviderId = project.getAsJsonObject().get("id").getAsString();
				serviceProviderInfos[index] = serviceProviderInfo;
				index++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error("Unable to read SysML Projects: {}", e.getMessage());
			e.printStackTrace();
		}
        // End of user code
        return serviceProviderInfos;
    }

    public static List<AbstractResource> queryElementsAndRequirements(HttpServletRequest httpServletRequest, final String serviceProviderId, String where, int page, int limit)
    {
        List<AbstractResource> resources = null;
        
        // Start of user code queryElementsAndRequirements
        // Return a set of resources.
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        
        // This implementation just returns all the Elements in the Project
        // The page and limit parameters are ignored
        // The where parameter is {type}::{regex} where {type}:: is optional
        // Get the ServiceProvider, the SysML Project
        try {
        	String type = null;
        	String regex = where;
	        	if (where != null) {
	        	String[] temp = where.split("::");
	        	if (temp.length == 2) {
	        		type = temp[0];
	        		regex = temp[1]; // Element @type can be multi-valued
	        	}
        	}
        	ServiceProviderInfo info = SysmlServerManager.getServiceProviderInfo(httpServletRequest, serviceProviderId);
            SysMLClient apiClient = (SysMLClient)httpServletRequest.getSession().getAttribute(SysMLClient.APICLIENT_ATTRIBUTE);
            String projectId = info.serviceProviderId;
            // Get the head commit /projects/{projectId}/head
            String url = "/projects/"+projectId+"/head";
            JsonElement commit = apiClient.readSysMLResource(url);
            if (commit == null) return resources; // There are no elements in this project
            String head = commit.getAsJsonObject().get("id").getAsString();
            // Get all the Elements in the Project for the head commit
            url =  "/projects/"+projectId+"/commits/"+head+"/elements";
	        JsonArray results = apiClient.readSysMLResource(url).getAsJsonArray();
			resources = new ArrayList<AbstractResource>(results.size());
			for (int i = 0; i < results.size(); i++) {
				JsonObject obj = results.get(i).getAsJsonObject();
				Element element = new Element(httpServletRequest, info, obj.get("identifier").getAsString(),  obj);
				if (regex == null || regex.equals("") || regex.equals("*")) regex = ".*";
				if ((type == null || element.getType().contains(type)) && element.toString().matches(regex)) resources.add(element);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(e, Status.INTERNAL_SERVER_ERROR);
		}
        // End of user code
        return resources;
    }
    public static List<AbstractResource> ElementAndResourceAndRequirementSelector(HttpServletRequest httpServletRequest, final String serviceProviderId, String terms)   
    {
        List<AbstractResource> resources = null;
        
        // Start of user code ElementAndResourceAndRequirementSelector
        // Return a set of resources, based on search criteria 
        // An empty List should imply that no resources where found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
		try {
			ServiceProviderInfo info = SysmlServerManager.getServiceProviderInfo(httpServletRequest, serviceProviderId);
			resources = new ArrayList<AbstractResource>();
			resources.addAll(queryElementsAndRequirements(httpServletRequest, serviceProviderId, terms, 1, 10000));
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(e, Status.INTERNAL_SERVER_ERROR);
		}
        // End of user code
        return resources;
    }
    public static AbstractResource createElementAndRequirement(HttpServletRequest httpServletRequest, final AbstractResource aResource, final String serviceProviderId)
    {
        AbstractResource newResource = null;
        
        // Start of user code createElementAndRequirement
        // TODO Implement code to create a resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return newResource;
    }

    public static AbstractResource createElementAndResourceAndRequirementFromDialog(HttpServletRequest httpServletRequest, final AbstractResource aResource, final String serviceProviderId)
    {
        AbstractResource newResource = null;
        
        // Start of user code createElementAndResourceAndRequirementFromDialog
        // TODO Implement code to create a resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return newResource;
    }



    public static Element getElement(HttpServletRequest httpServletRequest, final String serviceProviderId, final String id)
    {
        Element aResource = null;
        
        // Start of user code getElement
        // /projects/{projectId}/commits/{commitId}/elements/{elementId}
		try {
			if (id == null) {
				throw new Exception("Device ID must not be null");
			}
			final ServiceProviderInfo info = SysmlServerManager.getServiceProviderInfo(httpServletRequest, serviceProviderId);
			SysMLClient apiClient = (SysMLClient)httpServletRequest.getSession().getAttribute(SysMLClient.APICLIENT_ATTRIBUTE);
            String projectId = info.serviceProviderId;  // SysML Project is an OSLC ServiceProvider
            
            // Get the head commit /projects/{projectId}/head, we're just using the HEAD version for now
            String url = "/projects/"+projectId+"/head";
            JsonElement commit = apiClient.readSysMLResource(url);
            if (commit == null) return aResource; // There are no elements in this project
            String head = commit.getAsJsonObject().get("id").getAsString();
            
			url = apiClient.getBasePath() + "/projects/"+projectId+"/commits/"+head+"/elements/"+id;
			Response response = apiClient.getResource(url, "application/ld+json");
			
			URI fromBase = URI.create(apiClient.getBasePath());
			String temp = OSLC4JUtils.resolveServletUri(httpServletRequest);
			URI toBase = URI.create(temp+"crud");
			//URI.create("https://jamsden.rtp.raleigh.ibm.com:8443/sysml/services/crud");

			
			if (response != null && response.getStatus() == HttpStatus.SC_OK) {
				OSLC4JUtils.setUseBeanClassForParsing("true");
				final Model model = ModelFactory.createDefaultModel();
				RDFReader reader = model.getReader("JSON-LD");

				reader.read(model, (InputStream)response.getEntity(), "");

				// Translate the URIs to those of the adapting OSLC server
				StmtIterator statements = model.listStatements();
				List<Statement> toRemove = new ArrayList<Statement>();
				List<Statement> toAdd = new ArrayList<Statement>();
				for (Statement s; statements.hasNext(); ) {
					s = statements.next();
					RDFNode o = s.getObject();
					if (o.isURIResource()) {
						URI aURI = URI.create(o.asResource().getURI());
						String newURI = translate(aURI, fromBase, toBase).toString();
						toAdd.add(model.createStatement(s.getSubject(), s.getPredicate(), model.createResource(newURI)));
						toRemove.add(s);
					}
				}
				model.remove(toRemove);
				model.add(toAdd);
				
				// Get the actual @type, some SysML subclass of Element
				org.apache.jena.rdf.model.Resource resource = (org.apache.jena.rdf.model.Resource)model.getResource(url);
				Property rdfType = model.createProperty("http://www.w3.org/1999/02/22-rdf-syntax-ns#","type");
				String atType = resource.getProperty(rdfType).getObject().toString();
				
				Object[] elements =  JenaModelHelper.unmarshal(model, Element.class);
				
				if (elements.length > 0) {
					aResource = (Element)elements[0]; 
					// Translate the Element URL
					aResource.setAbout(translate(aResource.getAbout(), fromBase, toBase));
					
					// add the specific @type subclass  
					aResource.addType(atType);

					// Add the dcterms:identifier
					Map<QName,Object> extProps = aResource.getExtendedProperties();
					String identifier = ((TypedValue)extProps.get(new QName("http://omg.org/ns/sysml#","identifier"))).lexicalValue;
					aResource.setIdentifier(identifier);
				}
			} else {
				throw new WebApplicationException(response.getStatus());
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(e, Status.INTERNAL_SERVER_ERROR);
		}
        // End of user code
        return aResource;
    }
    public static Requirement getRequirement(HttpServletRequest httpServletRequest, final String serviceProviderId, final String id)
    {
        Requirement aResource = null;
        
        // Start of user code getRequirement
        // TODO Implement code to return a resource
        // return 'null' if the resource was not found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return aResource;
    }
    public static Relationship getRelationship(HttpServletRequest httpServletRequest, final String serviceProviderId, final String id)
    {
        Relationship aResource = null;
        
        // Start of user code getRelationship
        // TODO Implement code to return a resource
        // return 'null' if the resource was not found.
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return aResource;
    }

    public static Boolean deleteElement(HttpServletRequest httpServletRequest, final String serviceProviderId, final String id)
    {
        Boolean deleted = false;
        // Start of user code deleteElement
        // TODO Implement code to delete a resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return deleted;
    }
    public static Boolean deleteRequirement(HttpServletRequest httpServletRequest, final String serviceProviderId, final String id)
    {
        Boolean deleted = false;
        // Start of user code deleteRequirement
        // TODO Implement code to delete a resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return deleted;
    }
    public static Boolean deleteRelationship(HttpServletRequest httpServletRequest, final String serviceProviderId, final String id)
    {
        Boolean deleted = false;
        // Start of user code deleteRelationship
        // TODO Implement code to delete a resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return deleted;
    }

    public static Element updateElement(HttpServletRequest httpServletRequest, final Element aResource, final String serviceProviderId, final String id) {
        Element updatedResource = null;
        // Start of user code updateElement
        // TODO Implement code to update and return a resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return updatedResource;
    }
    public static Requirement updateRequirement(HttpServletRequest httpServletRequest, final Requirement aResource, final String serviceProviderId, final String id) {
        Requirement updatedResource = null;
        // Start of user code updateRequirement
        // TODO Implement code to update and return a resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return updatedResource;
    }
    public static Relationship updateRelationship(HttpServletRequest httpServletRequest, final Relationship aResource, final String serviceProviderId, final String id) {
        Relationship updatedResource = null;
        // Start of user code updateRelationship
        // TODO Implement code to update and return a resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return updatedResource;
    }

    public static String getETagFromElement(final Element aResource)
    {
        String eTag = null;
        // Start of user code getETagFromElement
        // TODO Implement code to return an ETag for a particular resource
        // End of user code
        return eTag;
    }
    public static String getETagFromRelationship(final Relationship aResource)
    {
        String eTag = null;
        // Start of user code getETagFromRelationship
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public static String getETagFromRequirement(final Requirement aResource)
    {
        String eTag = null;
        // Start of user code getETagFromRequirement
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
    public static String getETagFromResource(final Resource aResource)
    {
        String eTag = null;
        // Start of user code getETagFromResource
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }

    public static String getETagFromRequirementAndElement(final AbstractResource aResource)
    {
        String eTag = null;
        // Start of user code getETagFromRequirementAndElement
        // TODO Implement code to return an ETag for a particular resource
        // If you encounter problems, consider throwing the runtime exception WebApplicationException(message, cause, final httpStatus)
        // End of user code
        return eTag;
    }
}
