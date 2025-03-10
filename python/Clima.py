def Vestuario(temp, estado_del_tiempo):

    if temp > 24:
        return ("Es Caliente, Usa Ropa ligera y Comoda")

    elif  temp > 17:
        return ("Es Templado, Usa Camiseta,short y Tennis")

    else:
        return ("Es Frío, Usa Abrigo,pantalon y OxFords")