function openForm() {
    $.ajax({
        type: "get",
        url: "/variant/form",
        contentType: "html",
        success: function (variantForm) {
            $('#myModal').modal('show');
            $('.modal-title').html("Variant Form");
            $('.modal-body').html(variantForm);
        }
    });
}

function editForm(slug) {
    $.ajax({
        type: "get",
        url: `/variant/edit/${slug}`,
        contentType: `html`,
        success: function (variantForm) {
            $('#myModal').modal('show');
            $('.modal-title').html("Variant Form");
            $('.modal-body').html(variantForm);
        }
    });
}

function deleteForm(slug) {
    $.ajax({
        type: "get",
        url: `/variant/deleteForm/${slug}`,
        contentType: `html`,
        success: function (variantForm) {
            $('#myModal').modal('show');
            $('.modal-title').html("Variant Form");
            $('.modal-body').html(variantForm);
        }
    });
}

function deleteVariant(slug) {
    $.ajax({
        type: "get",
        url: `/variant/delete/${slug}`,
        contentType: `html`,
        success: function (response) {
            location.reload();
        }
    });
}

function getProductListByCategoryId(id) {
    let categoryId = $('#categoryId').val();
    let productId = $('#productId').val();

    $('#productId').empty().append(new Option("Please Select Variant Product", ""));
    $.ajax({
        type: "get",
        url: `/variant/productlist/${id}`,
        contentType: "application/json",
        success: function (productList) {
            productList.forEach(product => {
                $('#productId').append(new Option(product.name, product.id));
            });
            if (categoryId) {
                $('#productId').val(productId).change();
            }
        }
    });
}