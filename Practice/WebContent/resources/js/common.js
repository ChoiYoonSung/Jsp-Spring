// Paging + Search
function list_go(page,url){
	
	if(!url) url="list.do";	// url 없을 경우
	
	var jobForm = $('form#pageForm');
	jobForm.find('[name="page"]').val(page);	// Paging present page
	jobForm.find('[name="perPageNum"]').val($('select#perPageNum').val());	// page num per screen
	jobForm.find('[name="searchType"]').val($('select#searchType').val());	// 
	jobForm.find('[name="keyword"]').val($('div.input-group>input[name="keyword"]').val());
	
	jobForm.attr({
		action: url,
		method:'get'
	}).submit();
};

function OpenWindow(UrlStr, WinTitle, WinWidth, WinHeight){
	winleft = (screen.width - WinWidth) / 2;
	wintop = (screen.height - WinHeight) / 2;
	
	var win = window.open(UrlStr, WinTitle, "scrollbars=yes,width"+WinWidth+",height="+WinHeight+",top="+wintop+",left="+winleft+",resizable=yes, status=yes");
	win.focus();
}

function CloseWindow(){
	window.opener.location.reload(true);
	window.close();
}

function CloseWindow(parentURL){
	window.opener.parent.location.href=parentURL;
	window.close();
}