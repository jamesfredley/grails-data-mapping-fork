package grails.gorm.services

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * Allow specifying the query to execute
 *
 * TODO: implement support for string queries
 *
 * @author Graeme Rocher
 * @since 6.1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Query {
    String value()
}