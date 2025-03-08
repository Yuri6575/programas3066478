<?php
//1er condicional
$a = 2;
if ($a == 2) {
    echo "a vale 2\n";
} else {
    echo "a es diferente de 2\n";
}

//2da condicional
$nombre = "ana";
$edad = 28;
$ciudad = "Medellin";

if ($nombre == "ana" && $edad == 28) {
    echo "su nombre es ana y tiene 28 años\n";
} elseif ($nombre == "ana" && !($edad == 28)) {
    echo "su nombre es ana y no tiene 28 años\n";
} elseif ($nombre != "ana" && $edad == 28) {
    echo "su nombre no es ana y tiene 28 años\n";
}

if ($nombre == "ana" && $ciudad == "Medellin") {
    echo "su nombre es ana y la ciudad que vive es Medellin\n";
} elseif ($nombre == "ana" && !($ciudad == "Medellin")) {
    echo "su nombre es ana y la ciudad que vive no es Medellin\n";
} elseif ($nombre != "ana" && !($ciudad == "Medellin")) {
    echo "su nombre no es ana y la ciudad que vive no es Medellin\n";
} else {
    echo "No se llama ana ni tiene 28 años\n";
}
?>