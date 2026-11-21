# Fundamentos de Programación – Ejercicios de la Unidad 2

- **Nombre:** Cristhian Herrera
- **NRC:** 37712
- **Fecha:** 20/11/2026
- **Carrera:** Tecnologías de la Información

Este repositorio reúne 14 ejercicios en Java de las sesiones S10, S11 y S12 de Fundamentos de Programación de la ESPE.

**Estado de la actividad:** Los 14 ejercicios de las sesiones S10, S11 y S12 están completos.

## S10 – Argumentos y parámetros

### 1. [Intercambio de valores primitivos](S10_ArgumentosParametros/Ej01_IntercambiarPrimitivos.java)
Se intenta intercambiar dos números enteros mediante un método. Se observa que los valores originales en `main` se conservan porque el método recibe copias.

### 2. [Intercambio de elementos de un arreglo](S10_ArgumentosParametros/Ej02_IntercambiarArreglo.java)
Se intercambian dos elementos de un arreglo a partir de sus posiciones. Al volver a `main`, se puede ver el cambio en el mismo arreglo.

### 3. [Aplicación de un descuento](S10_ArgumentosParametros/Ej03_AplicarDescuento.java)
Se aplica un porcentaje de descuento a todos los precios de un arreglo. Se muestran los valores antes y después del cálculo.

### 4. [Sobrecarga del método de perímetro](S10_ArgumentosParametros/Ej04_SobrecargaPerimetro.java)
Se calcula el perímetro de un cuadrado y de un rectángulo con dos métodos del mismo nombre. El primero recibe un lado y el segundo recibe dos medidas.

### 5. [Predicción de la salida](S10_ArgumentosParametros/Ej05_PrediccionSalida.java)
Se predice la salida de tres llamadas a métodos y se compara con el resultado que se obtiene al ejecutar el programa.

## S11 – Ámbito de las variables

### 1. [Identificación del ámbito de las variables](S11_AmbitoVariables/Ej01_MarcarAmbito.java)
Se identifican las variables locales, las variables de bloque y los atributos `static`. Los comentarios indican en qué parte del programa se puede usar cada variable.

### 2. [Análisis de líneas que no compilan](S11_AmbitoVariables/Ej02_LineasNoCompilan.java)
Se señalan las líneas que intentan usar variables fuera de su ámbito. En los comentarios se explica el error que reporta el compilador.

### 3. [Traza de un contador estático](S11_AmbitoVariables/Ej03_TrazaContadorStatic.java)
Se registra cómo cambia el contador `static` cada vez que se llama al método desde un ciclo `for`.

### 4. [Reescritura sin atributos estáticos](S11_AmbitoVariables/Ej04_ReescribirSinStatic.java)
Se reemplazan tres atributos `static` por variables locales. Se pasan los datos como parámetros y se devuelve el resultado con `return`.

## S12 – Métodos de biblioteca

### 1. [Distancia entre dos puntos](S12_MetodosBiblioteca/Ej01_DistanciaPuntos.java)
Se calcula la distancia entre dos puntos del plano mediante `Math.pow` y `Math.sqrt`.

### 2. [Simulación de dados que suman siete](S12_MetodosBiblioteca/Ej02_DadosSuma7.java)
Se simulan 1000 lanzamientos de dos dados con `Random`. Se muestra cuántas veces la suma es siete y qué porcentaje representan esas veces.

### 3. [Validación de una contraseña](S12_MetodosBiblioteca/Ej03_ValidarContrasena.java)
Se verifica que la contraseña tenga al menos ocho caracteres, una letra mayúscula y un dígito.

### 4. [Conteo de vocales](S12_MetodosBiblioteca/Ej04_ContarVocales.java)
Se recorre una frase para contar sus vocales. El programa reconoce mayúsculas, minúsculas y vocales con tilde.

### 5. [Generación de un código aleatorio](S12_MetodosBiblioteca/Ej05_GenerarCodigo.java)
Se genera un código de seis caracteres con `Random`. El código contiene tres letras mayúsculas seguidas de tres dígitos.
