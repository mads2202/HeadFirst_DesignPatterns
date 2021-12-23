# HeadFirst_DesignPatterns
На этой ветке реализован паттерн Observer.
Суть паттерна состоит в том что наблюдаемый объект сообщает своим наблюдателям об изменениях которые в нём происходят или о своих действиях.
Этот паттерн очень похож на газёту. Газета сообщает соим подписчикам об интересных новостях если подписка кончается то и газета больше не присылает новости.

![Observer](https://user-images.githubusercontent.com/56963305/147234691-8cc27da7-898c-44c1-9c29-589ff352ea5e.png)

Для того чтобы реализовать паттерн наблюдатель, мы должны создать 2 интерфейса Observer для наблюдателей и Observable для наблюдаемого объекта. Внутри интерфейса Observable мы должны задать 3 метода addObserver() для подписки наблюдателей, removeObserver() для отписки наблюдателей и notify() для того чтобы уведомлять наблюдателей о изменениях или событиях. И имплементировать эти интерфейсы в наши  классы. Так же в классе реализующем Observable важно не забыть создать список в котором он сожет хранить своих подписчиков.
Пример сделан на основе магазина и покупателей. Покупатели могут подписаться на интересующие их товары и как только они появятся в магазине в нужном количестве, покупатели смогет их купить.
