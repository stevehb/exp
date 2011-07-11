var App = {}

function init() {
    console.log("in init()");
    App.canvas = document.getElementById("dist");
    App.c = App.canvas.getContext("2d");
    App.c.fillStyle = "#000";
    App.c.fillRect(0, 0, App.canvas.width, App.canvas.height);

    App.c.font = "10pt Verdana";
    App.c.textBaseline = "bottom";

    $("#dist").mousedown(App.set);
    $("#dist").mousemove(App.update);

    App.src = {
        x : 0,
        y : 0
    };
    App.dest = {
        x : 0,
        y : 0
    };
    App.dx = 0;
    App.dy = 0;
    App.dist = 0;
}


App.set = function(ev) {
    var bb = App.canvas.getBoundingClientRect();
    var x = (ev.clientX - bb.left) * (App.canvas.width / bb.width);
    var y = (ev.clientY - bb.top) * (App.canvas.height / bb.height);
    App.src.x = x;
    App.src.y = y;
};

App.update = function(ev) {
    var bb = App.canvas.getBoundingClientRect();
    var x = (ev.clientX - bb.left) * (App.canvas.width / bb.width);
    var y = (ev.clientY - bb.top) * (App.canvas.height / bb.height);
    App.dest.x = x;
    App.dest.y = y;

    // update distance calc
    App.dx = App.dist.x - App.src.x;
    App.dy = App.dist.y - App.src.y;
    App.dist = Math.sqrt((App.dx * App.dx) + (App.dy * App.dy));


    // draw it 
    App.c.fillStyle = "#000";
    App.c.fillRect(0, 0, App.canvas.width, App.canvas.height);
    App.c.strokeStyle = "#FFF";
    App.c.beginPath();
    App.c.moveTo(App.src.x, App.src.y);
    App.c.lineTo(App.dest.x, App.dest.y);
    App.c.stroke();

    // draw the text
    App.c.fillStyle = "#FFF";
    App.c.fillText("src=(" + App.src.x + "," + App.src.y + "), dest=(" + 
                   App.dest.x + "," + App.dest.y + "), dist=" + App.dist +
                   ", dx=" + App.dx + ", dy=" + App.dy, 1, App.canvas.height);
};
