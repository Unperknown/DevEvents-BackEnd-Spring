package space.devevents.DevEvents.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import space.devevents.DevEvents.entity.Crawled

@Repository
interface CrawledRepository : MongoRepository<Crawled, String>