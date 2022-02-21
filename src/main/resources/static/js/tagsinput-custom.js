/**
 * 
 */

$(document).ready(function(){
	console.log("a00");
	$(".btn-size").click(function() {
		console.log("a0");
		var val = $(this).text();
		console.log("a1");
		$("#sizes").tagsinput('add', val);
		console.log("a");
	});
	$(".btn-brand").click(function() {
		var val = $(this).text();
		$("#brands").tagsinput('add', val);
	});
	$(".btn-category").click(function() {
		var val = $(this).text();
		$("#categories").tagsinput('add', val);
	});
	
});