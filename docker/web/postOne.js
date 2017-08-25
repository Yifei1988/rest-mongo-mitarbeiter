$(document).ready(function () {
            $('#btnPost').click(function () {
                var resultSummary = $('#resultDiv1');
                var resultElement = $('#resultDiv2');
                
                var newVorname = $('#txtNewVorname').val();
                var newName = $('#txtNewName').val();
                
                $.ajax({
                    url: 'http://localhost:8080/mitarbeiter/',
                    type: 'post',
                    contentType : 'application/json;charset=utf-8',
                    dataType: 'json',
                    async: false,
                    data: JSON.stringify({ "vorname": newVorname, "name" : newName }),
                    success: function (response) {
                        if (response != null) {
                            resultSummary.html(" Wir haben eine(n) neue(n) Mitarbeiter/in :");
                            
                            var resultAll = "";
                            resultAll = resultAll + "Id: " + response.id + "<br />";
                            resultAll = resultAll + "Vorname: " + response.vorname + "<br />";
                            resultAll = resultAll + "Name: " + response.name + "<br />";
                            resultAll = resultAll + "<br />";
                            resultElement.html(resultAll);
                        }
                    },
                    error: function (err) {
                        alert(err);
                    }
                });
            });
})