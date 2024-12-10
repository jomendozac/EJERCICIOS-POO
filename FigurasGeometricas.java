package pruebafiguras;

public class PruebaFiguras {

    public static void main(String[] args) {
        Círculo figura1 = new Círculo(2);
        Rectángulo figura2 = new Rectángulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TriánguloRectángulo figura4 = new TriánguloRectángulo(3,5);
        System.out.println("El area del circulo es = " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerímetro());
        System.out.println();
        System.out.println("El area del rectangulo es = " + figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerímetro());
        System.out.println();
        System.out.println("El area del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerímetro());
        System.out.println();
        System.out.println("El area del triangulo es = " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es = " + figura4.calcularPerímetro());
        figura4.determinarTipoTriángulo();
        }
    
}

//AHORA LAS CLASES SON:

//CUADRADO

package pruebafiguras;

public class Cuadrado {
    int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado*lado;
        }

    double calcularPerímetro() {
        return (4*lado);
    }
        
}

//CIRCULO

package pruebafiguras;

public class Círculo {
    int radio;
        
    Círculo(int radio) {
        this.radio = radio;
    }
        
    double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
        
    double calcularPerímetro() {
        return 2*Math.PI*radio;
    }
    
}

//RECTANGULO

package pruebafiguras;

public class Rectángulo {
    int base; 
    int altura; 

    Rectángulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
   
    double calcularArea() {
        return base * altura;
    }
    
    double calcularPerímetro() {
        return (2 * base) + (2 * altura);
    }
    
}

//TRIANGULO RECTANGULO

package pruebafiguras;

public class TriánguloRectángulo {
    int base;
    int altura;

    public TriánguloRectángulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura / 2);
    }

    double calcularPerímetro() {
        return (base + altura + calcularHipotenusa()); 
    }
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    void determinarTipoTriángulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura 
            == calcularHipotenusa()))
            System.out.println("Es un triangulo equilatero");
        if ((base != altura) && (base != calcularHipotenusa()) && 
            (altura != calcularHipotenusa()))
            System.out.println("Es un triangulo escaleno"); 
        else 
            System.out.println("Es un triangulo isosceles");
    } 
}

