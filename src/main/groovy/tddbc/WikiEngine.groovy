package tddbc
/**
 * Created with IntelliJ IDEA.
 * User: sue445
 * Date: 2013/06/16
 * Time: 12:21
 * To change this template use File | Settings | File Templates.
 */
class WikiEngine {
    String format(String line){
        def wikiFormats = [
                /_(.+?)_/                 : /<i>$1<\/i>/,
                /\*(.+?)\*/               : /<b>$1<\/b>/,
                /======\s*(.+?)\s*======/ : /<h6>$1<\/h6>/,
                /=====\s*(.+?)\s*=====/   : /<h5>$1<\/h5>/,
                /====\s*(.+?)\s*====/     : /<h4>$1<\/h4>/,
                /===\s*(.+?)\s*===/       : /<h3>$1<\/h3>/,
                /==\s*(.+?)\s*==/         : /<h2>$1<\/h2>/,
                /=\s*(.+?)\s*=/           : /<h1>$1<\/h1>/,
        ]

        wikiFormats.inject(line){ work, entry ->
            work = work.replaceAll(entry.key, entry.value)
            work
        }
    }
}
