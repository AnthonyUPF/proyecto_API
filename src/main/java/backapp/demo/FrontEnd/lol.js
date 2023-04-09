//fetch('https://reqres.in/api/users')

window.onload = function () {
  fetch('http://localhost:8080/api')
    .then(response => {
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      return response.json();
    })
    .then(json => {
      console.log(JSON.stringify(json));
      const str = document.getElementById("start");
      str.innerHTML = ""; // Clearing the HTML element
      for (let i = 0; i < json.data.length; i++) {
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
    })
    .catch(error => {
      console.error('There was a problem with the fetch operation:', error);
    });
};





