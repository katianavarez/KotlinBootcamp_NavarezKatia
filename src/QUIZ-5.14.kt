import Buildings.BaseBuildingMaterial

class Building<out T: BaseBuildingMaterial>(val buildingMaterial: T){
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * buildingMaterial.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}