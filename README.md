# Backlog
- [x] Task 1. Сервис для  работы с курсором.
1. Где находится курсор
2. Клик курсора
3. Движение курсора по списку из точек

- [x] Task 2. Сервис генерации траектории движение курсора.
1. Генерация точек для имитации кривой движения, в приделах.
2. Генерация траектории по X и по Y
3. Возвращать правильно отсортированный список точек, траекторию.

- [ ] Task 3. Генерация координат для отслеживания на экране RedClickField
1. Подсчет точки по разрешению экрана

- [ ] Task 4. Работа с изображением
1 Получить скриншот экрана / Значения в точке
2 Проверка точки отслеживания, возвращать результат

- [ ] Task 5. Генерация случайного поведения
1. Принимает в себя два значения "от" и "до". Возвращает случайное число между ними. Используется для случайной задержки между кликами.
2. Смещение точек от идеальной, "от" и "до". Возвращается точку, рядом с идеальной, всегда случайное. Для генерации точки финального клика. Зависит от разрешения. Текущей точки. Приделы смещения.

- [ ] Task 6. Контроль нажатия кнопок для включения/выключения бота.

- [ ] Task 7. Звук включения/выключения бота

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

