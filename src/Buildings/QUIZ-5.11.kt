package Buildings

open class BaseBuildingMaterial {
    open val numberNeeded = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

// MODIFICADO PARA EL QUIZ 5.14
//class Building<T: BaseBuildingMaterial>(val material: T)
class Building<out T: BaseBuildingMaterial>(val buildingMaterial: T){
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * buildingMaterial.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build()
    val brickBuilding = Building(Brick())
    brickBuilding.build()
}