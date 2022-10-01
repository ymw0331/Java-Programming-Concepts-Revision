package com.wayneyong.javacourse.generics;

/**
 * Type Erasure -
 * - Generics introduced to provide tighter type checks at compile
 * time
 * - To implement generics Java compiler applies type erasure
 *      - Replaces unbounded type parameters with Object types
 *          OR if bounded then it replaces with bounded types
 *      - Inserts type casts if necessary for type safety.
 *      - Generates bridge methods if needed.
 *
 * Case 1 - For unbounded Type Parameter
 *
 * class Demo<T>{
 *     private T value;
 *     public void setValue(T value){
 *         this.value = value;
 *     }
 *     public T getValue(){
 *         return this.value;
 *     }
 * }
 *
 * Class after compilation
 * class Demo{
 *     private Object value;
 *     public void setValue(Object value){
 *         this.value = value;
 *     }
 *     public Object getValue(){
 *         return this.value;
 *     }
 * }
 *
 * Case 2 - Type erasure for bounded type parameters
 * class Demo<T extends Number>{
 *      private T value;
 *      public void setValue(T value){
 *          this.value = value;
 *      }
 *      public T getValue(){
 *          return this.value;
 *      }
 * }
 *
 * Class after compilation
 *
 * class Demo{
 *     private Number value;
 *     public void setValue(Number value){
 *         this.value = value;
 *     }
 *     public Number getValue(){
 *         return this.value;
 *     }
 * }
 * */

