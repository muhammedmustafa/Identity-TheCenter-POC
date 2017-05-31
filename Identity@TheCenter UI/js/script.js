$(document).ready(function() {

	//$(selector).hover(handlerIn, handlerOut);
	$('.systemBoxContainer').hover(function() {
		
		//alert('test');
		$(this).find('.systemActions').css('visibility', 'visible');
	}, function() {
		
		$('.systemActions').css('visibility', 'hidden');
	});
	
	
	
	
	
});
