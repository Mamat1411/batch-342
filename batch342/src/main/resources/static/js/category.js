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

function editForm(slug) {
    $.ajax({
        type: "get",
        url: `/category/edit/${slug}`,
        contentType: `html`,
        success: function (categoryForm) {
            $('#myModal').modal('show');
            $('.modal-title').html("Category Form");
            $('.modal-body').html(categoryForm);
        }
    });
}

function deleteForm(slug) {
    $.ajax({
        type: "get",
        url: `/category/deleteForm/${slug}`,
        contentType: `html`,
        success: function (categoryForm) {
            $('#myModal').modal('show');
            $('.modal-title').html("Category Form");
            $('.modal-body').html(categoryForm);
        }
    });
}

function deleteCategory(slug) {
    $.ajax({
        type: "get",
        url: `/category/delete/${slug}`,
        contentType: `html`,
        success: function (response) {
            location.reload();
        }
    });
}