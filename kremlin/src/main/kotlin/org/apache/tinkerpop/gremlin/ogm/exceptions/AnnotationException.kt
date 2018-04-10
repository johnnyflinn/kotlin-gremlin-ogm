package org.apache.tinkerpop.gremlin.ogm.exceptions


internal open class AnnotationException(description: String) :
        ClientException("Annotation Exception - There was a problem with how you annotated your objects:\n$description")

