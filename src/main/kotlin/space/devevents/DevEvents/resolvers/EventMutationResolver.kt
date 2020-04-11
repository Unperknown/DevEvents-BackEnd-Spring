package space.devevents.DevEvents.resolvers

import graphql.kickstart.tools.GraphQLMutationResolver
import space.devevents.DevEvents.entity.Event
import space.devevents.DevEvents.repository.EventRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class EventMutationResolver(val eventRepository: EventRepository) : GraphQLMutationResolver {
    fun addEvent(event: Event): Event {
        eventRepository.save(event)

        return event
    }

    fun removeEvent(id: String): Optional<Event> {
        val event = eventRepository.findById(id)
        eventRepository.deleteById(id)

        return event
    }
}