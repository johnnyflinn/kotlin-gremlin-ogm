package org.apache.tinkerpop.gremlin.ogm.exceptions

import kotlin.reflect.KClass

internal class EmptyPropertyName(
        kClass: KClass<*>
) : AnnotationException(
        description = "@Property.name may not be an empty string. Class: $kClass"
)
