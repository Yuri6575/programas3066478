/*
AND

X  ADN Y
........
T | T | T
T | F | F
F | F | T
F | F | F
*/

console.log(true & true)
console.log(false & true)
console.log(true & false)
console.log(false & false)

/*
OR 

X  OR  Y
........
T | T | T
T | T | F
F | T | T
F | F | F
*/
console.log(true || true)
console.log(true || false)
console.log(false || tur)
console.log(false || false)

/*
NOT 

X  NOT  Y
........
T | F 
F | T 
*/
console.log(!true)
console.log(!false)

const herramienta = prompt ("ingerese una herramienta");
const color = prompt ("ingerese una color");

if (heramienta === 'martillo' && color == 'rojo') {
    alert('Adivinamos la combinacion');
} 
else {
    alert('No Adivinamos la combinacion');
}