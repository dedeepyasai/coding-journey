const express = require("express");
const app = express();
const bodyParser = require('body-parser')

const MongoClient = require('mongodb').MongoClient;

const datta = require('dattafirstnpm');

datta.printMsg();

MongoClient.connect('mongodb://localhost:27017').then(client => {
    console.log('Connected to Database');
    const db = client.db('test')
    const datasCollection = db.collection('datas');
    
        app.post('/quotes',(req,res)=>{
            // console.log("Quotes Post Path");
            // console.log(req.body);
            datasCollection.insertOne(req.body)
               .then(result => {
                   console.log(result);
                   res.redirect('/');
               })
               .catch(error => console.error(error));
        })
})
.catch(error => console.error(error))
app.use(bodyParser.urlencoded({extended:true}))
app.listen(3000,function(){
    console.log("listening on 3000");
})

app.get('/', (req,res)=>{
    // res.send('Hello World');
    res.sendFile(__dirname + '/index.html');
})
