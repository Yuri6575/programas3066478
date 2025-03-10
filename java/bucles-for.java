import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        String[] nombres = {
            "camila", "sebastian R", "Cristian", "Andres R", "Anyelo", 
            "Esteban A", "Felipe", "Fito", "Hanssy R", "Hanz l", 
            "Jhon", "juan pablo", "Nilo", "Santiago", "Santiago S", "Yuri \n\n"
        };

       
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        
        List<Map<String, Object>> personas = new ArrayList<>();

       
        Map<String, Object> a = new HashMap<>();
        a.put("nombre", "sebastian R");
        a.put("Edad", 24);

        Map<String, Object> b = new HashMap<>();
        b.put("nombre", "Andres R");
        b.put("Edad", 26);

        Map<String, Object> c = new HashMap<>();
        c.put("nombre", "Anyelo");
        c.put("Edad", 30);

        Map<String, Object> d = new HashMap<>();
        d.put("nombre", "Esteban A");
        d.put("Edad", 28);

        Map<String, Object> e = new HashMap<>();
        e.put("nombre", "Felipe");
        e.put("Edad", 23);

        Map<String, Object> f = new HashMap<>();
        f.put("nombre", "Fito");
        f.put("Edad", 32);

        Map<String, Object> g = new HashMap<>();
        g.put("nombre", "Hanssy R");
        g.put("Edad", 27);

        Map<String, Object> h = new HashMap<>();
        h.put("nombre", "Jhon");
        h.put("Edad", 26);

        Map<String, Object> i = new HashMap<>();
        i.put("nombre", "juan pablo");
        i.put("Edad", 25);

        Map<String, Object> j = new HashMap<>();
        j.put("nombre", "Nilo");
        j.put("Edad", 26);

        Map<String, Object> k = new HashMap<>();
        k.put("nombre", "Santiago");
        k.put("Edad", 20);

        Map<String, Object> l = new HashMap<>();
        l.put("nombre", "Santiago s");
        l.put("Edad", 28);

        Map<String, Object> m = new HashMap<>();
        m.put("nombre", "Yuri");
        m.put("Edad", 28);

       
        personas.add(a);
        personas.add(b);
        personas.add(c);
        personas.add(d);
        personas.add(e);
        personas.add(f);
        personas.add(g);
        personas.add(h);
        personas.add(i);
        personas.add(j);
        personas.add(k);
        personas.add(l);
        personas.add(m);

       
        for (Map<String, Object> persona : personas) {
            System.out.println(persona.get("nombre") + " " + persona.get("Edad"));
        }

        
        for (Map<String, Object> persona : personas) {
            int edad = (int) persona.get("Edad");
            
            persona.put("Edad", edad + 1);
        }

       
        System.out.println("\nDespués de operar con los valores de edad:");
        for (Map<String, Object> persona : personas) {
            System.out.println(persona.get("nombre") + " " + persona.get("Edad"));
        }
    }
}
