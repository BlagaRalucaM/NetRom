function makeTable(container, data) {
    var table = $("<table />").addClass('table');
    var tableHeader= "<tr><th>ID</th><th>Name</th><th>Type</th><th>Actions</th></tr>";
    table.append(tableHeader);

    var deleteHome = document.createElement("button");
//    deleteHome = "<button class="btn btn-delete">
//                    <span class="mdi mdi-delete mdi-24px"></span>
//                    <span class="mdi mdi-delete-empty mdi-24px"></span>
//                    <span>Delete</span>
//                  </button>"
//    deleteHome.setAttribute(‘id’, ‘delete-btn’);
//    deleteHome.innerText = "Delete";

    $.each(data, function(rowIndex, r) {
        var row = $("<tr/>");
        row.append("<td>" + r.id + "</td>");
        row.append("<td>" + r.name + "</td>");
        row.append("<td>" + r.type + "</td>");
        row.append("<td> <button onclick = 'deleteTeam("+r.id+")' class='btn btn-delete'> Delete </button> </td>");
        table.append(row);
    });
    return container.append(table);
}

function deleteTeam(id){
    alert("Delete this team?");
    var el = this;

    // Delete id
    var deleteid = $(this).data('id');

    var confirmalert = confirm("Are you sure?");
    if (confirmalert == true) {
      // AJAX Request"
      $.ajax({
        url: "http://localhost:8080/team/deleteTeam/" + id ,
        type: 'DELETE',
        success: function(response){
//            getTeams()
        }
        });
      };
}



function getTeams(){
  $.ajax({
            url: "http://localhost:8080/team/byName",
            type: 'GET',
            dataType: 'json',
            success: function(res) {
                data = res;
                var cityTable = makeTable($(document.body), data);
            }
        });
}

$(document).ready(function() {
        getTeams()
});

