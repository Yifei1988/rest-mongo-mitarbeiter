$(document).ready(function () {
            $('#btnPutById').click(function () {
                var resultSummary = $('#resultDiv1');
                var resultElement = $('#resultDiv2');
                
                var requestData = $('#txtIdUpdate').val();
                var putVorname = $('#txtPutVorname').val();
                var putName = $('#txtPutName').val();
                
                $.ajax({
                    url: 'http://localhost:8080/mitarbeiter/' + requestData,
                    type: 'put',
                    contentType : 'application/json;charset=utf-8',
                    dataType: 'json',
                    async: false,
                    data: JSON.stringify({ "vorname": putVorname, "name" : putName }),
                    success: function (response) {
                        if (response != null) {
                            resultSummary.html(" Wir haben eine(n) Mitarbeiter/in erneuert:");
                            
                            var resultAll = "";
                            resultAll = resultAll + "Id: " + response.id + "<br />";
                            resultAll = resultAll + "Vorname: " + response.vorname + "<br />";
                            resultAll = resultAll + "Name: " + response.name + "<br />";
                            resultAll = resultAll + "<br />";
                            resultElement.html(resultAll);
                        }
                    },
                    error: function (err) {
                        alert("Nimand gefunden!");
                    }
                });
            });
})