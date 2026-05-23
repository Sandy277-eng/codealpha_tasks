# Task 4 — Docker Web Server

A web server running inside a Docker container using Nginx.

## Project Structure
```
task4-docker/
├── Dockerfile          ← Build instructions
├── nginx.conf          ← Web server configuration
├── website/
│   └── index.html      ← Your web page
└── README.md
```

## Commands

### Build the image
```
docker build -t my-webserver .
```

### Run the container
```
docker run -d -p 8080:80 --name webserver my-webserver
```

### Open in browser
```
http://localhost:8080
```

### Check container status
```
docker ps
```

### View logs
```
docker logs webserver
```

### Open shell inside container
```
docker exec -it webserver sh
```

### Stop and remove
```
docker stop webserver
docker rm webserver
```

## Container Lifecycle
| Command | Effect |
|---|---|
| `docker run` | Create + start container |
| `docker stop` | Gracefully stop |
| `docker start` | Start stopped container |
| `docker restart` | Stop then start |
| `docker rm` | Delete container |
| `docker rmi my-webserver` | Delete image |
