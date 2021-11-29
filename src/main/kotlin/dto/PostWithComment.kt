package dto

data class PostWithComment(
    val post: Post,
    val comment: List<Comment>
)