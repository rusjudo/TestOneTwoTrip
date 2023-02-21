
## Автотесты для сайта https://www.onetwotrip.com


### Содержание:

- <a href="#технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#реализованные-проверки">Реализованные проверки</a>
- <a href="#запуск-из-терминала">Запуск из терминала</a>
- <a href="#allure-отчет">Allure отчет</a>


### [Технологии и инструменты](#технологии-и-инструменты)
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="logo/Java.svg">
<img width="6%" title="Selenide" src="logo/Selenide.svg">
<img width="6%" title="Selenoid" src="logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="logo/Gradle.svg">
<img width="6%" title="JUnit5" src="logo/JUnit5.svg">
<img width="6%" title="GitHub" src="logo/GitHub.svg">
<img width="6%" title="Jenkins" src="logo/Jenkins.svg">
</p>

### [Реализованные проверки](#реализованные-проверки)
* Проверка формы регистрации на наличие всех элементов
* Проверка восстановления пароля
* Проверка авторизации
* Проверка формы регистрации на наличие всех элементов
* Проверка переходов на vk, ok, mail, twitter для авторизции


### [Запуск из терминала](#запуск-из-терминала)
* #### Локальный запуск тест-кейсов
**gradle clean test**

* #### Удаленный запуск тест-кейсов
**clean test**  
-Dbrowser=${PROPERTYBROWSER}  
-DbrowserVersion=${PROPERTYVERSION}  , где  
**browser** - браузер, по умолчанию Chrome;  
**browserVersion** - версия браузера, по умолчанию 110;  
Необходимо добавить файл src/test/resources/config/credentials.properties с полями
user
password
email
passwordOneTwoTrip
videoStorage
remote


### [Allure отчет](#allure-отчет)
#### Сводные данные
![Img1](logo/mainreport.jpg)

#### Тест-кейсы
![Img2](logo/tests.jpg)

* ##### **Пример успешного прохождения тест-кейса**
![Img3](logo/success.jpg)
