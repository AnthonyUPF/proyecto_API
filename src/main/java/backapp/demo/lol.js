/*const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': '9ab14386e0msh52499dac280a632p1826cejsn739c8d55d0a8',
    //'X-RapidAPI-Key': 'SIGN-UP-FOR-KEY',
		'X-RapidAPI-Host': 'genius-song-lyrics1.p.rapidapi.com'
	}
};



/*fetch('https://reqres.in/api/users?page=1&per_page=6')

  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error(error));*/

     window.onload = function (){
      //fetch('http://localhost:8080/api')
     fetch('https://reqres.in/api/users')
        .catch(error => console.error(error))
        .then(response => response.json())
        .then(json => {
          console.log(JSON.stringify(json));
          for (let i = 0; i < json.data.length; i++) {
            const str = document.getElementById("start");
            const card = document.createElement("div");
            card.className = "col";
            let p1 = document.createElement("p")
            p1.innerText = json.data[i].id  + " - "+ json.data[i].email + " - "+ json.data[i].first_name  + " - "+  json.data[i].last_name + " - "+ json.data[i].avatar;
            card.appendChild(p1);
            let i1 = document.createElement("img");
            i1.src = json.data[i].avatar;
            i1.alt = json.data[i].avatar; //alt imagenes
            card.appendChild(i1); 
            str.appendChild(card); 
          }
        });
    };
 





