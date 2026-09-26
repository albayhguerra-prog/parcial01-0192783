# Primer Parcial Práctico – Programación I

## Versión A

**Lenguaje:** Java  
**Modalidad:** Individual  
**Duración total:** 60 minutos  
**Valor:** 100 puntos  
**Temas:** arreglos unidimensionales, arreglos bidimensionales, ciclos, condicionales, contadores y acumuladores.

---

## Indicaciones generales

- Desarrolle los dos ejercicios en Java y desde consola.
- Cada ejercicio debe resolverse en un archivo independiente.
- Toda la solución debe estar dentro del método `main`.
- Puede utilizar `Scanner`, arreglos, matrices, ciclos y condicionales.
- No se permite utilizar `ArrayList`, colecciones, `Stream`, métodos de ordenamiento automático ni métodos creados por el estudiante.
- Los datos deben ser solicitados al usuario; no deben quedar escritos directamente en el código.
- Los resultados deben mostrarse de forma clara e identificable.
- Si se presenta un empate, debe reportarse la primera posición encontrada.

---

# Ejercicio 1 – Consumo de agua por sectores

**Tiempo sugerido:** 30 minutos  
**Valor:** 50 puntos

Una empresa de servicios públicos registró el consumo diario de agua de **10 sectores** de la ciudad. La información se expresa en metros cúbicos enteros y debe almacenarse en un arreglo unidimensional.

Construya un programa que:

1. Cree un arreglo de 10 posiciones.
2. Solicite el consumo de cada sector y valide que no sea negativo. Si el dato es inválido, debe solicitarlo nuevamente.
3. Calcule y muestre:
   - El consumo total de los 10 sectores.
   - El promedio de consumo.
   - El número del sector con el mayor consumo.
   - Cuántos sectores tuvieron un consumo superior al promedio.
   - La racha más larga de sectores consecutivos cuyo consumo fue superior al promedio.
4. Muestre el listado final con el número de cada sector y su consumo registrado.

## Aclaraciones

- Los sectores se numeran del 1 al 10, aunque las posiciones del arreglo comiencen en 0.
- Una racha es una secuencia de posiciones consecutivas. Por ejemplo, si los sectores 3, 4 y 5 superan el promedio, existe una racha de longitud 3.
- Para determinar cuáles consumos superan el promedio será necesario recorrer nuevamente el arreglo después de calcularlo.

## Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Lectura, almacenamiento y validación de los 10 consumos | 10 |
| Cálculo correcto del total y del promedio | 10 |
| Identificación del sector con mayor consumo | 10 |
| Conteo de sectores por encima del promedio | 8 |
| Cálculo correcto de la racha más larga | 8 |
| Claridad de la salida y organización del código | 4 |

---

# Ejercicio 2 – Control de producción semanal

**Tiempo sugerido:** 30 minutos  
**Valor:** 50 puntos

Una pequeña fábrica cuenta con **4 máquinas** y registra durante **5 días** la cantidad de piezas producidas por cada una. La información debe almacenarse en una matriz de 4 filas por 5 columnas:

- Cada fila representa una máquina.
- Cada columna representa un día de trabajo.

Construya un programa que:

1. Cree una matriz de `4 x 5`.
2. Solicite la producción de cada máquina durante cada día y valide que ningún valor sea negativo.
3. Calcule y muestre:
   - El total producido por cada máquina.
   - El total producido en cada día, sumando las cuatro máquinas.
   - La máquina con la mayor producción acumulada.
   - El día con la menor producción total.
   - Cuántos registros de la matriz fueron inferiores a 20 piezas.
4. Muestre la matriz completa, organizada por máquinas y días.

## Aclaraciones

- Las máquinas se numeran del 1 al 4 y los días del 1 al 5.
- Si dos máquinas tienen el mismo total máximo, se reporta la primera.
- Si dos días tienen el mismo total mínimo, se reporta el primero.
- No es necesario crear arreglos adicionales para resolver el ejercicio, aunque puede utilizarlos si lo considera conveniente.

## Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Lectura, almacenamiento y validación de la matriz | 10 |
| Cálculo del total de cada máquina | 10 |
| Cálculo del total de cada día | 10 |
| Identificación de la máquina mayor y el día menor | 10 |
| Conteo de registros inferiores a 20 | 6 |
| Presentación de la matriz y organización del código | 4 |

---

## Entrega

Entregue los dos archivos `.java`, debidamente nombrados y capaces de compilar y ejecutarse sin errores.

**Antes de escribir código, identifique las entradas, el proceso y las salidas. El compilador detecta errores de sintaxis; la lógica todavía corre por cuenta del programador.**

**Ejercicio 1**
Tuve que modificar el for para que estuvieran bien los datos de salida de los consumos y agregar un do while para que el usuario no pudiera ingrsar datos negativos, cambie un if por for para sacar el consumo mayor que promedio ya que con el if era muy extenso, y agrege lo dee la racha y el de mayor consumo, y por ultimo los System para mostar los resultados.

**Ejercicio 2**
Se declaro las constantes fuera del class, declaramos variables y la matriz bidimensional que se pedia, utilizamos Scanner para los datos de entrada, utilice varios for para las diferentes funciones que nos pedian como el ingreso de las producciones de las maquinas por los dias, para ir sumando y asi, al final se muestra los datos de salida.

**Profe si lee esto, significa que llego hasta el final. Gracias por su servicio**
