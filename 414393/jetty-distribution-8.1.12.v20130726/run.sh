#! /bin/bash
JAVA_OPTIONS="-XX:+UseRedis -XX:-Inline" JAVA=$JAVA_PLUS  ./bin/jetty.sh run
