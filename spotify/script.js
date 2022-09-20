console.log("Welcome to spotify");

let songIndex =0;
let audioElement = new Audio('songs/1.mp3');
let masterPlay = document.getElementById('masterPlay');
let myProgressBar = document.getElementById('myProgressBar');
let gif = document.getElementById('gif');
masterSongName = document.getElementById('masterSongName');
let songItems = Array.from(document.getElementsByClassName('songItem'));

let songs=[
    {songName:"Pheli dafa",filePath:"songs/7.mp3",cover:"cover/song1.jpg"},
    {songName:"Tere bina yaara",filePath:"songs/2.mp3",cover:"cover/0th.jpg"},
    {songName:"aadat",filePath:"songs/3.mp3",cover:"cover/1sr.jpg"},
    {songName:"kuch is trah",filePath:"songs/4.mp3",cover:"cover/2nd.jpg"},
    {songName:"jenna laga hoon",filePath:"songs/5.mp3",cover:"cover/3rd.jpg"},
    {songName:"jeena jeena",filePath:"songs/6.mp3",cover:"cover/jena.jpeg"},
    {songName:"Main agar",filePath:"songs/7.mp3",cover:"cover/last.jpg"},   
]

songItems.forEach((element,i)=>{
    element.getElementsByTagName("img")[0].src = songs[i].cover;
     element.getElementsByClassName("songName")[0].innerText =songs[i].songName;
})

masterPlay.addEventListener('click', ()=>{
    if(audioElement.paused || audioElement.currentTime<=0){
        audioElement.play();
        masterPlay.classList.remove('fa-circle-play');
        masterPlay.classList.add('fa-circle-pause');
        gif.style.opacity=1;
    }
    else
    {
        audioElement.pause();
        masterPlay.classList.remove('fa-circle-pause');
        masterPlay.classList.add('fa-circle-play');
        gif.style.opacity=0;   
    }
})

audioElement.addEventListener('timeupdate', ()=>{
  progress = parseInt((audioElement.currentTime/audioElement.duration)*100);
  myProgressBar.value = progress;
})

myProgressBar.addEventListener('change',()=>{
    audioElement.currentTime = myProgressBar.value * audioElement.duration/100;
})

const makeAllPlays = ()=>{
Array.from(document.getElementsByClassName('songItemPlay')).forEach((element)=>{
    element.classList.remove('fa-circle-pause');
    element.classList.add('fa-circle-play');
      })
}

Array.from(document.getElementsByClassName('songItemPlay')).forEach((element)=>{
    element.addEventListener('click', (e)=>{
        makeAllPlays();
        
        songIndex = parseInt(e.target.id);
        e.target.classList.remove('fa-circle-play');
        e.target.classList.add('fa-circle-pause');
        audioElement.src = `songs/${songIndex+1}.mp3`;
        masterSongName.innerText =songs[songIndex].songName;
        audioElement.currentTime=0;
        audioElement.play();
        gif.style.opacity = 1;
        masterPlay.classList.remove('fa-circle-play');
        masterPlay.classList.add('fa-circle-pause');
    })
})

document.getElementById('next').addEventListener('click',()=>{
    if(songIndex>=7)
    {
    songIndex=0
    }
    else{songIndex+=1;} 

    audioElement.src = `songs/${songIndex+1}.mp3`;
    masterSongName.innerText =songs[songIndex].songName;
        audioElement.currentTime=0;
        audioElement.play();
        masterPlay.classList.remove('fa-circle-play');
        masterPlay.classList.add('fa-circle-pause');
})

document.getElementById('previous').addEventListener('click',()=>{
    if(songIndex<=0)
    {
    songIndex=0
    }
    else{songIndex-=1;} 

    audioElement.src = `songs/${songIndex+1}.mp3`;
    masterSongName.innerText =songs[songIndex].songName;
        audioElement.currentTime=0;
        audioElement.play();
        masterPlay.classList.remove('fa-circle-play');
        masterPlay.classList.add('fa-circle-pause');
})


