import { useState } from "react"
function App() {
  return (
    <div>
      <Card>Hi there</Card>
      <Card>
        <div>
          Hello from the 2nd Card
        </div>
      </Card>
    </div>
  )
}
function Card({children}){
  return <div>
      {children}
  </div>
}
export default App