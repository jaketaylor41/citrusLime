var requestArray = [];

$(document).ready(function () {
    init();
});

function init() {
    // enable();
}
function enable() {
    goHome();
    goCheckout();
    goLog();
    buyNow();
}

function goLog() {
    window.location.href = "/history"
}

function goCheckout() {
    var regular = $("#regular").val();
    var strawberry = $("#strawberry").val();

    if(regular == '') {
        regular = 0;
    }
    if (strawberry == '') {
        strawberry = 0;
    }

    regQty = (parseFloat(regular));
    strQty = (parseFloat(strawberry));

    var newNumber = {};
    newNumber.Rlemon = regQty;
    newNumber.STlemon = strQty;


    requestArray.push(newNumber);


    sendToServer(requestArray);
}

function goHome() {
    window.location.href = "/"

}

function sendToServer() {


    window.location.href = "/math/" + regQty + "/" + strQty;

}

function checkOut() {

    //collect info of the form
    var regular = $("#regular").val();
    var strawberry = $("#strawberry").val();
    var firstName = $("#fName").val();
    var lastName = $("#lName").val();
    var address = $("#address").val();
    var city = $("#city").val();
    var state = $("#state").val();
    var zip = $("#zip").val();
    var creditCard = $("#creditCard").val();
    var expiration = $("#expiration").val();
    var csv = $("#csv").val();

    window.location.href = "/summary/" + regular + "/" + strawberry + "/" + firstName + "/" + lastName + "/" + address + "/" + city + "/" + state + "/" + zip + "/" + creditCard + "/" +
    expiration + "/" + csv;
}

function buyNow() {
    window.location.href = "/confirm"
}

function cart() {
    window.location.href = "/summary/"
}