package com.flipkart.hbaseobjectmapper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Maps an entity class to a table in HBase
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface HBTable {
    /**
     * Name of the HBase table
     *
     * @return Name of the HBase table
     */
    String name();


    /**
     * Column families and their specs
     *
     * @return Column families and their specs
     */
    Family[] families() default {};
}
