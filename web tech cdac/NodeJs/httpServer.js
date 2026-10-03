require('dotenv').config()
const http = require('http');
const fs=require('fs');

const port=process.env.PORT;
const host=process.env.HOST;

const server = http.createServer((req, res) => {

    if (req.url === '/') {

        // res.write("this is simple request");
        // res.end();

        res.writeHead(200,{"content-type":"text/html"});
        let myReader=fs.createReadStream(__dirname+'/home.html',"utf8");
        myReader.pipe(res);

    } else if (req.url === "/home") {

        // res.write("this is Home request");
        // res.end();
        res.writeHead(200,{"content-type":"text/html"});
        let myReader=fs.createReadStream(__dirname+'/home.html',"utf8");
        myReader.pipe(res);

    } else if (req.url === "/about") {

        // res.write("this is about request");
        // res.end();

        res.writeHead(200,{"content-type":"text/html"});
        let myReader=fs.createReadStream(__dirname+'/about.html',"utf8");
        myReader.pipe(res);

    } else if (req.url === "/contact") {

        // res.write("this is contact request");
        // res.end();

        res.writeHead(200,{"content-type":"text/html"});
        let myReader=fs.createReadStream(__dirname+'/contact.html',"utf8");
        myReader.pipe(res);

    } else if (req.url === "/gallery") {

        // res.write("this is gallery request");
        // res.end();
        
           res.writeHead(200,{"content-type":"text/html"});
        let myReader=fs.createReadStream(__dirname+'/gallery.html',"utf8");
        myReader.pipe(res);

    } else if (req.url === "/service") {

        // res.write("this is service request");
        // res.end();

        
           res.writeHead(200,{"content-type":"text/html"});
        let myReader=fs.createReadStream(__dirname+'/service.html',"utf8");
        myReader.pipe(res);
    } else {

        res.write("404 Page Not Found");
        res.end();

    }
});

server.listen(port, () => {
    console.log(`Server is Started  on ${host}:${port}`);
});