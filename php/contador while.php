<?php
$contador = 5;
while ($contador < 20) {
    $contador++;
    echo "Iteración: " . $contador . "\n";
}

while (true) {
    echo "Introduzca un valor mayor a 10: ";
    $a = intval(fgets(STDIN)); // entrada desde la consola
    if ($a > 10) {
        echo "Es correcto\n";
        break; // Salir si la condición se cumple
    } else {
        echo "Es incorrecto, pruebe de nuevo\n";
    }
}
?>