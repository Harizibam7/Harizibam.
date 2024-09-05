// const express = require("express");
// const jwt = require("jsonwebtoken");
// const jwtpassword = "123456";

// const app = express();
// app.use(express.json());
// const ALL_USERS = [
//     {
//       username: "harizibamv@gmail.com",
//       password: "password",
//       name: "Harizibam",
//     },
//     {
//       username: "raman@gmail.com",
//       password: "123321",
//       name: "Raman singh",
//     },
//     {
//       username: "priya@gmail.com",
//       password: "123321",
//       name: "Priya kumari",
//     },
//   ];

// function userExists(username, password){
//     let exists = false;
//     ALL_USERS.find((user) =>{
//         if(user.username == username && user.password == password){
//             exists = true;
//         }
//     })
//     return exists;
// }

// app.post("/signin", function(req,res){
//     const { username, password } = req.body;

//     if(!userExists(username,password)){
//         return res.status(403).json({
//             msg:"User doesn't exist in our in memory db"
//         });
//     }
//     var token = jwt.sign({username,password}, "shhhh");
//     return res.json({
//         token,
//     });
// });


// app.get("/users",function(req,res){
//     const token = req.headers.authorization;

//     try{
//         const decoded = jwt.verify(token, "shhhh");
//         const username = decoded.username;
//         return res.json(ALL_USERS);
//     }catch(err){
//         return res.status(403).json({
//             msg:"Invalid token",
//         });
//     }
// });

// app.listen(3000, ()=>{
//     console.log("Server is running at 3000");
// });

const express = require("express");
const jwt = require("jsonwebtoken");
const mongoose = require("mongoose");
const app = express();

app.use(express.json());

const User =  mongoose.model("user",{
  name:String,
  username:String, 
  password:String,
});

async function userExists(username, password){
  const user = await User.findOne({username:username});
  if(!user){
      return false;
  }
  return true;
}


app.post("/signup",async function(req,res){
  const username = req.body.username;
  const  password = req.body.password;
  const userExist = await User.findOne({username:username});
  if(userExists){
      return res.json({
      msg:"User already exists"
    });
  }
  try{
    const user = await User.create({
      username:username,
      password:password,
    });
    return res.json({user});
  }catch(err){
     return res.json({
      "msg":"Server down"
    });
  }
});

app.post("/signin",function(req,res){
    const username = req.body.username;
    const password = req.body.password;
    if(!userExists(username, password)){
      return res.json({
          "msg":"User already exists",
      });
    }
    const token = jwt.sign({username},"shhhh");
    return res.status(200).json({
      token
  });
});


app.get("/users",function(req,res){
    const token = req.headers.authorization;
    try{
    const decoded = jwt.verify(token, "shhhh");
    const username = decoded.username;  
    const data = User.findOne({username:username});
    return res.json(data);
  }catch(err){  
     return res.json("Invalid Users");  
  }
});     

app.listen(3000,()=>{
  console.log("Server is running on 3000");
});
