package space.devevents.DevEvents.entity

import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document(collection = "crawleds")
data class Crawled(
        var title: String,
        var date: String,
        var location: String,
        var price: String,
        var imageLink: String,
        var hyperLink: String,
        var isValid: Boolean
)