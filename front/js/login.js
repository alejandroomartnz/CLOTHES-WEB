const f = document.querySelector("form-signin")
const username = document.getElementById("username")
const password = document.getElementById("password")

console.log(username.value)
console.log(password)




    function login() {
        // e.preventDefault();
        fetch ("http://localhost:8080/login", {
            method: "GET",
       

        })
        .then(response => response.json())
        .then((result) => {
             console.log(result);
        })
        ;

        }

