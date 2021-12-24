# HeadFirst_DesignPatterns
Паттерн декоратор - это структурный паттерн, который позволяет добавлять новое поведение объектам заворачивая их в классы обёртки.

•	Объект можно завернуть в 1 или несколько декораторов.

•	Декоратор имеет тот же тип что и декорируемые объекты.

•	Декоратор добавляет свое поведение до или после делегирования операций декорируемому объекту, выполняющему остальную работу.

![Decorator](https://user-images.githubusercontent.com/56963305/147336873-f67acc71-6763-47fc-9ee7-a43262d558bc.png)
Я реализвал этот паттерн основываясь на примере из книги Head First: паттерны проектирования.
В коде представлены классы различных видов кофе (американо, капучино, латте) и классы различных топиногов для них(молоко, сахар, сироп).
Нам бы очень не хотелось создавать множество классов по типу AmericanoWithMilk, AmericanoWithMilkAndSugar ...
Поэтому для вычисления стоимости и описания нашего заказа мы пользуемся паттерном декоратор.
Я создал класс BaseDecorator, который наследует базовый тип Coffee.
Внутри BaseDecorator у нас есть ссылка типа Coffee на объект который мы будем оборачивать нашими декораторами.
Фактически декоратор делегирует выполнение своего метода объекту который он оборачивает и добавляет к результату своё поведение.
К примеру если мы обернём Latte в декоратор Syrop, то Syrop при расчёте стоимости сначала спросит стоимость у Latte, а потом к ней добваит стоимость сиропа. 
