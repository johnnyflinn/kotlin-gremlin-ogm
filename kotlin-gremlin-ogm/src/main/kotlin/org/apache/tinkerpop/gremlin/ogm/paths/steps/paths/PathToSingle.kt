package org.apache.tinkerpop.gremlin.ogm.paths.steps.paths

import org.apache.tinkerpop.gremlin.ogm.paths.steps.Step

internal data class PathToSingle<FROM, MIDDLE, TO>(
        override val first: Step.ToSingle<FROM, MIDDLE>,
        override val last: Step.ToSingle<MIDDLE, TO>
) : Path.ToSingle<FROM, MIDDLE, TO>
