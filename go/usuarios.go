package main

import (
	"fmt"
)

// Definir la estructura del Usuario
type Usuario struct {
	ID     int
	Nombre string
	Correo string
}

// Crear un mapa para almacenar usuarios, usando el ID como clave
var usuarios = make(map[int]Usuario)

// Función para agregar un usuario
func agregarUsuario(id int, nombre, correo string) {
	usuario := Usuario{
		ID:     id,
		Nombre: nombre,
		Correo: correo,
	}
	usuarios[id] = usuario
	fmt.Println("Usuario agregado:", usuario)
}

// Función para mostrar todos los usuarios
func mostrarUsuarios() {
	if len(usuarios) == 0 {
		fmt.Println("No hay usuarios registrados.")
		return
	}
	fmt.Println("Usuarios registrados:")
	for _, usuario := range usuarios {
		fmt.Printf("ID: %d, Nombre: %s, Correo: %s\n", usuario.ID, usuario.Nombre, usuario.Correo)
	}
}

// Función para eliminar un usuario por su ID
func eliminarUsuario(id int) {
	_, existe := usuarios[id]
	if existe {
		delete(usuarios, id)
		fmt.Println("Usuario eliminado con ID:", id)
	} else {
		fmt.Println("No se encontró el usuario con ID:", id)
	}
}

func main() {
	// Agregar algunos usuarios
	agregarUsuario(1, "Juan Pérez", "juan.perez@email.com")
	agregarUsuario(2, "Ana Gómez", "ana.gomez@email.com")
	agregarUsuario(3, "Luis Díaz", "luis.diaz@email.com")

	// Mostrar los usuarios
	mostrarUsuarios()

	// Eliminar un usuario
	eliminarUsuario(2)

	// Mostrar los usuarios después de la eliminación
	mostrarUsuarios()
}
