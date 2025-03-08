<?php
$lonchera = ["Manzana", "Sandwich", "Jugo de naranja", "Galletas", "Yogur", "Plátano"];

echo "Los alimentos en la lonchera son:\n";

for ($i = 0; $i < count($lonchera); $i++) {
    echo "- " . $lonchera[$i] . "\n";
}
?>