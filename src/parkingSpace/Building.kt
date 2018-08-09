package parkingSpace

public class Building{
    val owner="Default owner";
    val address="Default address";
    var levels: ArrayList<Level>= ArrayList();

    fun addLevel(levelToAdd: Level):Boolean{
        return true
    }

    fun getLevel(levelId: Int):Level{
        return Level;
    }

    fun canLevelBeCreated(nameOfNewLevel:String,idOfNewLevel:Int, colorOfNewLevel:String,nameOfFile:String):Boolean{
        return true
    }

    fun createLevel(nameOfNewLevel:String,idOfNewLevel:Int, colorOfNewLevel:String,nameOfFile:String){

    }
    fun filterColor(color: String): Level? {
        val color = levels.filter { it.getColor() == color }
        return  color[0]
    return null
    }


}