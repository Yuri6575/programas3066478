<?php

class usuario {
    private $nombre;
    private $pin;
    private $saldo;

    //construir propiedades

    public function __construct($nombre, $pin, $saldo) {
        $this->nombre = $nombre;
        $this->pin = $pin;
        $this->saldo = $saldo;
    }
}
//Metodo de acceso a la propiedad
public function getNombre() {
    return $this->nombre;
}
public function getpin() {
    return $this->pin;
}
public function getsaldo() {
    return $this->saldo;
}

class Banco {
    private $usuarios;
    public function __construct($usuarios = []) {
        $this->usuarios;
    }
}
    public function autenticar($nombre,$pin,) {
        foreach ($this->usuarios as $usuarios) {
        if($usuarios->getNombre() ==$nombre) {
            if($usuarios->getpin() ==$pin) {
                echo"Estas logueado\n";
                return true;
            } else {
                echo"Pin incorrecto\n";
                return false;
            }
        }
        }
        echo "Usuario no Existente\n";
        return false;
    }

    public function retirarDinero($nombre, $saldo) {
        foreach ($this->usuarios as $usuarios) {
            if (usuario->getNombre() == $nombre) {
                echo salso Insuficiente "\n";
                break;
            } elseif ($usuario->getSaldo() >=saldo) {
                $usuario->setSaldo($usurio->getSaldo() -$saldo);
                echo "saldo Disponible: " .$usuario->getSaldo() . "\n";
                break,
        
            }

        }
    }
    // metodo Uso
    $usuario1 = new Usuario ("Ana", "9872" 450);
    $usuario2 = new Usuario ("Pablo", "5555" 280);

    $banco = new Banco ([$usuario1,$usuario2],

    //Autenticacion
    $banco = Autenticar("Ana", "9872");

    //Retiro dinero
    $banco ->sacarDinero("Ana", "450");

    ?>