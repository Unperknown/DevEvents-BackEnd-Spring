package space.devevents.DevEvents.resolvers

import graphql.kickstart.tools.GraphQLQueryResolver
import space.devevents.DevEvents.entity.Crawled
import org.springframework.stereotype.Component
import space.devevents.DevEvents.repository.CrawledRepository
import java.util.*

@Component
class CrawledQueryResolver(val crawledRepository: CrawledRepository) : GraphQLQueryResolver {
    fun crawleds(): List<Crawled> {
        return crawledRepository.findAll()
    }

    fun crawled(id: String): Optional<Crawled> {
        return crawledRepository.findById(id)
    }
}