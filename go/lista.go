package main

import "fmt"

func main(){

	//crear lista (slice) con elememtos
	frutas := []string["manzana", "banana", "cereza"]

	// mostrar la lista(slice)
	fmt.Println("lista dee frutas", frutas)

	//agregar (append) nuevo elemento a la lista
	frutas = append(frutas, "naranja")

	//slice despues de nuevo elemento
	fmt.Println("lista de frutas despues de agragar la naranja:", frutas)

	//acceder a un elemento de slice x indice
	fmt.Println("la primera fruta es:", frutas[0])

	//recorrer con bucle el slice //range es para iterar
	fmt.Println("Frutas en lista :")
	for i, fruta := range frutas {
	fmt.Printf("indice %d: %s\n", i, fruta)
	}

}