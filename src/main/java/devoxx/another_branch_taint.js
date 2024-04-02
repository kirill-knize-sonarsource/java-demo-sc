
const express = require('express');

const app = express();

app.get('/lookup', (req, res) => {
    const regex = RegExp(req.query.regex); // Noncompliant

    if (regex.test(req.query.data)) {
        res.send("It's a Match!");
    } else {
        res.send("Not a Match!");
    }
})
