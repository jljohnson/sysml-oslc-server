<%--To avoid the overriding of any manual code changes upon subsequent code generations, disable "Generate JSP Files" option in the Adaptor model.--%>
<!DOCTYPE html>
<%--
 Copyright (c) 2011, 2012, 2017 IBM Corporation and others.

 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v1.0
 and Eclipse Distribution License v. 1.0 which accompanies this distribution.

 The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 and the Eclipse Distribution License is available at
 http://www.eclipse.org/org/documents/edl-v10.php.

 Contributors:

  Sam Padgett     - initial API and implementation
  Michael Fiedler - adapted for OSLC4J
  Jad El-khoury   - initial implementation of code generator (422448)
  Frédéric Loiret - Switch the template to Bootstrap (519699)
  Frédéric Loiret - Support for UI Preview (494303)
  Andrii Berezovskyi - Support for UI Preview (494303)

 This file is generated by org.eclipse.lyo.oslc4j.codegenerator
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@page import="org.eclipse.lyo.oslc4j.core.model.Link" %>
<%@page import="org.eclipse.lyo.oslc4j.core.model.ServiceProvider"%>
<%@page import="org.eclipse.lyo.oslc4j.core.model.OslcConstants"%>
<%@page import="org.eclipse.lyo.oslc4j.core.OSLC4JUtils"%>
<%@page import="org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition"%>
<%@page import="org.eclipse.lyo.oslc4j.core.annotation.OslcName"%>
<%@page import="java.lang.reflect.Method"%>
<%@page import="java.net.URI"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@page import="javax.xml.namespace.QName"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>

<%@page import="org.oasis.oslcop.sysml.Subsetting"%>
<%@page import="org.oasis.oslcop.sysml.SysmlDomainConstants"%>

<%@ page contentType="text/html" language="java" pageEncoding="UTF-8" %>

<%
  Subsetting aSubsetting = (Subsetting) request.getAttribute("aSubsetting");
%>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title><%= aSubsetting.toString() %></title>

  <link href="<c:url value="/static/css/bootstrap-4.0.0-beta.min.css"/>" rel="stylesheet">
  <link href="<c:url value="/static/css/adaptor.css"/>" rel="stylesheet">

  <script src="<c:url value="/static/js/jquery-3.2.1.min.js"/>"></script>
  <script src="<c:url value="/static/js/popper-1.11.0.min.js"/>"></script>
  <script src="<c:url value="/static/js/bootstrap-4.0.0-beta.min.js"/>"></script>
  <script src="<c:url value="/static/js/ui-preview-helper.js"/>"></script>
  <script type="text/javascript">
    $(function () {setupUiPreviewOnPopover($("a.oslc-resource-link"));});
  </script>
</head>

<body>
<!-- Fixed navbar -->
  <nav class="navbar navbar-expand-lg sticky-top navbar-light bg-light">
    <div class="container">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item"><a class="nav-link" href="<c:url value="/"/>"><%= application.getServletContextName() %></a></li>
        <li class="nav-item"><a class="nav-link" href="<c:url value="/services/catalog/singleton"/>">Service Provider Catalog</a></li>
        <li class="nav-item"><a class="nav-link" href="<c:url value="/swagger-ui/index.jsp"/>">Swagger UI</a></li>
      </ul>
    </div>
  </nav>
<!-- Begin page content -->
<div class="container">
    <div class="page-header">
        <h1>Subsetting: <%= aSubsetting.toString() %></h1>
        <%
        URI shapeUri = UriBuilder.fromUri(OSLC4JUtils.getServletURI()).path(OslcConstants.PATH_RESOURCE_SHAPES).path(SysmlDomainConstants.SUBSETTING_PATH).build();
        Collection<URI> types = aSubsetting.getTypes();   
        %>
        <p class="lead">Resource URI:&nbsp;
        <jsp:include page="/org/oasis/oslcop/sysml/subsettingtohtml.jsp"></jsp:include>
        </p>
        <p class="lead">Shape:&nbsp;
        <a href="<%=shapeUri%>"><%=shapeUri%></a>
        </p>
        <p class="lead">rdf:type(s):</p>
        <ul>
        <%for (URI type : aSubsetting.getTypes()) {%>
        <li><a href="<%=type%>"><%=type%></a></li>
        <%}%>
        </ul>
    </div>
        <h2>Properties</h2>
        <div>
          <% Method method = null; %>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getSubsettedFeature"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if ((aSubsetting.getSubsettedFeature() == null) || (aSubsetting.getSubsettedFeature().getValue() == null)) {
                out.write("<em>null</em>");
            }
            else {
                %>
                <jsp:include page="/org/oasis/oslcop/sysml/featuretohtml.jsp">
                    <jsp:param name="resourceUri" value="<%=aSubsetting.getSubsettedFeature().getValue()%>"/> 
                    </jsp:include>
                <%
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getSubsettingFeature"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if ((aSubsetting.getSubsettingFeature() == null) || (aSubsetting.getSubsettingFeature().getValue() == null)) {
                out.write("<em>null</em>");
            }
            else {
                %>
                <jsp:include page="/org/oasis/oslcop/sysml/featuretohtml.jsp">
                    <jsp:param name="resourceUri" value="<%=aSubsetting.getSubsettingFeature().getValue()%>"/> 
                    </jsp:include>
                <%
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getOwningFeature"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if ((aSubsetting.getOwningFeature() == null) || (aSubsetting.getOwningFeature().getValue() == null)) {
                out.write("<em>null</em>");
            }
            else {
                %>
                <jsp:include page="/org/oasis/oslcop/sysml/featuretohtml.jsp">
                    <jsp:param name="resourceUri" value="<%=aSubsetting.getOwningFeature().getValue()%>"/> 
                    </jsp:include>
                <%
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getGeneral"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if ((aSubsetting.getGeneral() == null) || (aSubsetting.getGeneral().getValue() == null)) {
                out.write("<em>null</em>");
            }
            else {
                %>
                <jsp:include page="/org/oasis/oslcop/sysml/typetohtml.jsp">
                    <jsp:param name="resourceUri" value="<%=aSubsetting.getGeneral().getValue()%>"/> 
                    </jsp:include>
                <%
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getSpecific"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if ((aSubsetting.getSpecific() == null) || (aSubsetting.getSpecific().getValue() == null)) {
                out.write("<em>null</em>");
            }
            else {
                %>
                <jsp:include page="/org/oasis/oslcop/sysml/typetohtml.jsp">
                    <jsp:param name="resourceUri" value="<%=aSubsetting.getSpecific().getValue()%>"/> 
                    </jsp:include>
                <%
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getOwningType"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if ((aSubsetting.getOwningType() == null) || (aSubsetting.getOwningType().getValue() == null)) {
                out.write("<em>null</em>");
            }
            else {
                %>
                <jsp:include page="/org/oasis/oslcop/sysml/typetohtml.jsp">
                    <jsp:param name="resourceUri" value="<%=aSubsetting.getOwningType().getValue()%>"/> 
                    </jsp:include>
                <%
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getRelatedElement"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getRelatedElement()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    %>
                    <li>
                    <jsp:include page="/org/oasis/oslcop/sysml/elementtohtml.jsp">
                        <jsp:param name="resourceUri" value="<%=next.getValue()%>"/> 
                        </jsp:include>
                    </li>
                    <%
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getTarget"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getTarget()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    %>
                    <li>
                    <jsp:include page="/org/oasis/oslcop/sysml/elementtohtml.jsp">
                        <jsp:param name="resourceUri" value="<%=next.getValue()%>"/> 
                        </jsp:include>
                    </li>
                    <%
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getSysmlSource"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getSysmlSource()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    %>
                    <li>
                    <jsp:include page="/org/oasis/oslcop/sysml/elementtohtml.jsp">
                        <jsp:param name="resourceUri" value="<%=next.getValue()%>"/> 
                        </jsp:include>
                    </li>
                    <%
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getOwningRelatedElement"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if ((aSubsetting.getOwningRelatedElement() == null) || (aSubsetting.getOwningRelatedElement().getValue() == null)) {
                out.write("<em>null</em>");
            }
            else {
                %>
                <jsp:include page="/org/oasis/oslcop/sysml/elementtohtml.jsp">
                    <jsp:param name="resourceUri" value="<%=aSubsetting.getOwningRelatedElement().getValue()%>"/> 
                    </jsp:include>
                <%
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getOwnedRelatedElement_comp"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getOwnedRelatedElement_comp()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    %>
                    <li>
                    <jsp:include page="/org/oasis/oslcop/sysml/elementtohtml.jsp">
                        <jsp:param name="resourceUri" value="<%=next.getValue()%>"/> 
                        </jsp:include>
                    </li>
                    <%
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getOwnedRelatedElement"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getOwnedRelatedElement()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    %>
                    <li>
                    <jsp:include page="/org/oasis/oslcop/sysml/elementtohtml.jsp">
                        <jsp:param name="resourceUri" value="<%=next.getValue()%>"/> 
                        </jsp:include>
                    </li>
                    <%
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getSysmlIdentifier"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if (aSubsetting.getSysmlIdentifier() == null) {
                out.write("<em>null</em>");
            }
            else {
                out.write(aSubsetting.getSysmlIdentifier().toString());
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getName"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if (aSubsetting.getName() == null) {
                out.write("<em>null</em>");
            }
            else {
                out.write(aSubsetting.getName().toString());
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getOwningMembership"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if ((aSubsetting.getOwningMembership() == null) || (aSubsetting.getOwningMembership().getValue() == null)) {
                out.write("<em>null</em>");
            }
            else {
                %>
                <jsp:include page="/org/oasis/oslcop/sysml/membershiptohtml.jsp">
                    <jsp:param name="resourceUri" value="<%=aSubsetting.getOwningMembership().getValue()%>"/> 
                    </jsp:include>
                <%
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getOwnedRelationship_comp"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getOwnedRelationship_comp()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    %>
                    <li>
                    <jsp:include page="/org/oasis/oslcop/sysml/relationshiptohtml.jsp">
                        <jsp:param name="resourceUri" value="<%=next.getValue()%>"/> 
                        </jsp:include>
                    </li>
                    <%
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getOwningRelationship"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if ((aSubsetting.getOwningRelationship() == null) || (aSubsetting.getOwningRelationship().getValue() == null)) {
                out.write("<em>null</em>");
            }
            else {
                %>
                <jsp:include page="/org/oasis/oslcop/sysml/relationshiptohtml.jsp">
                    <jsp:param name="resourceUri" value="<%=aSubsetting.getOwningRelationship().getValue()%>"/> 
                    </jsp:include>
                <%
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getOwningNamespace"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if ((aSubsetting.getOwningNamespace() == null) || (aSubsetting.getOwningNamespace().getValue() == null)) {
                out.write("<em>null</em>");
            }
            else {
                %>
                <jsp:include page="/org/oasis/oslcop/sysml/sysmlpackagetohtml.jsp">
                    <jsp:param name="resourceUri" value="<%=aSubsetting.getOwningNamespace().getValue()%>"/> 
                    </jsp:include>
                <%
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getOwner"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if ((aSubsetting.getOwner() == null) || (aSubsetting.getOwner().getValue() == null)) {
                out.write("<em>null</em>");
            }
            else {
                %>
                <jsp:include page="/org/oasis/oslcop/sysml/elementtohtml.jsp">
                    <jsp:param name="resourceUri" value="<%=aSubsetting.getOwner().getValue()%>"/> 
                    </jsp:include>
                <%
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getOwnedElement"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getOwnedElement()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    %>
                    <li>
                    <jsp:include page="/org/oasis/oslcop/sysml/elementtohtml.jsp">
                        <jsp:param name="resourceUri" value="<%=next.getValue()%>"/> 
                        </jsp:include>
                    </li>
                    <%
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getOwnedRelationship"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getOwnedRelationship()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    %>
                    <li>
                    <jsp:include page="/org/oasis/oslcop/sysml/relationshiptohtml.jsp">
                        <jsp:param name="resourceUri" value="<%=next.getValue()%>"/> 
                        </jsp:include>
                    </li>
                    <%
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getContributor"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getContributor()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    %>
                    <li>
                    <jsp:include page="/org/oasis/oslcop/sysml/persontohtml.jsp">
                        <jsp:param name="resourceUri" value="<%=next.getValue()%>"/> 
                        </jsp:include>
                    </li>
                    <%
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getCreated"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if (aSubsetting.getCreated() == null) {
                out.write("<em>null</em>");
            }
            else {
                out.write(aSubsetting.getCreated().toString());
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getCreator"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getCreator()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    %>
                    <li>
                    <jsp:include page="/org/oasis/oslcop/sysml/persontohtml.jsp">
                        <jsp:param name="resourceUri" value="<%=next.getValue()%>"/> 
                        </jsp:include>
                    </li>
                    <%
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getDescription"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if (aSubsetting.getDescription() == null) {
                out.write("<em>null</em>");
            }
            else {
                out.write(aSubsetting.getDescription().toString());
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getIdentifier"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if (aSubsetting.getIdentifier() == null) {
                out.write("<em>null</em>");
            }
            else {
                out.write(aSubsetting.getIdentifier().toString());
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getModified"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if (aSubsetting.getModified() == null) {
                out.write("<em>null</em>");
            }
            else {
                out.write(aSubsetting.getModified().toString());
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getSource"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if (aSubsetting.getSource() == null) {
                out.write("<em>null</em>");
            }
            else {
                out.write(aSubsetting.getSource().toString());
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getTitle"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if (aSubsetting.getTitle() == null) {
                out.write("<em>null</em>");
            }
            else {
                out.write(aSubsetting.getTitle().toString());
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getType"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            Iterator<String> typeItr = aSubsetting.getType().iterator();
            while(typeItr.hasNext()) {
                out.write("<li>" + typeItr.next().toString() + "</li>");
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getInstanceShape"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getInstanceShape()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    out.write("<li>" + "<a href=\"" + next.getValue().toString() + "\" class=\"oslc-resource-link\">" + next.getValue().toString() + "</a>" + "</li>");
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getServiceProvider"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getServiceProvider()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    out.write("<li>" + "<a href=\"" + next.getValue().toString() + "\" class=\"oslc-resource-link\">" + next.getValue().toString() + "</a>" + "</li>");
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getShortTitle"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <%
            if (aSubsetting.getShortTitle() == null) {
                out.write("<em>null</em>");
            }
            else {
                out.write(aSubsetting.getShortTitle().toString());
            }
            %>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getExternal"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getExternal()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    out.write("<li>" + "<a href=\"" + next.getValue().toString() + "\" class=\"oslc-resource-link\">" + next.getValue().toString() + "</a>" + "</li>");
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getTrace"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getTrace()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    out.write("<li>" + "<a href=\"" + next.getValue().toString() + "\" class=\"oslc-resource-link\">" + next.getValue().toString() + "</a>" + "</li>");
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getRefine"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getRefine()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    out.write("<li>" + "<a href=\"" + next.getValue().toString() + "\" class=\"oslc-resource-link\">" + next.getValue().toString() + "</a>" + "</li>");
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getDerives"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getDerives()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    out.write("<li>" + "<a href=\"" + next.getValue().toString() + "\" class=\"oslc-resource-link\">" + next.getValue().toString() + "</a>" + "</li>");
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getElaborates"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getElaborates()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    out.write("<li>" + "<a href=\"" + next.getValue().toString() + "\" class=\"oslc-resource-link\">" + next.getValue().toString() + "</a>" + "</li>");
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
          <dl class="row">
            <% method = Subsetting.class.getMethod("getSatisfy"); %>
            <dt  class="col-sm-2 text-right"><a href="<%=method.getAnnotation(OslcPropertyDefinition.class).value() %>"><%=method.getAnnotation(OslcName.class).value()%></a></dt>
            <dd class="col-sm-9">
            <ul>
            <%
            for(Link next : aSubsetting.getSatisfy()) {
                if (next.getValue() == null) {
                    out.write("<li>" + "<em>null</em>" + "</li>");
                }
                else {
                    out.write("<li>" + "<a href=\"" + next.getValue().toString() + "\" class=\"oslc-resource-link\">" + next.getValue().toString() + "</a>" + "</li>");
                }
            }
            %>
            </ul>
            
            </dd>
          </dl>
        </div>
        <%
        Map<QName, Object> extendedProperties = aSubsetting.getExtendedProperties();
        if (!extendedProperties.isEmpty()) {
        %>
            <h3>Extended Properties</h3>
            <div>
            <%
            for (Map.Entry<QName, Object> entry : extendedProperties.entrySet()) 
            {
                QName key = entry.getKey();
                Object value = entry.getValue();
            %>
            <dl class="row">
                <dt  class="col-sm-2 text-right"><a href="<%=key.getNamespaceURI() + key.getLocalPart() %>"><%=key.getLocalPart()%></a></dt>
                <dd class="col-sm-9"><%= value.toString()%></dd>
            </dl>
            <%
            }
            %>
            </div>
        <%
        }
        %>
</div>
  <footer class="footer">
    <div class="container">
      <p class="text-muted">
        OSLC Adaptor was generated using <a href="http://eclipse.org/lyo">Eclipse Lyo</a>.
      </p>
    </div>
  </footer>
</body>
</html>
