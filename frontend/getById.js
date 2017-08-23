$(document).ready(function () {
            $('#btnGetById').click(function () {
                var resultSummary = $('#resultDiv1');
                var resultElement = $('#resultDiv2');
                
                var requestData = $('#txtId').val();
                $.ajax({
                    url: 'http://localhost:8080/mitarbeiter/' + requestData,
                    method: 'get',
                    dataType: 'json',
                    success: function (response) {
                        if (response != null) {
                            resultSummary.html("Id = " + requestData + " :");
                            
                            var resultAll = "";
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