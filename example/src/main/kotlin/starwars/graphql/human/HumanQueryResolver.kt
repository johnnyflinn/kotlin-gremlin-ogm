package starwars.graphql.human

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.apache.tinkerpop.gremlin.ogm.GraphMapper
import org.springframework.stereotype.Component
import starwars.models.Human

@Component
class HumanQueryResolver(
        private val graph: GraphMapper
) : GraphQLQueryResolver {

    fun human(name: String): Human? = graph.loadAll<Human>().find { it.name.full == name }
}
