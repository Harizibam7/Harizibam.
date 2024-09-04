const express = require("express");
const z = require('zod');
const app = express();

// function userNameValidator(username, password){
//     if(username != "Harizibam" && password != "pass"){
//         return false;
//     }
//     return true;
// }

// function kidneyValidator(kidneyId){
//     if(kidneyId != 1 && kidneyId != 2){
//         return false;
//     }
//     return true;
// }
app.use(express.json());

const kidneysInput = z.literal("1").or(z.literal("2"));

// function usernameValidateMiddleware(req, res, next){
//     if(username != "Harizibam" && password != "passwd"){
//         res.status(403).json({
//             msg:"Incorrect user id"
//         });
//     }else{
//         next();
//     }
// }
// function kidneyValidateMiddleware(req, res, next){
//     if(kidneyId != 1 && kidneyId != 2){
//         res.status(403).json({
//             msg:"Incorrect User Id"
//         });
//     }else{
//         next();
//     }
// }

// app.get("/health-checkup",usernameValidateMiddleware,kidneyValidateMiddleware,function(req, res){
//     res.send("Yout heart is healthy");
// });


// app.put("/replace-kidney",usernameValidateMiddleware, kidneyValidateMiddleware,function(req, res){
//     res.send("Yout heart is healthy");
// });

// app.use((error, req, res,next)=>{
//     res.status(500).send('An internal server error occured');
// });




app.post("/health-checkup",function(req, res){
    const kidneyId = req.body.kidneyId;
    const validatiaon  = kidneysInput.safeParse(kidneyId);
    if(!validatiaon){
        res.send("Incorrect input");
        return;
    }
    res.send("Your Kidney id is "+ kidneyId);
});

app.listen(3000);