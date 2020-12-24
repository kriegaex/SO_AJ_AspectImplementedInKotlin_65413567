package de.scrum_master.stackoverflow.q65413567.aspect

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before

@Aspect
class MyAspect {
  @Before("@annotation(MyAnnotation) && execution(* *(..))")
  fun myAdvice(jp: JoinPoint) {
    println(jp)
  }
}
