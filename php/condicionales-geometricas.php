<?php
$image = imagecreatetruecolor(150, 150);

// color
$fondo = imagecolorallocate($image, 255, 255, 255); // blanco
$color_circulo = imagecolorallocate($image, 255, 0, 0); // rojo

// Relleno
imagefill($image, 0, 0, $fondo);

imageellipse($image, 150, 150, 200, 200, $color_circulo);

imagedestroy($image);
?>