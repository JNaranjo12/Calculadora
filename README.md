# 🧮 Calculadora en Java - Clean Code

Este proyecto implementa una calculadora de línea de comandos en Java, que permite realizar operaciones básicas y avanzadas. El código ha sido desarrollado aplicando principios seleccionados del repositorio [clean-code-javascript](https://github.com/andersontr15/clean-code-javascript-es), adaptados al contexto de Java.

---

## 🧼 Principios de Clean Code aplicados

### ✔️ Nombres significativos y pronunciables
Se utilizaron nombres claros y expresivos para métodos, variables y clases.  
Ejemplos:
- `sumar`, `restar`, `dividir`, `raiz`, `absoluto`
- `numero`, `operacion`, `resultado`

> Aplicado en: `Calculadora.java`, `Main.java`

---

### ✔️ Funciones pequeñas y específicas
Cada método realiza una sola tarea y está claramente separado del resto.  
Ejemplo: `dividir(double a, double b)` solo realiza división y valida división por cero.

> Aplicado en: `Calculadora.java`

---

### ✔️ Evitar el mapeo mental
Se evitan nombres ambiguos como `x` o `val`, usando nombres como `numero1`, `numero2` o `simbolo`, que ayudan a comprender el propósito.

> Aplicado en: `Main.java`

---

### ✔️ Separación de responsabilidades
La lógica de cálculo está separada de la interacción con el usuario:
- `Main.java` → Entrada/salida con el usuario.
- `Calculadora.java` → Lógica de operaciones matemáticas.

> Esto mejora el mantenimiento y la capacidad de prueba del código.

---

### ✔️ Manejo explícito de errores
Se valida la división por cero y raíz de número negativo con excepciones claras (`IllegalArgumentException`), en lugar de permitir errores silenciosos o resultados inválidos.

> Aplicado en: `Calculadora.java`

---

### ✔️ Código autoexplicativo, sin comentarios innecesarios
No se agregaron comentarios redundantes. El código es lo suficientemente legible gracias a la claridad de sus nombres y estructura.

> Aplicado en: Todo el código

---

## ▶️ Cómo ejecutar el programa

Este proyecto fue desarrollado y probado en **IntelliJ IDEA**.  
Para ejecutarlo:

1. Abre el proyecto en IntelliJ.
2. Asegúrate de que `Main.java` esté marcado como clase principal.
3. Haz clic derecho sobre el archivo `Main.java` y selecciona **Run 'Main'** o utiliza el botón ▶️.
4. Interactúa con la calculadora desde la terminal integrada.

> No se requiere configuración adicional si usas IntelliJ con Maven correctamente configurado.

