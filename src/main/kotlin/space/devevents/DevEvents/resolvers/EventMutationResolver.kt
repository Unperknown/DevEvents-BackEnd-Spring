package space.devevents.DevEvents.resolvers

import graphql.kickstart.tools.GraphQLMutationResolver
import space.devevents.DevEvents.entity.Event
import space.devevents.DevEvents.repository.EventRepository
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.stereotype.Component
import java.util.*

@Component
class EventMutationResolver(val eventRepository: EventRepository, private val mongoOperations: MongoOperations) : GraphQLMutationResolver {
    fun addEvent(event: Event): Event {
        eventRepository.save(event)

        return event
    }

    fun updateEvent(id: String, event: Event): Event {
        val _event = eventRepository.findById(id)
        _event.ifPresent {
            it.title = event.title
            it.location = event.location
            it.date = event.date
            it.price = event.price
            it.hyperLink = event.hyperLink
            it.imageLink = event.imageLink
            it.isValid = event.isValid

            eventRepository.save(it)
        }

        return _event.get()
    }

    fun removeEvent(id: String): Optional<Event> {
        val event = eventRepository.findById(id)
        eventRepository.deleteById(id)

        return event
    }
}