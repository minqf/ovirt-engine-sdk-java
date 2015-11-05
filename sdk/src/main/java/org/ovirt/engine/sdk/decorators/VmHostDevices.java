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
 * <p>VmHostDevices providing relation and functional services
 * <p>to {@link org.ovirt.engine.sdk.entities.HostDevices }.
 */
@SuppressWarnings("unused")
public class VmHostDevices extends
        CollectionDecorator<org.ovirt.engine.sdk.entities.HostDevice,
                            org.ovirt.engine.sdk.entities.HostDevices,
                            VmHostDevice> {

    private Vm parent;

    /**
     * @param proxy HttpProxyBroker
     * @param parent Vm
     */
    public VmHostDevices(HttpProxyBroker proxy, Vm parent) {
        super(proxy, "hostdevices");
        this.parent = parent;
    }

    /**
     * Lists VmHostDevice objects.
     *
     * @return
     *     List of {@link VmHostDevice }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public List<VmHostDevice> list() throws ClientProtocolException,
            ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName();
        return list(url, org.ovirt.engine.sdk.entities.HostDevices.class, VmHostDevice.class);
    }

    /**
     * Fetches VmHostDevice object by id.
     *
     * @return
     *     {@link VmHostDevice }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public VmHostDevice get(UUID id) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName() + SLASH + id.toString();
        return getProxy().get(url, org.ovirt.engine.sdk.entities.HostDevice.class, VmHostDevice.class);
    }

    /**
     * Fetches VmHostDevice object by id.
     *
     * @return
     *     {@link VmHostDevice }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public VmHostDevice getById(String id) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName() + SLASH + id;
        return getProxy().get(url, org.ovirt.engine.sdk.entities.HostDevice.class, VmHostDevice.class);
    }

    /**
     * Adds HostDevice object.
     *
     * @param hostdevice {@link org.ovirt.engine.sdk.entities.HostDevice}
     *    <pre>
     *    host_device.id|name
     *    </pre>
     *
     *
     * @return
     *     {@link VmHostDevice }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public VmHostDevice add(org.ovirt.engine.sdk.entities.HostDevice hostdevice) throws
            ClientProtocolException, ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName();

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        url = urlBuilder.build();

        return getProxy().add(url, hostdevice,
                org.ovirt.engine.sdk.entities.HostDevice.class,
                VmHostDevice.class, headers);
    }
    /**
     * Adds HostDevice object.
     *
     * @param hostdevice {@link org.ovirt.engine.sdk.entities.HostDevice}
     *    <pre>
     *    host_device.id|name
     *    </pre>
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     * @return
     *     {@link VmHostDevice }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public VmHostDevice add(org.ovirt.engine.sdk.entities.HostDevice hostdevice, String correlationId) throws
            ClientProtocolException, ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName();

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        if (correlationId != null) {
            headersBuilder.add("Correlation-Id", correlationId);
        }
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        url = urlBuilder.build();

        return getProxy().add(url, hostdevice,
                org.ovirt.engine.sdk.entities.HostDevice.class,
                VmHostDevice.class, headers);
    }
    /**
     * Adds HostDevice object.
     *
     * @param hostdevice {@link org.ovirt.engine.sdk.entities.HostDevice}
     *    <pre>
     *    host_device.id|name
     *    </pre>
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     * @param expect
     *    <pre>
     *    [201-created]
     *    </pre>
     * @return
     *     {@link VmHostDevice }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public VmHostDevice add(org.ovirt.engine.sdk.entities.HostDevice hostdevice, String correlationId, String expect) throws
            ClientProtocolException, ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName();

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        if (correlationId != null) {
            headersBuilder.add("Correlation-Id", correlationId);
        }
        if (expect != null) {
            headersBuilder.add("Expect", expect);
        }
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        url = urlBuilder.build();

        return getProxy().add(url, hostdevice,
                org.ovirt.engine.sdk.entities.HostDevice.class,
                VmHostDevice.class, headers);
    }
    /**
     * Lists VmHostDevice objects.
     *
     * @param max
     *    <pre>
     *    [max results]
     *    </pre>
     *
     * @return List of {@link VmHostDevice }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public List<VmHostDevice> list(Integer max) throws ClientProtocolException,
            ServerException, IOException {

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(this.parent.getHref() + SLASH + getName());
        if (max != null) {
            urlBuilder.add("max", max, UrlParameterType.MATRIX);
        }

        String url = urlBuilder.build();

        return list(url, org.ovirt.engine.sdk.entities.HostDevices.class,
                VmHostDevice.class, headers);
    }

}