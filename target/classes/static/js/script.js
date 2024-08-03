console.log("script loaded")

let currentTheme=getTheme();
//default
changeTheme(currentTheme)

//todo
function changeTheme(currentTheme){
    //set to web page
    document.querySelector('html')
}

//set theme to local storage
function setTheme(theme){
    localStorage.setItem("theme",theme);
}


//get theme for local storage
function getTheme(){
    let theme=localStorage.getItem("theme");
    return theme ? theme : "light";
}