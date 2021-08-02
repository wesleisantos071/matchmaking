insert players
curl -i -H "Content-Type:application/json" -d "{\"playerName\": \"Frodo\", \"playerLevel\": 1}" http://localhost:8080/player
curl -i -H "Content-Type:application/json" -d "{\"playerName\": \"Bilbo\", \"playerLevel\": 1}" http://localhost:8080/player
curl -i -H "Content-Type:application/json" -d "{\"playerName\": \"Gendalf\", \"playerLevel\": 5}" http://localhost:8080/player
curl -i -H "Content-Type:application/json" -d "{\"playerName\": \"Gimli\", \"playerLevel\": 5}" http://localhost:8080/player
