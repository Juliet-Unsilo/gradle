/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.internal.artifacts.repositories.resolver

import org.gradle.api.internal.artifacts.ImmutableModuleIdentifierFactory
import org.gradle.api.internal.artifacts.ivyservice.ivyresolve.parser.MetaDataParser
import org.gradle.api.internal.artifacts.repositories.transport.RepositoryTransport
import org.gradle.internal.resource.local.FileStore
import org.gradle.internal.resource.local.LocallyAvailableResourceFinder
import org.gradle.internal.resource.transfer.CacheAwareExternalResourceAccessor
import spock.lang.Specification

class MavenResolverTest extends Specification {
    def resolver = new MavenResolver("repo", new URI("http://localhost"), Stub(RepositoryTransport), Stub(LocallyAvailableResourceFinder), Stub(FileStore), Stub(MetaDataParser), Stub(ImmutableModuleIdentifierFactory), Stub(CacheAwareExternalResourceAccessor), Stub(FileStore))

    def "has useful string representation"() {
        expect:
        resolver.toString() == "Maven repository 'repo'"
    }
}
