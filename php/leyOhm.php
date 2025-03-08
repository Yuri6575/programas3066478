<?php
// Función de calculo
function leyDeOhm($I = null, $V = null, $R = null) {
    if ($I === null && $V !== null && $R !== null) {
        // Calcular la corriente I = V / R
        $I = $V / $R;
        echo "La corriente es: " . $I . " amperios\n";
    } elseif ($V === null && $I !== null && $R !== null) {
        
        $V = $I * $R; // Calcular el voltaje 
        echo "El voltaje es: " . $V . " voltios\n";
    } elseif ($R === null && $I !== null && $V !== null) {
        
        $R = $V / $I; // Calcular la resistencia 
        echo "La resistencia es: " . $R . " ohmios\n";
    } else {
        echo "Por favor, ingrese dos valores para calcular el tercero.\n";
    }
}

$I = 2;   // Corriente en amperios
$V = 10;  // Voltaje en voltios
leyDeOhm($I, $V, null);
?>