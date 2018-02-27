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
    } else if (strawberry == '') {
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
    window.location.href = "/summary"
}

function buyNow() {
    window.location.href = "/confirm"
}