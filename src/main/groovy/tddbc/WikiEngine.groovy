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
        switch (line){
        case ~/_(.+)_/:
            return line.replaceAll(/_(.+)_/, /<i>$1<\/i>/)
        default:
            return line
        }
    }
}
