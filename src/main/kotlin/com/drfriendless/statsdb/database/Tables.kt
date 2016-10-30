package com.drfriendless.statsdb.database

import org.jetbrains.exposed.sql.Table

/**
 * Definitions of tables. Note that we don't create the schema in this project, the schema already exists and is
 * populated by the downloader component of https://github.com/DrFriendless/ExtendedStats.
 */
object GeekGames: Table("geekgames") {
    val geek = varchar("geek", 128)
    val game = integer("game")
    val wish = integer("wish")
    val rating = float("rating", 3, 1)
    val owned = bool("owned")
    val want = bool("want")
    val trade = bool("trade")
    val prevowned = bool("prevowned")
    val wanttobuy = bool("wanttobuy")
    val wanttoplay = bool("wanttoplay")
    val preordered = bool("preordered")
    val comment = varchar("comment", 1024)
}

object Games: Table("games") {
    val bggid = integer("bggid")
    val name = varchar("name", 256)
    val minPlayers = integer("minPlayers")
    val maxPlayers = integer("maxPlayers")
    val playTime = integer("playTime")
    // TODO
}

object Users: Table("users") {
    val geek = varchar("geek", 128)
    val bggid = integer("bggid")
    val profileViews = integer("profileViews")
    val country = varchar("country", 64).nullable()
    val lastProfileView = date("lastProfileView").nullable()
}

object Expansions: Table("expansions") {
    val basegame = integer("basegame")
    val expansion = integer("expansion")
}

object Plays: Table("plays") {
    val game = integer("game")
    val geek = varchar("geek", 128)
    val playDate = date("playDate")
    val quantity = integer("quantity")
    val basegame = integer("basegame")
    val raters = integer("raters")
    val ratingsTotal = integer("ratingsTotal")
    val location = varchar("location", 256)
}

object GeekGameTags: Table("geekgametags") {
    val geek = varchar("geek", 128)
    val tag = varchar("tag", 128)
    val game = integer("game")
}

object History: Table("history") {
    val geek = varchar("geek", 128)
    val ts = date("ts")
    val friendless = integer("friendless")
    val wanted = integer("wanted")
    val wished = integer("wished")
    val owned = integer("owned")
    val unplayed = integer("unplayed")
    val distinctPlayed = integer("distinctPlayed")
    val traded = integer("traded")
    /* TODO */
}

object MonthsPlayed: Table("monthsplayer") {
    val geek = varchar("geek", 128)
    val month = integer("month")
    val year = integer("year")
}

object Geeks: Table("geeks") {
    val username = varchar("username", 128)
    val shouldplay = integer("shouldplay")
    val avatar = varchar("avatar", 128)
}

object Files: Table("files") {
    val filename = varchar("filename", 128).nullable()
    val geek = varchar("geek", 128).nullable()
    val processMethod = varchar("processMethod", 128)
    val url = varchar("url", 256).nullable()
    val lastUpdate = date("lastUpdate").nullable()
    val nextUpdate = date("nextUpdate").nullable()
    val tillNextUpdate = varchar("tillNextUpdate", 128)
    val description = varchar("description", 256)
    val lastattempt = date("lastattempt").nullable()
}

object Downloader: Table("downloader") {
    val starttime = date("starttime")
    val endtime = date("endtime")
    val filesprocessed = integer("filesprocessed")
    val waittime = float("waittime", 3, 1)
    val pausetime = float("pausetime", 3, 1)
    val nothing = float("nothing", 3, 1)
    val failures = integer("failures")
    val users = integer("users")
    val games = integer("games")
}

object Metadata: Table("metadata") {
    val ruletype = integer("ruletype")
    val bggid = integer("bggid")
}

object Series: Table("series") {
    val name = varchar("name", 128)
    val game = integer("game")
}