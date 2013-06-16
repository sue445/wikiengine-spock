package tddbc

import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: sue445
 * Date: 2013/06/16
 * Time: 12:22
 * To change this template use File | Settings | File Templates.
 */
class WikiEngineSpec extends Specification{
    def "format(#line) == #expected"(){
        setup:
        def sut = new WikiEngine()

        expect:
        sut.format(line) == expected

        where:
        line                    | expected
        "_italic_"              | "<i>italic</i>"
        "*bold*"                | "<b>bold</b>"
        "= Heading ="           | "<h1> Heading </h1>"
        "== Subheading =="      | "<h2> Subheading </h2>"
        "=== Level 3 ==="       | "<h3> Level 3 </h3>"
        "==== Level 4 ===="     | "<h4> Level 4 </h4>"
        "===== Level 5 ====="   | "<h5> Level 5 </h5>"
        "====== Level 6 ======" | "<h6> Level 6 </h6>"
        "other string"          | "other string"
    }
}
