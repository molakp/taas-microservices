# taas-microservices-eureka

|Servizio| Funzione| Porta|
|----------|----------|----------|
|eureka| Discovery|  http://localhost:8761/ |

- API service: il servizio principale che fa tutto, http://localhost:8080/
- Position service: il serviio delle posizioni http://localhost:8081/
- Api Gateway: riunisce tutti i servizi sotto un unico url http://localhost:9191/

Per avviarli occhio alle rispettive versioni, JAVA 11 per i primi 3 e java 18 per api gateway.



KUBERNETES
Installazione: https://kubernetes.io/docs/tasks/tools/install-kubectl-windows/

