$(document).ready(function () {
            $('#btnDeleteById').click(function () {
                var resultSummary = $('#resultDiv1');
                var resultElement = $('#resultDiv2');
                
                var requestData = $('#txtIdDelete').val();
                
                $.ajax({
                    url: 'http://localhost:8080/mitarbeiter/' + requestData,
                    type: 'delete',
                    dataType: 'json',
                    async: false,
                    success: function (response) {
                        if (response != null) {
                            resultSummary.html(" Schon gelöscht:");
                            
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