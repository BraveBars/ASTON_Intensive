# Вопросы и ответы:

### 1.	Назовите основные принципы ООП. Расскажите подробно о каждом.
1. **Инкапсуляция**: это процесс, который скрывает внутренние детали реализации объекта и предоставляет доступ к ним только через публичные методы. Это помогает защитить данные от случайного изменения и облегчает поддержку кода.
2. **Наследование**: позволяет создавать новый класс на основе существующего, наследуя его свойства и методы. Это способствует повторному использованию кода и упрощает его расширение.
3. **Полиморфизм**: это способность объектов разных классов обрабатывать одно и то же сообщение по-разному. Реализуется через переопределение методов и интерфейсы, позволяя использовать один интерфейс для разных типов данных.
4. **Абстракция**: это процесс выделения значимых характеристик объекта, игнорируя несущественные детали. В ООП это достигается с помощью абстрактных классов и интерфейсов.
### 2.	Расскажите про иерархию наследования. Подробно про методы класса Object.
Наследование в Java реализуется через иерархию классов:
1. Каждый класс в Java наследует от **класса Object**, который является корнем иерархии. Класс Object — вершина иерархии наследования. Все классы в Java неявно наследуются от Object. Обеспечивает базовые методы, такие как equals(), hashCode(), toString() и другие.
2. **Пользовательские классы** могут наследоваться от других классов, используя ключевое слово extends. Если класс не указывает явного родителя, он наследует от Object.
3. **Подклассы и суперклассы**. Класс, который наследует от другого класса, называется подклассом (или производным классом). Класс, от которого наследуют, называется суперклассом (или базовым классом).
**Методы класса Object** включают:
1. **equals()**: сравнивает объекты на равенство. По умолчанию проверяет, ссылаются ли оба объекта на один и тот же экземпляр. Обычно переопределяется для сравнения содержимого объектов.
2. **hashCode()**: возвращает хэш-код объекта, который используется в коллекциях, таких как HashMap и HashSet. Если equals переопределен, то hashCode также должен быть переопределен, чтобы обеспечивать согласованность.
3. **toString()**: возвращает строковое представление объекта. По умолчанию возвращает строку, содержащую имя класса и хэш-код объекта. Обычно переопределяется для предоставления более информативного представления.
4. **getClass()**: возвращает объект Class, который представляет класс, к которому принадлежит данный объект. Этот метод может быть использован для получения информации о типе объекта во время выполнения.
5. **clone()**: создает копию объекта. Для использования этого метода класс должен реализовать интерфейс Cloneable, и метод clone() должен быть переопределен, чтобы обеспечить глубокое копирование (если необходимо).
6. **finalize()**: вызывается сборщиком мусора перед удалением объекта. Этот метод может использоваться для освобождения ресурсов. Однако его использование не рекомендуется, так как поведение сборщика мусора непредсказуемо.
7. **wait()**: приостанавливает выполнение текущего потока до тех пор, пока не будет вызван метод notify() или notifyAll() в том же объекте. Используется для межпоточного взаимодействия.
8. **notify()**: пробуждает один из потоков, которые ожидают на этом объекте (вызван метод wait()).
9. **notifyAll()**: пробуждает все потоки, которые ожидают на этом объекте.
### 3.	Что такое интерфейс, что такое абстрактный класс.
### 4.	Может ли интерфейс/абстрактный класс иметь конструктор, поля, статические/дефолтные методы.
### 5.	Что такое Enum, в чем отличие от класса, может ли иметь методы, конструкторы, наследоваться реализовывать интерфейсы.
### 6.	Расскажите про модификаторы доступа, к чему они применяются.
### 7.	Расскажите про конструкторы, с какими модификаторами они применяются, могут ли они наследоваться/переопределяться?
### 8.	Можно ли в классе заимплементировать 2 интерфейса? А если в них один и тот же метод doSmth? Как он реализуется?
### 9.	Статический/динамический полиморфизм.
### 10.	Что является членами класса.
### 11.	Расскажите подробно как переопределяются/перегружаются методы классов наследников.
### 12.	JVN, JRE, JDK.
### 13.	Расскажите что такое classpath java, общее правило именования пакетов java.
### 14.	Расскажите про интерфейсы Comparator, Comparable и их применение.
### 15.	Расскажите про класс String, пул строк.
### 16.	Расскажите про варианты использования зарезервированных слов таких как super, this, class, instance of.
### 17.	java массивы, к какому типу относится, какие есть особенности можно ли создать 0 длинны, могут ли расширяться.
### 18.	Назовите этапы создания/запуска блоков/конструкторов класса при наследовании.
### 19.	Расскажите какое будет поведение если внутри цикла вызвать оператор break/continue.
### 20.	Что такое Generic.
### 21.	Расскажите про такое зарезервированное слово как final, к чему применяется как используется.
### 22.	Рассказать про Optional.
### 23.	Что описывает и показывает Big O нотация как высчитывается, что фактически измеряется, привести примеры.
### 24.	Основные алгоритмы сортировки знать/поймать принцип работы.
### 25.	Пузырьковая сортировка, сложность, что по памяти.
### 26.	Сортировка выбором, сложность, что по памяти.
### 27.	Сортировка вставкой, сложность, что по памяти.
### 28.	Быстрая сортировка, сложность, что по памяти.
### 29.	Сортировка слиянием, сложность, что по памяти.
### 30.	Жадный алгоритм.
### 31.	Бинарный поиск.
### 32.	Алгоритмы поиска пути: обход в глубину, обход в ширину.
### 33.	Какие структуры данных вы знаете?
### 34.	Массивы: достоинства недостатки
### 35.	Связанные списки: достоинства недостатки временная сложность добавления/поиск/удаления элемента.
### 36.	Стек: достоинства, недостатки, временная сложность добавления/поиск/удаления элемента.
### 37.	Очередь: достоинства, недостатки, временная сложность добавления/поиск/удаления элемента.
### 38.	Деревья: достоинства, недостатки, временная сложность, добавления/поиск/удаления элемента.
### 39.	На какие основные группы можно поделить типы данных?
### 40.	Какие примитивные типы вы знаете?
### 41.	Что вы знаете о преобразовании примитивных типов данных, есть ли потеря данных, можно ли преобразовать логический тип?
### 42.	Какими значениями инициализируются переменные по умолчанию?
### 43.	Как передается значение переменной (по ссылке/значению)?
### 44.	Что вы знаете про классы обертки?
### 45.	Определение коллекции.
### 46.	Преимущества использования коллекций.
### 47.	Какие объекты можно хранить в коллекциях.
### 48.	Иерархия коллекций.
### 49.	Отличия вектора от ArrayList.
### 50.	Что знаете об коллекциях типа List как добавляется элемент\расширяется коллекция?
### 51.	Что знаете об коллекциях типа Set?
### 52.	Что знаете об коллекциях типа Queue?
### 53.	Что знаете об коллекциях типа Map и их принципиальное отличие?
### 54.	Назовите основные реализации List, Set, Map.
### 55.	Что общего у ArrayList\LinkedList, когда какой лучше использовать?
### 56.	Расскажите про HashSet.
### 57.	Расскажите про TreeSet/как сортируются элементы.
### 58.	Как задается порядок следования объектов в коллекции, как отсортировать коллекцию.
### 59.	Iterator. Как его получить(). Его методы: что и зачем?
### 60.	Iterable - что за зверь? Что за контракт описывает.
### 61.	Коллекция 10 элементов.Вызываю 9x Iterator.hasNext а затем Iterator.next. Что вернется.
### 62.	Как перебрать все ключи значения Map (можно ли через Iterable)?
### 63.	Разница Iterator, Enumerator, ListIterator.
### 64.	В каких случаях может быть выброшено ConcurrentModificationException?
### 65. Что такое Stream API?
### 66. Каковы основные преимущества использования Stream API?
### 67. Какие основные операции доступны в Stream API?
### 68. Как можно объединять несколько Stream с помощью Stream API?
### 69. Как использовать Stream API для обработки ошибок?
### 70. Как использовать методы фильтрации в Stream API, что принимает/возвращает?
### 71. Как применять Collectors.groupingBy() Stream API, что принимает/возвращает?
### 72. Как можно использовать Stream API для преобразования одного типа данных в другой, например, int[] {1,2,3}?
### 73. Отличия flatMap от Map?
### 74. Как работать с параллельными потоками с помощью Stream API?
### 75. Как использовать метод forEach в Stream API? - что принимает/возвращает?
### 76. Как использовать метод peek в Stream API? - что принимает/возвращает?
### 77. Как работает метод reduce в Stream API? - что принимает/возвращает? Варианты и методы.
### 78. Как создать бесконечный поток с помощью Stream API?
### 79. Какие ограничения есть у Stream API?
### 80. Как передать переменную в стрим что с ней можно сделать?
### 81. Как создать Optional?
### 82. Отличие Optional of() от Nullable().
### 83. В чем отличие методов ifPresent и orElse в контексте Optional?
### 84. Каким образом можно объединить два Optional в один, используя метод join?
### 85. Что проверяет ifPresent Optional?
### 86. Каким образом можно преобразовать Stream в массив или коллекцию?
### 87. В чём отличие методов orElseGet и orElse?
### 88. Каким образом можно реализовать обработку ошибок с использованием Optional и метод orElseThrow?
### 89. Какова иерархия исключений?
### 90. Дайте определение понятию “исключение”.
### 91. Какая конструкция используется в Java для обработки исключений?
### 92. Можно/нужно ли обрабатывать ошибки JVM?
### 93. Какие существуют способы обработки исключений?
### 94. О чем говорит ключевое слово throws?
### 95. В чем особенность блока finally? Всегда ли он исполняется?
### 96. Когда блок finally не будет выполнен?
### 97. Может ли не быть ни одного блока catch?
### 98. Что вы знаете об (checked/unchecked) исключениях?
### 99. Может ли один блок catch отлавливать несколько исключений (с одной и разных веток наследований порядок блоков исключений)?
### 100. Особенность RuntimeException.
### 101. Как выбрать свой: checked/unchecked?
### 102. Какой оператор позволяет принудительно выбросить исключение?
### 103. Есть ли дополнительные условия к методу, который потенциально может выбросить исключение?
### 104. Может ли метод main выбросить исключение во вне и если да, то где будет происходить обработка данного исключения?
### 105. Если оператор return содержится и в блоке catch и в finally, какой из них “главнее”?
### 106. Что вы знаете о OutOfMemoryError, SQLException? К какому типу checked или unchecked оно относится, почему?
### 107. Error? В каком случае используется Error (пример Error’а).
