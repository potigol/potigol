#!/bin/bash

gnome-terminal --title="$1 - Potigol" -x bash -c "java -jar potigol.jar -w -c $1; printf 'Pressione enter para sair ...'; read; exit 0; exec $SHELL";
