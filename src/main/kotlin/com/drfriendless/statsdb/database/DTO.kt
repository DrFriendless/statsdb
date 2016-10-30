package com.drfriendless.statsdb.database

/**
 * Classes representing records from the database.
 *
 * @author John Farrell
 */
data class SeriesMetadata(val key: String, val ids: Set<Int>) {}

data class ExpansionsMetadata(val type: MetadataRuleType, val game: Int) {}

enum class MetadataRuleType(val intKey: Int, val stringKey: String) {
    EXPANSION(1, "expansion"),
    BASEGAME(2, "basegame")
}

fun metadataRuleFromString(s: String): MetadataRuleType? {
    return MetadataRuleType.values().firstOrNull { it.stringKey == s }
}

fun metadataRuleFromInt(i: Int): MetadataRuleType? {
    return MetadataRuleType.values().firstOrNull { it.intKey == i }
}
