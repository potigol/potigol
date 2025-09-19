#!/bin/bash

# Script to run Potigol tests
# Usage: ./run_tests.sh [number_of_test_cases]

cd "$(dirname "$0")"

# Set up PATH for sbt
export PATH="/tmp/sbt/bin:$PATH"

# Default number of test cases to run
NUM_TESTS=${1:-3}

echo "Running Potigol error tests (first $NUM_TESTS test cases)..."
echo "=========================================================="

# Update the test file to run the specified number of tests
sed -i "s/erros\.take([0-9]*)/erros.take($NUM_TESTS)/" src/test/scala/br/edu/ifrn/potigol/TesteErros.scala

# Compile and run the tests
/tmp/sbt/bin/sbt "Test/runMain br.edu.ifrn.potigol.TesteErros"