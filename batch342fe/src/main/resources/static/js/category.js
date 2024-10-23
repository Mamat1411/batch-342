loadData();
function loadData() {
    let tableData = ``;
    $.ajax({
        type: "get",
        url: "http://localhost:9001/api/category",
        contentType: "application/json",
        success: function (categoryResponse) {
            let categoryData = categoryResponse.data;

            categoryData.forEach((category, index) => {
                tableData += `
                  <tr>
                    <td>${index+1}</td>
                    <td>${category.name}</td>
                    <td>${category.slug}</td>
                    <td>${category.description}</td>
                    <td>
                        <button class="btn btn-warning" onclick="editForm(${category.id})">Edit</button>
                        <button class="btn btn-danger" onclick="deleteForm(${category.id})">Delete</button>
                    </td>
                  </tr>
                `;
            });

            $('#categoryTable').html(tableData);
        }
    });
}

function openForm(type) {
    let button = ``;
    if (type == "edit") {
        button += `<button type="submit" class="btn btn-primary" style="float: right;" onclick="editCategory(this.value)">Update</button>`
    } else {
        button += `<button type="submit" class="btn btn-primary" style="float: right;" onclick="saveCategory()">Save</button>`
    }
    $.ajax({
        type: "get",
        url: "/category/form",
        contentType: "html",
        success: function (categoryForm) {
            $('#myModal').modal('show');
            $('.modal-title').html("Category Form");
            $('.modal-body').html(categoryForm);
            $('#formButton').append(button);
        }
    });
}

function saveCategory() {
    let jsonData = {
        name: $('#categoryName').val(),
        slug: $('#categorySlug').val(),
        description: $("#categoryDesc").val()
    }
    $.ajax({
        type: "POST",
        url: "http://localhost:9001/api/category",
        data: JSON.stringify(jsonData),
        contentType: "application/json",
        success: function (response) {
            console.log(response);
            location.reload();
        },
        error: function (error) {
            console.error(error);
        }
    });
}

function editForm(id) {
    openForm("edit");
    $.ajax({
        type: "get",
        url: `http://localhost:9001/api/category/${id}`,
        contentType: "application/json",
        success: function (response) {
            let categoryData = response.data;
            $('#categoryName').val(categoryData.name);
            $("#categorySlug").val(categoryData.slug);
            $('#categoryDesc').val(categoryData.description);
        }
    });
}

function editCategory(id) {
    let jsonData = {
        name: $('#categoryName').val(),
        slug: $("#categorySlug").val(),
        description: $('#categoryDesc').val()
    }
    $.ajax({
        url: `http://localhost:9001/api/category/${id}`,
        type: "PUT",
        header: {
            "Access-Control-Allow-Origin" : `*`,
        },
        data: JSON.stringify(jsonData),
        contentType: "application/json",
        success: function (response) {
            console.log(response);
            location.reload();
        }
    });
}