# Evaluación 1 de Arquitectura de Computadoras
Alumna: Maribel Santiago Bautista 
Número de control: 22620262
## Cuestionario Avanzado sobre Arquitectura de Computadoras

    **Tema 1: Evolución de la Arquitectura de Computadoras**

1. **¿Qué limitaciones de la arquitectura de Von Neumann llevaron al desarrollo de arquitecturas alternativas como Harvard, segmentada y de multiprocesamiento?**
Limitaciones en la longitud de las instrucciones por el bus de datos, limitaciones de velocidad, cuellos de botella y complejidad de programación.
2. **¿Cómo la arquitectura Harvard aborda las limitaciones de rendimiento de la arquitectura de Von Neumann?**
La arquitectura de Harvard utiliza dos buses separados para transferir datos entre la memoria de programa y la memoria de datos, permite el acceso simultáneo a la memoria de programa y la memoria de datos, lo que mejora el rendimiento de la computadora. 
3. **Explique la diferencia entre la segmentación de instrucciones y la segmentación de datos en una arquitectura segmentada.**
La arquitectura de segmentacion de instrucciones divide el proceso de ejecución de instrucciones en varias etapas, cada una realizada por una unidad de procesamiento diferente. La arquitectura de segmentación de datos divide el proceso de ejecución de instrucciones en varias etapas, cada una realizada por una unidad de procesamiento diferente.
4. **Compare y contraste las arquitecturas de multiprocesamiento simétrico (SMP) y asimétrico (AMP).**
Comparación:
La arquitectura de multiprocesamiento simétrico se utiliza en sistemas de alto rendimiento, como supercomputadoras y servidores, donde se requiere un procesamiento rápido y eficiente de restricciones.
La arquitectura de multiproceamiento asimétrico se utiliza en sistemas de alto rendimiento, como supercomputadoras y servidores, donde se requiere un procesamiento rápido y eficiente de instrucciones.
Contraste:
La arquitectura de multiprocesamiento simétrico todos los procesadores son iguales en términos de capacidad y roles, cada uno de ellos tiene acceso completo a la memoria compartida. Todos los procesadores tienen acceso simétrico y directo a la memoria compartida, facilita la comunicación entre procesadores y la distribución de tareas.
La arquitectura de multiprocesamiento asimétrico hay un procesador principal que se encarga de gestionar el sistema y uno o más procesadores secundarios que son controlados por el procesador principal. El procesador principal tiene acceso a la memoria principal y controla el sistema, mientras que los procesadores secundarios pueden tener memoria local y no acceso directo a la memoria principal.
    **Tema 2:  Componentes de un Sistema de Computación**

5. **¿Cómo la Ley de Moore ha influenciado la evolución de los microprocesadores?**
La ley de Moore ha permitido en la evolución de los microprocesadores aumentar la potencia de procesamiento, disminuir el costo del transistor, reducir el tamaño de los dispositivos electrónicos, ya que establece el numero de transistores en un circuito integrado, se duplica aproximadamente cada dos años.
6. **Describa las funciones principales de cada unidad dentro de la CPU: Unidad de Control (UC), Unidad Aritmético-Lógica (ALU) y Unidad de Coma Flotante (FPU).**
Unidad de control (UC): Es el elemento que se encarga de impartir las órdenes mediante las señales de control, busca las instrucciones en la memoria principal y las pasa al decodificador de instrucciones para que se ejecuten. Partes internas:
   - Reloj
   - Contador de programa
   - Registro de instrucciones
   - Secuenciador
   - Decodificador de instrucciones (DI)
Unidad Aritmético-Lógica (ALU): Se encarga de hacer los cálculos aritméticos (suma, resta, multiplicación, división) y operaciones lógicas (and, or, ...). Partes internas:
   - Circuito operacional
   - Registros de entrada
   - Acumulador
   - Registro de estado (Flag)
Unidad de coma flotante (FPU): Este elemento no estaba en el diseño original de la arquitectura, posteriormente fue introducido cuando las instrucciones y cálculos se hicieron más complejos con la aparición de los programas representados gráficamente, se encarga de realizar las operaciones en coma flotante, es decir, números reales.
7. **Explique la jerarquía de memoria y su impacto en el rendimiento del sistema.**
La jerarquía de memoria organiza diferentes tipos de memoria en niveles de acceso rápido y capacidad variable, con el fin de optimizar el rendimiento del sistema. La idea principal es proporcionar un equilibrio entre velocidad y capacidad de almacenamiento.  
Níveles de la jerarquía de memoria:
   - Registros (Nível 0): Los registros permiten un acceso casi inmediato a los datos necesarios para las operaciones más críticas del procesador, pero debido a su pequeña capacidad, se utilizan para almacenar solo datos muy específicos.
   - Caché de primer nivel (L1): El acceso a la caché L1 es extremadamente rápido, lo que ayuda a mejorar el rendimiento al reducir el tiempo de espera para datos e instrucciones comunes. Sin embargo, su capacidad limitada significa que solo los datos más relevantes para las operaciones actuales pueden almacenarse.
   - Caché de segundo nivel (L2): L2 complementa a la L1 y reduce la latencia general de acceso a datos, manteniendo los costos de acceso bajos, pero con un costo adicional en términos de tamaño y velocidad. Esto ayuda a mejorar el rendimiento al almacenar datos que no encajan en L1.
   - Caché de tercer nivel (L3): La caché L3 ayuda a evitar cuellos de botella al reducir la cantidad de accesos a la memoria principal. Su tamaño más grande permite almacenar más datos, pero su acceso más lento comparado con L1 y L2 puede afectar el rendimiento.
   - Memoria secundaria (Disco duro o SSD): El acceso a la memoria secundaria es mucho más lento, lo que hace que el sistema recurra a la memoria RAM y las cachés cuando es posible. Sin embargo, los avances en las unidades SSD han mejorado significativamente la velocidad de acceso, superando en parte las limitaciones de los discos duros tradicionales.
Impacto de la jerarquía de memoria en el rendimiento del sistema:
   - Reducción de la latencia.
   - Optimización de la capacidad de almacenamiento.
   - Caché Hit y Caché Miss.
   - Consumo de energía.
8. **Compare y contraste las arquitecturas CISC y RISC.**
Actualmente existen dos tipos de arquitectura la CISC y la RISC, dos formas de trabajar basadas en la arquitectura de Von Neuman.
Comparación:
Arquitectura CISC: Tienen un conjunto diverso de instrucciones complejas que permiten realizar múltiples operaciones en una sola instrucción. Esto facilita la programación de software, ya que se pueden realizar tareas complejas con menos instrucciones.
Arquitectura RISC: Tienen un conjunto de instrucciones más pequeño y simple. Permite una ejecucón más rápida de las instrucciones, pero también requiere que el software realice más trabajo para realizar tareas complejas.
Contraste:
Arquitectura CISC: Se enfoca en la complejidad de las instrucciones, lo que permite realizar más operaciones con menos instrucciones. Es más adecuado para aplicaciones que requieren realizar tareas complejas en un solo ciclo, pero puede ser más lentro en términos de ejecucción debido a la mayor complejidad de cada instrucción.
Arquitectura RISC: Prioriza instrucciones simples y rápidas, lo que optimiza la velocidad de ejecución, pero puede requerir más instrucciones para realizar tareas complejas. Es ideal para aplicaciones que buscan rendimiento de alta velocidad y eficiencia en el euso de ciclos de reloj.

9. **¿Cuáles son las ventajas y desventajas de integrar una GPU en la CPU?**
Ventajas:
- Reducción de espacio físico
- Eficiencia energética
- Mejora en la comunicación entre la CPU y la GPU
- Mayor simplicidad en la construcción del sistema
Desventajas:
- Rendimiento grafico limitado
- Uso compartido de recursos
- Térmicas limitadas
- Menos capacidad para tareas gráficas especializadas
    **Tema 3: Memoria y Almacenamiento**

10. **Diferencie entre memoria volátil y no volátil, proporcionando ejemplos de cada tipo.**
Memoria volátil: Es una forma de memoria que pierde su contenido cuando se apaga la computadora. Se utiliza para almacenar datos e instrucciones temporales que se utilizan durante la ejecución de un programa.
Ejemplos:
La memoria volátil se divide en dos categorias principales: la memoria de acceso aleatorio (RAM) y la memoria de solo lectura (ROM).

Memoria no volátil: Es una forma de memoria que conserva su contenido cuando se apaga la computadora. Se utiliza para almacenar datos e instrucciones permanentes que se utilizan durante la ejecucción de un programa.
Ejemplos:
La memoria volátil se divide en dos categorías principales: la memoria de solo lectura (ROM) y la memoria de solo escritura (WORM).
11. **Explique el rol de la memoria caché y sus diferentes niveles (L1, L2, L3) en la optimización del rendimiento.**
La memoria caché almacena datos e instrucciones que se utilizan frecuentemente, lo que permite que la CPU los acceda más rápido en comparación con la memoria principal (RAM). Si la CPU necesita acceder a un dato y este se encuentra en la caché, el tiempo de acceso es mucho más bajo.
- Caché L1: Está integrada directamente en el núcleo de la CPU y es la más cercana a los procesadores. La caché L1 es la más rápida de todas las cachés, ya que se encuentra dentro del núcleo de la CPU y tiene un tiempo de acceso muy bajo.
- Caché L2: La caché L2 está generalmente ubicada fuera del núcleo de la CPU, pero aún dentro del chip del procesador o en su cercanía. Aunque es más lenta que la L1, sigue siendo más rápida que la memoria RAM. Su acceso es más lento que la L1, pero sigue siendo más rápido que el acceso a la RAM.
- Caché L3: La caché L3 se encuentra fuera de los núcleos de la CPU, pero sigue estando en el mismo chip del procesador o cerca de él, en algunos casos es compartida entre todos los núcleos. Es más lenta que la L1 y la L2, pero sigue siendo más rápida que acceder a la memoria RAM.
12. **¿Cómo se gestionan las interrupciones en un sistema de computación?**
La gestión de interrupciones involucra varios componentes y etapas dentro de la arquitectura del sistema. Tipos de Interrupciones:
Las interrupciones pueden clasificarse de varias maneras según su origen o la forma en que son generadas:
Interrupciones externas: Provienen de fuera de la CPU.
Interrupciones internas: Provienen de la propia CPU durante la ejecución de un programa.
    **Tema 4: Entrada/Salida y Buses**

13. **Describa la diferencia entre entrada/salida programada y acceso directo a memoria (DMA).**
La entrada/salida programada (PIO) es un método en el que la CPU gestiona directamente todas las transferencias de datos entre la memoria y los dispositivos periféricos.
El acceso directo a memoria (DMA) es un método en el que un controlador DMA (un dispositivo separado) se encarga de las transferencias de datos entre la memoria y los dispositivos periféricos, sin la intervención directa de la CPU. Esto permite que la CPU se concentre en otras tareas mientras se gestionan las transferencias de datos.
14. **¿Cuáles son los tres tipos principales de buses en un sistema de computación y sus funciones?**
- Bus de datos (Data bus): El bus de datos es responsable de transportar los datos entre los diferentes componentes del sistema, como la CPU, la memoria y los dispositivos de entrada/salida.
- Bus de direcciones (Adress bus): El bus de direcciones es responsable de transportar las direcciones de memoria o dispositivos a los que la CPU desea acceder, ya sea para leer o escribir datos. No transporta datos reales, solo direcciones.
- Bus de control (Control bus): El bus de control transporta las señales de control que coordinan y supervisan las operaciones de la CPU y otros componentes del sistema, como la memoria y los periféricos. Estas señales indican cuándo y cómo se deben realizar las transferencias de datos y acceso a memoria, entre otros.
15. **Explique el concepto de "cuello de botella" en el contexto de la arquitectura de Von Neumann y cómo las arquitecturas alternativas buscan mitigarlo.**
Se refiere a una limitación en el rendimiento del sistema debido a la forma en que se gestionan las operaciones de lectura y escritura de datos entre la CPU y la memoria. Este problema es especialmente notorio en la arquitectura de Von Neumann, que emplea un único bus de datos para transferir tanto instrucciones como datos hacia y desde la memoria, lo que provoca una congestión en el flujo de información.
En un sistema basado en la arquitectura de Von Neumann, tanto las instrucciones (que son ejecutadas por la CPU) como los datos (que la CPU manipula) se almacenan en la misma memoria y se transfieren a través de un único bus. Esto significa que la CPU debe esperar para obtener una instrucción o acceder a los datos, ya que solo un recurso (el bus) está disponible para ambas tareas.
    **Tema 5:  Programación y Software**

16. **Explique la diferencia entre un compilador y un intérprete.**
La principal diferencia entre un compilador y un intérprete radica en cómo traducen y ejecutan el código fuente de un programa. Ambos tienen la función de transformar el código escrito por un programador (en un lenguaje de alto nivel) a un formato que pueda ser entendido por la máquina, pero lo hacen de maneras diferentes.
Un compilador lee y traduce todo el código fuente de un programa de una vez, y genera un archivo ejecutable o un código intermedio que luego puede ser ejecutado por la máquina.
Un intérprete traduce el código fuente línea por línea, y lo ejecuta inmediatamente. No produce un archivo ejecutable; simplemente ejecuta las instrucciones a medida que las lee.
17. **¿Qué es un lenguaje ensamblador y cómo se relaciona con el lenguaje máquina?**
Un lenguaje ensamblador es un lenguaje de programación de bajo nivel que está muy cerca del lenguaje máquina y se utiliza para escribir programas que pueden ser ejecutados directamente por un procesador. Se considera un lenguaje de "casi bajo nivel" porque es más comprensible para los seres humanos que el lenguaje máquina, pero aún está estrechamente relacionado con la arquitectura del hardware.
18. **Describa el proceso de "ligado" (linking) en la creación de un programa ejecutable.**
El proceso de ligado o linking es una de las etapas clave en la creación de un programa ejecutable. Su objetivo principal es combinar y vincular distintos módulos o componentes de un programa para generar un archivo ejecutable final que pueda ser ejecutado por la máquina.
Fases del proceso de "ligado" (Linking):
- Compilación
- Proceso de "linking"
- Generación del archivo ejecutable
19. **¿Qué son las llamadas al sistema y cómo se utilizan en la programación?**
Una llamada al sistema es una función que un programa puede invocar para solicitar al sistema operativo que ejecute una operación específica. Estas operaciones no pueden ser realizadas directamente por los programas debido a las restricciones de seguridad y acceso. El sistema operativo, que tiene privilegios más altos, es quien ejecuta estas operaciones en nombre del programa.
Las llamadas al sistema se utilizan en la programación mediante:
- Interfaz de llamadas al sistema
- Uso desde un programa
    **Tema 6:  Rendimiento y Optimización**

20. **¿Qué factores se consideran al medir el rendimiento de un sistema de computación?**
Medir el rendimiento de un sistema de computación implica evaluar cómo de eficientemente un sistema realiza tareas específicas bajo ciertas condiciones. Para hacer una medición completa, se deben considerar varios factores clave que influyen en la capacidad del sistema para procesar datos, ejecutar aplicaciones y responder a las solicitudes de los usuarios.
Factores para medir el rendimiento de un sistema de computación:
- Veloidad de procesamiento (clock speed).
- Rendimiento de la memoria.
- Rendimiento de almacenamiento.
- Rendimiento de la red.
- Utilización de recursos.
- Escalabilidad.
- Eficiencia energética.
- Tiempo de respuesta.
21. **Explique la diferencia entre localidad espacial y temporal en el contexto de acceso a memoria.**
La localidad temporal se refiere a la tendencia de un programa a acceder repetidamente a las mismas direcciones de memoria en un corto período de tiempo. Es decir, si un dato o una instrucción se ha accedido recientemente, es probable que se vuelva a acceder en un futuro cercano.
La localidad espacial se refiere a la tendencia de un programa a acceder a ubicaciones de memoria cercanas entre sí. Es decir, si un programa accede a una dirección de memoria en particular, es probable que también acceda a direcciones cercanas en el futuro cercano.
22. **¿Cómo el paralelismo a nivel de instrucción (ILP) y el paralelismo a nivel de datos (DLP) contribuyen a mejorar el rendimiento?**
Son dos enfoques fundamentales utilizados en la arquitectura de computadoras para mejorar el rendimiento de los sistemas de procesamiento, especialmente en procesadores modernos, ambos permiten ejecutar múltiples operaciones en paralelo, pero lo hacen de diferentes maneras y se enfocan en diferentes aspectos de la ejecución de programas.
ILP contribuye al rendimiento mediante la ejecución de instrucciones en paralelo dentro de un mismo hilo de ejecución.
DLP, por su parte, permite procesar muchos datos de manera simultánea, lo que es especialmente útil en aplicaciones que manejan grandes volúmenes de datos.
23. **¿Qué son los cuellos de botella en el rendimiento y cómo se identifican y resuelven?**
Un cuello de botella en el rendimiento de un sistema de computación es un componente o proceso dentro del sistema que limita el rendimiento global del sistema, es decir, el componente que se convierte en el límite más lento o menos eficiente, impidiendo que el sistema funcione a su máxima capacidad.
Un cuello de botella es cualquier componente del sistema (CPU, memoria, red, almacenamiento) que limita el rendimiento general.
Se identifican mediante:
- Monitoreo del rendimiento.
- Análisis de métricas clave.
- Perfílado y pruebas de carga.
- Análisis de arquitectura.
Identificar los cuellos de botella se hace a través de herramientas de monitoreo de rendimiento, perfilado de código, pruebas de carga y análisis de arquitectura.
Se resuelven mediante:
- Optimización del código.
- Escalabilidad del hardware.
- Optimización de la memoria.
- Paralelización y distribución.
- Balance de carga.
- Uso de técnicas de escalabilidad.
Resolver los cuellos de botella puede implicar optimizar el código, mejorar el hardware, aumentar el paralelismo, balancear la carga, o utilizar técnicas de escalabilidad y caché.
    **Tema 7: Clasificación de Multiprocesadores**

24. **Explique la taxonomía de Flynn para clasificar arquitecturas paralelas.**
La taxonomía de Flynn es un sistema de clasificación de arquitecturas de procesamiento paralelo propuesto por Michael J. Flynn en 1966. Esta taxonomía se utiliza para categorizar los sistemas de computación paralela según el número de flujos de instrucciones y flujos de datos que pueden manejar simultáneamente.
Categorías de la taxonomía de Flynn:
- SISD: En una arquitectura SISD, hay un único flujo de instrucciones y un único flujo de datos. Es la arquitectura tradicional de un procesador secuencial.
- SIMD: En una arquitectura SIMD, hay un único flujo de instrucciones, pero múltiples flujos de datos. La misma instrucción se aplica a múltiples datos al mismo tiempo.
- MIMD: En una arquitectura MIMD, hay múltiples flujos de instrucciones y múltiples flujos de datos. Cada procesador puede ejecutar su propio conjunto de instrucciones sobre diferentes datos.
- MISD: En una arquitectura MISD, hay múltiples flujos de instrucciones, pero un único flujo de datos. Diferentes instrucciones se aplican al mismo conjunto de datos.
La taxonomía de Flynn proporciona una manera clara de clasificar las arquitecturas paralelas en función del número de flujos de instrucciones y datos que pueden manejar. Mientras que SISD es un enfoque secuencial y simple, SIMD y MIMD explotan paralelismo a través de múltiples unidades de procesamiento, cada una con sus características y aplicaciones específicas. MISD, aunque teóricamente posible, es una categoría rara en la práctica debido a su limitada aplicabilidad.
25. **Describa las características principales de cada categoría en la taxonomía de Flynn: SISD, SIMD, MISD, MIMD.**
- SISD: Las instrucciones se ejecutan de manera secuencial, es decir, una tras otra, sin paralelismo de instrucciones o datos.
Es la arquitectura secuencial más simple, adecuada para tareas sin paralelismo.
Flujos de instrucciones: 1 (un solo flujo de instrucciones).
Flujos de datos: 1 (un solo flujo de datos).
- SIMD: El procesador aplica la misma instrucción de manera simultánea a varios datos. Es común en operaciones vectoriales y matrices, que requieren la misma operación repetida sobre un conjunto de datos.
Ofrece paralelismo de datos, ideal para operaciones repetitivas sobre grandes volúmenes de datos.
Flujos de instrucciones: 1 (un solo flujo de instrucciones).
Flujos de datos: Múltiples (varios flujos de datos).
MISD: Aunque las instrucciones son diferentes, todas se aplican al mismo conjunto de datos. Esta configuración es rara, ya que la mayoría de los sistemas paralelos aprovechan múltiples datos, no un solo conjunto de datos.
Es rara y se utiliza en aplicaciones de alta fiabilidad o redundancia.
Flujos de instrucciones: Múltiples (varios flujos de instrucciones).
Flujos de datos: 1 (un solo flujo de datos).
MIMD: Los procesadores en un sistema MIMD pueden estar ejecutando distintas instrucciones sobre diferentes datos, lo que les permite trabajar de forma independiente, sin dependencia directa entre ellos.
Es la arquitectura más flexible y poderosa, utilizada en sistemas distribuidos y de alto rendimiento.
Flujos de instrucciones: Múltiples (varios flujos de instrucciones).
Flujos de datos: Múltiples (varios flujos de datos).
26. **Diferencie entre multiprocesadores fuertemente acoplados y débilmente acoplados.**
La diferencia entre multiprocesadores fuertemente acoplados y multiprocesadores débilmente acoplados radica principalmente en la forma en que los procesadores en un sistema trabajan juntos y cómo comparten los recursos.
Los multiprocesadores fuertemente acoplados están basados en una memoria compartida y proporcionan comunicación eficiente entre procesadores, lo que facilita la sincronización y la coherencia de datos.
Los multiprocesadores débilmente acoplados están basados en una memoria distribuida, lo que permite una gran escalabilidad, ya que los procesadores no compiten por los mismos recursos.
    **Tema 8:  Tendencias en la Arquitectura de Computadoras**

27. **¿Cómo el crecimiento del procesamiento en la nube está impactando la arquitectura de los centros de datos?**
El crecimiento del procesamiento en la nube ha tenido un impacto significativo en la arquitectura de los centros de datos en los últimos años. A medida que más empresas y usuarios adoptan servicios basados en la nube para almacenar datos, ejecutar aplicaciones y realizar cálculos complejos, la infraestructura de los centros de datos debe evolucionar para satisfacer nuevas demandas de capacidad, flexibilidad, eficiencia y escalabilidad.
Principales impactos:
- Escalabilidad masiva y flexibilidad.
- Arquitecturas distribuidas.
- Optimización del consumo energético.
- Redundancia y alta disponibilidad.
- Automatización y gestión de infraestructura.
- Aumento de la seguridad.
28. **¿Cuáles son las ventajas y desventajas de las arquitecturas de sistemas en chip (SoC)?**
Ventajas:
- Reducción del tamaño físico.
- Mayor eficiencia energética.
- Costos reducidos.
- Mejor rendimiento.
- Reducción de la complejidad en el diseño.
- Mejora la fiabilidad.
Desventajas:
- Limitaciones de personalización.
- Dificultad de actualización.
- Rendimiento limitado por la integración.
- Problemas de disipación de calor.
- Desarrollo y diseño más complejo.
- Dependencia de un solo proveedor.
29. **¿Cómo la inteligencia artificial (IA) está influyendo en la evolución de la arquitectura de computadoras?**
La inteligencia artificial (IA) está teniendo un impacto en la evolución de la arquitectura de computadoras, ya que las demandas de procesamiento de datos y cálculos necesarios para ejecutar modelos de IA están impulsando innovaciones en hardware, diseño de sistemas y optimización del rendimiento. A medida que la IA se integra en una variedad más amplia de aplicaciones, la arquitectura de las computadoras debe adaptarse para satisfacer las necesidades específicas de los algoritmos y las cargas de trabajo intensivas en datos
**Pregunta general:**

30. **¿Cómo los avances en la tecnología de semiconductores han impulsado la evolución de la arquitectura de computadoras?**
Los avances en la tecnología de semiconductores han sido fundamentales para la evolución de la arquitectura de computadoras, ya que permiten un mejor rendimiento, mayor eficiencia energética y miniaturización de los sistemas.
La mejora en la miniaturización, el desarrollo de transistores avanzados, la creación de arquitecturas heterogéneas y la mejora en las tecnologías de memoria y almacenamiento han hecho posible que las computadoras actuales puedan afrontar las crecientes demandas de procesamiento de datos y de ejecución de algoritmos complejos, como los utilizados en inteligencia artificial, big data y realidad virtual.
