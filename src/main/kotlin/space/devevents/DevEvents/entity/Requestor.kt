package space.devevents.DevEvents.entity

import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document(collection = "requestors")
data class Requestor(
        var name: String
)