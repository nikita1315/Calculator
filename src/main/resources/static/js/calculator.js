function doThing() {
     var operation =$("#screen2").val();
     var mas  = [$("screen1").val,$("screen3").val];

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

function addNum(number) {
   let count = true;
   if(count === true) {
       $("#screen1").val($("#screen1").val() + number);

   }else{
       $("#screen3").val($("#screen3").val() + number);
   }
}

function addAction(action) {
    $("#screen2").val(action);
}