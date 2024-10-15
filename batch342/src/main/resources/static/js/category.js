function openForm() {
    $.ajax({
        type: "get",
        url: "/category/form",
        contentType: "html",
        success: function (categoryForm) {
            $('#myModal').modal('show');
            $('.modal-title').html("Category Form");
            $('.modal-body').html(categoryForm);
        }
    });
}