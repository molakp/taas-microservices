# taas-microservices-eureka

|Servizio| Funzione| Porta| Java |
|----------|----------|----------|----------|
|Eureka| Discovery|  http://localhost:8761/ | 11 |
|API service| Il servizio principale che fa tutto tranne posizioni | http://localhost:8080/ | 11 |
|Position | Il servizo delle posizioni | http://localhost:8081/ | 11 |
| Api Gateway | Riunisce tutti i servizi sotto un unico url | http://localhost:9191/ | 18 |

Per avviarli da IntelliJ occhio alle rispettive versioni, JAVA 11 per i primi 3 e java 18 per api gateway.

AVVIO DEL PROGETTO

*Con Docker*

Per avviare tutto insieme è meglio usare Docker
Andare su docker-compose.yaml e dovrebbe uscire il pulsante per avviare tutto. Docker compose va a prendersi i docker file dei singoli servizi e li esegue  con le specifiche che gli sono date
 
*Senza Docker*

 Per avviare i singoli servizi senza docker  ( per fare sviluppo veloce e robe così ) fare come di solito ma occhio alla versione di Java che si usa dei setting di Intellij (questo problema  non c'è con Docker)



KUBERNETES
Installazione: Docker Desktop installa già tutto anche per Kubernetes non serve fare altro

Se le immagini docker sono già state create andare nella cartella kubernetes e fare da Linux:
 kubectl apply -f nome-file-deployment.yaml
