function makeTable(container, data) {
    var table = $("<table id='gamesTable'/>").addClass('table');
    var tableHeader= " <thead> <tr><th>ID</th><th>GameType</th><th>Score1</th><th>Score2</th><th>Actions</th></tr> </thead>";
    table.append(tableHeader);

    var deleteHome = document.createElement("button");

    table.append("<tbody>")
        $.each(data, function(rowIndex, r) {
                var row = $("<tr/>");
                row.append("<td>" + r.id + "</td>");
                row.append("<td>" + r.GameType + "</td>");
                row.append("<td>" + r.Score1 + "</td>");
                row.append("<td>" + r.Score2 + "</td>");
                row.append("<td> <button onclick = 'deleteGame("+r.id+")' class='btn btn-delete'> Delete </button> </td>");
                table.append(row);
            });
            table.append("</tbody>")
             container.append(table);
    }

function getGames(){
  $.ajax({
            url: "http://localhost:8080/game/allGames",
            type: 'GET',
            dataType: 'json',
            success: function(res) {
                data = res;
                var table = makeTable($(document.body), data);
                 $('#gamesTable').DataTable({
                                     paging: true,
                                     sorting: true
                                   });
            }
        });
}
$(document).ready(function() {
        getGames()
});

function deleteGame(id){
    alert("Delete this game?");
    var el = this;

    // Delete id
    var deleteid = $(this).data('id');

    var confirmalert = confirm("Are you sure?");
    if (confirmalert == true) {
      // AJAX Request"
      $.ajax({
        url: "http://localhost:8080/game/deleteGame" + id ,
        type: 'DELETE',
        success: function(response){
        }
        });
      };
}

function createGame() {
    var data = {
        name: $("#gameType")[0].value,
        type: $("#score1")[0].value
        type: $("#score2")[0].value
    }
      $.ajax({
        url: "http://localhost:8080/game/saveGame" ,
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

