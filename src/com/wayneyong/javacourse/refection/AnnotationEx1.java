package com.wayneyong.javacourse.refection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Annotations -
 * <p>
 * Provide a form of metadata about the class/field/method.
 * They don't have direct affect ont the code. Mostly used
 * by framework components.
 * <p>
 * Several uses include
 * - Provide information for the compiler
 * - Tools can use it to get additional info such as code generators, json serialization
 * - Some annotations are available to be processed at runtime
 * <p>
 * Example 1 - JPA entities
 *
 * @Entity
 * @Table(name = "User")
 * <p>
 * public class User{
 * @Id
 * @GeneratedValue(strategy = GenerationType.IDENTITY)
 * private Long id;
 * <p>
 * private String name;
 * ....
 * ....
 * }
 * <p>
 * <p>
 * Example 2 - Spring
 * @Service public class AccountService{
 * @Autowired NotificationService notificationService;
 * <p>
 * ...
 * }
 */

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();

    String version() default "";

    String description() default "";
}

//annotation is similar to comment, but one is giving
// information while another is for documentation
@Author(name = "Wayne", version = "1.0", description = "Some account service")
class AccountService {
}

public class AnnotationEx1 {
    public static void main(String[] args) {

        Class clazz = AccountService.class;
        Author author = (Author) clazz.getDeclaredAnnotation(Author.class);
        System.out.println("Author name - " + author.name());
        System.out.println("Version - " + author.version());
        System.out.println("Description - " + author.description());
    }
}
