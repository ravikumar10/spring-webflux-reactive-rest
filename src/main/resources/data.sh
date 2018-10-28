for i in {1..10000}; do 
curl -X POST http://localhost:8080/tweets  -H 'content-type: application/json' -d ' {"id":"59ba5587d2b2a85f93b8ece7'$i'","text":"tweet'$i'","createdAt":1505383814847}'
done

