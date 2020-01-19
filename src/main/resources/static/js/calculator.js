function doThing() {
     let operation = $("#screen2").val();
     let mas  = [];
     mas.push( $("#screen1").val());
    mas.push( $("#screen3").val());

        jsonData = {
        "action": operation,
        "numbers": mas
    }

    $.ajax({
        url: '/api/calculator',
        type: 'get',
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        data: jsonData,


        error: function (response) {
            alert('error');
        }
    })
    ;


}



let count = true;
function addNum(number) {

   if(count === true) {
       $("#screen1").val($("#screen1").val() + number);

   }else{
       $("#screen3").val($("#screen3").val() + number);
   }
}

function addAction(action) {
    count = false;
    $("#screen2").val(action);
}