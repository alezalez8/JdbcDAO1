## JdbcDAO1 Домашняя работа №6
#### Добавлены методы получения id сохраненного объекта, а также получение объектов по 
#### необходимым полям. Так же доработан метод getAll() получения записей, содержащие
#### пустые ячейки, такие записи при вызове игнорируются. Создан файл Clients.sql
#### для создания и заполнения таблицы разными записями. При этом создание таблицы из 
#### главного метода закоментированно (строки 17 и 26 в /case2/Main ). Для запуска 
#### необходимо из Clients.sql запустить создание таблицы и все инсерты, после этого
#### запустить сам Main из паккаджа case2. Немного изменен метод toString(), чтобы
#### уменьшить кол-во выводимой информации согласно запросу и наличию пустых полей в 
#### таблице.