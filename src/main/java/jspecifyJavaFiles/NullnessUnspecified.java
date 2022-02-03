package jspecifyJavaFiles;

import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * <b>WARNING:</b> This is not the final class name or package name for this annotation. We are not
 * even sure if an annotation like this one will make the 1.0 release.
 *
 * <p>These annotations exist only as a skeleton for the final product. At this point, we are not
 * even building prototypes that use them.
 */
@Documented
@Target(TYPE_USE)
@Retention(RUNTIME)
public @interface NullnessUnspecified {}