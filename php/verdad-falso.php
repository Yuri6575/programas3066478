<?php
$a = true;
$b = false;
echo ($a && $b) ? 'true' : 'false';  // Impresión del resultado de a and b
echo "\n";

$a = 2;
$b = 3;
$c = 4;
$d = 10;

// Comparación 1: a == b and c < d
echo ($a == $b && $c < $d) ? 'true' : 'false';
echo "\n";

// Comparación 2: not a == b and c > d
echo (!($a == $b) && $c > $d) ? 'true' : 'false';
echo "\n";
?>