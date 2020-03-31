# date_calendar_java
Trabalhar com Date e Calendar em Java

### classes
- Date
  - Representa um INSTANTE
  - Pacote java.util
  - https://docs.oracle.com/javase/10/docs/api/java/util/Date.html
- SimpleDateFormat sdf
  - https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html
  - Define formatos para conversão entre Date e String
  - dd/MM/yyyy -> 23/07/2018
  - dd/MM/yyyy HH:mm:ss -> 23/07/2018 15:42:07
  - Date contractDate = sdf.parse(value in string);
- Padrão ISO 8601 e classe Instant
  - Formato: yyyy-MM-ddTHH:mm:ssZ
  - Exemplo: "2018-06-25T15:42:07Z"
  - Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
  Calendar
  - classe abstrata que fornece métodos para converter a data entre um instante específico no tempo e um conjunto de campos do calendário como MONTH, YEAR, HOUR 
  - Calendar.getInstance(): return a Calendar instance based on the current time in the default time zone with the default locale.
  - Calendar.getInstance(TimeZone zone)
  - Calendar.getInstance(Locale aLocale)
  - Calendar.getInstance(TimeZone zone, Locale aLocale)
