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