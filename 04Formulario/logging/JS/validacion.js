function loguear ()
{

let user=document.getElementById("usuario").value;
let pass=document.getElementById("contraseña").value;

if(user=="john" && pass=="jpgg")
{
window.location="Bienvenida/Bienvenida.html";

}

else
{

    alert("Datos Incorrectos");
}

}