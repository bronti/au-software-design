Понравилось: из уже существующих файлов пришлось потрогать только CommandFactory (кроме изменений, связанных со странностями работы джавы при смене директории).  Описание работы комманд можно задать прямо в команде (usage).



Не понравилось: приходиться самостоятельно проверять количество аргументов внутри функции run. Run возвращает Stream, который каждый раз приходиться конструировать из строки.