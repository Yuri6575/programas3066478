package main

import "fmt"

func main() {

	//clasico
	count := 5
				for i :=0; i < count; i++ {
					fmt.Println(i)
				}
}
	//continuo
	a := 5
	for a > 0 {
		a--
		fmt.Println(a)
		
	}
	
	//forever se jecuta infinito sin condicion q lo detenga
	for {
			fmt.Println("Esto no se va detener")
	}


	// range devuelve 2 valores (indice y valor)
	for i, v :=range numerod {
		fmt.Println(i,v)
		
	}
	nombres := map[string]string{
			"es": "Esapaña"
			"co": "Colombia"
			"br": "Brasil"
	}
