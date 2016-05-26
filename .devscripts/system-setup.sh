#!/usr/bin/env bash
sudo add-apt-repository ppa:webupd8team/java -y
sudo apt-get -y update
sudo apt-get -y upgrade
sudo apt-get install oracle-java8-installer zookeeper wget
wget https://www.apache.org/dyn/closer.cgi?path=/kafka/0.10.0.0/kafka_2.11-0.10.0.0.tgz
tar -xzf kafka_2.11-0.10.0.0.tgz
cd kafka_2.11-0.10.0.0
nohup bin/kafka-server-start.sh config/server.properties &
nohup java -jar selenium-server-standalone-2.53.0.jar -role hub -hubConfig grid2-hub-default-config.json | tee grid2.hub.log &
nohup java -jar selenium-server-standalone-2.53.0.jar -role node -nodeConfig grid2-node-default-config.json | tee grid2.node.log &