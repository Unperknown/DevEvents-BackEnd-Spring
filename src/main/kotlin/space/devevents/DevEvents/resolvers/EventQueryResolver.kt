package space.devevents.DevEvents.resolvers

import graphql.kickstart.tools.GraphQLQueryResolver
import space.devevents.DevEvents.entity.Event
import space.devevents.DevEvents.repository.EventRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class EventQueryResolver(val eventRepository: EventRepository) : GraphQLQueryResolver {
    fun events(): List<Event> {
        return eventRepository.findAll()
    }

    fun event(id: String): Optional<Event> {
        return eventRepository.findById(id)
    }
}