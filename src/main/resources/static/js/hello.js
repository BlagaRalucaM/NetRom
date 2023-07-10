$npm i bootstrap@5.3.0
function makeTable(container, data) {
    var table = $("<table/>").addClass('CSSTableGenerator');
    $.each(data, function(rowIndex, r) {
        var row = $("<tr/>");
        $.each(r, function(colIndex, c) {
            row.append($("<t"+(rowIndex == 0 ?  "h" : "d")+"/>").text(c));
        });
        table.append(row);
    });
    return container.append(table);
}

$(document).ready(function() {
var data = [];
  $.ajax({
            url: "http://localhost:8080/team/byName",
            type: 'GET',
            dataType: 'json', // added data type
            success: function(res) {
                data = res;
                var cityTable = makeTable($(document.body), data);
            }
        });

});

