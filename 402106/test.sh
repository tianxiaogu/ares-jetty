#! /bin/bash

D=0123456789ABCDEF
URI=

for (( i = 0; i < 16 ; i ++ ))
do
    URI="${URI}${D}"
done

curl -v http://localhost:8080/${URI}
