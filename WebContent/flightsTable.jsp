<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="/struts-dojo-tags" prefix="sd"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sd:head />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Airline</title>
<link rel="icon" href="images/favicon.ico">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Sales Manager Dashboard Panel" />
<script type="application/x-javascript">
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 


</script>
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel='stylesheet' type='text/css' />
<script src="https://use.fontawesome.com/36a53496c3.js"></script>
<link rel="stylesheet" href="css/icon-font.min.css" type='text/css' />
<link href="css/animate.css" rel="stylesheet" type="text/css"
	media="all">
<script src="js/wow.min.js"></script>
<script>
	new WOW().init();
</script>
<script src="js/jquery-1.10.2.min.js"></script>
<link href="css/editor-style.css" rel="stylesheet" type="text/css">

<!-- DATATABLES  -->
<script
	src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
<link
	href="https://cdn.datatables.net/1.10.13/css/jquery.dataTables.min.css"
	rel="stylesheet">

<script>
	$(document).ready(function() {
		$('#myTable').DataTable();
	});
</script>
</head>

<body class="sticky-header left-side-collapsed">
	<section>
	<div class="left-side sticky-left-side">
		<div class="logo">
			<h1>
				<a href="index.jsp">Index</a>
			</h1>
		</div>
		<div class="logo-icon text-center">
			<a href="index.jsp"><i class="lnr lnr-home"></i> </a>
		</div>
		<div class="left-side-inner">
			<ul class="nav nav-pills nav-stacked custom-nav">
				<li><s:a name="action" value="show_map">
						<i class="fa fa-globe"></i>
						<span>Map</span>
					</s:a></li>
				<li><s:a name="action" value="show_flights">
						<i class="fa fa-table"></i>
						<span>Historical Flights</span>
					</s:a></li>
				<li><s:a name="action" value="show_flow">
						<i class="fa fa-area-chart"></i>
						<span>Planes flow</span>
					</s:a></li>
				<li><s:a name="action" value="show_pie">
						<i class="fa fa-pie-chart"></i>
						<span>Terminals</span>
					</s:a></li>
			</ul>
		</div>
	</div>

	<div class="main-content">
		<jsp:include page="includes/header_section.jsp" />
		<h1>FLIGHTS</h1>
		<div class="contentform">
			<table id="myTable" class="display" cellspacing="0" width="100%">
				<thead>
					<tr>
						<th>Airline</th>
						<th>Plane</th>
						<th>Baggage</th>
						<th>Gate</th>
						<th>Route</th>
						<th>Departure</th>
						<th>Duration</th>
						<th>Delay</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="flightsList">
						<tr>
							<td><s:property value="airline_name" /></td>
							<td><s:property value="plane_name" /></td>
							<td><s:property value="baggage_id" /></td>
							<td><s:property value="gate_name" /></td>
							<td><s:property value="route_name" /></td>
							<td><s:property value="dateDeparture" /></td>
							<td><s:property value="duration" /></td>
							<td><s:property value="delay" /></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
	</div>
	<footer>
	<p>&copy 2017 Gonenpru Corporation</p>
	</footer> </section>
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>