//
// Copyright (c) 2012 Red Hat, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//           http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

// *********************************************************************
// ********************* GENERATED CODE - DO NOT MODIFY ****************
// *********************************************************************

package org.ovirt.engine.sdk.decorators;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.ovirt.engine.sdk.common.CollectionDecorator;
import org.ovirt.engine.sdk.exceptions.ServerException;
import org.ovirt.engine.sdk.utils.CollectionUtils;
import org.ovirt.engine.sdk.utils.HttpHeaderBuilder;
import org.ovirt.engine.sdk.utils.HttpHeaderUtils;
import org.ovirt.engine.sdk.utils.UrlBuilder;
import org.ovirt.engine.sdk.utils.UrlBuilder;
import org.ovirt.engine.sdk.utils.UrlHelper;
import org.ovirt.engine.sdk.web.HttpProxyBroker;
import org.ovirt.engine.sdk.web.UrlParameterType;
import org.ovirt.engine.sdk.entities.Action;

/**
 * <p>Hosts providing relation and functional services
 * <p>to {@link org.ovirt.engine.sdk.entities.Hosts } .
 */
@SuppressWarnings("unused")
public class Hosts extends
        CollectionDecorator<org.ovirt.engine.sdk.entities.Host, 
                            org.ovirt.engine.sdk.entities.Hosts, 
                            Host> {

    /**
     * @param proxy HttpProxyBroker
     */
    public Hosts(HttpProxyBroker proxy) {
        super(proxy, "hosts");
    }

    /**
     * Lists Host objects.
     *
     * @return
     *     List of {@link Host }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public List<Host> list() throws ClientProtocolException,
            ServerException, IOException {
        String url = SLASH + getName();
        return list(url, org.ovirt.engine.sdk.entities.Hosts.class, Host.class);
    }

    /**
     * Fetches Host object by id.
     *
     * @return {@link Host }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public Host get(UUID id) throws ClientProtocolException,
            ServerException, IOException {
        String url = SLASH + getName() + SLASH + id.toString();
        return getProxy().get(url, org.ovirt.engine.sdk.entities.Host.class, Host.class);
    }

    /**
     * Lists Host objects.
     *
     * @param query
     *    <pre>
     *    [search query]
     *    </pre>
     * @param caseSensitive
     *    <pre>
     *    [true|false]
     *    </pre>
     * @param max
     *    <pre>
     *    [max results]
     *    </pre>
     *
     *
     * @return List of {@link Host }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public List<Host> list(String query, Boolean caseSensitive, Integer max) throws ClientProtocolException,
            ServerException, IOException {

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        String url = new UrlBuilder(SLASH + getName())
                .add("search", query, UrlParameterType.QUERY)
                .add("case_sensitive", caseSensitive, UrlParameterType.MATRIX)
                .add("max", max, UrlParameterType.MATRIX)
                .build();

        return list(url, org.ovirt.engine.sdk.entities.Hosts.class,
                Host.class, headers);
    }
    /**
     * Adds Host object.
     *
     * @param host {@link org.ovirt.engine.sdk.entities.Host}
     *    <pre>
     *    host.name
     *    host.address
     *    host.root_password
     *    host.cluster.id|name
     *    [host.port]
     *    [host.display.address]
     *    [host.storage_manager.priority]
     *    [host.power_management.type]
     *    [host.power_management.enabled]
     *    [host.power_management.address]
     *    [host.power_management.username]
     *    [host.power_management.password]
     *    [host.power_management.options.option]
     *    [host.power_management.pm_proxy]
     *    [host.power_management.agents.agent]
     *    [host.reboot_after_installation]
     *    </pre>
     *
     * @return
     *     {@link Host }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Host add(org.ovirt.engine.sdk.entities.Host host) throws 
            ClientProtocolException, ServerException, IOException {
        String url = SLASH + getName();

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().add(url, host,
                org.ovirt.engine.sdk.entities.Host.class,
                Host.class, headers);
    }
    /**
     * Adds Host object.
     *
     * @param host {@link org.ovirt.engine.sdk.entities.Host}
     *    <pre>
     *    host.name
     *    host.address
     *    host.root_password
     *    host.cluster.id|name
     *    [host.port]
     *    [host.display.address]
     *    [host.storage_manager.priority]
     *    [host.power_management.type]
     *    [host.power_management.enabled]
     *    [host.power_management.address]
     *    [host.power_management.username]
     *    [host.power_management.password]
     *    [host.power_management.options.option]
     *    [host.power_management.pm_proxy]
     *    [host.power_management.agents.agent]
     *    [host.reboot_after_installation]
     *    </pre>
     *
     * @param expect
     *    <pre>
     *    [201-created]
     *    </pre>
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     *
     * @return
     *     {@link Host }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Host add(org.ovirt.engine.sdk.entities.Host host, String expect, String correlationId) throws 
            ClientProtocolException, ServerException, IOException {
        String url = SLASH + getName();

        List<Header> headers = new HttpHeaderBuilder()
                .add("Expect", expect)
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().add(url, host,
                org.ovirt.engine.sdk.entities.Host.class,
                Host.class, headers);
    }

}

