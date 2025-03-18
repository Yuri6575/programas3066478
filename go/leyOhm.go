package main

import "fmt"

func calcularCorriente(voltage, resistencia float64) float64{
	//Aplicar formula I = V / R
	return voltage / resistencia
}

func main {
	//solicitar al usuario voltage y resistencia
	var  voltage, resistencia float64

	fmt.Print("Ingresa el voltaje (V): ")
	fmt.scan(&voltage)

	fmt.Print("Ingresa la resistencia (Ω): ")
	fmt.scan(&resistencia)

	//calcular la corriente
	corriente := calcularCorriente(voltage, resistencia)

	//mostrar el resultado 
	fmt.Printf("La corriente es: %.2f A\n", corriente)
}