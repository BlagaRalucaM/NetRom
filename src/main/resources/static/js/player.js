function makeTable(container, data) {
    var table = $("<table id='playersTable'/>").addClass('table');
    var tableHeader= " <thead> <tr><th>ID</th><th>Name</th><th>Surname</th><th>Actions</th></tr> </thead>";
    table.append(tableHeader);

    var deleteHome = document.createElement("button");

table.append("<tbody>")
    $.each(data, function(rowIndex, r) {
            var row = $("<tr/>");
            row.append("<td>" + r.id + "</td>");
            row.append("<td>" + r.name + "</td>");
            row.append("<td>" + r.surname + "</td>");
            row.append("<td> <button onclick = 'deletePlayer("+r.id+")' class='btn btn-delete'> Delete </button> </td>");
            table.append(row);
        });
        table.append("</tbody>")
         container.append(table);

}

function getPlayers(){
  $.ajax({
            url: "http://localhost:8080/player/allPlayers",
            type: 'GET',
            dataType: 'json',
            success: function(res) {
                data = res;
                var table = makeTable($(document.body), data);
                 $('#playersTable').DataTable({
                                     paging: true,
                                     sorting: true
                                   });
            }
        });
}

$(document).ready(function() {
        getPlayers()
});


function deletePlayer(id){
    alert("Delete this player?");
    var el = this;

    // Delete id
    var deleteid = $(this).data('id');

    var confirmalert = confirm("Are you sure?");
    if (confirmalert == true) {
      // AJAX Request"
      $.ajax({
        url: "http://localhost:8080/player/deletePlayer" + id ,
        type: 'DELETE',
        success: function(response){
//            getPlayers()
        }
        });
      };
}

function createPlayer() {
// Define the data we want to send
//    const data = {
//     document.getElementById('form1').submit();
//    };
    var data = {
        name: $("#playerName")[0].value,
        type: $("#playerSurname")[0].value
    }
      $.ajax({
        url: "http://localhost:8080/player/savePlayer" ,
        type: 'POST',
        contentType: "application/json",
        data: JSON.stringify(data),
        success: function(response){
            window.location.reload();
        },
        error: function(){
                alert(data)
        }
        });
}
