package demo

import grails.test.mixin.integration.Integration
import grails.transaction.Rollback
import spock.lang.Specification

@Integration
@Rollback
class RollbackSpec extends Specification {

    void 'test method one'() {
        when:
        new Person(name: 'One').save()

        then:
        Person.count() == 1
    }

    void 'test method two'() {
        when:
        new Person(name: 'Two').save()

        then:
        Person.count() == 1
    }

    void 'test method three'() {
        when:
        new Person(name: 'three').save()

        then:
        Person.count() == 1
    }
}
