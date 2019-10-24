//package spring.aspect;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//import java.util.logging.Logger;
//
//@Aspect
//@Component
//public class CRMLoggingAspect {
//
//    private Logger logger = Logger.getLogger(getClass().getName());
//
//    @Pointcut("execution(* spring.controller.*.* (..))")
//    private void forControllerPackage(){}
//
//    @Pointcut("execution(* spring.service.*.* (..))")
//    private void forServicePackage(){}
//
//    @Pointcut("execution(* spring.dao.*.* (..))")
//    private void forDaoPackage(){}
//
//    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
//    private void forAppFlow(){
//    }
//
//    @Before("forAppFlow()")
//    public void before(JoinPoint joinPoint){
//
//        String method = joinPoint.getSignature().toShortString();
//        logger.info("--> in @Before: calling method: " + method);
//
//        Object [] args = joinPoint.getArgs();
//        for (Object tmpArg : args){
//            logger.info("--||-> argument: " + tmpArg);
//        }
//    }
//
//    @AfterReturning(
//            pointcut = "forAppFlow()",
//            returning = "result")
//    public void afterReturning(JoinPoint joinPoint, Object result){
//
//        String method = joinPoint.getSignature().toShortString();
//        logger.info("--> in @AfterReturning: from method: " + method);
//        logger.info("-|--> result: " + result);
//    }
//
//}
