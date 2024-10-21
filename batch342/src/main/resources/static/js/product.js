function openForm() {
    $.ajax({
        type: "get",
        url: "/product/form",
        contentType: "html",
        success: function (productForm) {
            $('#myModal').modal('show');
            $('.modal-title').html("Product Form");
            $('.modal-body').html(productForm);
        }
    });
}

function editForm(slug) {
    $.ajax({
        type: "get",
        url: `/product/edit/${slug}`,
        contentType: `html`,
        success: function (productForm) {
            $('#myModal').modal('show');
            $('.modal-title').html("Product Form");
            $('.modal-body').html(productForm);
        }
    });
}

function deleteForm(slug) {
    $.ajax({
        type: "get",
        url: `/product/deleteForm/${slug}`,
        contentType: `html`,
        success: function (productForm) {
            $('#myModal').modal('show');
            $('.modal-title').html("Product Form");
            $('.modal-body').html(productForm);
        }
    });
}

function deleteCategory(slug) {
    $.ajax({
        type: "get",
        url: `/product/delete/${slug}`,
        contentType: `html`,
        success: function (response) {
            location.reload();
        }
    });
}