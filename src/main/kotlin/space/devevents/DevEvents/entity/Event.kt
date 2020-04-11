package space.devevents.DevEvents.entity

import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document(collection = "events")
data class Event(
        var title: String,
        var date: Date,
        var location: String,
        var price: Number,
        var imageLink: String,
        var hyperLink: String,
        var isValid: Boolean
)