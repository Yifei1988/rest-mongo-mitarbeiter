$(document).ready(function () {
            $('#btnGetAll').click(function () {
                var resultSummary = $('#resultDiv1');
                var resultElement = $('#resultDiv2');
                $.ajax({
                    url: 'http://localhost:8080/mitarbeiter/',
                    method: 'get',
                    dataType: 'json',
                    success: function (response) {
                        if (response != null) {
                            resultSummary.html("Wir haben " + (response).length + " Mitarbeiter:");
                            
                            var resultAll = "";
                            for (var i in response) {
                            	resultAll = resultAll + "Id: " + response[i].id + "<br />";
                            	resultAll = resultAll + "Vorname: " + response[i].vorname + "<br />";
                            	resultAll = resultAll + "Name: " + response[i].name + "<br />";
                            	resultAll = resultAll + "<br />";
                            }
                            resultElement.html(resultAll);
                        }
                    },
                    error: function (err) {
                        alert(err);
                    }
                });
            });
})