package space.devevents.DevEvents.resolvers

import graphql.kickstart.tools.GraphQLQueryResolver
import space.devevents.DevEvents.entity.Requestor
import space.devevents.DevEvents.repository.RequestorRepository
import org.springframework.stereotype.Component

@Component
class RequestorQueryResolver(val requestorRepository: RequestorRepository) : GraphQLQueryResolver {

    fun requestors(): List<Requestor> {
        return requestorRepository.findAll()
    }
}