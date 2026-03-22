package oop_00000130613_BrilliantHafizdHermawan.week07

sealed class BattleState {
    data class MonsterEncounter(val monsterName: String): BattleState()
    data class LostDropped(val item: GameItem): BattleState()
    data class GameOver(val reason: String): BattleState()
    object SafeZone: BattleState()

}