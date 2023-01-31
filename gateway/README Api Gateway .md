*Questo servizio svolge il compito di API Gateway*
- Porta: 9191
- URL: http://localhost:9191
- Scopo: tutte le chiamate vengono fatte a lui, lui poi le indirizza al servizio giusto
- Se si aggiunge un servizio nuovo va creata una route, cioè
bisogna dire al gateway che se arriva una chiamata a /api/nuovoServizio va indirizzata al servizio nuovoServizio:portaNuovoServizio

- La route si crea nella classe principale del programma, cioè in ApiGatewayApplication.java
- Ovviamente i servizi sono sempre disponibili alla loro porta, però dal frontend non chiamaeremo tante porte 
diverse quanti sono i servizi ma solo una la 9191