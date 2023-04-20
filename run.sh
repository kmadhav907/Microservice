#!/bin/bash
set -e
cd `dirname $0`
r=`pwd`
echo $r

echo "Starting Services"

echo "Running Eureka Registry"
cd $r/eurekaserver
./mvnw spring-boot:run &
echo "Running API GATEWAY"
cd $r/apigateway
./mvnw spring-boot:run &
echo "Running User Service"
cd $r/userservice
./mvnw spring-boot:run &
echo "Running Chat Service"
cd $r/chatservice
./mvnw  spring-boot:run &
echo "Running Cron Service"
cd $r/crons
./mvnw spring-boot:run &
echo "Running Documentation Service"
cd $r/documentation
./mvnw  spring-boot:run
