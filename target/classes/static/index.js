$(document).ready(function() {

	$('#login_button').click(function() {
		var param = {};
		param['loginName'] = $('#login_name').val();
		param['password'] = $('#login_password').val();
		$.ajax({
			type : "POST",
			contentType : 'application/json; charset=utf-8',
			dataType : 'json',
			url : window.location.href + '/' + 'loginCheck',
			data : JSON.stringify(param),
			success : function(response) {
				alert(JSON.stringify(response));
			}
		})
	});
});