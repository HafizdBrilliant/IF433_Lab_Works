package oop_00000130613_BrilliantHafizdHermawan.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("AWAS! Kamu berpapasan dengan monster: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            val (itemName, damage, rarity) = event.item
            println("HORE! Kamu mendapat loot: $itemName (rarity: rarity,Damage: $damage)")
        }

        is BattleState.GameOver -> {
            println("GAME OVER! Alasan: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Fiuuh... Kamu telah memasuki Safe Zone. Silahkan beristirahat.")
        }
    }
}


