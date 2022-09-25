$(document).ready(() => {
    $("#btn-menu-search").click(function () {
        var searchKey = $("#txt-menu-search").val();
        $.ajax({
            type: 'GET',
            url: '/web-selfcare/search-menu/'+searchKey,
            success: function (result) {
        }
    });
});