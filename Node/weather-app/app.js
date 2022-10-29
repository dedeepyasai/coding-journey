const request = require('request');

const url ="http://api.weatherstack.com/current?access_key=e0ced1a28705af6b8ba4b4d983a77ab2&query=32.776665,-96.796989"

request({url: url, json: true},(error,response)=>{
    const data = response.body
    console.log(data.current);
})

const listlocations = (locations) =>{
    locations.forEach((location)=>{
        console.log(location);
    })
}
const myLocations = ['Las Vegas', 'New York', 'Dallas']

listlocations(myLocations);