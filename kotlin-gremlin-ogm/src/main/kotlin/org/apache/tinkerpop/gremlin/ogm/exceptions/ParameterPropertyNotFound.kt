package org.apache.tinkerpop.gremlin.ogm.exceptions

import org.apache.tinkerpop.gremlin.ogm.annotations.Property
import kotlin.reflect.KClass
import kotlin.reflect.KParameter


internal class ParameterPropertyNotFound(
        kClass: KClass<*>,
        annotation: Property,
        param: KParameter
) : AnnotationException(
        "Could not find a member property for parameter $param. This library will first look " +
                "for a @Property annotation on a member property with key: ${annotation.key}, " +
                "then it will look for a member property with the same name as the parameter. Class $kClass"
)
