const express = require("express");
const app = express();

const users =[{
  name:"John",
  kidneys:[{
    healthy:false
  }]
}];

app.use(express.json());

app.get("/",function(req,res){
    const johnKidneys = users[0].kidneys;
  const numberOfKidneys = johnKidneys.length;
  let numberofHealthyKidneys = 0; 
  for(let i = 0; i< johnKidneys.length;i++){
    if(johnKidneys[i].healthy){
      numberOfKidneys = numberOfKidneys + 1;
    }
  }
  const numberOfUnhealthyKidneys = numberOfKidneys - numberOfUnhealthyKidneys;
  res.json({
    numberOfKidneys, numberofHealthyKidneys,numberOfUnhealthyKidneys
  });
})

app.post("/",function(req, res){
    const isHealthy = req.body.isHealthy;
  
};

app.listen(3000, ()=>{
  console.log("Server is running in 3000")
})
