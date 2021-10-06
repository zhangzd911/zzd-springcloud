#!/bin/sh
export JAVA_HOME=/usr/java/jdk1.8.0_71
mvn clean package install -Dmaven.test.skip=true
export JAVA_HOME=/usr/java/jdk1.7.0_79
