package parkingSpace


import javax.xml.ws.soap.Addressing

public class Level{
    val id=0;
    val name="";
    val color="";
    var walls: ArrayList<Wall> = ArrayList();
    var parkingSlots: Arraylist<parkingSpace>=ArrayList();




    fun addParkingSlot(slotTag:String,slotNew_X:Int,slotNew_Y:Int):Boolean{
        return true
    }

    fun isParkingSlotEmpty(slot_X:Int,slot_Y:Int):Boolean{
        return true
    }

    fun getColor():String{
        return this.color
    }

    fun getName():String{
        return this.name
    }
    fun getId():Int{
        return this.id
    }
}