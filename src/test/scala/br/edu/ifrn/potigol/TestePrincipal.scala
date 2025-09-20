package br.edu.ifrn.potigol

object TestePrincipal extends App {
  
  println("=== Testing Principal.test method ===")
  
  // Test case 1: Simple output
  val test1 = Principal.test("escreva \"Hello World\"", "")
  println("Test 1 - Simple output:")
  println(s"Result: $test1")
  println()
  
  // Test case 2: Input/Output
  val test2 = Principal.test("nome = leia_texto\nescreva \"Olá \" + nome", "João")
  println("Test 2 - Input/Output:")
  println(s"Result: $test2")
  println()
  
  // Test case 3: Mathematical operation
  val test3 = Principal.test("a = 5\nb = 3\nescreva a + b", "")
  println("Test 3 - Mathematical operation:")
  println(s"Result: $test3")
  println()
  
  println("=== Principal.test method tests completed ===")
}