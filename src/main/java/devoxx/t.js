var i = 0;

var iframe = document.getElementById("testiframe");
iframe.contentWindow.postMessage("secret", "*"); // Noncompliant: * is used

var k = 0;
var j = 0;
async function INDEX(req, res) {
    const knex = req.app.get('knex');

    let loggedInUser = await knex('users')
        .whereRaw(`user = '${req.query.user}' and pass = '${req.query.pass}'`); // Noncompliant

    res.send(JSON.stringify(loggedInUser));
    res.end();
}