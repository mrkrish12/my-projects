import React,{useState} from 'react'


export default function TextForm(props) {

    const handleUpClick =()=>{
        console.log("Uppercase was clicked "+text);
        let newText = text.toUpperCase();
        setText(newText);
        props.showAlert("converted text","success");
    }
    const handlelowClick =()=>{
      console.log("lowercase was clicked "+text);
      let newText = text.toLowerCase();
      setText(newText);
      props.showAlert("converted text","success");
  }
  const handleResetClick =()=>{
    let newText = "";
    setText(newText);
    props.showAlert("converted text","success");
}

// const handleVovelClick =()=>{
//   let counter=0;
//   for(let i=0;i<text.length;i++)
//   {
//   if(text.charAt[i]=== 'A' ||text.charAt[i]==='E' ||text.charAt[i]==='I' ||text.charAt[i]==='O'|| text.charAt[i]==='U'||text.charAt[i]=== 'a'||text.charAt[i]=== 'e' || text.charAt[i]==='i' ||text.charAt[i]==='o' ||text.charAt[i]==='u')
// {
//   counter++;
// } 
// }let newText = counter;
//   setText(newText);
// }
    const handleOpChange =(event)=>{
        console.log("U");
        setText(event.target.value);
    }
     const handleCopy =()=>{
      var text = document.getElementById("myBox");
      text.select();
      navigator.clipboard.writeText(text.value);
      props.showAlert("converted text","success");
     }
     const handleExtraS =()=>{
      let newText = text.split(/[ ]+/);
      setText(newText.join(" "))
      props.showAlert("converted text","success");
     }

    const [text,setText] = useState('');
    return (
      <>
    <div className='container' style={{color:props.mode ==='dark'? 'white':'#042743'}}>
        <h1 >{props.heading}</h1>
        <div class="mb-3">
  <textarea className="form-control" value={text} onChange={handleOpChange} id="myBox" style={{backgroundColor:props.mode ==='dark'? 'grey':'white', color:props.mode ==='dark'? 'white':'#042743'}}  rows="8"></textarea>
</div>
      <button className="btn btn-primary mx-2 " onClick={handleUpClick} >Convert to uppercase</button>
      <button className="btn btn-primary mx-2" onClick={handlelowClick} >Convert to lowercase</button>
      <button className="btn btn-primary mx-2" onClick={handleResetClick} >Reset Text</button>
      <button className="btn btn-primary mx-2" onClick={handleCopy} >CopyText</button>
      <button className="btn btn-primary mx-2 my-2" onClick={handleExtraS} >RemoveSpace</button>
    </div>
    {/* <button className="btn btn-primary mx-2" onClick={handleVovelClick} >Vovel counter</button> */}
<div className="container my-4"style={{color:props.mode ==='dark'? 'white':'#042743'}} >
  <h1>Your text summary</h1>
  <p>{text.split(" ").length} words & {text.length} characters</p>
  <p>{0.008*text.split(" ").length} Minutes read</p>
  <h2>Preview</h2>
  <p>{text.length>0?text:"Enter something to preview"}</p> 
</div>

    </>
  )
}
