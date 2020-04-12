package space.devevents.DevEvents.resolvers

import graphql.kickstart.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component
import space.devevents.DevEvents.entity.Crawled
import space.devevents.DevEvents.entity.Requestor
import space.devevents.DevEvents.repository.CrawledRepository
import space.devevents.DevEvents.repository.RequestorRepository

@Component
class CrawledMutationResolver(val crawledRepository: CrawledRepository, val requestorRepository: RequestorRepository) : GraphQLMutationResolver {
    fun addCrawleds(crawled: Crawled, requestor: Requestor): Crawled {
        crawledRepository.save(crawled)

        if (requestor != null) {
            requestorRepository.save(requestor)
        }

        return crawled
    }
}