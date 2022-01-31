#Backlog
#Services
1. Класс работы с курсором
1.1 Где находится курсор
1.2 Клик курсора
1.3 Движение курсора по списку из точек

2. Класс генерации траектории движение курсора
2.1 Генерация точек для имитации кривой движения, в приделах.
2.2 Генерация траектории по X и по Y
2.3 Возвращать правильно отсортированный список точек, траекторию.

3. Генерация координат для отслеживания на экране RedClickField
3.1 Подсчет точки по разрешению экрана

4. Класс работа с изображением
4.1 Получить скриншот экрана
4.2 Проверка точки отслеживания, возвращать результат

5. Генерация случайного поведения
5.1 Принимает в себя два значения "от" и "до". 
Возвращает случайное число между ними. Используется для случайной задержки между кликами.
5.2 Смещение точек от идеальной, "от" и "до".
Возвращается точку, рядом с идеальной, всегда случайное. Для генерации точки финального клика.
Зависит от разрешения. Текущей точки. Приделы смещения.

6. Контроль нажатия кнопок для включения/выключения бота.

7. Звук включения/выключения бота

#Core
1. Подключить зависимости Spring
2. Использовать многопоточность для работы: 
"кликаем и двигаем", "слушаем кнопки для включения выключения бота" и т.д
3. Задать параметры отдельным property file.
4. Написание тестов на Service функционал
5. Simple jFrame для работы с приложение
6. Наладить процесс создание самодостаточного приложения для запуска из командной строки
7. Создание инструкции для работы пользователей
8. Логирование

