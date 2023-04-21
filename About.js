import React, {useState} from 'react'

export default function About() {

    const[myStyle, setMyStyle]= useState({
        color:'black',
        backgroundColor:'white'
    })

    const [btntext, setBtntext] = useState("Dark mode")

     const toggleStyle = ()=>{
        if(myStyle.color ==='black'){
            setMyStyle({
                color:'white',
                backgroundColor:'black'
            })
            setBtntext("Light mode")
        }
        else{
            setMyStyle({
                color:'black',
                backgroundColor:'white'
            })
            setBtntext("Dark mode");
        }
    }

  return (
    <div style={myStyle} >
        <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Modi similique laudantium eaque vitae harum fugit ex voluptatibus maxime nesciunt ducimus ad atque unde totam sit rem aliquid nihil, laboriosam cum!</p>
        <div className="container my-3">
      <button onClick ={toggleStyle}  type="button" className="btn btn-primary" >{btntext}</button>
      </div>
       </div>
  )
}
