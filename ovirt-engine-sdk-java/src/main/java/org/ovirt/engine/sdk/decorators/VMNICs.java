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
 * <p>VMNICs providing relation and functional services
 * <p>to {@link org.ovirt.engine.sdk.entities.Nics }.
 */
@SuppressWarnings("unused")
public class VMNICs extends
        CollectionDecorator<org.ovirt.engine.sdk.entities.NIC,
                            org.ovirt.engine.sdk.entities.Nics,
                            VMNIC> {

    private VM parent;

    /**
     * @param proxy HttpProxyBroker
     * @param parent VM
     */
    public VMNICs(HttpProxyBroker proxy, VM parent) {
        super(proxy, "nics");
        this.parent = parent;
    }

    /**
     * Lists VMNIC objects.
     *
     * @return
     *     List of {@link VMNIC }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public List<VMNIC> list() throws ClientProtocolException,
            ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName();
        return list(url, org.ovirt.engine.sdk.entities.Nics.class, VMNIC.class);
    }

    /**
     * Fetches VMNIC object by id.
     * 
     * @return
     *     {@link VMNIC }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public VMNIC get(UUID id) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName() + SLASH + id.toString();
        return getProxy().get(url, org.ovirt.engine.sdk.entities.NIC.class, VMNIC.class);
    }

    /**
     * Lists VMNIC objects.
     *
     * @param max
     *    <pre>
     *    [max results]
     *    </pre>
     *
     *
     * @return List of {@link VMNIC }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public List<VMNIC> list(Integer max) throws ClientProtocolException,
            ServerException, IOException {

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        String url = new UrlBuilder(this.parent.getHref() + SLASH + getName())
                .add("max", max, UrlParameterType.MATRIX)
                .build();

        return list(url, org.ovirt.engine.sdk.entities.Nics.class,
                VMNIC.class, headers);
    }
    /**
     * Adds NIC object.
     *
     * @param nic {@link org.ovirt.engine.sdk.entities.NIC}
     *    <pre>
     *    nic.name
     *    [nic.network.id|name]
     *    [nic.linked]
     *    [nic.mac.address]
     *    [nic.interface]
     *    [nic.port_mirroring.networks.network]
     *    [nic.plugged]
     *    [nic.custom_properties.custom_property]
     *    </pre>
     *
     * @return
     *     {@link VMNIC }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public VMNIC add(org.ovirt.engine.sdk.entities.NIC nic) throws 
            ClientProtocolException, ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName();

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().add(url, nic,
                org.ovirt.engine.sdk.entities.NIC.class,
                VMNIC.class, headers);
    }
    /**
     * Adds NIC object.
     *
     * @param nic {@link org.ovirt.engine.sdk.entities.NIC}
     *    <pre>
     *    nic.name
     *    [nic.network.id|name]
     *    [nic.linked]
     *    [nic.mac.address]
     *    [nic.interface]
     *    [nic.port_mirroring.networks.network]
     *    [nic.plugged]
     *    [nic.custom_properties.custom_property]
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
     *     {@link VMNIC }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public VMNIC add(org.ovirt.engine.sdk.entities.NIC nic, String expect, String correlationId) throws 
            ClientProtocolException, ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName();

        List<Header> headers = new HttpHeaderBuilder()
                .add("Expect", expect)
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().add(url, nic,
                org.ovirt.engine.sdk.entities.NIC.class,
                VMNIC.class, headers);
    }

}

