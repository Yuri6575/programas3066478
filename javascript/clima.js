console.log ("Hola Todos")
if (condiciones === "Caliente") {
    if (temperatura > 24) {
        vestuario = "Usa ropa ligera y comoda.";
    } else if (temperatura >= 17 && temperatura <= 24) {
        vestuario = "Una camiseta y jeans son ideales.";
    } else {
        vestuario = "Lleva una sombrilla .";
    }
} else if (condiciones === "Templado") {
    if (temperatura > 17) {
        vestuario = "Una camiseta y pantalones son suficientes.";
    } else if (temperatura >= 16 && temperatura <= 20) {
        vestuario = "Usa una chaqueta ligera.";
    } else {
        vestuario = "Es mejor usar tennis.";
}   } else if (condiciones === "frío") {
    if (temperatura > 0) {
        vestuario = "Usa un abrigo  y bufanda.";
    } else {
        vestuario = "Es mejor usar ropa térmica y botas de lluvia.";
    }
}