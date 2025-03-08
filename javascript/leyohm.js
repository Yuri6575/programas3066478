if (V !== undefined && I !== undefined && R === undefined) {
    // Calcular resistencia
    R = V / I;
    console.log("Resistencia (R): " + R + " Ω");
} else if (V !== undefined && I === undefined && R !== undefined) {
    // Calcular corriente
    I = V / R;
    console.log("Corriente (I): " + I + " A");
} else if (V === undefined && I !== undefined && R !== undefined) {
    // Calcular tensión
    V = I * R;
    console.log("Tensión (V): " + V + " V");
} else {
    console.log("Por favor, proporciona exactamente dos de los tres valores: V, I o R.");
}


// Ejemplos;
calcularLeyDeOhm(10, 2); // Calcula Resistecia
calcularLeyDeOhm(undefined, 2, 5); // Calcula Voltaje
calcularLeyDeOhm(10, undefined, 5); // Calcula (I) Amperios