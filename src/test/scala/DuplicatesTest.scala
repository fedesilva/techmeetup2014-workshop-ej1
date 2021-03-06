import util._

class DuplicatesTest extends BetterFunSuite with Solutions {

  val relativeName = "src/test/resources/HistorySong.txt"

  "Duplicados" should "be able to read all lines" in {
    val dupes = new Duplicates(relativeName)
    assert (dupes.lines.size === allLinesCount)
  }

  it should "be able to list song ids" in {
    val dupes = new Duplicates(relativeName)
    assert ( dupes.allSongs.size === allSongsCount )
  }

  it should "be able to list all distinct song ids" in {
    val dupes = new Duplicates(relativeName)
    assert ( dupes.distinctSongs.size === distinctSongCount )
  }

  it should "be able to list the duplicates" in {
    val dupes = new Duplicates(relativeName)
    assert ( dupes.duplicateSongs.size === ( allSongsCount - dupes.distinctSongs.size ) )
  }

  it should "find the correct duplicate song ids" in {
    val dupes = new Duplicates(relativeName)
    assert (dupes.duplicateSongsWithCount.keys === duplicateSongsIdCountMap.keys)
  }

  it should "be able to emit the correct count for each duplicated song" in {
    val dupes = new Duplicates(relativeName)
    assert (duplicateSongsIdCountMap === dupes.duplicateSongsWithCount)
  }
  
}