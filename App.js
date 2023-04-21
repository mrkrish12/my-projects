
import './App.css';
import Alert from './component/Alert';
import Navbar from './component/Navbar';
import TextForm from './component/TextForm';
import React,{useState} from 'react';
function App() {
  // tells wheather dark mode is on or not
  const [mode, setMode] = useState('light');
  const [alert, setAlert] = useState(null);

   const showAlert = (message,type)=>{
           setAlert({
msg:message,
type:type
           })
           setTimeout(() =>{
            setAlert(null);
           },2000);
   }
 const toggleMode =()=>{
   if(mode === 'light')
   {
          setMode('dark');
          document.body.style.backgroundColor ='#042743';
          showAlert("Dark mode has been enabled","success");
  }
  else{
    setMode('light');
    document.body.style.backgroundColor ='white';
    showAlert("Light mode has been enabled","success");
  }
}

  return (
   <>

  <Navbar title='TextAchive' mode={mode} toggleMode={toggleMode}/>
  <Alert alert={alert} />
  <div className="container my-3"> 
   <TextForm heading="Enter the text to analyz"  showAlert={showAlert}  mode={mode} />
   
  </div>
</>
  );
}

export default App;
