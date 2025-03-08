var usuarios = [
    { id: 1, nombre: "Camila", edad: 22 },
    { id: 2, nombre: "Esteban", edad: 28 },
    { id: 3, nombre: "Felipe", edad: 25 },
    { id: 4, nombre: "Nilo", edad: 26 }
];


for (var n = 0; n < usuarios.length; n++) {
    console.log("Usuario ID: " + usuarios[n].id + ", Nombre: " + usuarios[n].nombre + ", Edad: " + usuarios[n].edad);
}