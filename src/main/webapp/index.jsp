<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Contact Manager - Struts2 Hibernate Example</title>
</head>
<body>

<h1>Contact Manager</h1>
<s:actionerror/>

<s:form action="add" method="post">
    <s:textfield name="contact.firstName" label="Firstname"/>
    <s:textfield name="contact.lastName" label="Lastname"/>
    <s:textfield name="contact.emailId" label="Email"/>
    <s:textfield name="contact.cellNo" label="Cell No."/>
    <s:textfield name="contact.website" label="Homepage"/>
    <s:textfield name="contact.birthDate" label="Birthdate"/>

    <s:textfield name="task.taskId" label="Task No"/>
    <s:textfield name="task.taskName" label="Task Name"/>
    <s:textfield name="task.deadTime" label="Dead Time"/>
    <s:textfield name="task.taskSize" label="Task Size"/>


    <s:submit value="Add Contact" align="center"/>
</s:form>

<h2>Contacts</h2>
<table>
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Cell No.</th>
        <th>Birthdate</th>
        <th>Homepage</th>
        <th>Delete</th>
    </tr>
    <s:iterator value="contactList" var="item">
        <tr>
            <td>

            </td>
            <td><s:property value="lastName"/>, <s:property value="firstName"/></td>
            <td><s:property value="emailId"/></td>
            <td><s:property value="cellNo"/></td>
            <td><s:property value="birthDate"/></td>
            <td><a href="<s:property value="website"/>">link</a></td>
            <td><a href="delete?id=<s:property value="id"/>">delete</a></td>
        </tr>
    </s:iterator>
</table>
<hr/>
<s:form id="listFrm" action="add1" method="post">
    <s:iterator value="contactList" status="row">
        <%--<s:form id="%{'frm'+#row.index}" action="add1" method="post">--%>
        <s:hidden name="contactList[%{#row.index}].id" />
        <s:textfield name="contactList[%{#row.index}].firstName" label="First Name"/>
        <s:textfield name="contactList[%{#row.index}].lastName" label="Last Name"/>
        <s:textfield name="contactList[%{#row.index}].emailId" label="Email"/>
        <s:textfield name="contactList[%{#row.index}].cellNo" label="Cell No."/>
        <s:textfield name="contactList[%{#row.index}].website" label="Homepage"/>
        <s:textfield name="contactList[%{#row.index}].birthDate" label="Birth Date"/>

        <%--</s:form>--%>
        <hr/>
    </s:iterator>
    <s:submit value="Test" align="center"/>
</s:form>
</body>
</html>