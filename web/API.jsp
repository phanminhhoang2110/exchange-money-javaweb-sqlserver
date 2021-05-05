<%-- 
    Document   : API
    Created on : Mar 27, 2021, 9:39:18 AM
    Author     : Hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>JSP Page</title>
        <style>
            #customer>table,th,td,tr{
                border: 1px black solid;
                padding: 5px;
            }
            #customer>table{
                margin:  0 auto;
            }
            .button{
                text-align: center;
                margin-top: 20px;
                margin-bottom: 20px;
            }
            .title{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div class="title">
            <h1>Customer List In Store</h1>
        </div>
        <div id="customer">
            <div class="button">
                <button type="button" class="btn btn-lg btn-primary" onclick="loadDoc()">Load</button>            
            </div>
        </div>

    </body>
    <script>
        function loadDoc() {
            var xhttp = new XMLHttpRequest();
            var table = "<table class='table table-striped'><th class='table-primary'>Name</th><th class='table-primary'>Job Title</th><th class='table-primary'>Birthday</th><th class='table-primary'>Marial Status</th><th class='table-primary'>Gender</th><th class='table-primary'>Hire Date</th>"
            var data;
            xhttp.onreadystatechange = function () {
                if (this.readyState == 4 && this.status == 200) {
                    var customers = this.responseXML;
                    var x = customers.getElementsByTagName("customer");
                    for (var i = 0; i < x.length; i++) {
                        table += "<tr><td>";
                        table += x[i].getElementsByTagName("name")[0].childNodes[0].nodeValue;
                        table += "</td><td>"
                        table += x[i].getElementsByTagName("jobtitle")[0].childNodes[0].nodeValue;
                        table += "</td><td>"
                        table += x[i].getElementsByTagName("birthday")[0].childNodes[0].nodeValue;
                        table += "</td><td>"
                        if (x[i].getElementsByTagName("marialStatus")[0].childNodes[0].nodeValue == 'S') {
                            table += 'Single';
                        }
                        if (x[i].getElementsByTagName("marialStatus")[0].childNodes[0].nodeValue == 'M') {
                            table += 'Married';
                        }
                        table += "</td><td>"
                        table += x[i].getElementsByTagName("gender")[0].childNodes[0].nodeValue == 'M' ? 'Male' : 'Female';
                        table += "</td><td>"
                        table += x[i].getElementsByTagName("hireDate")[0].childNodes[0].nodeValue;
                        table += "</td></tr>"
                    }
                    table += "</table>"
                    document.getElementById("customer").innerHTML = table;
                }
            }
            xhttp.open("GET", "http://localhost:8084/FakeAPIForXML/customers", true);
            xhttp.send();
        }
    </script>
</html>
