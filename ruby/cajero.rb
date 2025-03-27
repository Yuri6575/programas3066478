class Cajero
    attr_reader :saldo
  
    def initialize
      @saldo = 100.000 # saldo inicial del cajero
      @intentos = 3 # número de intentos para ingresar el PIN correctamente
      @pin = "2222" # PIN correcto
    end
  
    def iniciar_sesion
      puts "Por favor ingresa tu PIN:"
      while @intentos > 0
        pin_ingresado = gets.chomp
        if pin_ingresado == @pin
          puts "PIN correcto. Bienvenido al cajero."
          mostrar_menu
          break
        else
          @intentos -= 1
          if @intentos > 0
            puts "PIN incorrecto. Te quedan #{@intentos} intentos."
          else
            puts "Has agotado tus intentos. El acceso ha sido bloqueado."
          end
        end
      end
    end
  
    def mostrar_menu
      loop do
        puts "\n--- Menú del Cajero ---"
        puts "1. Consultar saldo"
        puts "2. Retirar dinero"
        puts "3. Depositar dinero"
        puts "4. Salir"
        print "Selecciona una opción: "
        opcion = gets.chomp.to_i
  
        case opcion
        when 1
          consultar_saldo
        when 2
          retirar_dinero
        when 3
          depositar_dinero
        when 4
          puts "Gracias por usar el cajero. ¡Hasta luego!"
          break
        else
          puts "Opción no válida. Por favor, selecciona una opción válida."
        end
      end
    end
  
    def consultar_saldo
      puts "Tu saldo actual es: $#{@saldo}"
    end
  
    def retirar_dinero
      print "Ingresa la cantidad a retirar: $"
      cantidad = gets.chomp.to_i
  
      if cantidad <= 0
        puts "La cantidad debe ser mayor a 0."
      elsif cantidad > @saldo
        puts "Saldo insuficiente. No puedes retirar esa cantidad."
      else
        @saldo -= cantidad
        puts "Has retirado $#{cantidad}. Tu saldo actual es: $#{@saldo}"
      end
    end
  
    def depositar_dinero
      print "Ingresa la cantidad a depositar: $"
      cantidad = gets.chomp.to_i
  
      if cantidad <= 0
        puts "La cantidad debe ser mayor a 0."
      else
        @saldo += cantidad
        puts "Has depositado $#{cantidad}. Tu saldo actual es: $#{@saldo}"
      end
    end
  end
  
  # Crear una nueva instancia de Cajero y ejecutar el proceso
  cajero = Cajero.new
  cajero.iniciar_sesion
  