//fun main() {
//
//  print("File Extension name: ")
//  val fileName: String = readln()
//  val extension: String = fileName.substringAfterLast(".", "Unknown File Extension")
//  val mediaType: String = when (extension.lowercase()) {
//      "jpg", "jpeg" -> "Image (JPEG)"
//      "png" -> "Image (PNG)"
//      "mp3" -> "Audio (MP3)"
//      "mp4" -> "Video (MP4)"
//      "txt" -> "Text file"
//      "pdf" -> "PDF document"
//      else -> "Unknown media type"
//    }
//    println("The media type is: $mediaType")


fun main(){
    //1.Input from User

    print("File extension name: ")
    val fileExtensionName: String = readln()
    //2.Media Type Converter
    val mediaType: String = mediaTypeConverter(fileExtensionName)
    //Print Media Type to the user
    print("The media Type of $fileExtensionName is $mediaType")
}

fun mediaTypeConverter(fileExtensionName: String): String {
    //3.Get extension
    val extension: String = getExtensionName(fileExtensionName)
    //5.Get MediaType
    val mediaType: String = when (extension.lowercase()) {
        "jpg", "jpeg" -> "Image (JPEG)"
        "png" -> "Image (PNG)"
        "mp3" -> "Audio (MP3)"
        "mp4" -> "Video (MP4)"
        "txt" -> "Text file"
        "pdf" -> "PDF document"
        else -> "Unknown media type"
    }
    //6.Return Media Type
    return mediaType
}

fun getExtensionName(fileExtensionName: String):String {
    //4.Return extension name
    return fileExtensionName.substringAfterLast(".", "Unknown File Extension")
}