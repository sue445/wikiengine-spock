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
        line        | expected
        "_italic_"  | "<i>italic</i>"
    }
}
