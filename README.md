# grid_docker
Steps:
1. Clone this repo and navigate to the project directory via command line.
2. run docker-compose.yaml file using command 'docker-compose up'
    This will create 3 containers:
      1. grid hub
      2. chrome node
      3. firefox node
3. when the containers are up and running run the testng.xml file
      This will execute the test cases in chrome and firefox parallely.
