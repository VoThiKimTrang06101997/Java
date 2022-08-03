jQuery(document).ready(function($) {
	
	$('#btn-register').click(function(e) {
		e.preventDefault()    // ngăn chặn sự kiện load lại trang
		
		var fullname = $('#fullname').val()
		var email = $('#email').val()
		var password = $('#password').val()
		
		$.ajax({
			url: 'http://localhost:8080/DemoFilter/api/register',
			type: 'get',
			data: {
				fullname: fullname,
				email: email,
				password: password
			}
		}).done(function(result) {
			if(result.success) {
				// Thành công
				$('#message').append('<h1>Thành công</h1>')
				// alert('Thành công')
				// console.log(result)
			} else {
				// Thất bại
				$('#message').append('<h1>Thất bại</h1>')
			}
		}).fail(function(error) {
			console.log(error)
		})
		
	})
})

