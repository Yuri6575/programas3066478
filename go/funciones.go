package main

import "fmt"

func main() {
	saludar("Yuri", 28)
}

func saludar(nombre string, edad uint8) {
	fmt.Println("Hola", nombre)
	fmt.Printf("Tienes %d años\n", edad)
	if edad > 30 {
		return
	}
	fmt.Println("eres Adulto")
}

