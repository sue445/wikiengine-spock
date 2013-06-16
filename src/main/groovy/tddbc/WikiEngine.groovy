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
                /_(.+)_/           : /<i>$1<\/i>/,
                /\*(.+)\*/         : /<b>$1<\/b>/,
                /======(.+)======/ : /<h6>$1<\/h6>/,
                /=====(.+)=====/   : /<h5>$1<\/h5>/,
                /====(.+)====/     : /<h4>$1<\/h4>/,
                /===(.+)===/       : /<h3>$1<\/h3>/,
                /==(.+)==/         : /<h2>$1<\/h2>/,
                /=(.+)=/           : /<h1>$1<\/h1>/,
        ]

        wikiFormats.inject(line){ work, entry ->
            work = work.replaceAll(entry.key, entry.value)
            work
        }
    }
}
