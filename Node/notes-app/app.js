const fs = require('fs')
const note= require('./utils');

const data = note();

fs.appendFileSync('notes.txt',data)