package space.devevents.DevEvents.repository

import space.devevents.DevEvents.entity.Event
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EventRepository : MongoRepository<Event, String>