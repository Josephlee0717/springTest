<html >
	<head>
		<script src="libs/angular-1.5.7/angular.min.js"></script>
		<script src="libs/jquery/jquery-2.0.0.js"></script>
		<link href="libs/bootstrap-3.3.5-dist/css/bootstrap.css" rel="stylesheet"></link>
		<script src="libs/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
		<script src="libs/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
		<script src="js/controllers.js"></script>
		<script src="js/app.js"></script>
	</head>
	<body ng-app='myApp'>
		<div ng-controller='CartController'>
			<h1>You Order</h1>
			<div ng-repeat='item in items'>
				<span>{{item.title}}</span>
				<input ng-model='item.quantity' />
				<span>{{item.price | currency}}</span>
				<span>{{item.price * item.quantity | currency}}</span>
				<button ng-click="remove($index)">Remove</button>
			</div>
			<br/>
			<!-- <h2>
				<input type="text" ng-model="user.name" />
				<h3>Echo: {{user.name}}</h3>
			</h2> -->
		</div>
	</body>
</html>
