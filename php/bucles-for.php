<?php
for
$nombres =["camila", "sebastian R","Cristian","Andres R", "Anyelo", "Esteban A","Felipe ","Fito","Hanssy R","Hanz l","Jhon", "juan pablo","Nilo", "Santiago","Santiago S","Yuri \n\n"]
for ($i = 0;$i <count($nombres); $i++) {
    echo $nombres[$i] . "\n";
}
<?php

//Diccionarios
// Inicia con array vacío
$Personas = array();

// Crear los arreglos para cada persona
$a = array('nombre' => 'Sebastian R', 'Edad' => 24);
$b = array('nombre' => 'Andres R', 'Edad' => 26);
$c = array('nombre' => 'Anyelo', 'Edad' => 30);
$d = array('nombre' => 'Esteban A', 'Edad' => 28);
$e = array('nombre' => 'Felipe', 'Edad' => 23);
$f = array('nombre' => 'Fito', 'Edad' => 32);
$g = array('nombre' => 'Hanssy R', 'Edad' => 27);
$h = array('nombre' => 'Jhon', 'Edad' => 26);
$i = array('nombre' => 'Juan Pablo', 'Edad' => 25);
$j = array('nombre' => 'Nilo', 'Edad' => 26);
$k = array('nombre' => 'Santiago', 'Edad' => 20);
$l = array('nombre' => 'Santiago S', 'Edad' => 28);
$m = array('nombre' => 'Yuri', 'Edad' => 28);

// Agregar los arreglos a la lista de Personas
array_push($Personas, $a);
array_push($Personas, $b);
array_push($Personas, $c);
array_push($Personas, $d);
array_push($Personas, $e);
array_push($Personas, $f);
array_push($Personas, $g);
array_push($Personas, $h);
array_push($Personas, $i);
array_push($Personas, $j);
array_push($Personas, $k);
array_push($Personas, $l);
array_push($Personas, $m);


foreach ($Personas as $persona) {
    echo $persona['nombre'] . " " . $persona['Edad'] . "\n";
}

?>
