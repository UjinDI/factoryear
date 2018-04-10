Программа описывает работу фабрики по выпуску автомобилей. 
Конструкция автомобиля описывает: кузов (тип,цвет, кол-во дверей, VIN), 
двигатель (тип, объем, мощность кВт, серийный номер), трансмиссию (тип, серийный номер). 
Программа  выполнена по архитектуре EAR упаковки с использованием менеджера зависимостей и систему 
сборки Maven (версия 3 и выше) с возможностью деплоя на сервер приложения (при помощи maven плагина). 

В качестве ORM системы, используется библиотека Hibernate. 
Технология спецификаций написания кода EJB 3.1. 

Функции управляющих бинов: 
1. возможность создавать, модифицировать и удалять каждый из вышеописанных узлов в отдельности
2. собирать из созданных узлов автомобиль в целом, контролировать типы связи объектов в соответствии с реальным миром 
(нельзя один и тот же двигатель устанавливать в 2 разные машины и т.д.)
3. просматривать результат получившегося автопарка с возможностью постраничного вывода и поддержкой поиска и сортировки (поиск, сортировка и постраничный вывод следует поддержать для всех списков, например, работа
с компонентами автомобиля), иметь возможность разбирать машины на запчасти, для повторного использования. 
