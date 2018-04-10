package org.apache.tinkerpop.gremlin.ogm.exceptions

import kotlin.reflect.KClass

internal class DuplicateID(
        kClass: KClass<*>,
        name1: String?,
        name2: String?,
        annotationType: AnnotationType
) : AnnotationException("Only one $annotationType may be annotated with @ID. " +
        "${annotationType.name.capitalize()}: $name1, $name2. Class: $kClass.")
