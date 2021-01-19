class Car constructor(
    var maxSpeed: Int,
    var color: String,
    var fuel: Float
) {

    init{
        if(maxSpeed <= 0){
            error("Error")
        }
    }

    fun movie(){

    }

}