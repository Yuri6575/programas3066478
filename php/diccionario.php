<?php
$carro = array(
// Definir asociacion
    'marca' => 'Honda',
    'color' => 'gris',
    'modelo' => '1993',
    'placa' => 'BLC281'
);

echo $carro['color'] . "\n";

$carro['color'] = 'verde';

echo $carro['color'] . "\n";

echo $carro['marca'] . "\n";

$carro['marca'] = 'Chevrolet';

echo $carro['marca'] . "\n";
?>
